/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.util.LinkedList;

import argoconfigurationfileutilities.GenericUtilities;
import argoconfigurationfileutilities.QueryNameSortUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoTemplateProducerSortByQueryName.
 */
public class ArgoTemplateProducerSortByQueryName extends ArgoConfigurationFileBase {

	/** The Argo bwa mem template producer. */
	private ArgoTemplateProducerBwaMem _ArgoBwaMemTemplateProducer;

	/** The generic utilities class. */
	private GenericUtilities _genericUtilitiesClass;

	/** The query name sort processing value. */
	private LinkedList<String> _queryNameSortProcessingValue;

	/** The query name sort template specification. */
	private LinkedList<String> _queryNameSortTemplateSpecification;

	/** The query name sort utilities class. */
	private QueryNameSortUtilities _queryNameSortUtilitiesClass;

	/** The query name sort workflow definition. */
	private LinkedList<String> _queryNameSortWorkflowDefinition;

	/**
	 * Instantiates a new queryname sort template generator.
	 */
	public ArgoTemplateProducerSortByQueryName() {
		super();
		try {
			this._queryNameSortProcessingValue = new LinkedList<>();
			this._queryNameSortTemplateSpecification = new LinkedList<>();
			this._queryNameSortWorkflowDefinition = new LinkedList<>();
			this._genericUtilitiesClass = new GenericUtilities();
			this._queryNameSortUtilitiesClass = new QueryNameSortUtilities();
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
	 * Gets the querynamesortmode.
	 *
	 * @return the querynamesortmode
	 */
	public LinkedList<String> get_queryNameSortProcessingValue() {
		try {
			return this._queryNameSortProcessingValue;
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
	public LinkedList<String> get_queryNameSortTemplateSpecification() {
		try {
			return this._queryNameSortTemplateSpecification;
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
	public QueryNameSortUtilities get_queryNameSortUtilitiesClass() {
		try {
			return this._queryNameSortUtilitiesClass;
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
	public LinkedList<String> get_queryNameSortWorkflowDefinition() {
		try {
			return this._queryNameSortWorkflowDefinition;
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
	 * Sets the querynamesortmode.
	 *
	 * @param querynameSortProcessingMode the new querynamesortmode
	 */
	public void set_queryNameSortProcessingValue(LinkedList<String> querynameSortProcessingMode) {
		try {
			this._queryNameSortProcessingValue = querynameSortProcessingMode;
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
	public void set_queryNameSortTemplateSpecification(LinkedList<String> querynameSortTemplateSpecification) {
		try {
			this._queryNameSortTemplateSpecification = querynameSortTemplateSpecification;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the querynamesortutilities.
	 *
	 * @param querynamesortutilities the new querynamesortutilities
	 */
	public void set_queryNameSortUtilitiesClass(QueryNameSortUtilities querynamesortutilities) {
		try {
			this._queryNameSortUtilitiesClass = querynamesortutilities;
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
	public void set_queryNameSortWorkflowDefinition(LinkedList<String> querynameSortWorkflowDefinition) {
		try {
			this._queryNameSortWorkflowDefinition = querynameSortWorkflowDefinition;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Generate queryname sort invoked template for sample and lane.
	 *
	 * @param templateSpecification      the invokedtemplatefilename
	 * @param sampleindex                the sampleindex
	 * @param sampleId                   the sampleid
	 * @param laneId                     the laneid
	 * @param argotemplateproducerbwamem the bwamemtemplategenerator
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKQueryNameSortTemplate(String templateSpecification, int sampleindex, String sampleId,
			String laneId, ArgoTemplateProducerBwaMem argotemplateproducerbwamem) throws Exception {

		try {
			File file = new File(templateSpecification);
			set_ArgoBwaMemTemplateProducer(argotemplateproducerbwamem);
			return (QueryNameSortUtilities.amendBAINameInInputArtifactsOfTemplateSpecificationQueryNameSort(
					QueryNameSortUtilities.amendBAMNameInInputArtifactsOfTemplateSpecificationQueryNameSort(
							QueryNameSortUtilities.amendBAIGlobalNameInOutputArtifactsOfTemplateDefinitionQueryNameSort(
									QueryNameSortUtilities
											.amendBAINameInOutputArtifactsOfTemplateSpecificationQueryNameSort(
													QueryNameSortUtilities
															.amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationQueryNameSort(
																	QueryNameSortUtilities
																			.amendBAMNameInOutputArtifactsOfTemplateSpecificationQueryNameSort(
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
																													sampleId,
																													laneId),
																									super.getStepname(),
																									sampleId, laneId),
																					super.getStepname(), sampleId,
																					laneId),
																	super.getStepname(), sampleId, laneId),
													super.getStepname(), sampleId, laneId),
									super.getStepname(), sampleId, laneId),
							argotemplateproducerbwamem.getStepname(), sampleId, laneId),
					argotemplateproducerbwamem.getStepname(), sampleId, laneId));
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
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKQueryNameSortTemplateWorkflowStep(String templateSpecification, String sampleId,
			String laneId) throws Exception {
		try {
			File file = new File(templateSpecification);
			return (QueryNameSortUtilities.amendBAINameInInputArtifactsOfWorkflowDefinitionQueryNameSort(
					QueryNameSortUtilities.amendBAIFileNameInKeyTagOfInputArtifactsInWorkflowDefinitionQueryNameSort(
							QueryNameSortUtilities
									.amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionQueryNameSort(
											QueryNameSortUtilities
													.amendBAMNameInInputArtifactsOfWorkflowDefinitionQueryNameSort(
															QueryNameSortUtilities
																	.amendLaneIdInWorkflowDefinitionQueryNameSort(
																			QueryNameSortUtilities
																					.amendSampleIdInWorkflowDefinitionQueryNameSort(
																							QueryNameSortUtilities
																									.amendTemplateSpecificationNameInWorkflowDefinitionQueryNameSort(
																											QueryNameSortUtilities
																													.amendWorkflowDefinitionNameQueryNameSort(
																															GenericUtilities
																																	.amendBucketNameInTemplateSpecification(
																																			GenericUtilities
																																					.convertFileToString(
																																							file),
																																			this._ArgoBwaMemTemplateProducer
																																					.getBucketName()),
																															super.getStepname(),
																															sampleId,
																															laneId),

																											sampleId,
																											laneId),
																							sampleId),
																			laneId),
															this._ArgoBwaMemTemplateProducer.getStepname(), sampleId,
															laneId),
											sampleId, laneId),
							sampleId, laneId),
					this._ArgoBwaMemTemplateProducer.getStepname(), sampleId, laneId));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
