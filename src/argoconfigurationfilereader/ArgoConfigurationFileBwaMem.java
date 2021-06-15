/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import argoconfigurationfileutilities.GenericUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoConfigurationFileBwaMem.
 */
public final class ArgoConfigurationFileBwaMem extends ArgoTemplateProducerBwaMem {

	/**
	 * The main method.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if (args.length != 1)
				throw new Exception(
						"Invalid number of arguments. Usage: <java -cp <classpath> -jar <Tool> <configfilename>"); //$NON-NLS-1$
			ArgoConfigurationFileBwaMem _argoConfigurationFileBwaMem = new ArgoConfigurationFileBwaMem();
			_argoConfigurationFileBwaMem._configFileValidator = new ConfigFileValidator(args[0].trim());
			if (_argoConfigurationFileBwaMem._configFileValidator.validateConfigFile()) {
				_argoConfigurationFileBwaMem._configfilename = args[0];
				_argoConfigurationFileBwaMem.readconfigfile();
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e); //$NON-NLS-1$
			e.printStackTrace();
		}

	}

	/** The argo configuration file GATKBQSR. */
	private ArgoConfigurationFileGATK_BQSR _argoConfigurationFileGATKBQSR;

	/** The argo configuration file GATK coordinate sort. */
	private ArgoConfigurationFileGATKCoordinateSort _argoConfigurationFileGATKCoordinateSort;

	/** The argo configuration file GATK mark duplicate. */
	private ArgoConfigurationFileGATKMarkDuplicate _argoConfigurationFileGATKMarkDuplicate;

	/** The argo configuration file GATK merge BA ms. */
	private ArgoConfigurationFileGATKMergeBAMs _argoConfigurationFileGATKMergeBAMs;

	/** The argo configuration file GATK query name sort. */
	private ArgoConfigurationFileGATKQueryNameSort _argoConfigurationFileGATKQueryNameSort;

	/** The argo template specification header. */
	private File _argoTemplateSpecificationHeader;

	/** The argo workflow definition file header. */
	private File _argoWorkflowDefinitionFileHeader;

	/** The configfilename. */
	private String _configfilename;

	/** The config file validator. */
	private ConfigFileValidator _configFileValidator;

	/** The input stream. */
	private InputStream _inputStream;

	/** The outputfilename. */
	private String _outputfilename;

	/** The reference. */
	private String _reference;

	/** The reference amb. */
	private String _reference_amb;

	/** The reference ann. */
	private String _reference_ann;

	/** The reference bwt. */
	private String _reference_bwt;

	/** The reference dict. */
	private String _reference_dict;

	/** The reference fai. */
	private String _reference_fai;

	/** The reference pac. */
	private String _reference_pac;

	/** The reference sa. */
	private String _reference_sa;

	/** The workflowsteps. */
	private WorkflowStepsList _workflowsteps;

	/**
	 * Instantiates a new bwa mem config file parser.
	 */
	public ArgoConfigurationFileBwaMem() {
		super();
		try {
			this._argoConfigurationFileGATKQueryNameSort = new ArgoConfigurationFileGATKQueryNameSort();
			this._argoConfigurationFileGATKMarkDuplicate = new ArgoConfigurationFileGATKMarkDuplicate();
			this._argoConfigurationFileGATKCoordinateSort = new ArgoConfigurationFileGATKCoordinateSort();
			this._argoConfigurationFileGATKMergeBAMs = new ArgoConfigurationFileGATKMergeBAMs();
			this._argoConfigurationFileGATKBQSR = new ArgoConfigurationFileGATK_BQSR();
			this._configFileValidator = new ConfigFileValidator();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}

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
		ArgoConfigurationFileBwaMem other = (ArgoConfigurationFileBwaMem) obj;
		if (this._argoTemplateSpecificationHeader == null) {
			if (other._argoTemplateSpecificationHeader != null)
				return false;
		} else if (!this._argoTemplateSpecificationHeader.equals(other._argoTemplateSpecificationHeader))
			return false;
		if (this._argoWorkflowDefinitionFileHeader == null) {
			if (other._argoWorkflowDefinitionFileHeader != null)
				return false;
		} else if (!this._argoWorkflowDefinitionFileHeader.equals(other._argoWorkflowDefinitionFileHeader))
			return false;
		if (this._configfilename == null) {
			if (other._configfilename != null)
				return false;
		} else if (!this._configfilename.equals(other._configfilename))
			return false;
		if (this._inputStream == null) {
			if (other._inputStream != null)
				return false;
		} else if (!this._inputStream.equals(other._inputStream))
			return false;
		if (this._argoConfigurationFileGATKMarkDuplicate == null) {
			if (other._argoConfigurationFileGATKMarkDuplicate != null)
				return false;
		} else if (!this._argoConfigurationFileGATKMarkDuplicate.equals(other._argoConfigurationFileGATKMarkDuplicate))
			return false;
		if (this._argoConfigurationFileGATKQueryNameSort == null) {
			if (other._argoConfigurationFileGATKQueryNameSort != null)
				return false;
		} else if (!this._argoConfigurationFileGATKQueryNameSort.equals(other._argoConfigurationFileGATKQueryNameSort))
			return false;
		if (this._reference == null) {
			if (other._reference != null)
				return false;
		} else if (!this._reference.equals(other._reference))
			return false;
		if (this._reference_amb == null) {
			if (other._reference_amb != null)
				return false;
		} else if (!this._reference_amb.equals(other._reference_amb))
			return false;
		if (this._reference_ann == null) {
			if (other._reference_ann != null)
				return false;
		} else if (!this._reference_ann.equals(other._reference_ann))
			return false;
		if (this._reference_bwt == null) {
			if (other._reference_bwt != null)
				return false;
		} else if (!this._reference_bwt.equals(other._reference_bwt))
			return false;
		if (this._reference_dict == null) {
			if (other._reference_dict != null)
				return false;
		} else if (!this._reference_dict.equals(other._reference_dict))
			return false;
		if (this._reference_fai == null) {
			if (other._reference_fai != null)
				return false;
		} else if (!this._reference_fai.equals(other._reference_fai))
			return false;
		if (this._reference_pac == null) {
			if (other._reference_pac != null)
				return false;
		} else if (!this._reference_pac.equals(other._reference_pac))
			return false;
		if (this._reference_sa == null) {
			if (other._reference_sa != null)
				return false;
		} else if (!this._reference_sa.equals(other._reference_sa))
			return false;
		if (this._workflowsteps != other._workflowsteps)
			return false;
		return true;
	}

