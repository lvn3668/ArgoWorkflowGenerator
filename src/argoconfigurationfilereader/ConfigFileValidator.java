/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import argoconfigurationfileutilities.GenericUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ConfigFileValidator.
 */
public class ConfigFileValidator {

	/** The config file. */
	private File _configFile = null;

	/** The config properties. */
	private Properties _configProperties = new Properties();

	/** The number of supported intervals for BQSR. */
	private final int _numberOfSupportedIntervalsForBQSR = 13;

	/** The number of supported lanes per sample. */
	private final int _numberOfSupportedLanesPerSample = 4;

	/** The number of supported samples. */
	private final int _numberOfSupportedSamples = 1;

	/** The optional parameters. */
	private Set<String> _optionalParameters;

	/** The required parameters. */
	private Set<String> _requiredParameters;

	/** The step number. */
	private final int _stepNumber = 6;

	/**
	 * Instantiates a new config file validator.
	 */
	public ConfigFileValidator() {

		try {
			this._requiredParameters = new HashSet<>();
			this._optionalParameters = new HashSet<>();
			this._configProperties = new Properties();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Instantiates a new config file validator.
	 *
	 * @param configfilename the configfilename
	 * @throws Exception the exception
	 */
	public ConfigFileValidator(String configfilename) throws Exception {

		this._requiredParameters = new HashSet<>();
		this._optionalParameters = new HashSet<>();
		this._configProperties = new Properties();
		this._configFile = new File(getClass().getClassLoader().getResource(configfilename.trim()).getFile());
		@SuppressWarnings("resource")
		InputStream _inputStream = getClass().getClassLoader().getResourceAsStream(configfilename);

		if (_inputStream != null) {
			this._configProperties.load(_inputStream);
		} else {
			throw new FileNotFoundException("property file '" + configfilename + "' not found in the classpath"); //$NON-NLS-1$ //$NON-NLS-2$
		}
		_inputStream.close();
		setRequiredVariables();

	}

	/**
	 * Instantiates a new configfilevalidator.
	 *
	 * @param configFileName the config file name
	 * @param props          the props
	 */
	public ConfigFileValidator(String configFileName, Properties props) {
		try {
			this._requiredParameters = new HashSet<>();
			this._optionalParameters = new HashSet<>();
			this._configProperties = new Properties(props);
			this._configFile = new File(configFileName);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Check file format.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	// check if end is the last entry
	public boolean checkConfigFileEndLine() throws Exception {

		try {
			String fileAsString = GenericUtilities.convertFileToString(this._configFile);
			String[] splitFile = fileAsString.split("="); //$NON-NLS-1$
			if (splitFile[splitFile.length - 1].trim().equalsIgnoreCase("end") //$NON-NLS-1$
					&& (splitFile[splitFile.length - 2].contains("StepName_"))) //$NON-NLS-1$
				return true;
			return false;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check CPU limits.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public boolean checkCPULimits() throws Exception {
		try {
			int CPULimits;
			for (int index = 1; index <= this._numberOfSupportedSamples; index++) {
				CPULimits = Integer.parseInt(this._configProperties.getProperty("CPULimits_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
				if ((CPULimits < 0) || (CPULimits > 10))
					return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check CPU requests.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public boolean checkCPURequests() throws Exception {
		try {
			int CPURequests;
			for (int index = 1; index <= this._numberOfSupportedSamples; index++) {
				CPURequests = Integer.parseInt(this._configProperties.getProperty("CPURequests_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
				if ((CPURequests < 0) || (CPURequests > 10))
					return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// check if gender is only m or f for all supported samples
	/**
	 * Check for valid gender.
	 *
	 * @return true, if successful
	 */
	// presently supporting only 1 sample
	public boolean checkForValidGender() {
		try {
			String gender;

			for (int index = 1; index <= this._numberOfSupportedSamples; index++) {
				gender = this._configProperties.getProperty("Gender_" + index); //$NON-NLS-1$
				if ((!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F"))) //$NON-NLS-1$ //$NON-NLS-2$
					return false;
			}
			return true;
		} catch (

		Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check for valid step names.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	// check if the step names are valid
	public boolean checkForValidStepNames() throws Exception {
		try {
			String stepValue;
			Enumeration<?> keys = this._configProperties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				if (key.startsWith("StepName_")) { //$NON-NLS-1$
					for (int index = 1; index <= this._stepNumber; index++) {
						stepValue = this._configProperties.getProperty("StepName_" + index); //$NON-NLS-1$
						if (!GenericUtilities.checkIfStepNameIsSupported(stepValue))
							return false;
					}
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check memory limits.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public boolean checkMemoryLimits() throws Exception {
		try {
			String MemoryLimits;
			for (int index = 1; index <= this._numberOfSupportedSamples; index++) {
				MemoryLimits = this._configProperties.getProperty("MemoryLimits_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
				if (!MemoryLimits.trim().endsWith("Mi")) //$NON-NLS-1$
					return false;
				if ((Integer.parseInt(MemoryLimits.replace("Mi", "").trim()) < 5000) //$NON-NLS-1$ //$NON-NLS-2$
						|| (Integer.parseInt(MemoryLimits.replace("Mi", "").trim()) > 20000)) //$NON-NLS-1$ //$NON-NLS-2$
					return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check memory requests.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public boolean checkMemoryRequests() throws Exception {
		try {
			String MemoryRequests;
			for (int index = 1; index <= this._numberOfSupportedSamples; index++) {
				MemoryRequests = this._configProperties.getProperty("MemoryRequests_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
				if (!MemoryRequests.trim().endsWith("Mi")) //$NON-NLS-1$
					return false;
				if ((Integer.parseInt(MemoryRequests.trim().replace("Mi", "")) < 1000) //$NON-NLS-1$ //$NON-NLS-2$
						|| (Integer.parseInt(MemoryRequests.trim().replace("Mi", "")) > 10000)) //$NON-NLS-1$ //$NON-NLS-2$
					return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check number of lanes.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
// check if number of lanes exceeds 4
	public boolean checkNumberOfLanes() throws Exception {

		try {
			int numLanes;
			for (WorkflowStepsList ws : WorkflowStepsList.values()) {
				for (String key : this._requiredParameters) {
					if (key.contentEquals("NumberOfLanes_" + ws + "_" + this._numberOfSupportedSamples)) { //$NON-NLS-1$ //$NON-NLS-2$
						numLanes = Integer.parseInt(this._configProperties
								.getProperty("NumberOfLanes_" + ws + "_" + this._numberOfSupportedSamples)); //$NON-NLS-1$ //$NON-NLS-2$
						if (numLanes > this._numberOfSupportedLanesPerSample)
							return false;
					}
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check number of samples per step.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public boolean checkNumberOfSamplesPerStep() throws Exception {

		try {
			int numSamplesPerStep;
			for (WorkflowStepsList ws : WorkflowStepsList.values()) {
				for (String key : this._requiredParameters) {
					if (key.contentEquals("NumberOfSamples_" + ws)) { //$NON-NLS-1$
						numSamplesPerStep = Integer
								.parseInt(this._configProperties.getProperty("NumberOfSamples_" + ws)); //$NON-NLS-1$
						if (numSamplesPerStep > this._numberOfSupportedSamples)
							return false;
					}
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Test props.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	private boolean checkPropertiesFileForRequiredKeys() throws Exception {
		try {
			int requiredCount = 0;
			Enumeration<Object> keys = this._configProperties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				if (this._requiredParameters.contains(key)) {
					requiredCount++;
				} else {
					throw new IllegalStateException("Unauthorized key : " + key); //$NON-NLS-1$
				}
			}
			if (requiredCount < this._requiredParameters.size()) {
				for (String requiredKey : this._requiredParameters) {
					if (!this._configProperties.containsKey(requiredKey)) {
						throw new IllegalStateException("Missing required key : " + requiredKey); //$NON-NLS-1$
					}
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check retry strategy value.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public boolean checkRetryStrategyValue() throws Exception {
		try {
			int retrystrategyvalue;
			for (int index = 1; index <= this._numberOfSupportedSamples; index++) {
				retrystrategyvalue = Integer
						.parseInt(this._configProperties.getProperty("RetryStrategy_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
				if ((retrystrategyvalue < 0) || (retrystrategyvalue > 25))
					return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check valid lane id.
	 *
	 * @return true, if successful
	 */
	public boolean checkValidLaneId() {
		String SampleId;
		try {
			for (int index = 1; index <= this._numberOfSupportedLanesPerSample; index++) {
				for (WorkflowStepsList ws : WorkflowStepsList.values()) {
					SampleId = this._configProperties.getProperty("LaneId_" + ws + "_" + index); //$NON-NLS-1$ //$NON-NLS-2$
					if (!SampleId.trim().matches("^\\d+$")) //$NON-NLS-1$
						return false;
				}
			}
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}
// 1 lane is mandatory
// remaining are optional
// correlation between number of lanes and information per lane

	/**
	 * Check valid sample id.
	 *
	 * @return true, if successful
	 */
	public boolean checkValidSampleId() {
		String SampleId;
		try {
			for (int index = 1; index <= this._numberOfSupportedSamples; index++) {
				for (WorkflowStepsList ws : WorkflowStepsList.values()) {
					SampleId = this._configProperties.getProperty("SampleId_" + ws + "_" + index); //$NON-NLS-1$ //$NON-NLS-2$
					if (!SampleId.trim().matches("^\\d+$")) //$NON-NLS-1$
						return false;
				}
			}
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	// check if there are fields called StepName_4/5/6, Gender_2, etc.

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfigFileValidator other = (ConfigFileValidator) obj;
		if (this._optionalParameters == null) {
			if (other._optionalParameters != null)
				return false;
		} else if (!this._optionalParameters.equals(other._optionalParameters))
			return false;
		if (this._requiredParameters == null) {
			if (other._requiredParameters != null)
				return false;
		} else if (!this._requiredParameters.equals(other._requiredParameters))
			return false;
		return true;
	}

	/**
	 * Gets the optional.
	 *
	 * @return the optional
	 */
	public Set<String> get_optionalParameters() {
		return this._optionalParameters;
	}

	/**
	 * Gets the required.
	 *
	 * @return the required
	 */
	public Set<String> get_requiredParameters() {
		return this._requiredParameters;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this._optionalParameters == null) ? 0 : this._optionalParameters.hashCode());
		result = prime * result + ((this._requiredParameters == null) ? 0 : this._requiredParameters.hashCode());
		return result;
	}

	/**
	 * Sets the optional.
	 *
	 * @param _optional the new optional
	 */
	public void set_optionalParameters(Set<String> _optional) {
		this._optionalParameters = _optional;
	}

	/**
	 * Sets the required.
	 *
	 * @param _required the new required
	 */
	public void set_requiredParameters(Set<String> _required) {
		this._requiredParameters = _required;
	}

	/**
	 * Sets the required.
	 *
	 * @param required the new required
	 */
	private void set_requiredParameters(String required) {
		try {
			this._requiredParameters.add(required);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Sets the required variables.
	 */
	private void setRequiredVariables() {
		try {
			// TODO Auto-generated constructor stub
			set_requiredParameters("Header_InvokerTemplate"); //$NON-NLS-1$
			set_requiredParameters("Header_InvokedTemplate"); //$NON-NLS-1$

			for (int index = 1; index <= this._stepNumber + 1; index++)
				set_requiredParameters("StepName_" + index); //$NON-NLS-1$

			for (WorkflowStepsList ws : WorkflowStepsList.values()) {
				set_requiredParameters("NumberOfSamples_" + ws.name()); //$NON-NLS-1$
				set_requiredParameters("SampleId_" + ws.name() + "_" + this._numberOfSupportedSamples); //$NON-NLS-1$ //$NON-NLS-2$

				if (!(ws.name().equalsIgnoreCase("bqsr"))) //$NON-NLS-1$
					set_requiredParameters("NumberOfLanes_" + ws.name() + "_" + this._numberOfSupportedSamples); //$NON-NLS-1$ //$NON-NLS-2$

				else if ((ws.name().equalsIgnoreCase("bqsr"))) //$NON-NLS-1$
					set_requiredParameters("NumberOfIntervals_" + ws.name() + "_" + this._numberOfSupportedSamples); //$NON-NLS-1$ //$NON-NLS-2$

				if ((!(ws.name().equalsIgnoreCase("bqsr"))) && (!(ws.name().equalsIgnoreCase("coordinatesort"))) //$NON-NLS-1$ //$NON-NLS-2$
						&& (!(ws.name().equalsIgnoreCase("mergebams")))) //$NON-NLS-1$
					for (int index = 1; index <= this._numberOfSupportedLanesPerSample; index++) {
						set_requiredParameters("LaneId_" + ws.name() + "_" + index); //$NON-NLS-1$ //$NON-NLS-2$
					}
				else if ((ws.name().equalsIgnoreCase("coordinatesort")) || (ws.name().equalsIgnoreCase("mergebams"))) //$NON-NLS-1$ //$NON-NLS-2$
					set_requiredParameters("LaneId_" + ws.name() + "_1"); //$NON-NLS-1$ //$NON-NLS-2$
				else if (ws.name().equalsIgnoreCase("bqsr")) { //$NON-NLS-1$
					set_requiredParameters("Bucket_" + ws.name()); //$NON-NLS-1$
					set_requiredParameters("InvokedTemplateFile_applybqsr_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					set_requiredParameters("InvokerTemplateFile_applybqsr_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					set_requiredParameters("InvokedTemplateFile_bqsr_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					set_requiredParameters("InvokerTemplateFile_bqsr_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					for (int index = 1; index <= this._numberOfSupportedIntervalsForBQSR; index++) {
						set_requiredParameters(
								"Interval_" + ws.name() + "_S" + this._numberOfSupportedSamples + "I" + index); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						set_requiredParameters(
								"Mode_" + ws.name() + "_S" + this._numberOfSupportedSamples + "I" + index); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						// ONly for BQSR
						set_requiredParameters(Messages.getString("ConfigFileValidator.0")); //$NON-NLS-1$
						set_requiredParameters("GoldStandardIndels"); //$NON-NLS-1$
					}
				}
			}
			// Buckets per lane
			// Fastq1 per lane
			// Fastq2 per lane
			// GlobalName FOR BAM (BWA MEM only) per lane
			// GLobalName for BAI (BWA MEM only) per lane
			for (int index = 1; index <= this._numberOfSupportedLanesPerSample; index++) {
				set_requiredParameters("Bucket_S" + this._numberOfSupportedSamples + "L" + index); //$NON-NLS-1$ //$NON-NLS-2$
				set_requiredParameters("Fastq1_" + index); //$NON-NLS-1$
				set_requiredParameters("Fastq2_" + index); //$NON-NLS-1$
				set_requiredParameters("GlobalNameBam_S" + this._numberOfSupportedSamples + "L" + index); //$NON-NLS-1$ //$NON-NLS-2$
				set_requiredParameters("GlobalNameBai_S" + this._numberOfSupportedSamples + "L" + index); //$NON-NLS-1$ //$NON-NLS-2$
			}

			// Mode of running each step, for each of the lanes
			for (WorkflowStepsList ws : WorkflowStepsList.values()) {
				if ((!(ws.name().equalsIgnoreCase("bqsr"))) && (!(ws.name().equalsIgnoreCase("mergebams"))) //$NON-NLS-1$ //$NON-NLS-2$
						&& (!(ws.name().equalsIgnoreCase("coordinatesort")))) { //$NON-NLS-1$
					for (int index = 1; index <= this._numberOfSupportedLanesPerSample; index++) {
						set_requiredParameters(
								"Mode_" + ws.name() + "_S" + this._numberOfSupportedSamples + "L" + index); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						set_requiredParameters("InvokedTemplateFile_" + ws.name() + "_S" //$NON-NLS-1$ //$NON-NLS-2$
								+ this._numberOfSupportedSamples + "L" + index); //$NON-NLS-1$
						set_requiredParameters("InvokerTemplateFile_" + ws.name() + "_S" //$NON-NLS-1$ //$NON-NLS-2$
								+ this._numberOfSupportedSamples + "L" + index); //$NON-NLS-1$
						set_requiredParameters("LaneId_" + ws.name() + "_" + index); //$NON-NLS-1$ //$NON-NLS-2$
					}
				} else if (((ws.name().equalsIgnoreCase("coordinatesort"))) //$NON-NLS-1$
						|| ((ws.name().equalsIgnoreCase("mergebams")))) { //$NON-NLS-1$
					set_requiredParameters("Mode_" + ws.name() + "_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					set_requiredParameters(
							"InvokedTemplateFile_" + ws.name() + "_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					set_requiredParameters(
							"InvokerTemplateFile_" + ws.name() + "_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					set_requiredParameters("LaneId_" + ws.name() + "_1"); //$NON-NLS-1$ //$NON-NLS-2$
				}
			}

			// Gender and References set per sample
			set_requiredParameters("Gender_" + this._numberOfSupportedSamples); //$NON-NLS-1$
			set_requiredParameters("ReferenceSAIndexfile_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("Reference_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("ReferenceAMBIndexfile_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("ReferenceANNIndexfile_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("ReferenceBWTIndexfile_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("ReferenceDICTIndexfile_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("ReferencePACIndexfile_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("ReferenceFAIIndexfile_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("ActiveDeadlineSeconds_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("RetryStrategy_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("MemoryLimits_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("CPULimits_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("MemoryRequests_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
			set_requiredParameters("CPURequests_S" + this._numberOfSupportedSamples + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * Validate config file.
	 *
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	public boolean validateConfigFile() throws Exception {
		boolean validFile = true;
		try {
			// check if the file ends in "Stepname_*=end"
			if (!checkConfigFileEndLine()) {
				validFile = false;
				throw new Exception("Config file does not close with \"StepName=End\""); //$NON-NLS-1$
			}
			if (!checkForValidStepNames()) {
				validFile = false;
				throw new Exception(
						"Config file does not contain valid Step Names. Please refer the WorkflowSteps.java enum for valid stepnames"); //$NON-NLS-1$
			}
			if (!checkForValidGender()) {
				validFile = false;
				throw new Exception("Gender can be single-character M/F or m/f only"); //$NON-NLS-1$
			}
			if (!checkNumberOfLanes()) {
				validFile = false;
				throw new Exception("More number of lanes than presently supported"); //$NON-NLS-1$
			}
			if (!checkNumberOfSamplesPerStep()) {
				validFile = false;
				throw new Exception("More number of samples than presently supported"); //$NON-NLS-1$
			}
			if (!checkRetryStrategyValue()) {
				validFile = false;
				throw new Exception("More number of samples than presently supported"); //$NON-NLS-1$
			}
			if (!checkCPURequests()) {
				validFile = false;
				throw new Exception("Invalid CPU Requests specified"); //$NON-NLS-1$
			}
			if (!checkCPULimits()) {
				validFile = false;
				throw new Exception("Invalid CPU Limits specified"); //$NON-NLS-1$
			}
			if (!checkPropertiesFileForRequiredKeys()) {
				validFile = false;
				throw new Exception("Incomplete Properties File"); //$NON-NLS-1$
			}
			if (!checkCPULimits()) {
				validFile = false;
				throw new Exception("Invalid CPU Limits in File"); //$NON-NLS-1$
			}
			if (!checkMemoryLimits()) {
				validFile = false;
				throw new Exception("Invalid Memory Limits in File"); //$NON-NLS-1$
			}

			if (!checkCPURequests()) {
				validFile = false;
				throw new Exception("Invalid CPU Requests in File"); //$NON-NLS-1$
			}
			if (!checkMemoryRequests()) {
				validFile = false;
				throw new Exception("Invalid Memory Requests in File"); //$NON-NLS-1$
			}

			return validFile;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
