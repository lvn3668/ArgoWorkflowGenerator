/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.util.LinkedList;

import argoconfigurationfileutilities.CoordinateSortUtilities;
import argoconfigurationfileutilities.GenericUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoTemplateProducerSortByCoordinates.
 */
public class ArgoTemplateProducerSortByCoordinates extends ArgoConfigurationFileBase {

	/** The Argo bwa mem template producer. */
	private ArgoTemplateProducerBwaMem _ArgoBwaMemTemplateProducer;

	/** The coordinate sort processing value. */
	private LinkedList<String> _coordinateSortProcessingValue;

	/** The coordinate sort template specification. */
	private LinkedList<String> _coordinateSortTemplateSpecification;

	/** The coordinate sort utilities class. */
	private CoordinateSortUtilities _coordinateSortUtilitiesClass;

	/** The coordinate sort workflow definition. */
	private LinkedList<String> _coordinateSortWorkflowDefinition;

	/** The generic utilities class. */
	private GenericUtilities _genericUtilitiesClass;

	/**
	 * Instantiates a new queryname sort template generator.
	 */
	public ArgoTemplateProducerSortByCoordinates() {
		super();
		try {
			this._coordinateSortProcessingValue = new LinkedList<>();
			this._coordinateSortTemplateSpecification = new LinkedList<>();
			this._coordinateSortWorkflowDefinition = new LinkedList<>();
			this._genericUtilitiesClass = new GenericUtilities();
			this._coordinateSortUtilitiesClass = new CoordinateSortUtilities();
			this._ArgoBwaMemTemplateProducer = new ArgoTemplateProducerBwaMem();
			// TODO Auto-generated constructor stub
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Gets the bwamemtemplategenerator.
	 *
	 * @return the bwamemtemplategenerator
	 */
	public ArgoTemplateProducerBwaMem get_ArgoBwaMemTemplateProducer() {
		try {
			return this._ArgoBwaMemTemplateProducer;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the querynamesortmode.
	 *
	 * @return the querynamesortmode
	 */
	public LinkedList<String> get_coordinateSortProcessingValue() {
		try {
			return this._coordinateSortProcessingValue;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the querynamesortinvokedtemplate.
	 *
	 * @return the querynamesortinvokedtemplate
	 */
	public LinkedList<String> get_coordinateSortTemplateSpecification() {
		try {
			return this._coordinateSortTemplateSpecification;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the querynamesortutilities.
	 *
	 * @return the querynamesortutilities
	 */
	public CoordinateSortUtilities get_coordinateSortUtilitiesClass() {
		try {
			return this._coordinateSortUtilitiesClass;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the querynamesortinvokertemplate.
	 *
	 * @return the querynamesortinvokertemplate
	 */
	public LinkedList<String> get_coordinateSortWorkflowDefinition() {
		try {
			return this._coordinateSortWorkflowDefinition;
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Sets the bwamemtemplategenerator.
	 *
	 * @param argotemplateproducerbwamem the new bwamemtemplategenerator
	 */
	public void set_ArgoBwaMemTemplateProducer(ArgoTemplateProducerBwaMem argotemplateproducerbwamem) {
		try {
			this._ArgoBwaMemTemplateProducer = argotemplateproducerbwamem;
			this._ArgoBwaMemTemplateProducer.setCPULimits(argotemplateproducerbwamem.getCPULimits());
			this._ArgoBwaMemTemplateProducer.setMemoryLimits(argotemplateproducerbwamem.getMemoryLimits());
			this._ArgoBwaMemTemplateProducer.setCPURequests(argotemplateproducerbwamem.getCPURequests());
			this._ArgoBwaMemTemplateProducer.setMemoryRequests(argotemplateproducerbwamem.getMemoryRequests());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Sets the querynamesortmode.
	 *
	 * @param querynameSortProcessingMode the new querynamesortmode
	 */
	public void set_coordinateSortProcessingValue(LinkedList<String> querynameSortProcessingMode) {
		try {
			this._coordinateSortProcessingValue = querynameSortProcessingMode;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the querynamesortinvokedtemplate.
	 *
	 * @param querynameSortTemplateSpecification the new
	 *                                           querynamesortinvokedtemplate
	 */
	public void set_coordinateSortTemplateSpecification(LinkedList<String> querynameSortTemplateSpecification) {
		try {
			this._coordinateSortTemplateSpecification = querynameSortTemplateSpecification;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the querynamesortutilities.
	 *
	 * @param coordinatesortutilities the new querynamesortutilities
	 */
	public void set_coordinateSortUtilitiesClass(CoordinateSortUtilities coordinatesortutilities) {
		try {
			this._coordinateSortUtilitiesClass = coordinatesortutilities;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the querynamesortinvokertemplate.
	 *
	 * @param querynameSortWorkflowDefinition the new querynamesortinvokertemplate
	 */
	public void set_coordinateSortWorkflowDefinition(LinkedList<String> querynameSortWorkflowDefinition) {
		try {
			this._coordinateSortWorkflowDefinition = querynameSortWorkflowDefinition;
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Generate queryname sort invoked template for sample and lane.
	 *
	 * @param templateSpecification       the invokedtemplatefilename
	 * @param sampleindex                 the sampleindex
	 * @param sampleId                    the sampleid
	 * @param laneId                      the laneid
	 * @param previousStepName            the previous step name
	 * @param _argoTemplateProducerBwaMem the bwamemtemplategenerator
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKCoordinateSortTemplate(String templateSpecification, int sampleindex, String sampleId,
			String laneId, String previousStepName, ArgoTemplateProducerBwaMem _argoTemplateProducerBwaMem)
			throws Exception {

		try {
			File file = new File(templateSpecification);
			set_ArgoBwaMemTemplateProducer(_argoTemplateProducerBwaMem);
			return (CoordinateSortUtilities.amendBAMNameInInputArtifactsOfTemplateSpecificationCoordinateSort(
					CoordinateSortUtilities.amendBAIGlobalNameInOutputArtifactsOfTemplateDefinitionCoordinateSort(
							CoordinateSortUtilities.amendBAINameInOutputArtifactsOfTemplateSpecificationCoordinateSort(
									CoordinateSortUtilities
											.amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationCoordinateSort(
													CoordinateSortUtilities
															.amendBAMNameInOutputArtifactsOfTemplateSpecificationCoordinateSort(
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
																																																																									this._ArgoBwaMemTemplateProducer
																																																																											.getBucketName()),
																																																																					this._ArgoBwaMemTemplateProducer
																																																																							.getActiveDeadlineSecondsValue()),
																																																																	this._ArgoBwaMemTemplateProducer
																																																																			.getRetryStrategyLimitsValue()),
																																																													this._ArgoBwaMemTemplateProducer
																																																															.getMemoryLimits()
																																																															.get(sampleindex
																																																																	- 1)),
																																																									this._ArgoBwaMemTemplateProducer
																																																											.getCPULimits()
																																																											.get(sampleindex
																																																													- 1)),
																																																					this._ArgoBwaMemTemplateProducer
																																																							.getMemoryRequests()
																																																							.get(sampleindex
																																																									- 1)),
																																																	this._ArgoBwaMemTemplateProducer
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
																									sampleId, laneId),
																					super.getStepname(), sampleId,
																					laneId),
																	super.getStepname(), sampleId, laneId),
													super.getStepname(), sampleId, laneId),
									super.getStepname(), sampleId, laneId),
							super.getStepname(), sampleId, laneId),
					previousStepName, sampleId, laneId));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Generate queryname sort invoker template for sample and lane.
	 *
	 * @param templateSpecification the invokedtemplatefilename
	 * @param sampleId              the sampleid
	 * @param laneId                the laneid
	 * @param previousStepName      the previous step name
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKCoordinateSortTemplateWorkflowStep(String templateSpecification, String sampleId,
			String laneId, String previousStepName, String stepPreviousToMergeBams) throws Exception {
		try {
			File file = new File(templateSpecification);
			return (CoordinateSortUtilities.amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionCoordinateSort(
					CoordinateSortUtilities.amendBAMNameInInputArtifactsOfWorkflowDefinitionCoordinateSort(
							CoordinateSortUtilities
									.amendLaneIdInWorkflowDefinitionCoordinateSort(CoordinateSortUtilities
											.amendSampleIdInWorkflowDefinitionCoordinateSort(CoordinateSortUtilities
													.amendTemplateSpecificationNameInWorkflowDefinitionCoordinateSort(
															CoordinateSortUtilities
																	.amendWorkflowDefinitionNameCoordinateSort(
																			GenericUtilities
																					.amendBucketNameInTemplateSpecification(
																							GenericUtilities
																									.convertFileToString(
																											file),
																							this._ArgoBwaMemTemplateProducer
																									.getBucketName()),
																			super.getStepname(), sampleId, laneId),

															sampleId, laneId),
													sampleId),
											laneId),
							previousStepName, sampleId, laneId),
					sampleId, laneId, previousStepName, stepPreviousToMergeBams));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
