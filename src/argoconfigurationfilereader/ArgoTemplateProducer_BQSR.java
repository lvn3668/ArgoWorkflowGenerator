/*
 * 
 */
package argoconfigurationfilereader;

import java.io.File;
import java.util.LinkedList;

import argoconfigurationfileutilities.BQSRUtilities;
import argoconfigurationfileutilities.GenericUtilities;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoTemplateProducer_BQSR.
 */
public class ArgoTemplateProducer_BQSR extends ArgoConfigurationFileBase {

	/** The Argo bwa mem template producer. */
	private ArgoTemplateProducerBwaMem _ArgoBwaMemTemplateProducer;

	/** The bqsr processing value. */
	/** The coordinate sort processing value. */
	private LinkedList<String> _bqsrProcessingValue;

	/** The bqsr template specification. */
	private LinkedList<String> _bqsrTemplateSpecification;

	/** The bqsr utilities class. */
	private BQSRUtilities _bqsrUtilitiesClass;

	/** The bqsr workflow definition. */
	private LinkedList<String> _bqsrWorkflowDefinition;

	/** The bucket. */
	private String _bucket;

	/** The generic utilities class. */
	private GenericUtilities _genericUtilitiesClass;

	/** The intervals list. */
	private LinkedList<String> intervalsList;

	/** The invoked template apply BQSR. */
	private String invokedTemplateApplyBQSR;

	/** The invoked template BQSR. */
	private String invokedTemplateBQSR;

	/** The invoker template apply BQSR. */
	private String invokerTemplateApplyBQSR;

	/** The invoker template BQSR. */
	private String invokerTemplateBQSR;

	/** The number of intervals. */
	private String numberOfIntervals;

