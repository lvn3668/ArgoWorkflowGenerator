/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.util.LinkedList;

import argoconfigurationfileutilities.BwaMemUtilities;
import argoconfigurationfileutilities.GenericUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoTemplateProducerBwaMem.
 */
public class ArgoTemplateProducerBwaMem extends ArgoConfigurationFileBase {

	/** The active deadline seconds value. */
	private String _activeDeadlineSecondsValue;

	/** The aligned BAM file global name. */
	private String _alignedBAMFileGlobalName;

	/** The BAI index file global name. */
	private String _BAIIndexFileGlobalName;

	/** The bucket. */
	private String _bucket;

	/** The bwa mem processing. */
	private LinkedList<String> _bwaMemProcessing;

	/** The bwa mem template definition. */
	private LinkedList<String> _bwaMemTemplateDefinition;

	/** The bwa mem utilities class. */
	private BwaMemUtilities _bwaMemUtilitiesClass;

	/** The bwa mem workflow call definition. */
	private LinkedList<String> _bwaMemWorkflowCallDefinition;

	/** The generic utilities class. */
	private GenericUtilities _genericUtilitiesClass;

	/** The retry strategy limits value. */
	private String _retryStrategyLimitsValue;

	/**
	 * Instantiates a new bwa mem template generator.
	 */
	public ArgoTemplateProducerBwaMem() {
		// TODO Auto-generated constructor stub
		super();
		try {
			this._bucket = null;
			this._alignedBAMFileGlobalName = null;
			this._BAIIndexFileGlobalName = null;
			super.setMemoryLimits(new LinkedList<String>());
			super.setCPULimits(new LinkedList<String>());
			super.setMemoryRequests(new LinkedList<String>());
			super.setCPURequests(new LinkedList<String>());
			this._bwaMemProcessing = new LinkedList<>();
			this._bwaMemTemplateDefinition = new LinkedList<>();
			this._bwaMemWorkflowCallDefinition = new LinkedList<>();
			this._activeDeadlineSecondsValue = null;
			this._retryStrategyLimitsValue = null;
			this._genericUtilitiesClass = new GenericUtilities();
			this._bwaMemUtilitiesClass = new BwaMemUtilities();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Gets the active deadline seconds value.
	 *
	 * @return the active deadline seconds value
	 */
	public String getActiveDeadlineSecondsValue() {
		try {
			return this._activeDeadlineSecondsValue;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the aligned BA mglobalname.
	 *
	 * @return the aligned BA mglobalname
	 */
	public String getAlignedBAMglobalname() {
		try {
			return this._alignedBAMFileGlobalName;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the BAI file global name.
	 *
	 * @return the BAI file global name
	 */
	public String getBAIFileGlobalName() {
		try {
			return this._BAIIndexFileGlobalName;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the bucket name.
	 *
	 * @return the bucket name
	 */
	public String getBucketName() {
		try {
			return this._bucket;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the bwamem processingmode.
	 *
	 * @return the bwamem processingmode
	 */
	public LinkedList<String> getBwamemProcessingmode() {
		try {
			return this._bwaMemProcessing;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the bwa mem template specification.
	 *
	 * @return the bwa mem template specification
	 */
	public LinkedList<String> getBwaMemTemplateSpecification() {
		try {
			return this._bwaMemTemplateDefinition;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the bwa mem utilities class.
	 *
	 * @return the bwa mem utilities class
	 */
	public BwaMemUtilities getBwaMemUtilitiesClass() {
		try {
			return this._bwaMemUtilitiesClass;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the bwa mem workflow step definition.
	 *
	 * @return the bwa mem workflow step definition
	 */
	public LinkedList<String> getBwaMemWorkflowStepDefinition() {
		try {
			return this._bwaMemWorkflowCallDefinition;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the retry strategy limits value.
	 *
	 * @return the retry strategy limits value
	 */
	public String getRetryStrategyLimitsValue() {
		try {
			return this._retryStrategyLimitsValue;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the utilities class.
	 *
	 * @return the utilities class
	 */
	public GenericUtilities getUtilitiesClass() {
		try {
			return this._genericUtilitiesClass;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Sets the active deadline seconds value.
	 *
	 * @param activeDeadlineSeconds the new active deadline seconds value
	 */
	public void setActiveDeadlineSecondsValue(String activeDeadlineSeconds) {
		try {
			this._activeDeadlineSecondsValue = activeDeadlineSeconds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the aligned BAM file global name.
	 *
	 * @param alignedBAMglobalname the new aligned BAM file global name
	 */
	public void setAlignedBAMFileGlobalName(String alignedBAMglobalname) {
		try {
			this._alignedBAMFileGlobalName = alignedBAMglobalname;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the BAI index F ile global name.
	 *
	 * @param alignedBAIglobalname the new BAI index F ile global name
	 */
	public void setBAIIndexFIleGlobalName(String alignedBAIglobalname) {
		try {
			this._BAIIndexFileGlobalName = alignedBAIglobalname;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the bucket name.
	 *
	 * @param bucket the new bucket name
	 */
	public void setBucketName(String bucket) {
		try {
			this._bucket = bucket;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Sets the bwamem processingmode.
	 *
	 * @param bwamemmode the new bwamem processingmode
	 */
	public void setBwamemProcessingmode(LinkedList<String> bwamemmode) {
		try {
			this._bwaMemProcessing = bwamemmode;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * Sets the bwa mem template specification.
	 *
	 * @param bwameminvokedtemplate the new bwa mem template specification
	 */
	public void setBwaMemTemplateSpecification(LinkedList<String> bwameminvokedtemplate) {
		try {
			this._bwaMemTemplateDefinition = bwameminvokedtemplate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the bwa mem utilities class.
	 *
	 * @param _bwamemutilities the new bwa mem utilities class
	 */
	public void setBwaMemUtilitiesClass(BwaMemUtilities _bwamemutilities) {
		try {
			this._bwaMemUtilitiesClass = _bwamemutilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the bwa mem workflow step definition.
	 *
	 * @param bwameminvokertemplate the new bwa mem workflow step definition
	 */
	public void setBwaMemWorkflowStepDefinition(LinkedList<String> bwameminvokertemplate) {
		try {
			this._bwaMemWorkflowCallDefinition = bwameminvokertemplate;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * Sets the retry strategy limits value.
	 *
	 * @param retryStrategyLimits the new retry strategy limits value
	 */
	public void setRetryStrategyLimitsValue(String retryStrategyLimits) {
		try {
			this._retryStrategyLimitsValue = retryStrategyLimits;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * Sets the utilities class.
	 *
	 * @param _utilities the new utilities class
	 */
	public void setUtilitiesClass(GenericUtilities _utilities) {
		try {
			this._genericUtilitiesClass = _utilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Generate bwa mem invoked template for sample and lane.
	 *
	 * @param templatespecification the invokedtemplatefilename
	 * @param sampleIndex           the sampleindex
	 * @param sampleId              the sampleid
	 * @param laneId                the laneid
	 * @return the string
	 * @throws Exception       the exception
	 * @throws BwaMemException the bwa mem exception
	 */
	public String writeArgoBwaMemTemplateSpecification(String templatespecification, int sampleIndex, String sampleId,
			String laneId) throws Exception, BwaMemException {
		try {
			File file = new File(templatespecification);
			return (GenericUtilities.amendNameOfTemplateInTemplateSpecification(
					BwaMemUtilities.amendBAIGlobalNameInOutputArtifactsBWAMEMTemplateSpecification(
							BwaMemUtilities.amendAlignedBAMGlobalNameInOutputArtifactsBWAMEM(BwaMemUtilities
									.amendBAINameInOutputArtifactsBWAMEMTemplateDefinition(BwaMemUtilities
											.amendAlignedBAMNameInOutputArtifactsBWAMEMTemplateDefinition(
													GenericUtilities
															.amendGlobalNameOfLaneIdInOutputParametersOfTemplateSpecification(
																	GenericUtilities
																			.amendLaneIdInOutputParametersOfTemplateSpecification(
																					GenericUtilities
																							.amendGlobalNameOfSampleIdInOutputParametersOfTemplateSpecification(
																									GenericUtilities
																											.amendSampleIdInOutputParametersOfTemplateSpecification(
																													GenericUtilities
																															.amendCPURequestsinResourcesOfTemplateSpecification(
																																	GenericUtilities
																																			.amendMemoryRequestsinResourcesOfTemplateSpecification(
																																					GenericUtilities
																																							.amendCPULimitsinResourcesOfTemplateSpecification(
																																									GenericUtilities
																																											.amendMemoryLimitsinResourcesOfTemplateSpecification(
																																													GenericUtilities
																																															.amendRetryStrategyusingLimitsInTemplateSpecification(
																																																	GenericUtilities
																																																			.amendActiveDeadlineSecondsValueInTemplateSpecification(
																																																					GenericUtilities
																																																							.amendBucketNameInTemplateSpecification(
																																																									GenericUtilities
																																																											.convertFileToString(
																																																													file),
																																																									this._bucket),
																																																					this._activeDeadlineSecondsValue),
																																																	this._retryStrategyLimitsValue),
																																													super.getMemoryLimits()
																																															.get(sampleIndex
																																																	- 1)),
																																									super.getCPULimits()
																																											.get(sampleIndex
																																													- 1)),
																																					super.getMemoryRequests()
																																							.get(sampleIndex
																																									- 1)),
																																	super.getCPURequests()
																																			.get(sampleIndex
																																					- 1)),
																													sampleId,
																													laneId),
																									sampleId, laneId),
																					sampleId, laneId),
																	sampleId, laneId),
													super.getStepname(), sampleId, laneId),
											super.getStepname(), sampleId, laneId),
									super.getStepname(), sampleId, laneId),
							super.getStepname(), sampleId, laneId),
					super.getStepname(), sampleId, laneId));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Generate bwa mem invoker template.
	 *
	 * @param workflowdefinition the invokertemplatefilename
	 * @param laneindex          the laneindex
	 * @param sampleId           the sampleid
	 * @param laneId             the laneid
	 * @param reference_sa       the reference sa
	 * @param reference_pac      the reference pac
	 * @param reference_fai      the reference fai
	 * @param reference_ann      the reference ann
	 * @param reference_amb      the reference amb
	 * @param reference_bwt      the reference bwt
	 * @param reference_dict     the reference dict
	 * @param reference          the reference
	 * @return the string
	 * @throws Exception       the exception
	 * @throws BwaMemException the bwa mem exception
	 */
	public String writeArgoBwaMemWorkflowStepDefinition(String workflowdefinition, int laneindex, String sampleId,
			String laneId, String reference_sa, String reference_pac, String reference_fai, String reference_ann,
			String reference_amb, String reference_bwt, String reference_dict, String reference)
			throws Exception, BwaMemException {
		try {
			File file = new File(workflowdefinition);
			return (BwaMemUtilities.amendGenderInWorkflowDefinitionBWAMEM(
					BwaMemUtilities.amendReferenceFilesFastaDictInWorkflowDefinitionBWAMEM(
							BwaMemUtilities.amendReferenceFilesFastaInWorkflowDefinitionBWAMEM(BwaMemUtilities
									.amendReferenceFilesAmbIndexInWorkflowDefinitionBWAMEM(BwaMemUtilities
											.amendReferenceFilesAnnIndexInWorkflowDefinitionBWAMEM(BwaMemUtilities
													.amendReferenceFilesBwtIndexInWorkflowDefinitionBWAMEM(
															BwaMemUtilities
																	.amendReferenceFilesFaiIndexInWorkflowDefinitionBWAMEM(
																			BwaMemUtilities
																					.amendReferenceFilesPacIndexInWorkflowDefinitionBWAMEM(
																							BwaMemUtilities
																									.amendReferenceFilesSaIndexInWorkflowDefinitionBWAMEM(
																											BwaMemUtilities
																													.amendFastq2InWorkflowDefinitionBWAMEM(
																															BwaMemUtilities
																																	.amendFastq1InWorkflowDefinitionBWAMEMTemplateDefinition(
																																			BwaMemUtilities
																																					.amendLaneIdInWorkflowDefinitionBWAMEM(
																																							BwaMemUtilities
																																									.amendSampleIdInWorkflowDefinitionBWAMEM(
																																											BwaMemUtilities
																																													.amendTemplateSpecificationNameInWorkflowDefinitionBWAMEM(
																																															BwaMemUtilities
																																																	.amendWorkflowDefinitionNameBWAMEM(
																																																			GenericUtilities
																																																					.amendBucketNameInTemplateSpecification(
																																																							GenericUtilities
																																																									.convertFileToString(
																																																											file),
																																																							this._bucket),
																																																			sampleId,
																																																			laneId),
																																															sampleId,
																																															laneId),
																																											sampleId),
																																							laneId),
																																			super.getFastq1List()
																																					.get(laneindex
																																							- 1)),
																															super.getFastq2List()
																																	.get(laneindex
																																			- 1)),
																											reference_sa),
																							reference_pac),
																			reference_fai),
															reference_bwt),
													reference_ann),
											reference_amb),
									reference),
							reference_dict),
					super.getGender()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
