/*
 * 
 */
package argoconfigurationfileutilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import argoconfigurationfilereader.BwaMemException;

// TODO: Auto-generated Javadoc
/**
 * The Class BQSRUtilities.
 */
public class BQSRUtilities extends GenericUtilities {

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionApplyBQSR(
			String invokertemplatefile_as_string, String sampleid, String laneid, String stepPriorToBQSR)
			throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*coordinatesort-bam\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*" //$NON-NLS-1$
						+ stepPriorToBQSR + "\\.)\\S+bam(\\s+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + sampleid + "." + laneid + ".bam$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
																					// //$NON-NLS-4$
		} else
			throw new Exception("Not found 'key:coordinatesort.sampleid.laneid.bam' in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo WorkflowStep template for Apply BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
			String invokertemplatefile_as_string, String sampleid, String laneid, String previousstepname)
			throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*" + previousstepname + "\\.)\\S+bam(\\s+)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + sampleid + "." + laneid + ".bam$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
																					// //$NON-NLS-4$
		} else
			throw new Exception("Not found 'key:coordinatesort.sampleid.laneid.bam' in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amenddbSNPFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
			String invokertemplatefile_as_string, String dbSNPFileName) throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*dbsnp\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)\\S+(\\s+)"); //$NON-NLS-1$ 
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + dbSNPFileName + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ 
																		// //$NON-NLS-4$
		} else
			throw new Exception("Not found key with name:dbsnp in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amenddbSNPIndexFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
			String invokertemplatefile_as_string, String dbSNPFileName) throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*dbsnp-tbi\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)\\S+(\\s+)"); //$NON-NLS-1$ 
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + dbSNPFileName.trim() + ".tbi$2"); //$NON-NLS-1$ //$NON-NLS-2$
																				// //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found key with name:dbsnp-tbi in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendGoldStandardsIndelsFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
			String invokertemplatefile_as_string, String goldStandardIndelsFileName) throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*gold-standard-indels-vcf\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)\\S+(\\s+)"); //$NON-NLS-1$ 
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + goldStandardIndelsFileName + "$2"); //$NON-NLS-1$ //$NON-NLS-2$
																					// //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found key with name:gold-standard-indels-vcf in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendGoldStandardsIndelsIndexFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
			String invokertemplatefile_as_string, String dbSNPFileName) throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*gold-standard-indels-vcf-idx\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)\\S+(\\s+)"); //$NON-NLS-1$ 
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + dbSNPFileName.trim() + ".tbi$2"); //$NON-NLS-1$ //$NON-NLS-2$
																				// //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found key with name:dbsnp-tbi in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace lane id in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param laneid                 the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendIntervalNumberInWorkflowDefinitionApplyBQSR(String workflowDefn_as_string,
			String intervalNumber) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+arguments:\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*\\S+\\s+-\\s*name:\\s*intervalnumber\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 \"" + intervalNumber + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:sampleid\nvalue:\n-name:intervalnumber in Argo Workflow Step template for ApplyBQSR", //$NON-NLS-1$
					e);
		}
	}

	/**
	 * Replace lane id in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param laneid                 the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendIntervalNumberInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String intervalNumber) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*\\S+\\s+-\\s*name:\\s*laneid\\s+value:\\s*\\S+\\s+-\\s*name:\\s*intervalnumber\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 \"" + intervalNumber + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:\nvalue:\n-name:laneid\nvalue:\n-name:intervalnumber in Argo Workflow Step template for BQSR", //$NON-NLS-1$
					e);
		}
	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendIntervalsFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionBQSR(
			String invokertemplatefile_as_string, String intervalsFileName) throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*intervalslist\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)\\S+(\\s+)"); //$NON-NLS-1$ 
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + intervalsFileName + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ 
																			// //$NON-NLS-4$
		} else
			throw new Exception("Not found key with name:intervalslist in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace lane id in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param laneid                 the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendLaneIdInWorkflowDefinitionBQSR(String workflowDefn_as_string, String laneid)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*\\S+\\s+-\\s*name:\\s*laneid\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 \"" + laneid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:\nvalue:\n-name:laneid\nvalue: in Argo Workflow Step template for BQSR", e); //$NON-NLS-1$
		}
	}

	/**
	 * Replace bam global name in output artifacts query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param intervalId                    the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendRecalibratedBAMGlobalNameInOutputArtifactsOfTemplateSpecificationApplyBQSR(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String intervalId)
			throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S*" + stepname //$NON-NLS-1$
				+ "\\S*bam\\S*\\s+globalName:\\s*)global\\S+" + stepname //$NON-NLS-1$
				+ "\\S*bam\\S*(\\s+path)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		if (matcher.find()) {
			invokedtemplatefile_as_string = matcher
					.replaceAll("$1 " + "global-" + stepname + "-bam-" + sampleid + "-" + intervalId + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		} else
			throw new Exception(
					"Not found recalibration report globalName in the output artifacts section of the Argo Workflow Template for BQSR"); //$NON-NLS-1$
		return invokedtemplatefile_as_string;
	}

	/**
	 * Replace bam name in output artifacts query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendRecalibratedBAMNameInOutputArtifactsOfTemplateSpecificationApplyBQSR(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String intervalid)
			throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)" + stepname + "(-bam)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		if (matcher.find()) {
			invokedtemplatefile_as_string = matcher.replaceAll("$1 " + stepname + "$2-" + sampleid + "-" + intervalid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception("Not found 'output: name: applybqsr-bam' as the one of the output artifacts in the " //$NON-NLS-1$
					+ "output-artifacts-section of Argo template for Apply BQSR"); //$NON-NLS-1$
		return invokedtemplatefile_as_string;
	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendRecalibrationFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionApplyBQSR(
			String invokertemplatefile_as_string, String sampleId, String laneId, String intervalId) throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*recalibration-report\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)\\S+(\\s+)"); //$NON-NLS-1$ 
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceAll("$1" + "bqsr.recalibration." + sampleId + "." + laneId + "." + intervalId + ".table$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found key with name:recalibration-report in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for Apply BQSR "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam global name in output artifacts query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendRecalibrationReportGlobalNameInOutputArtifactsOfTemplateSpecificationBQSR(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S*" + stepname //$NON-NLS-1$
				+ "\\S*recalibration-report\\S*\\s+globalName:\\s*)global\\S+" + stepname //$NON-NLS-1$
				+ "\\S*recalibration-report\\S*(\\s+path)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		if (matcher.find()) {
			invokedtemplatefile_as_string = matcher.replaceAll(
					"$1 " + "global-" + stepname + "-recalibration-report-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		} else
			throw new Exception(
					"Not found recalibration report globalName in the output artifacts section of the Argo Workflow Template for BQSR"); //$NON-NLS-1$
		return invokedtemplatefile_as_string;
	}

	/**
	 * Replace bam name in output artifacts query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendRecalibrationReportNameInOutputArtifactsOfTemplateSpecificationBQSR(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)" + stepname + "(-recalibration-report)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		if (matcher.find()) {
			invokedtemplatefile_as_string = matcher.replaceAll("$1 " + stepname + "$2-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"Not found 'output: name: bqsr-recalibration-report' as the first output artifact in the " //$NON-NLS-1$
							+ "output-artifacts-section of Argo template for BQSR"); //$NON-NLS-1$
		return invokedtemplatefile_as_string;
	}

	/**
	 * Replace reference files amb index in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string        the workflow defn as string
	 * @param referencefiles_amb_index_file the referencefiles amb index file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesAmbIndexInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_amb_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-amb\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 " + referencefiles_amb_index_file); //$NON-NLS-1$
			}
			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-amb\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$

		}
	}

	/**
	 * Replace reference files ann index in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string        the workflow defn as string
	 * @param referencefiles_ann_index_file the referencefiles ann index file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesAnnIndexInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_ann_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-ann\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 " + referencefiles_ann_index_file); //$NON-NLS-1$
			}
			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-ann\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$

		}
	}

	/**
	 * Replace reference files bwt index in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string        the workflow defn as string
	 * @param referencefiles_bwt_index_file the referencefiles bwt index file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesBwtIndexInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_bwt_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-bwt\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 " + referencefiles_bwt_index_file); //$NON-NLS-1$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-bwt\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$
		}
	}

	/**
	 * Replace reference files fai index in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string        the workflow defn as string
	 * @param referencefiles_fai_index_file the referencefiles fai index file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesFaiIndexInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_fai_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-fai\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 " + referencefiles_fai_index_file); //$NON-NLS-1$
			}
			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-fai\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$
		}
	}

	/**
	 * Replace reference files fasta dict in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string         the workflow defn as string
	 * @param referencefiles_fasta_dict_file the referencefiles fasta dict file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesFastaDictInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_fasta_dict_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-dict\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			String workflowDefn_as_string2 = workflowDefn_as_string;
			Matcher matcher = pattern.matcher(workflowDefn_as_string2);
			if (matcher.find()) {
				workflowDefn_as_string2 = matcher.replaceAll("$1 " + referencefiles_fasta_dict_file); //$NON-NLS-1$
			}

			return workflowDefn_as_string2;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-dict\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$
		}
	}

	/**
	 * Replace reference files fasta in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string    the workflow defn as string
	 * @param referencefiles_fasta_file the referencefiles fasta file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesFastaInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_fasta_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-fasta\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 " + referencefiles_fasta_file); //$NON-NLS-1$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-fasta\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$
		}
	}

	/**
	 * Replace reference files pac index in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string        the workflow defn as string
	 * @param referencefiles_pac_index_file the referencefiles pac index file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesPacIndexInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_pac_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-pac\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 " + referencefiles_pac_index_file); //$NON-NLS-1$
			}
			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-pac\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$

		}
	}

	/**
	 * Replace reference files sa index in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string       the workflow defn as string
	 * @param referencefiles_sa_index_file the referencefiles sa index file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendReferenceFilesSaIndexInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String referencefiles_sa_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-sa\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 " + referencefiles_sa_index_file); //$NON-NLS-1$
			}
			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"Not found -name:reference-files-sa\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", e); //$NON-NLS-1$

		}
	}

	/**
	 * Replace sample id in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param sampleid               the sampleid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendSampleIdInWorkflowDefinitionBQSR(String workflowDefn_as_string, String sampleid)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern
					.compile("(\\s+parameters:\\s+-\\s*name:\\s*\\S*sampleid\\S*\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 \"" + sampleid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException("Not found parameters:\nname:\nvalue: in Argo invoker template", e); //$NON-NLS-1$
		}
	}

	/**
	 * Replace invoked template name in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param sampleid               the sampleid
	 * @param intervalid             the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendTemplateSpecificationNameInWorkflowDefinitionApplyBQSR(String workflowDefn_as_string,
			String sampleid, String intervalid) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*\\S+\\s+template:\\s*)\\S*apply-bqsr(\\s+arguments:\\s+parameters:\\s+-\\s*name:\\s*)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceFirst("$1 apply-bqsr-" + sampleid + "-" + intervalid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException("Not found -name:\n:template: in Argo invoker template", e); //$NON-NLS-1$
		}

	}

	/**
	 * Replace invoked template name in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param sampleid               the sampleid
	 * @param intervalid             the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendTemplateSpecificationNameInWorkflowDefinitionBQSR(String workflowDefn_as_string,
			String sampleid, String intervalid) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*\\S+\\s+template:\\s*)\\S*base-recalibration(\\s+arguments:\\s+parameters:\\s+-\\s*name:\\s*)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher
						.replaceFirst("$1 base-recalibration-" + sampleid + "-" + intervalid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException("Not found -name:\n:template: in Argo invoker template", e); //$NON-NLS-1$
		}

	}

	/**
	 * Replace invoker template name BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param sampleid               the sampleid
	 * @param intervalid             the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendWorkflowDefinitionNameApplyBQSR(String workflowDefn_as_string, String sampleid,
			String intervalid) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S*applybqsr(\\s+template:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher.replaceAll("$1 applybqsr-" + sampleid + "-" + intervalid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException("Not found - name:\ntemplate: in Argo invoker template", e); //$NON-NLS-1$

		}

	}

	/**
	 * Replace invoker template name BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param sampleid               the sampleid
	 * @param intervalid             the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public String amendWorkflowDefinitionNameBQSR(String workflowDefn_as_string, String sampleid,
			String intervalid) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S*baserecalibration(\\s+template:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			if (matcher.find()) {
				workflowDefn_as_string = matcher
						.replaceAll("$1 baserecalibration-" + sampleid + "-" + intervalid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
			return workflowDefn_as_string;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException("Not found - name:\ntemplate: in Argo invoker template", e); //$NON-NLS-1$

		}

	}

	/**
	 * Instantiates a new BQSR utilities.
	 */
	public BQSRUtilities() {
		// TODO Auto-generated constructor stub
	}

}