	/**
	 * Instantiates a new queryname sort template generator.
	 */
	public ArgoTemplateProducer_BQSR() {
		super();
		try {
			this._bqsrProcessingValue = new LinkedList<>();
			this._bqsrTemplateSpecification = new LinkedList<>();
			this.intervalsList = new LinkedList<>();
			this._bqsrWorkflowDefinition = new LinkedList<>();
			this._genericUtilitiesClass = new GenericUtilities();
			this._bqsrUtilitiesClass = new BQSRUtilities();
			this._ArgoBwaMemTemplateProducer = new ArgoTemplateProducerBwaMem();
			// TODO Auto-generated constructor stub
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addInterval(String interval) {
		this.intervalsList.add(interval);
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
	public LinkedList<String> get_bqsrProcessingValue() {
		try {
			return this._bqsrProcessingValue;
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
	public LinkedList<String> get_bqsrTemplateSpecification() {
		try {
			return this._bqsrTemplateSpecification;
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
	public BQSRUtilities get_bqsrUtilitiesClass() {
		try {
			return this._bqsrUtilitiesClass;
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
	public LinkedList<String> get_bqsrWorkflowDefinition() {
		try {
			return this._bqsrWorkflowDefinition;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	public String get_bucket() {
		return this._bucket;
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
	 * Gets the intervals list.
	 *
	 * @return the intervals list
	 */
	public LinkedList<String> getIntervalsList() {
		return this.intervalsList;
	}

	/**
	 * Gets the invoked template apply BQSR.
	 *
	 * @return the invoked template apply BQSR
	 */
	public String getInvokedTemplateApplyBQSR() {
		return this.invokedTemplateApplyBQSR;
	}

	/**
	 * Gets the invoked template BQSR.
	 *
	 * @return the invoked template BQSR
	 */
	public String getInvokedTemplateBQSR() {
		return this.invokedTemplateBQSR;
	}

	/**
	 * Gets the invoker template apply BQSR.
	 *
	 * @return the invoker template apply BQSR
	 */
	public String getInvokerTemplateApplyBQSR() {
		return this.invokerTemplateApplyBQSR;
	}

	/**
	 * Gets the invoker template BQSR.
	 *
	 * @return the invoker template BQSR
	 */
	public String getInvokerTemplateBQSR() {
		return this.invokerTemplateBQSR;
	}

	/**
	 * Gets the number of intervals.
	 *
	 * @return the number of intervals
	 */
	public String getNumberOfIntervals() {
		return this.numberOfIntervals;
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
	public void set_bqsrProcessingValue(LinkedList<String> bqsrProcessingMode) {
		try {
			this._bqsrProcessingValue = bqsrProcessingMode;
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
	public void set_bqsrTemplateSpecification(LinkedList<String> bqsrTemplateSpecification) {
		try {
			this._bqsrTemplateSpecification = bqsrTemplateSpecification;
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
	public void set_bqsrUtilitiesClass(BQSRUtilities bqsrutilities) {
		try {
			this._bqsrUtilitiesClass = bqsrutilities;
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
	public void set_bqsrWorkflowDefinition(LinkedList<String> bqsrWorkflowDefinition) {
		try {
			this._bqsrWorkflowDefinition = bqsrWorkflowDefinition;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void set_bucket(String _bucket1) {
		this._bucket = _bucket1;
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
	 * Sets the bucket.
	 *
	 * @param bqsrBucket the new bucket
	 */
	public void setBucket(String bqsrBucket) {
		this._bucket = bqsrBucket;
	}

	/**
	 * Sets the intervals list.
	 *
	 * @param intervalsList1 the new intervals list
	 */
	public void setIntervalsList(LinkedList<String> intervalsList1) {
		this.intervalsList = intervalsList1;
	}

	/**
	 * Sets the invoked template apply BQSR.
	 *
	 * @param invokedTemplateApplyBQSR1 the new invoked template apply BQSR
	 */
	public void setInvokedTemplateApplyBQSR(String invokedTemplateApplyBQSR1) {
		this.invokedTemplateApplyBQSR = invokedTemplateApplyBQSR1;
	}

	/**
	 * Sets the invoked template BQSR.
	 *
	 * @param invokedTemplateBQSR1 the new invoked template BQSR
	 */
	public void setInvokedTemplateBQSR(String invokedTemplateBQSR1) {
		this.invokedTemplateBQSR = invokedTemplateBQSR1;
	}

	/**
	 * Sets the invoker template apply BQSR.
	 *
	 * @param invokerTemplateApplyBQSR1 the new invoker template apply BQSR
	 */
	public void setInvokerTemplateApplyBQSR(String invokerTemplateApplyBQSR1) {
		this.invokerTemplateApplyBQSR = invokerTemplateApplyBQSR1;
	}

	/**
	 * Sets the invoker template BQSR.
	 *
	 * @param invokerTemplateBQSR the new invoker template BQSR
	 */
	public void setInvokerTemplateBQSR(@SuppressWarnings("hiding") String invokerTemplateBQSR) {
		this.invokerTemplateBQSR = invokerTemplateBQSR;
	}

	/**
	 * Sets the number of intervals.
	 *
	 * @param numberOfIntervals the new number of intervals
	 */
	public void setNumberOfIntervals(@SuppressWarnings("hiding") String numberOfIntervals) {
		this.numberOfIntervals = numberOfIntervals;
	}

	/**
	 * Generate queryname sort invoked template for sample and lane.
	 *
	 * @param templateSpecification       the invokedtemplatefilename
	 * @param sampleindex                 the sampleindex
	 * @param sampleId                    the sampleid
	 * @param intervalId                  the laneid
	 * @param _argoTemplateProducerBwaMem the bwamemtemplategenerator
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKApplyBQSRTemplate(String templateSpecification, int sampleindex, String sampleId,
			String intervalId, ArgoTemplateProducerBwaMem _argoTemplateProducerBwaMem) throws Exception {

		try {
			File file = new File(templateSpecification);
			set_ArgoBwaMemTemplateProducer(_argoTemplateProducerBwaMem);
			return (BQSRUtilities.amendRecalibratedBAMGlobalNameInOutputArtifactsOfTemplateSpecificationApplyBQSR(

					BQSRUtilities.amendRecalibratedBAMNameInOutputArtifactsOfTemplateSpecificationApplyBQSR(
							GenericUtilities.amendNameOfGlobalLogFileInTemplateSpecification(
									GenericUtilities.amendLogFileNameInTemplateSpecification(
											GenericUtilities.amendNameOfTemplateInTemplateSpecification(GenericUtilities
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
																			sampleId, intervalId),
															sampleId, intervalId),

													"apply" + super.getStepname(), sampleId, intervalId), //$NON-NLS-1$
											"apply" + super.getStepname(), sampleId, intervalId), //$NON-NLS-1$
									"apply" + super.getStepname(), sampleId, intervalId), //$NON-NLS-1$
							"apply" + super.getStepname(), sampleId, intervalId), //$NON-NLS-1$
					"apply" + super.getStepname(), sampleId, intervalId)); //$NON-NLS-1$
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Generate queryname sort invoked template for sample and lane.
	 *
	 * @param templateSpecification       the invokedtemplatefilename
	 * @param sampleId                    the sampleid
	 * @param intervalId                  the laneid
	 * @param _argoTemplateProducerBwaMem the bwamemtemplategenerator
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKApplyBQSRWorkflowStepsDefinition(String workflowdefinition, String sampleId,
			String intervalId, ArgoTemplateProducerBwaMem _argoTemplateProducerBwaMem,
			ArgoConfigurationFileGATKCoordinateSort _argoConfigurationFileCoordinateSort, String laneId,
			String reference_sa, String reference_pac, String reference_fai, String reference_ann, String reference_amb,
			String reference_bwt, String reference_dict, String reference) throws Exception {

		try {
			File file = new File(workflowdefinition);
			set_ArgoBwaMemTemplateProducer(_argoTemplateProducerBwaMem);
			return (BQSRUtilities.amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionApplyBQSR(
					BQSRUtilities.amendRecalibrationFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionApplyBQSR(
							BQSRUtilities.amendIntervalNumberInWorkflowDefinitionApplyBQSR(
									BQSRUtilities.amendReferenceFilesFastaDictInWorkflowDefinitionBQSR(
											BQSRUtilities.amendReferenceFilesFastaInWorkflowDefinitionBQSR(BQSRUtilities
													.amendReferenceFilesAmbIndexInWorkflowDefinitionBQSR(BQSRUtilities
															.amendReferenceFilesAnnIndexInWorkflowDefinitionBQSR(
																	BQSRUtilities
																			.amendReferenceFilesBwtIndexInWorkflowDefinitionBQSR(
																					BQSRUtilities
																							.amendReferenceFilesFaiIndexInWorkflowDefinitionBQSR(
																									BQSRUtilities
																											.amendReferenceFilesPacIndexInWorkflowDefinitionBQSR(
																													BQSRUtilities
																															.amendReferenceFilesSaIndexInWorkflowDefinitionBQSR(
																																	BQSRUtilities
																																			.amendSampleIdInWorkflowDefinitionBQSR(
																																					BQSRUtilities
																																							.amendTemplateSpecificationNameInWorkflowDefinitionApplyBQSR(
																																									BQSRUtilities
																																											.amendWorkflowDefinitionNameApplyBQSR(
																																													GenericUtilities
																																															.amendBucketNameInTemplateSpecification(
																																																	GenericUtilities
																																																			.convertFileToString(
																																																					file),
																																																	this._ArgoBwaMemTemplateProducer
																																																			.getBucketName()),
																																													sampleId,
																																													intervalId),
																																									sampleId,
																																									intervalId),
																																					sampleId),
																																	reference_sa),
																													reference_pac),
																									reference_fai),
																					reference_bwt),
																	reference_ann),
															reference_amb),
													reference),
											reference_dict),
									intervalId),
							sampleId, laneId, intervalId),
					sampleId, laneId, _argoConfigurationFileCoordinateSort.getStepname()));

		} catch (Exception e) {
			// TODO Auto-generated catch block
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
	 * @param intervalId                  the laneid
	 * @param _argoTemplateProducerBwaMem the bwamemtemplategenerator
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKBQSRTemplate(String templateSpecification, int sampleindex, String sampleId,
			String intervalId, ArgoTemplateProducerBwaMem _argoTemplateProducerBwaMem) throws Exception {

		try {
			File file = new File(templateSpecification);
			set_ArgoBwaMemTemplateProducer(_argoTemplateProducerBwaMem);
			return (BQSRUtilities.amendRecalibrationReportGlobalNameInOutputArtifactsOfTemplateSpecificationBQSR(
					BQSRUtilities.amendRecalibrationReportNameInOutputArtifactsOfTemplateSpecificationBQSR(
							GenericUtilities.amendNameOfGlobalLogFileInTemplateSpecification(
									GenericUtilities.amendLogFileNameInTemplateSpecification(
											GenericUtilities.amendNameOfTemplateInTemplateSpecification(GenericUtilities
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
																											intervalId),
																							sampleId, intervalId),
																			sampleId, intervalId),
															sampleId, intervalId),
													super.getStepname(), sampleId, intervalId),
											super.getStepname(), sampleId, intervalId),
									super.getStepname(), sampleId, intervalId),
							super.getStepname(), sampleId, intervalId),
					super.getStepname(), sampleId, intervalId));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Generate queryname sort invoked template for sample and lane.
	 *
	 * @param templateSpecification       the invokedtemplatefilename
	 * @param sampleId                    the sampleid
	 * @param intervalId                  the laneid
	 * @param _argoTemplateProducerBwaMem the bwamemtemplategenerator
	 * @return the string
	 * @throws Exception the exception
	 */
	public String writeArgoGATKBQSRWorkflowStepsDefinition(String workflowdefinition, String sampleId,
			String intervalId, ArgoTemplateProducerBwaMem _argoTemplateProducerBwaMem,
			ArgoTemplateProducerSortByCoordinates _argoTemplateProducerSortByCoordinates, String laneId,
			String reference_sa, String reference_pac, String reference_fai, String reference_ann, String reference_amb,
			String reference_bwt, String reference_dict, String reference, String dbSNPFileName,
			String goldStandardIndelsFileName, String intervalFileName) throws Exception {

		try {
			File file = new File(workflowdefinition);
			set_ArgoBwaMemTemplateProducer(_argoTemplateProducerBwaMem);
			return (BQSRUtilities.amendIntervalsFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(BQSRUtilities
					.amendGoldStandardsIndelsIndexFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(BQSRUtilities
							.amendGoldStandardsIndelsFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
									BQSRUtilities
											.amenddbSNPIndexFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
													BQSRUtilities
															.amenddbSNPFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
																	BQSRUtilities
																			.amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
																					BQSRUtilities
																							.amendIntervalNumberInWorkflowDefinitionBQSR(
																									BQSRUtilities
																											.amendReferenceFilesFastaDictInWorkflowDefinitionBQSR(
																													BQSRUtilities
																															.amendReferenceFilesFastaInWorkflowDefinitionBQSR(
																																	BQSRUtilities
																																			.amendReferenceFilesAmbIndexInWorkflowDefinitionBQSR(
																																					BQSRUtilities
																																							.amendReferenceFilesAnnIndexInWorkflowDefinitionBQSR(
																																									BQSRUtilities
																																											.amendReferenceFilesBwtIndexInWorkflowDefinitionBQSR(
																																													BQSRUtilities
																																															.amendReferenceFilesFaiIndexInWorkflowDefinitionBQSR(
																																																	BQSRUtilities
																																																			.amendReferenceFilesPacIndexInWorkflowDefinitionBQSR(
																																																					BQSRUtilities
																																																							.amendReferenceFilesSaIndexInWorkflowDefinitionBQSR(
																																																									BQSRUtilities
																																																											.amendLaneIdInWorkflowDefinitionBQSR(
																																																													BQSRUtilities
																																																															.amendSampleIdInWorkflowDefinitionBQSR(
																																																																	BQSRUtilities
																																																																			.amendTemplateSpecificationNameInWorkflowDefinitionBQSR(
																																																																					BQSRUtilities
																																																																							.amendWorkflowDefinitionNameBQSR(
																																																																									GenericUtilities
																																																																											.amendBucketNameInTemplateSpecification(
																																																																													GenericUtilities
																																																																															.convertFileToString(
																																																																																	file),
																																																																													this._ArgoBwaMemTemplateProducer
																																																																															.getBucketName()),
																																																																									sampleId,
																																																																									intervalId),
																																																																					sampleId,
																																																																					intervalId),
																																																																	sampleId),
																																																													laneId),
																																																									reference_sa),
																																																					reference_pac),
																																																	reference_fai),
																																													reference_bwt),
																																									reference_ann),
																																					reference_amb),
																																	reference),
																													reference_dict),
																									intervalId),
																					sampleId, laneId,
																					_argoTemplateProducerSortByCoordinates
																							.getStepname()),
																	dbSNPFileName),
													dbSNPFileName),
									goldStandardIndelsFileName),
							goldStandardIndelsFileName),
					intervalFileName));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