	/**
	 * Gets the workflowsteps.
	 *
	 * @return the workflowsteps
	 */
	public WorkflowStepsList get_workflowsteps() {
		try {
			return this._workflowsteps;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the configfilename.
	 *
	 * @return the configfilename
	 */
	public String getConfigfilename() {
		try {
			return this._configfilename;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the input stream.
	 *
	 * @return the input stream
	 */
	public InputStream getInputStream() {
		try {
			return this._inputStream;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference.
	 *
	 * @return the reference
	 */
	public String getReference() {
		try {
			return this._reference;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference amb.
	 *
	 * @return the reference amb
	 */
	public String getReference_amb() {
		try {
			return this._reference_amb;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference ann.
	 *
	 * @return the reference ann
	 */
	public String getReference_ann() {
		try {
			return this._reference_ann;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference bwt.
	 *
	 * @return the reference bwt
	 */
	public String getReference_bwt() {
		try {
			return this._reference_bwt;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference dict.
	 *
	 * @return the reference dict
	 */
	public String getReference_dict() {
		try {
			return this._reference_dict;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference fai.
	 *
	 * @return the reference fai
	 */
	public String getReference_fai() {
		try {
			return this._reference_fai;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference pac.
	 *
	 * @return the reference pac
	 */
	public String getReference_pac() {
		try {
			return this._reference_pac;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the reference sa.
	 *
	 * @return the reference sa
	 */
	public String getReference_sa() {
		try {
			return this._reference_sa;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
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
		result = prime * result + ((this._argoTemplateSpecificationHeader == null) ? 0
				: this._argoTemplateSpecificationHeader.hashCode());
		result = prime * result + ((this._argoWorkflowDefinitionFileHeader == null) ? 0
				: this._argoWorkflowDefinitionFileHeader.hashCode());
		result = prime * result + ((this._configfilename == null) ? 0 : this._configfilename.hashCode());
		result = prime * result + ((this._inputStream == null) ? 0 : this._inputStream.hashCode());
		result = prime * result + ((this._argoConfigurationFileGATKMarkDuplicate == null) ? 0
				: this._argoConfigurationFileGATKMarkDuplicate.hashCode());
		result = prime * result + ((this._argoConfigurationFileGATKQueryNameSort == null) ? 0
				: this._argoConfigurationFileGATKQueryNameSort.hashCode());
		result = prime * result + ((this._reference == null) ? 0 : this._reference.hashCode());
		result = prime * result + ((this._reference_amb == null) ? 0 : this._reference_amb.hashCode());
		result = prime * result + ((this._reference_ann == null) ? 0 : this._reference_ann.hashCode());
		result = prime * result + ((this._reference_bwt == null) ? 0 : this._reference_bwt.hashCode());
		result = prime * result + ((this._reference_dict == null) ? 0 : this._reference_dict.hashCode());
		result = prime * result + ((this._reference_fai == null) ? 0 : this._reference_fai.hashCode());
		result = prime * result + ((this._reference_pac == null) ? 0 : this._reference_pac.hashCode());
		result = prime * result + ((this._reference_sa == null) ? 0 : this._reference_sa.hashCode());
		result = prime * result + ((this._workflowsteps == null) ? 0 : this._workflowsteps.hashCode());
		return result;
	}

	/**
	 * Read, parse the configfile and call template generators for different steps
	 * mentioned in the config file.
	 *
	 * @throws Exception the exception
	 */
	@SuppressWarnings("null")
	public void readconfigfile() throws Exception {

		try {
			Properties _properties = new Properties();
			this._inputStream = getClass().getClassLoader().getResourceAsStream(this._configfilename);

			if (this._inputStream != null) {
				_properties.load(this._inputStream);
			} else {
				throw new FileNotFoundException(
						"property file '" + this._configfilename + "' not found in the classpath"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			int stepcount = 1;
			try {
				this._argoWorkflowDefinitionFileHeader = new File(getClass().getClassLoader()
						.getResource(_properties.getProperty("Header_InvokerTemplate").toString().trim()).getFile()); //$NON-NLS-1$
				this._argoTemplateSpecificationHeader = new File(getClass().getClassLoader()
						.getResource(_properties.getProperty("Header_InvokedTemplate").toString().trim()).getFile()); //$NON-NLS-1$
			} catch (Exception e) {
				e.printStackTrace();
			}
			this._outputfilename = this._configfilename + ".workflow.yaml"; //$NON-NLS-1$
			String _workflowDefinition = GenericUtilities.convertFileToString(this._argoWorkflowDefinitionFileHeader);
			String _templateSpecification = GenericUtilities.convertFileToString(this._argoTemplateSpecificationHeader);

			while (!_properties.getProperty("StepName_" + stepcount).toString().equals("end")) { //$NON-NLS-1$ //$NON-NLS-2$

				if (!GenericUtilities
						.checkIfStepNameIsSupported(_properties.getProperty("StepName_" + stepcount).toString())) //$NON-NLS-1$
					throw new Exception("Step " + super.getStepname() + "not supported by this tool"); //$NON-NLS-1$ //$NON-NLS-2$

				if (_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem")) { //$NON-NLS-1$ //$NON-NLS-2$
					super.setStepname(_properties.getProperty("StepName_" + stepcount)); //$NON-NLS-1$
					super.setNumberOfSamples(_properties.getProperty("NumberOfSamples_" + super.getStepname())); //$NON-NLS-1$
				}

				if (_properties.getProperty("StepName_" + stepcount).toString().equals("querynamesort")) { //$NON-NLS-1$ //$NON-NLS-2$
					this._argoConfigurationFileGATKQueryNameSort
							.setStepname(_properties.getProperty("StepName_" + stepcount)); //$NON-NLS-1$
					this._argoConfigurationFileGATKQueryNameSort.setNumberOfSamples(_properties.getProperty(
							"NumberOfSamples_" + this._argoConfigurationFileGATKQueryNameSort.getStepname())); //$NON-NLS-1$
				}

				if (_properties.getProperty("StepName_" + stepcount).toString().equals("markduplicates")) { //$NON-NLS-1$ //$NON-NLS-2$
					this._argoConfigurationFileGATKMarkDuplicate
							.setStepname(_properties.getProperty("StepName_" + stepcount)); //$NON-NLS-1$
					this._argoConfigurationFileGATKMarkDuplicate.setNumberOfSamples(_properties.getProperty(
							"NumberOfSamples_" + this._argoConfigurationFileGATKMarkDuplicate.getStepname())); //$NON-NLS-1$
				}
				if (_properties.getProperty("StepName_" + stepcount).toString().equals("mergebams")) { //$NON-NLS-1$ //$NON-NLS-2$
					this._argoConfigurationFileGATKMergeBAMs
							.setStepname(_properties.getProperty("StepName_" + stepcount)); //$NON-NLS-1$
					this._argoConfigurationFileGATKMergeBAMs.setNumberOfSamples(_properties
							.getProperty("NumberOfSamples_" + this._argoConfigurationFileGATKMergeBAMs.getStepname())); //$NON-NLS-1$
				}

				if (_properties.getProperty("StepName_" + stepcount).toString().equals("coordinatesort")) { //$NON-NLS-1$ //$NON-NLS-2$
					this._argoConfigurationFileGATKCoordinateSort
							.setStepname(_properties.getProperty("StepName_" + stepcount)); //$NON-NLS-1$
					this._argoConfigurationFileGATKCoordinateSort.setNumberOfSamples(_properties.getProperty(
							"NumberOfSamples_" + this._argoConfigurationFileGATKCoordinateSort.getStepname())); //$NON-NLS-1$
				}

				if (_properties.getProperty("StepName_" + stepcount).toString().equals("bqsr")) { //$NON-NLS-1$ //$NON-NLS-2$
					this._argoConfigurationFileGATKBQSR.setStepname(_properties.getProperty("StepName_" + stepcount)); //$NON-NLS-1$
					this._argoConfigurationFileGATKBQSR.setNumberOfSamples(_properties
							.getProperty("NumberOfSamples_" + this._argoConfigurationFileGATKBQSR.getStepname())); //$NON-NLS-1$
				}

				for (int index = 1; index <= Integer.parseInt(super.getNumberOfSamples()); index++) {

					if (_properties.getProperty("SampleId_" + super.getStepname() + "_" + index) == null) //$NON-NLS-1$ //$NON-NLS-2$
						throw new Exception("Sample Id is null"); //$NON-NLS-1$

					if (_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem")) { //$NON-NLS-1$ //$NON-NLS-2$
						super.getSampleIds()
								.add(_properties.getProperty("SampleId_" + super.getStepname() + "_" + index)); //$NON-NLS-1$ //$NON-NLS-2$
						super.setNumberOfLanes(
								_properties.getProperty("NumberOfLanes_" + super.getStepname() + "_" + index)); //$NON-NLS-1$ //$NON-NLS-2$
					}

					if (_properties.getProperty("StepName_" + stepcount).toString().equals("querynamesort")) { //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKQueryNameSort.getSampleIds()
								.add(_properties.getProperty("SampleId_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKQueryNameSort.getStepname() + "_" + index)); //$NON-NLS-1$
						this._argoConfigurationFileGATKQueryNameSort
								.setNumberOfLanes(_properties.getProperty("NumberOfLanes_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKQueryNameSort.getStepname() + "_" + index)); //$NON-NLS-1$
					}

					if (_properties.getProperty("StepName_" + stepcount).toString().equals("markduplicates")) { //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKMarkDuplicate.getSampleIds()
								.add(_properties.getProperty("SampleId_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKMarkDuplicate.getStepname() + "_" + index)); //$NON-NLS-1$
						this._argoConfigurationFileGATKMarkDuplicate
								.setNumberOfLanes(_properties.getProperty("NumberOfLanes_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKMarkDuplicate.getStepname() + "_" + index)); //$NON-NLS-1$
					}

					if (_properties.getProperty("StepName_" + stepcount).toString().equals("mergebams")) { //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKMergeBAMs.getSampleIds().add(_properties.getProperty(
								"SampleId_" + this._argoConfigurationFileGATKMergeBAMs.getStepname() + "_" + index)); //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKMergeBAMs
								.setNumberOfLanes(_properties.getProperty("NumberOfLanes_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKMergeBAMs.getStepname() + "_" + index)); //$NON-NLS-1$
					}

					if (_properties.getProperty("StepName_" + stepcount).toString().equals("coordinatesort")) { //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKCoordinateSort.getSampleIds()
								.add(_properties.getProperty("SampleId_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKCoordinateSort.getStepname() + "_" + index)); //$NON-NLS-1$
						this._argoConfigurationFileGATKCoordinateSort
								.setNumberOfLanes(_properties.getProperty("NumberOfLanes_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKCoordinateSort.getStepname() + "_" + index)); //$NON-NLS-1$
					}

					if (_properties.getProperty("StepName_" + stepcount).toString().equals("bqsr")) { //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKBQSR.getSampleIds().add(_properties.getProperty(
								"SampleId_" + this._argoConfigurationFileGATKBQSR.getStepname() + "_" + index)); //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKBQSR
								.setNumberOfIntervals(_properties.getProperty("NumberOfIntervals_" //$NON-NLS-1$
										+ this._argoConfigurationFileGATKBQSR.getStepname() + "_" + index)); //$NON-NLS-1$
						this._argoConfigurationFileGATKBQSR.setBucket(_properties.getProperty("Bucket_bqsr")); //$NON-NLS-1$
						this._argoConfigurationFileGATKBQSR.setInvokedTemplateBQSR(
								_properties.getProperty("InvokedTemplateFile_bqsr_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKBQSR.setInvokerTemplateBQSR(
								_properties.getProperty("InvokerTemplateFile_bqsr_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKBQSR.setInvokedTemplateApplyBQSR(
								_properties.getProperty("InvokedTemplateFile_applybqsr_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKBQSR.setInvokerTemplateApplyBQSR(
								_properties.getProperty("InvokerTemplateFile_applybqsr_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
						this._argoConfigurationFileGATKBQSR.getLaneids().add("1"); //$NON-NLS-1$
						this._argoConfigurationFileGATKBQSR.setDbSNPFileName(_properties.getProperty("dbSNP_BQSR")); //$NON-NLS-1$
						this._argoConfigurationFileGATKBQSR
								.setGoldStandardIndels(_properties.getProperty("GoldStandardIndels")); //$NON-NLS-1$
						// Add the intervals for BQSR
						for (int innerindex = 1; innerindex <= Integer
								.parseInt(this._argoConfigurationFileGATKBQSR.getNumberOfIntervals()); innerindex++) {
							this._argoConfigurationFileGATKBQSR
									.addInterval(_properties.getProperty("Interval_bqsr_S" + index + "I" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$
						}
					}

					// below parameters are all per-sample ONLY
					// not per-lane
					// reference and resource requirements
					if (this._reference == null) {
						this._reference = _properties.getProperty("Reference_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (this._reference_sa == null) {
						this._reference_sa = _properties.getProperty("ReferenceSAIndexfile_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (this._reference_ann == null) {
						this._reference_ann = _properties.getProperty("ReferenceANNIndexfile_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (this._reference_amb == null) {
						this._reference_amb = _properties.getProperty("ReferenceAMBIndexfile_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (this._reference_bwt == null) {
						this._reference_bwt = _properties.getProperty("ReferenceBWTIndexfile_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (this._reference_dict == null) {
						this._reference_dict = _properties.getProperty("ReferenceDICTIndexfile_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (this._reference_fai == null) {
						this._reference_fai = _properties.getProperty("ReferenceFAIIndexfile_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (this._reference_pac == null) {
						this._reference_pac = _properties.getProperty("ReferencePACIndexfile_S" + index + "L1"); //$NON-NLS-1$ //$NON-NLS-2$
					}

					if (super.getActiveDeadlineSecondsValue() == null) {
						super.setActiveDeadlineSecondsValue(
								_properties.getProperty("ActiveDeadlineSeconds_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (super.getRetryStrategyLimitsValue() == null) {
						super.setRetryStrategyLimitsValue(_properties.getProperty("RetryStrategy_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
					}
					if (super.getGender() == null) {
						super.setGender(_properties.getProperty("Gender_" + index)); //$NON-NLS-1$
					}

					// The resource requirements are set for the entire workflow PER SAMPLE
					// i.e. at the time of bwa-mem
					// Hence S1L1 and bwamem check
					if ((index == 1)
							&& (_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem"))) { //$NON-NLS-1$ //$NON-NLS-2$
						super.getMemoryLimits().add(_properties.getProperty("MemoryLimits_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
						super.getCPULimits().add(_properties.getProperty("CPULimits_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
						super.getMemoryRequests().add(_properties.getProperty("MemoryRequests_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
						super.getCPURequests().add(_properties.getProperty("CPURequests_S" + index + "L1")); //$NON-NLS-1$ //$NON-NLS-2$
					}

					for (int innerindex = 1; innerindex <= Integer.parseInt(super.getNumberOfLanes()); innerindex++) {

						if ((_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem"))) //$NON-NLS-1$ //$NON-NLS-2$
							super.getLaneids()
									.add(_properties.getProperty("LaneId_" + super.getStepname() + "_" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$

						if ((_properties.getProperty("StepName_" + stepcount).toString().equals("querynamesort"))) //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKQueryNameSort.getLaneids()
									.add(_properties.getProperty("LaneId_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKQueryNameSort.getStepname() + "_" //$NON-NLS-1$
											+ innerindex));

						if ((_properties.getProperty("StepName_" + stepcount).toString().equals("markduplicates"))) //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKMarkDuplicate.getLaneids()
									.add(_properties.getProperty("LaneId_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKMarkDuplicate.getStepname() + "_" //$NON-NLS-1$
											+ innerindex));

						if ((innerindex == 1)
								&& ((_properties.getProperty("StepName_" + stepcount).toString().equals("mergebams")))) //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKMergeBAMs.getLaneids().add(_properties.getProperty("LaneId_" //$NON-NLS-1$
									+ this._argoConfigurationFileGATKMergeBAMs.getStepname() + "_" + innerindex)); //$NON-NLS-1$

						if ((innerindex == 1) && ((_properties.getProperty("StepName_" + stepcount).toString() //$NON-NLS-1$
								.equals("coordinatesort")))) //$NON-NLS-1$
							this._argoConfigurationFileGATKCoordinateSort.getLaneids()
									.add(_properties.getProperty("LaneId_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKCoordinateSort.getStepname() + "_" //$NON-NLS-1$
											+ innerindex));

						// Curent support is ONLY for ONE SAMPLE
						// Hence adding the Fastq files across all 4 lanes for only one sample
						// index is the sample-number
						// Also fastq files can be specified only in bwa-mem step
						if ((_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem")) //$NON-NLS-1$ //$NON-NLS-2$
								&& (index == 1)) {
							super.getFastq1List().add(_properties.getProperty("Fastq1_" + innerindex)); //$NON-NLS-1$
							super.getFastq2List().add(_properties.getProperty("Fastq2_" + innerindex)); //$NON-NLS-1$
						}
						// Bucket is set PER LANE at the start i.e. during bwa-mem
						// index = 1 is only because presently only one sample is being supported
						if ((_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem")) //$NON-NLS-1$ //$NON-NLS-2$
								&& (super.getBucketName() == null)) {
							super.setBucketName(_properties.getProperty("Bucket_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$
						}

						if (_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem")) { //$NON-NLS-1$ //$NON-NLS-2$
							super.getBwamemProcessingmode().add(_properties
									.getProperty("Mode_" + super.getStepname() + "_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
							super.getBwaMemTemplateSpecification().add(_properties.getProperty(
									"InvokedTemplateFile_" + super.getStepname() + "_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
							super.getBwaMemWorkflowStepDefinition().add(_properties.getProperty(
									"InvokerTemplateFile_" + super.getStepname() + "_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						}
						if (_properties.getProperty("StepName_" + stepcount).toString().equals("querynamesort")) { //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKQueryNameSort.get_queryNameSortProcessingValue()
									.add(_properties.getProperty(
											"Mode_" + this._argoConfigurationFileGATKQueryNameSort.getStepname() //$NON-NLS-1$
													+ "_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKQueryNameSort.get_queryNameSortTemplateSpecification()
									.add(_properties.getProperty("InvokedTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKQueryNameSort.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" //$NON-NLS-1$
											+ innerindex));
							this._argoConfigurationFileGATKQueryNameSort.get_queryNameSortWorkflowDefinition()
									.add(_properties.getProperty("InvokerTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKQueryNameSort.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" //$NON-NLS-1$
											+ innerindex));
						}
						if (_properties.getProperty("StepName_" + stepcount).toString().equals("markduplicates")) { //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKMarkDuplicate.get_markDuplicatesProcessingValue()
									.add(_properties.getProperty(
											"Mode_" + this._argoConfigurationFileGATKMarkDuplicate.getStepname() //$NON-NLS-1$
													+ "_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKMarkDuplicate.get_markDuplicatesTemplateSpecification()
									.add(_properties.getProperty("InvokedTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKMarkDuplicate.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" //$NON-NLS-1$
											+ innerindex));
							this._argoConfigurationFileGATKMarkDuplicate.get_markDuplicatesWorkflowDefinition()
									.add(_properties.getProperty("InvokerTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKMarkDuplicate.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" //$NON-NLS-1$
											+ innerindex));
						}

						if ((innerindex == 1)
								&& (_properties.getProperty("StepName_" + stepcount).toString().equals("mergebams"))) { //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKMergeBAMs.get_mergeBamsProcessingValue()
									.add(_properties.getProperty(
											"Mode_" + this._argoConfigurationFileGATKMergeBAMs.getStepname() //$NON-NLS-1$
													+ "_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$
							this._argoConfigurationFileGATKMergeBAMs.get_mergeBamsTemplateSpecification()
									.add(_properties.getProperty("InvokedTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKMergeBAMs.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" + innerindex)); //$NON-NLS-1$
							this._argoConfigurationFileGATKMergeBAMs.get_mergeBamsWorkflowDefinition()
									.add(_properties.getProperty("InvokerTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKMergeBAMs.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" + innerindex)); //$NON-NLS-1$
						}

						if ((innerindex == 1) && (_properties.getProperty("StepName_" + stepcount).toString() //$NON-NLS-1$
								.equals("coordinatesort"))) { //$NON-NLS-1$
							this._argoConfigurationFileGATKCoordinateSort.get_coordinateSortProcessingValue()
									.add(_properties.getProperty(
											"Mode_" + this._argoConfigurationFileGATKCoordinateSort.getStepname() + "_S" //$NON-NLS-1$ //$NON-NLS-2$
													+ index + "L" + innerindex)); //$NON-NLS-1$
							this._argoConfigurationFileGATKCoordinateSort.get_coordinateSortTemplateSpecification()
									.add(_properties.getProperty("InvokedTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKCoordinateSort.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" + innerindex)); //$NON-NLS-1$
							this._argoConfigurationFileGATKCoordinateSort.get_coordinateSortWorkflowDefinition()
									.add(_properties.getProperty("InvokerTemplateFile_" //$NON-NLS-1$
											+ this._argoConfigurationFileGATKCoordinateSort.getStepname() + "_S" + index //$NON-NLS-1$
											+ "L" + innerindex)); //$NON-NLS-1$
						}

						if (_properties.getProperty("StepName_" + stepcount).toString().equals("bwamem")) { //$NON-NLS-1$ //$NON-NLS-2$
							super.setAlignedBAMFileGlobalName(
									_properties.getProperty("GlobalNameBam_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$
							super.setBAIIndexFIleGlobalName(
									_properties.getProperty("GlobalNameBai_S" + index + "L" + innerindex)); //$NON-NLS-1$ //$NON-NLS-2$

							_templateSpecification = _templateSpecification
									+ super.writeArgoBwaMemTemplateSpecification(
											getClass().getClassLoader()
													.getResource(super.getBwaMemTemplateSpecification()
															.get(innerindex - 1).toString().trim())
													.getFile(),
											index, super.getSampleIds().get(index - 1),
											super.getLaneids().get(innerindex - 1));
							_workflowDefinition = _workflowDefinition + super.writeArgoBwaMemWorkflowStepDefinition(
									getClass().getClassLoader()
											.getResource(super.getBwaMemWorkflowStepDefinition().get(innerindex - 1)
													.toString().trim())
											.getFile(),
									innerindex, super.getSampleIds().get(index - 1),
									super.getLaneids().get(innerindex - 1), this._reference_sa, this._reference_pac,
									this._reference_fai, this._reference_ann, this._reference_amb, this._reference_bwt,
									this._reference_dict, this._reference);
						}

						if (_properties.getProperty("StepName_" + stepcount).toString().equals("querynamesort")) { //$NON-NLS-1$ //$NON-NLS-2$
							_templateSpecification = _templateSpecification
									+ this._argoConfigurationFileGATKQueryNameSort.writeArgoGATKQueryNameSortTemplate(
											getClass().getClassLoader()
													.getResource(this._argoConfigurationFileGATKQueryNameSort
															.get_queryNameSortTemplateSpecification()
															.get(innerindex - 1).toString().trim())
													.getFile(),
											index,
											this._argoConfigurationFileGATKQueryNameSort.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKQueryNameSort.getLaneids()
													.get(innerindex - 1),
											this);
							_workflowDefinition = _workflowDefinition + this._argoConfigurationFileGATKQueryNameSort
									.writeArgoGATKQueryNameSortTemplateWorkflowStep(
											getClass()
													.getClassLoader()
													.getResource(this._argoConfigurationFileGATKQueryNameSort
															.get_queryNameSortWorkflowDefinition().get(innerindex - 1)
															.toString().trim())
													.getFile(),
											this._argoConfigurationFileGATKQueryNameSort.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKQueryNameSort.getLaneids()
													.get(innerindex - 1));
						}

						if (_properties.getProperty("StepName_" + stepcount).toString().equals("markduplicates")) { //$NON-NLS-1$ //$NON-NLS-2$
							_templateSpecification = _templateSpecification
									+ this._argoConfigurationFileGATKMarkDuplicate.writeArgoMarkDuplicatesTemplate(
											getClass().getClassLoader()
													.getResource(this._argoConfigurationFileGATKMarkDuplicate
															.get_markDuplicatesTemplateSpecification()
															.get(innerindex - 1).toString().trim())
													.getFile(),
											index,
											this._argoConfigurationFileGATKMarkDuplicate.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKMarkDuplicate.getLaneids()
													.get(innerindex - 1),
											this._argoConfigurationFileGATKQueryNameSort.getStepname(), this);
							_workflowDefinition = _workflowDefinition + this._argoConfigurationFileGATKMarkDuplicate
									.writeArgoMarkDuplicatesTemplateWorkflowStep(
											getClass()
													.getClassLoader()
													.getResource(this._argoConfigurationFileGATKMarkDuplicate
															.get_markDuplicatesWorkflowDefinition().get(innerindex - 1)
															.toString().trim())
													.getFile(),

											this._argoConfigurationFileGATKMarkDuplicate.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKMarkDuplicate.getLaneids()
													.get(innerindex - 1),
											this._argoConfigurationFileGATKQueryNameSort.getStepname(), this);
						}

						if ((innerindex == 1)
								&& (_properties.getProperty("StepName_" + stepcount).toString().equals("mergebams"))) { //$NON-NLS-1$ //$NON-NLS-2$
							_templateSpecification = _templateSpecification + this._argoConfigurationFileGATKMergeBAMs
									.writeArgoMergeBAMsTemplateSpecification(
											getClass()
													.getClassLoader()
													.getResource(this._argoConfigurationFileGATKMergeBAMs
															.get_mergeBamsTemplateSpecification().get(innerindex - 1)
															.toString().trim())
													.getFile(),
											index,
											this._argoConfigurationFileGATKMergeBAMs.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKMergeBAMs.getLaneids().get(innerindex - 1),
											this._argoConfigurationFileGATKMarkDuplicate.getStepname(),
											this._argoConfigurationFileGATKMarkDuplicate.getLaneids().size(), this);

							_workflowDefinition = _workflowDefinition + this._argoConfigurationFileGATKMergeBAMs
									.writeArgoMergeBamsTemplateWorkflowStep(
											getClass()
													.getClassLoader()
													.getResource(this._argoConfigurationFileGATKMergeBAMs
															.get_mergeBamsWorkflowDefinition().get(innerindex - 1)
															.toString().trim())
													.getFile(),
											this._argoConfigurationFileGATKMergeBAMs.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKMergeBAMs.getLaneids().get(innerindex - 1),
											this._argoConfigurationFileGATKMergeBAMs.getStepname(),
											Integer.parseInt(
													this._argoConfigurationFileGATKMarkDuplicate.getNumberOfLanes()),
											this, this._argoConfigurationFileGATKMarkDuplicate);

						}

						if ((innerindex == 1) && (_properties.getProperty("StepName_" + stepcount).toString() //$NON-NLS-1$
								.equals("coordinatesort"))) { //$NON-NLS-1$
							_templateSpecification = _templateSpecification
									+ this._argoConfigurationFileGATKCoordinateSort.writeArgoGATKCoordinateSortTemplate(
											getClass()
													.getClassLoader()
													.getResource(this._argoConfigurationFileGATKCoordinateSort
															.get_coordinateSortTemplateSpecification()
															.get(innerindex - 1).toString().trim())
													.getFile(),
											index,
											this._argoConfigurationFileGATKCoordinateSort.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKCoordinateSort.getLaneids()
													.get(innerindex - 1),
											this._argoConfigurationFileGATKMergeBAMs.getStepname(), this);
							_workflowDefinition = _workflowDefinition + this._argoConfigurationFileGATKCoordinateSort
									.writeArgoGATKCoordinateSortTemplateWorkflowStep(
											getClass()
													.getClassLoader()
													.getResource(this._argoConfigurationFileGATKCoordinateSort
															.get_coordinateSortWorkflowDefinition().get(innerindex - 1)
															.toString().trim())
													.getFile(),
											this._argoConfigurationFileGATKMarkDuplicate.getSampleIds().get(index - 1),
											this._argoConfigurationFileGATKMarkDuplicate.getLaneids()
													.get(innerindex - 1),
											this._argoConfigurationFileGATKMergeBAMs.getStepname(),
											this._argoConfigurationFileGATKMarkDuplicate.getStepname());

						}

					}

					if (_properties.getProperty("StepName_" + stepcount).toString().equals("bqsr")) { //$NON-NLS-1$ //$NON-NLS-2$
						for (int innerindex = 1; innerindex <= Integer
								.parseInt(this._argoConfigurationFileGATKBQSR.getNumberOfIntervals()); innerindex++) {

							// generate template spec for bqsr
							// generate workflow step spec for bqsr
							// generate template spec for applybqsr
							// generate workflow step spec for applybqsr
							_templateSpecification = _templateSpecification
									+ this._argoConfigurationFileGATKBQSR.writeArgoGATKBQSRTemplate(
											getClass().getClassLoader()
													.getResource(this._argoConfigurationFileGATKBQSR
															.getInvokedTemplateBQSR())
													.getFile(),
											index, this._argoConfigurationFileGATKBQSR.getSampleIds().get(index - 1),
											"Interval" + Integer.toString(innerindex), //$NON-NLS-1$
											this);
							_templateSpecification = _templateSpecification
									+ this._argoConfigurationFileGATKBQSR.writeArgoGATKApplyBQSRTemplate(
											getClass().getClassLoader()
													.getResource(this._argoConfigurationFileGATKBQSR
															.getInvokedTemplateApplyBQSR())
													.getFile(),
											index, this._argoConfigurationFileGATKBQSR.getSampleIds().get(index - 1),
											"Interval" + Integer.toString(innerindex), //$NON-NLS-1$
											this);
							_workflowDefinition = _workflowDefinition
									+ this._argoConfigurationFileGATKBQSR.writeArgoGATKBQSRWorkflowStepsDefinition(
											getClass().getClassLoader()
													.getResource(this._argoConfigurationFileGATKBQSR
															.getInvokerTemplateBQSR().toString().trim())
													.getFile(),
											this._argoConfigurationFileGATKBQSR.getSampleIds().get(index - 1),
											"Interval" + Integer.toString(innerindex), this, //$NON-NLS-1$
											this._argoConfigurationFileGATKCoordinateSort,
											this._argoConfigurationFileGATKBQSR.getLaneids().get(index - 1),
											this._reference_sa, this._reference_pac, this._reference_fai,
											this._reference_ann, this._reference_amb, this._reference_bwt,
											this._reference_dict, this._reference,
											this._argoConfigurationFileGATKBQSR.getDbSNPFileName(),
											this._argoConfigurationFileGATKBQSR.getGoldStandardIndels(),
											this._argoConfigurationFileGATKBQSR.getIntervalsList().get(innerindex - 1));
							_workflowDefinition = _workflowDefinition
									+ this._argoConfigurationFileGATKBQSR.writeArgoGATKApplyBQSRWorkflowStepsDefinition(
											getClass().getClassLoader()
													.getResource(this._argoConfigurationFileGATKBQSR
															.getInvokerTemplateApplyBQSR().toString().trim())
													.getFile(),
											this._argoConfigurationFileGATKBQSR.getSampleIds().get(index - 1),
											"Interval" + Integer.toString(innerindex), this, //$NON-NLS-1$
											this._argoConfigurationFileGATKCoordinateSort, this._argoConfigurationFileGATKBQSR.getLaneids().get(index - 1),
											this._reference_sa, this._reference_pac, this._reference_fai,
											this._reference_ann, this._reference_amb, this._reference_bwt,
											this._reference_dict, this._reference);

						}
					}
				}
				stepcount += 1;
			}
			GenericUtilities.writeWorkflowToFileUsingBufferedWritter_thenCorrect(
					_templateSpecification + _workflowDefinition, this._outputfilename);

		} catch (Exception e) {
			System.out.println("Exception: " + e); //$NON-NLS-1$
			e.printStackTrace();
		} finally {
			this._inputStream.close();
			System.out.println("Workflow written to " + this._outputfilename); //$NON-NLS-1$
		}
	}

	/**
	 * Sets the workflowsteps enum.
	 *
	 * @param _workflowstepsrevised the new workflowsteps enum
	 */
	public void set_workflowsteps(WorkflowStepsList _workflowstepsrevised) {
		try {
			this._workflowsteps = _workflowstepsrevised;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the configfilename.
	 *
	 * @param configfilename the new configfilename
	 */
	public void setConfigfilename(String configfilename) {
		try {
			this._configfilename = configfilename;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the input stream.
	 *
	 * @param inputStream the new input stream
	 */
	public void setInputStream(InputStream inputStream) {
		try {
			this._inputStream = inputStream;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference.
	 *
	 * @param reference the new reference
	 */
	public void setReference(String reference) {
		try {
			this._reference = reference;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference amb.
	 *
	 * @param reference_amb the new reference amb
	 */
	public void setReference_amb(String reference_amb) {
		try {
			this._reference_amb = reference_amb;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference ann.
	 *
	 * @param reference_ann the new reference ann
	 */
	public void setReference_ann(String reference_ann) {
		try {
			this._reference_ann = reference_ann;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference bwt.
	 *
	 * @param reference_bwt the new reference bwt
	 */
	public void setReference_bwt(String reference_bwt) {
		try {
			this._reference_bwt = reference_bwt;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference dict.
	 *
	 * @param reference_dict the new reference dict
	 */
	public void setReference_dict(String reference_dict) {
		try {
			this._reference_dict = reference_dict;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference fai.
	 *
	 * @param reference_fai the new reference fai
	 */
	public void setReference_fai(String reference_fai) {
		try {
			this._reference_fai = reference_fai;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference pac.
	 *
	 * @param reference_pac the new reference pac
	 */
	public void setReference_pac(String reference_pac) {
		try {
			this._reference_pac = reference_pac;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the reference sa.
	 *
	 * @param reference_sa the new reference sa
	 */
	public void setReference_sa(String reference_sa) {
		try {
			this._reference_sa = reference_sa;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		try {
			return "BwaMemConfigFileParser [_reference=" + this._reference + ", _reference_ann=" + this._reference_ann //$NON-NLS-1$ //$NON-NLS-2$
					+ ", _reference_amb=" + this._reference_amb + ", _reference_bwt=" + this._reference_bwt //$NON-NLS-1$ //$NON-NLS-2$
					+ ", _reference_fai=" //$NON-NLS-1$
					+ this._reference_fai + ", _reference_dict=" + this._reference_dict + ", _reference_pac=" //$NON-NLS-1$ //$NON-NLS-2$
					+ this._reference_pac + ", _reference_sa=" + this._reference_sa + ", _configfilename=" //$NON-NLS-1$ //$NON-NLS-2$
					+ this._configfilename + ", _inputStream=" //$NON-NLS-1$
					+ this._inputStream + ", _workflowsteps=" + this._workflowsteps //$NON-NLS-1$
					+ ", _querynamesortconfigfileparser=" //$NON-NLS-1$
					+ this._argoConfigurationFileGATKQueryNameSort + ", _markduplicatesconfigfileparser=" //$NON-NLS-1$
					+ this._argoConfigurationFileGATKMarkDuplicate + ", _argoinvokertemplateheaderfile=" //$NON-NLS-1$
					+ this._argoWorkflowDefinitionFileHeader + ", _argoinvokedtemplateheaderfile=" //$NON-NLS-1$
					+ this._argoTemplateSpecificationHeader + "]"; //$NON-NLS-1$
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
