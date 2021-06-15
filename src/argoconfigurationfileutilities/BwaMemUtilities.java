/*
 * 
 */
package argoconfigurationfileutilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import argoconfigurationfilereader.BwaMemException;

// TODO: Auto-generated Javadoc
/**
 * The Class BwaMemUtilities.
 */
public class BwaMemUtilities extends GenericUtilities {

	/**
	 * Replace aligned bam global name in output artifacts BWAMEM.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendAlignedBAMGlobalNameInOutputArtifactsBWAMEM(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+artifacts:\\s+-\\s*name:\\s*\\S+\\s+globalName:\\s*)\\S+bam"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceFirst("$1 global-" + stepname + "alignedreads-bam-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
																														// //NON-NLS-3$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Invoked Template: Not found aligned BAM globalName in output artifacts section named as 'alignedreads-bam' of the Argo Workflow Template, following the name tag", ////$NON-NLS-1$
					e);

		}
	}

	/**
	 * Replace aligned bam name in output artifacts BWAMEM.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendAlignedBAMNameInOutputArtifactsBWAMEMTemplateDefinition(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+artifacts:\\s+-\\s*name:\\s*)alignedreads-bam");//$NON-NLS-1$
			String invokedtemplatefile_as_string2 = invokedtemplatefile_as_string;
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string2);
			if (matcher.find()) {
				invokedtemplatefile_as_string2 = matcher
						.replaceAll("$1 " + stepname + "-alignedreads-bam-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
			return invokedtemplatefile_as_string2;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Invoked Template: Not found 'output: artifacts: -name: alignedreads-bam' as the first output artifact in the " //$NON-NLS-1$
							+ "output-artifacts-section of Argo template", //$NON-NLS-1$
					e);

		}
	}

	/**
	 * Replace aligned bai global name in output artifacts BWAMEM.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendBAIGlobalNameInOutputArtifactsBWAMEMTemplateSpecification(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+bai\\S+\\s+globalName:\\s*)\\S+bai"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 global-" + stepname + "-alignedreads-bai-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Invoked Template: Not found -name:*bai*; globalName: *bai in the output artifacts section of the Argo Workflow Template", //$NON-NLS-1$
					e);

		}
	}

	/**
	 * Replace aligned bai name in output artifacts BWAMEM.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendBAINameInOutputArtifactsBWAMEMTemplateDefinition(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)alignedreads\\S+bai"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + stepname + "-alignedreads-bai-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Invoked Template: Not found -name: alignedreads*bai the output artifacts section of the Argo Workflow Template", //$NON-NLS-1$
					e);

		}
	}

	/**
	 * Replace fastq 1 in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param fastq1                 the fastq 1
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendFastq1InWorkflowDefinitionBWAMEMTemplateDefinition(
			String workflowDefn_as_string, String fastq1) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+artifacts:\\s+-\\s*name:\\s*fastq1\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + fastq1); //$NON-NLS-1$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Invoked Template: Not found artifacts:\n -name:fastq1 \ns3:\nendpoint: \nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);
		}
	}

	/**
	 * Replace fastq 2 in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param fastq2                 the fastq 2
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendFastq2InWorkflowDefinitionBWAMEM(String workflowDefn_as_string, String fastq2)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*fastq2\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + fastq2); //$NON-NLS-1$
			}

			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Invoked Template: Not found -name: fastq2\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);
		}
	}

	/**
	 * Amend gender in workflow definition BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param gender                 the gender
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendGenderInWorkflowDefinitionBWAMEM(String workflowDefn_as_string, String gender)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*\\S+\\s+-\\s*name:\\s*laneid\\s+value:\\s*\\S+\\s+-\\s*name:\\s*gender)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + gender + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Step Template: Not found -name:\nvalue:\n-name:laneid\nvalue:\n-name: gender\nvalue: in Argo invoker template", //$NON-NLS-1$
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
	static public @Nullable String amendLaneIdInWorkflowDefinitionBWAMEM(String workflowDefn_as_string, String laneid)
			throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*\\S+\\s+-\\s*name:\\s*laneid\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + laneid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Step Template: Not found -name:\nvalue:\n-name:laneid\nvalue: in Argo invoker template", //$NON-NLS-1$
					e);
		}
	}

	/**
	 * Replace reference files amb index in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string        the workflow defn as string
	 * @param referencefiles_amb_index_file the referencefiles amb index file
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendReferenceFilesAmbIndexInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String referencefiles_amb_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-amb\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + referencefiles_amb_index_file); //$NON-NLS-1$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Step Template: Not found -name:reference-files-amb\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);

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
	static public @Nullable String amendReferenceFilesAnnIndexInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String referencefiles_ann_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-ann\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + referencefiles_ann_index_file); //$NON-NLS-1$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Step Template: Not found -name:reference-files-ann\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);

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
	static public @Nullable String amendReferenceFilesBwtIndexInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String referencefiles_bwt_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-bwt\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + referencefiles_bwt_index_file); //$NON-NLS-1$
			}

			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Step Template: Not found -name:reference-files-bwt\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);
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
	static public @Nullable String amendReferenceFilesFaiIndexInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String referencefiles_fai_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-fai\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + referencefiles_fai_index_file); //$NON-NLS-1$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Step Template: Not found -name:reference-files-fai\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);
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
	static public @Nullable String amendReferenceFilesFastaDictInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
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
					"BWA-MEM Workflow Step Template: Not found -name:reference-files-dict\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);
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
	static public @Nullable String amendReferenceFilesFastaInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String referencefiles_fasta_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-fasta\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + referencefiles_fasta_file); //$NON-NLS-1$
			}

			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Steps Template: Not found -name:reference-files-fasta\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);
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
	static public @Nullable String amendReferenceFilesPacIndexInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String referencefiles_pac_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-pac\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + referencefiles_pac_index_file); //$NON-NLS-1$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Steps Template: Not found -name:reference-files-pac\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);

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
	static public @Nullable String amendReferenceFilesSaIndexInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String referencefiles_sa_index_file) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*reference-files-sa\\s+s3:\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + referencefiles_sa_index_file); //$NON-NLS-1$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Steps Template: Not found -name:reference-files-sa\ns3:\nendpoint:\nbucket:\nkey: in Argo invoker template", //$NON-NLS-1$
					e);

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
	static public @Nullable String amendSampleIdInWorkflowDefinitionBWAMEM(String workflowDefn_as_string,
			String sampleid) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + sampleid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Steps Template: Not found parameters:\nname:\nvalue: in Argo invoker template", //$NON-NLS-1$
					e);
		}
	}

	/**
	 * Replace invoked template name in invoker template BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param sampleid               the sampleid
	 * @param laneid                 the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendTemplateSpecificationNameInWorkflowDefinitionBWAMEM(
			String workflowDefn_as_string, String sampleid, String laneid) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+\\s+template:\\s+\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$
			}

			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Steps Template: Not found -name:\n:template: in Argo invoker template", e); //$NON-NLS-1$
		}

	}

	/**
	 * Replace invoker template name BWAMEM.
	 *
	 * @param workflowDefn_as_string the workflow defn as string
	 * @param sampleid               the sampleid
	 * @param laneid                 the laneid
	 * @return the string
	 * @throws BwaMemException the bwa mem exception
	 */
	static public @Nullable String amendWorkflowDefinitionNameBWAMEM(String workflowDefn_as_string, String sampleid,
			String laneid) throws BwaMemException {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+)(\\s+template:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(workflowDefn_as_string);
			String local = workflowDefn_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			}
			return local;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BwaMemException(
					"BWA-MEM Workflow Step Template: Not found - name:\ntemplate: in Argo invoker template", e); //$NON-NLS-1$

		}

	}

	/**
	 * Instantiates a new bwa mem utilities.
	 */
	public BwaMemUtilities() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "BwaMemUtilities [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				+ super.toString() + "]"; //$NON-NLS-1$
	}
}
