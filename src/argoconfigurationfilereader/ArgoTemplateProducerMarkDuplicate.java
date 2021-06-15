/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.util.LinkedList;

import argoconfigurationfileutilities.GenericUtilities;
import argoconfigurationfileutilities.MarkDuplicatesUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoTemplateProducerMarkDuplicate.
 */
public class ArgoTemplateProducerMarkDuplicate extends ArgoConfigurationFileBase {

	/** The argo bwa mem template producer. */
	private ArgoTemplateProducerBwaMem _argoBwaMemTemplateProducer;

	/** The generic utilities class. */
	private GenericUtilities _genericUtilitiesClass;

	/** The mark duplicates processing value. */
	private LinkedList<String> _markDuplicatesProcessingValue;

	/** The mark duplicates template specification. */
	private LinkedList<String> _markDuplicatesTemplateSpecification;

	/** The mark duplicates utilities class. */
	private MarkDuplicatesUtilities _markDuplicatesUtilitiesClass;

	/** The mark duplicates workflow definition. */
	private LinkedList<String> _markDuplicatesWorkflowDefinition;

	/**
	 * Instantiates a new mark duplicates template generator.
	 */
	public ArgoTemplateProducerMarkDuplicate() {
		super();
		try {
			this._markDuplicatesProcessingValue = new LinkedList<>();
			this._markDuplicatesTemplateSpecification = new LinkedList<>();
			this._markDuplicatesWorkflowDefinition = new LinkedList<>();
			this._genericUtilitiesClass = new GenericUtilities();
			this._markDuplicatesUtilitiesClass = new MarkDuplicatesUtilities();
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
	 * Gets the markduplicatesmode.
	 *
	 * @return the markduplicatesmode
	 */
	public LinkedList<String> get_markDuplicatesProcessingValue() {
		try {
			return this._markDuplicatesProcessingValue;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the markduplicatesinvokedtemplate.
	 *
	 * @return the markduplicatesinvokedtemplate
	 */
	public LinkedList<String> get_markDuplicatesTemplateSpecification() {
		try {
			return this._markDuplicatesTemplateSpecification;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the markduplicatesutilities.
	 *
	 * @return the markduplicatesutilities
	 */
	public MarkDuplicatesUtilities get_markDuplicatesUtilitiesClass() {
		try {
			return this._markDuplicatesUtilitiesClass;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the markduplicatesinvokertemplate.
	 *
	 * @return the markduplicatesinvokertemplate
	 */
	public LinkedList<String> get_markDuplicatesWorkflowDefinition() {
		try {
			return this._markDuplicatesWorkflowDefinition;
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
	 * Sets the markduplicatesmode.
	 *
	 * @param _markduplicatessortmode the new markduplicatesmode
	 */
	public void set_markDuplicatesProcessingValue(LinkedList<String> _markduplicatessortmode) {
		try {
			this._markDuplicatesProcessingValue = _markduplicatessortmode;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the markduplicatesinvokedtemplate.
	 *
	 * @param _markduplicatesinvokedtemplate the new markduplicatesinvokedtemplate
	 */
	public void set_markDuplicatesTemplateSpecification(LinkedList<String> _markduplicatesinvokedtemplate) {
		try {
			this._markDuplicatesTemplateSpecification = _markduplicatesinvokedtemplate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the markduplicatesutilities.
	 *
	 * @param markduplicatesutilities the new markduplicatesutilities
	 */
	public void set_markDuplicatesUtilitiesClass(MarkDuplicatesUtilities markduplicatesutilities) {
		try {
			this._markDuplicatesUtilitiesClass = markduplicatesutilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the markduplicatesinvokertemplate.
	 *
	 * @param _markduplicatesinvokertemplate the new markduplicatesinvokertemplate
	 */
	public void set_markDuplicatesWorkflowDefinition(LinkedList<String> _markduplicatesinvokertemplate) {
		try {
			this._markDuplicatesWorkflowDefinition = _markduplicatesinvokertemplate;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Generate mark duplicates invoked template for sample and lane.
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
	public String writeArgoMarkDuplicatesTemplate(String invokedtemplatefilename, int sampleindex, String sampleId,
			String laneId, String previousstepname, ArgoTemplateProducerBwaMem argotemplateproducerbwamem)
			throws Exception {

		try {
			File file = new File(invokedtemplatefilename);
			set_argoBwaMemTemplateProducer(argotemplateproducerbwamem);
			return (MarkDuplicatesUtilities.amendDedupMetricsGlobalNameInOutputArtifactsMarkDuplicates(
					MarkDuplicatesUtilities.amendDedupMetricsNameInOutputArtifactsMarkDuplicates(MarkDuplicatesUtilities
							.amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationMarkDuplicates(
									MarkDuplicatesUtilities
											.amendBAINameInInputArtifactsOfTemplateSpecificationMarkDuplicates(
													MarkDuplicatesUtilities
															.amendBAMNameInInputArtifactsOfTemplateSpecificationMarkDuplicates(
																	MarkDuplicatesUtilities
																			.amendBAMNameInOutputArtifactsOfTemplateSpecificationMarkDuplicates(
																					GenericUtilities
																							.amendNameOfGlobalLogFileInTemplateSpecification(
																									GenericUtilities
																											.amendLogFileNameInTemplateSpecification(
																													GenericUtilities
																															.amendNameOfTemplateInTemplateSpecification(
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
																																																	sampleId,
																																																	laneId),
																																													sampleId,
																																													laneId),
																																									sampleId,
																																									laneId),
																																					sampleId,
																																					laneId),
																																	super.getStepname(),
																																	sampleId,
																																	laneId),
																													super.getStepname(),
																													sampleId,
																													laneId),
																									super.getStepname(),
																									sampleId, laneId),
																					super.getStepname(), sampleId,
																					laneId),
																	previousstepname, sampleId, laneId),
													previousstepname, sampleId, laneId),
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
	 * Generate mark duplicates invoked template for sample and lane.
	 *
	 * @param workflowStepTemplateFile    the invokedtemplatefilename
	 * @param sampleId                    the sampleid
	 * @param laneId                      the laneid
	 * @param previousStepName            the previous step name
	 * @param _ArgoTemplateProducerBwaMem the argo template producer bwa mem
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoMarkDuplicatesTemplateWorkflowStep(String workflowStepTemplateFile, String sampleId,
			String laneId, String previousStepName, ArgoTemplateProducerBwaMem _ArgoTemplateProducerBwaMem)
			throws Exception {

		try {
			File file = new File(workflowStepTemplateFile);
			set_argoBwaMemTemplateProducer(_ArgoTemplateProducerBwaMem);
			return (MarkDuplicatesUtilities.amendBAINameInInputArtifactsOfWorkflowDefinitionMarkDuplicates(
					MarkDuplicatesUtilities.amendBAIFileNameInKeyTagOfInputArtifactsInWorkflowDefinitionMarkDuplicates(
							MarkDuplicatesUtilities
									.amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionMarkDuplicates(
											MarkDuplicatesUtilities
													.amendBAMNameInInputArtifactsOfWorkflowDefinitionMarkDuplicates(
															MarkDuplicatesUtilities
																	.amendLaneIdInWorkflowDefinitionMarkDuplicates(
																			MarkDuplicatesUtilities
																					.amendSampleIdInWorkflowDefinitionMarkDuplicates(
																							MarkDuplicatesUtilities
																									.amendTemplateSpecificationNameInWorkflowDefinitionMarkDuplicates(
																											MarkDuplicatesUtilities
																													.amendWorkflowDefinitionNameMarkDuplicates(
																															GenericUtilities
																																	.amendBucketNameInTemplateSpecification(
																																			GenericUtilities
																																					.convertFileToString(
																																							file),
																																			_ArgoTemplateProducerBwaMem
																																					.getBucketName()),
																															super.getStepname(),
																															sampleId,
																															laneId),

																											sampleId,
																											laneId),
																							sampleId),
																			laneId),
															previousStepName, sampleId, laneId),
											previousStepName, sampleId, laneId),
							previousStepName, sampleId, laneId),
					previousStepName, sampleId, laneId));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
