/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.util.LinkedList;

import argoconfigurationfileutilities.GenericUtilities;
import argoconfigurationfileutilities.MergeBamsUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoTemplateProducerMergeBAMs.
 */
public class ArgoTemplateProducerMergeBAMs extends ArgoConfigurationFileBase {

	/** The argo bwa mem template producer. */
	private ArgoTemplateProducerBwaMem _argoBwaMemTemplateProducer;

	/** The generic utilities class. */
	private GenericUtilities _genericUtilitiesClass;

	/** The merge bams processing value. */
	private LinkedList<String> _mergeBamsProcessingValue;

	/** The merge bams template specification. */
	private LinkedList<String> _mergeBamsTemplateSpecification;

	/** The merge bams utilities class. */
	private MergeBamsUtilities _mergeBamsUtilitiesClass;

	/** The merge bams workflow definition. */
	private LinkedList<String> _mergeBamsWorkflowDefinition;

	/**
	 * Instantiates a new mark duplicates template generator.
	 */
	public ArgoTemplateProducerMergeBAMs() {
		super();
		try {
			this._mergeBamsProcessingValue = new LinkedList<>();
			this._mergeBamsTemplateSpecification = new LinkedList<>();
			this._mergeBamsWorkflowDefinition = new LinkedList<>();
			this._genericUtilitiesClass = new GenericUtilities();
			this._mergeBamsUtilitiesClass = new MergeBamsUtilities();
			this._argoBwaMemTemplateProducer = new ArgoTemplateProducerBwaMem();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the bwamemtemplategenerator.
	 *
	 * @return the bwamemtemplategenerator
	 */
	public ArgoTemplateProducerBwaMem get_argoBwaMemTemplateProducer() {
		try {
			return this._argoBwaMemTemplateProducer;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the genericutilities.
	 *
	 * @return the genericutilities
	 */
	public GenericUtilities get_genericUtilitiesClass() {
		try {
			return this._genericUtilitiesClass;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the mergebamsmode.
	 *
	 * @return the mergebamsmode
	 */
	public LinkedList<String> get_mergeBamsProcessingValue() {
		try {
			return this._mergeBamsProcessingValue;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the mergebamsinvokedtemplate.
	 *
	 * @return the mergebamsinvokedtemplate
	 */
	public LinkedList<String> get_mergeBamsTemplateSpecification() {
		try {
			return this._mergeBamsTemplateSpecification;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the mergebamsutilities.
	 *
	 * @return the mergebamsutilities
	 */
	public MergeBamsUtilities get_mergeBamsUtilitiesClass() {
		try {
			return this._mergeBamsUtilitiesClass;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the mergebamsinvokertemplate.
	 *
	 * @return the mergebamsinvokertemplate
	 */
	public LinkedList<String> get_mergeBamsWorkflowDefinition() {
		try {
			return this._mergeBamsWorkflowDefinition;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Sets the bwamemtemplategenerator.
	 *
	 * @param argotemplateproducerbwamem the new bwamemtemplategenerator
	 */
	public void set_argoBwaMemTemplateProducer(ArgoTemplateProducerBwaMem argotemplateproducerbwamem) {
		try {
			this._argoBwaMemTemplateProducer = argotemplateproducerbwamem;
			this._argoBwaMemTemplateProducer.setCPULimits(argotemplateproducerbwamem.getCPULimits());
			this._argoBwaMemTemplateProducer.setMemoryLimits(argotemplateproducerbwamem.getMemoryLimits());
			this._argoBwaMemTemplateProducer.setCPURequests(argotemplateproducerbwamem.getCPURequests());
			this._argoBwaMemTemplateProducer.setMemoryRequests(argotemplateproducerbwamem.getMemoryRequests());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	/**
	 * Sets the genericutilities.
	 *
	 * @param _genericutilities the new genericutilities
	 */
	public void set_genericUtilitiesClass(GenericUtilities _genericutilities) {
		try {
			this._genericUtilitiesClass = _genericutilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the mergebamsmode.
	 *
	 * @param _markduplicatessortmode the new mergebamsmode
	 */
	public void set_mergeBamsProcessingValue(LinkedList<String> _mergebamsmode) {
		try {
			this._mergeBamsProcessingValue = _mergebamsmode;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the mergebamsinvokedtemplate.
	 *
	 * @param _mergebamsinvokedtemplate the new mergebamsinvokedtemplate
	 */
	public void set_mergeBamsTemplateSpecification(LinkedList<String> _mergebamsinvokedtemplate) {
		try {
			this._mergeBamsTemplateSpecification = _mergebamsinvokedtemplate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the mergebamsutilities.
	 *
	 * @param mergebamsutilities the new mergebamsutilities
	 */
	public void set_mergeBamsUtilitiesClass(MergeBamsUtilities mergebamsutilities) {
		try {
			this._mergeBamsUtilitiesClass = mergebamsutilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the mergebansinvokertemplate.
	 *
	 * @param _mergebamsinvokertemplate the new mergebamsinvokertemplate
	 */
	public void set_mergeBamsWorkflowDefinition(LinkedList<String> _mergebamsinvokertemplate) {
		try {
			this._mergeBamsWorkflowDefinition = _mergebamsinvokertemplate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Generate mergebams invoked template for sample and lane.
	 *
	 * @param invokedtemplatefilename    the invokedtemplatefilename
	 * @param sampleindex                the sampleindex
	 * @param sampleId                   the sampleid
	 * @param laneId                     the laneid
	 * @param previousstepname           the previousstepname
	 * @param argotemplateproducerbwamem the bwamemtemplategenerator
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoMergeBAMsTemplateSpecification(String invokedtemplatefilename, int sampleindex,
			String sampleId, String laneId, String previousstepname, int numberOfLanesInPreviousStep,
			ArgoTemplateProducerBwaMem argotemplateproducerbwamem) throws Exception {

		try {
			File file = new File(invokedtemplatefilename);
			set_argoBwaMemTemplateProducer(argotemplateproducerbwamem);
			return (MergeBamsUtilities.amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationMergeBAMs(
					MergeBamsUtilities.amendInputInArgsOfTemplateSpecificationMergeBAMs(MergeBamsUtilities
							.amendBAMandPathInInputArtifactsOfTemplateSpecificationMergeBAMs(MergeBamsUtilities
									.amendBAMNameInOutputArtifactsOfTemplateSpecificationMergeBAMs(GenericUtilities
											.amendNameOfGlobalLogFileInTemplateSpecification(GenericUtilities
													.amendLogFileNameInTemplateSpecification(GenericUtilities
															.amendNameOfTemplateInTemplateSpecification(GenericUtilities
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
																																																			this._argoBwaMemTemplateProducer
																																																					.getBucketName()),
																																															this._argoBwaMemTemplateProducer
																																																	.getActiveDeadlineSecondsValue()),
																																											this._argoBwaMemTemplateProducer
																																													.getRetryStrategyLimitsValue()),
																																							this._argoBwaMemTemplateProducer
																																									.getMemoryLimits()
																																									.get(sampleindex
																																											- 1)),
																																			this._argoBwaMemTemplateProducer
																																					.getCPULimits()
																																					.get(sampleindex
																																							- 1)),
																															this._argoBwaMemTemplateProducer
																																	.getMemoryRequests()
																																	.get(sampleindex
																																			- 1)),
																											this._argoBwaMemTemplateProducer
																													.getCPURequests()
																													.get(sampleindex
																															- 1)),

																							sampleId, laneId),
																			sampleId, laneId),
																	super.getStepname(), sampleId, laneId),
															super.getStepname(), sampleId, laneId),
													super.getStepname(), sampleId, laneId),
											super.getStepname(), sampleId, laneId),
									previousstepname, sampleId, numberOfLanesInPreviousStep),
							previousstepname, sampleId, numberOfLanesInPreviousStep),
					super.getStepname(), previousstepname, sampleId, laneId));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Generate merge bams invoked template for sample and lane.
	 *
	 * @param workflowStepTemplateFile    the invokedtemplatefilename
	 * @param sampleId                    the sampleid
	 * @param laneId                      the laneid
	 * @param previousStepName            the previous step name
	 * @param _ArgoTemplateProducerBwaMem the argo template producer bwa mem
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoMergeBamsTemplateWorkflowStep(String workflowStepTemplateFile, String sampleId,
			String laneId, String previousStepName, int numberOfLanesInPreviousStep,
			ArgoTemplateProducerBwaMem _ArgoTemplateProducerBwaMem,
			ArgoTemplateProducerMarkDuplicate _ArgoTemplateProducerMarkDuplicate) throws Exception {

		try {
			File file = new File(workflowStepTemplateFile);
			set_argoBwaMemTemplateProducer(_ArgoTemplateProducerBwaMem);
			return (MergeBamsUtilities.amendBAMandKeyInInputArtifactsOfWorkflowDefinitionMergeBAMs(

					MergeBamsUtilities
							.amendSampleIdInWorkflowDefinitionMergeBAMs(
									MergeBamsUtilities.amendTemplateSpecificationNameInWorkflowDefinitionMergeBAMs(
											MergeBamsUtilities.amendWorkflowDefinitionNameMergeBAMs(
													GenericUtilities.amendBucketNameInTemplateSpecification(
															GenericUtilities.convertFileToString(file),
															_ArgoTemplateProducerBwaMem.getBucketName()),
													super.getStepname(), sampleId, laneId),
											sampleId, laneId),
									sampleId),

					sampleId, laneId, numberOfLanesInPreviousStep, _ArgoTemplateProducerMarkDuplicate.getStepname()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
