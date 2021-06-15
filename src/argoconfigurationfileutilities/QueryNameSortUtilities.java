/*
 * 
 */
package argoconfigurationfileutilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: Auto-generated Javadoc
/**
 * The Class QueryNameSortUtilities.
 */
public class QueryNameSortUtilities extends GenericUtilities {

	/**
	 * Replace bai file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAIFileNameInKeyTagOfInputArtifactsInWorkflowDefinitionQueryNameSort(
			String invokertemplatefile_as_string, String sampleid, String laneid) throws Exception {

		Pattern pattern = Pattern.compile("(\\s+key:\\s*alignedreads.)\\S+bai(\\s+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + sampleid + "." + laneid + ".bai$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"QuerynameSort Workflow Step Template: Not found 'key:alignedreads.sampleid.laneid.bai' in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Invoker template for Queryname Sort "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bai global name in output artifacts query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAIGlobalNameInOutputArtifactsOfTemplateDefinitionQueryNameSort(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S*" + stepname //$NON-NLS-1$
				+ "[\"bam\"]{0,1}\\S*bai\\S*\\s+globalName:\\s*)global\\S+" + stepname + "\\S*bai\\S*(\\s+path)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceAll("$1 " + "global-" + stepname + "-alignedreads-bai-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		} else
			throw new Exception(
					"QueryName Sort Invoked Template: Not found name:querynamesort*bai globalName: global*querynamesort*bai in the output artifacts section of the Argo Workflow Template"); //$NON-NLS-1$
		return local;
	}

	/**
	 * Amend BAI name in input artifacts of template specification query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAINameInInputArtifactsOfTemplateSpecificationQueryNameSort(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern
				.compile("(\\s+-\\s*name:\\s*)\\S*alignedreads-bai(\\s+path:\\s*\\S+\\s+\\s*retryStrategy:)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceAll("$1 " + previousstepname + "-alignedreads-bai-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception(
					"Queryname Sort Template Specification: Not found 'inputs: artifacts: name:alignedreads-bai' as the second input artifact in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Invoked template"); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bai name in input artifacts of invoker template query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAINameInInputArtifactsOfWorkflowDefinitionQueryNameSort(
			String invokertemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S*alignedreads\\S+bai"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + previousstepname + "-alignedreads-bai-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"QuerynameSort Workflow Step Template: Not found 'inputs: artifacts: name:alignedreads-bai' in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Workflow Steps template"); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bai name in output artifacts query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAINameInOutputArtifactsOfTemplateSpecificationQueryNameSort(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)" + stepname + "(-alignedreads-)\\S*bai"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + stepname + "$2bai-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"Queryname Sort Template Specification: Not found querynamesort-alignedreads-bai in the output artifacts section of the Argo Workflow Template"); //$NON-NLS-1$
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
	public static String amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionQueryNameSort(
			String invokertemplatefile_as_string, String sampleid, String laneid) throws Exception {

		Pattern pattern = Pattern.compile("(\\s+key:\\s*alignedreads.)\\S+bam(\\s+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + sampleid + "." + laneid + ".bam$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"QueryName Sort Workflow Step Template: Not found 'key:alignedreads.sampleid.laneid.bam' in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Template"); //$NON-NLS-1$
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
	public static String amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationQueryNameSort(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S*" + stepname //$NON-NLS-1$
				+ "\\S*bam[^\"bai\"]*\\s+globalName:\\s*)global\\S+" + stepname + "\\S*bam\\S*(\\s+path)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceAll("$1 " + "global-" + stepname + "-alignedreads-bam-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		} else
			throw new Exception(
					"Not found name: querynamesort-bam* globalName: global-querynamesort-bam* path: in the output artifacts section of the Argo Template"); //$NON-NLS-1$
		return local;
	}

	/**
	 * Amend BAM name in input artifacts of template specification query name sort.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAMNameInInputArtifactsOfTemplateSpecificationQueryNameSort(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S*alignedreads-bam(\\s+path:\\s*\\S+\\s+-\\s*name:)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceAll("$1 " + previousstepname + "-alignedreads-bam-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception(
					"Not found 'inputs: artifacts: name:alignedreads-bam' as the first input artifact in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Invoked template for Queryname Sort"); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam name in input artifacts of invoker template query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAMNameInInputArtifactsOfWorkflowDefinitionQueryNameSort(
			String invokertemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+artifacts:\\s+-\\s*name:\\s*)\\S*alignedreads\\S+bam"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + previousstepname + "-alignedreads-bam-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"Not found 'inputs: artifacts: name:alignedreads-bam' as the first input artifact in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Workflow Step template for Queryname Sort "); //$NON-NLS-1$
		return local;

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
	public static String amendBAMNameInOutputArtifactsOfTemplateSpecificationQueryNameSort(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)" + stepname + "(-alignedreads-bam)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + stepname + "$2-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"Queryname Sort Template Specification: Not found 'output: artifacts: name: querynamesort-alignedreads-bam' as the first output artifact in the " //$NON-NLS-1$
							+ "output-artifacts-section of Argo template"); //$NON-NLS-1$
		return local;
	}

	/**
	 * Replace lane id in invoker template query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendLaneIdInWorkflowDefinitionQueryNameSort(String invokertemplatefile_as_string,
			String laneid) throws Exception {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*\\S+\\s+-\\s*name:\\s*laneid\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + laneid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			} else
				throw new Exception(
						"Queryname Sort Workflow Step Template: Not found lane id parameter in correct format (name:sampleid\nvalue:\nname:laneid\nvalue:) in Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace sample id in invoker template query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendSampleIdInWorkflowDefinitionQueryNameSort(String invokertemplatefile_as_string,
			String sampleid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + sampleid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			} else
				throw new Exception(
						"Queryname Sort Workflow Step Template: Not found parameters:\nname:sampleid\nvalue: in Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace invoked template name in invoker template query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendTemplateSpecificationNameInWorkflowDefinitionQueryNameSort(
			String invokertemplatefile_as_string, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+\\s+template:\\s+\\S+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$

		} else
			throw new Exception(
					"Queryname Sort Workflow Step Template: Not found name:\ntemplate: in Argo invoker template"); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace invoker template name query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendWorkflowDefinitionNameQueryNameSort(String invokertemplatefile_as_string, String stepname,
			String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+)(\\s+template:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + stepname + "-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			} else
				throw new Exception(
						"Queryname Sort Workflow Step Template: Not found name:\ntemplate: in Argo template (Queryname Sort)"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * Instantiates a new query name sort utilities.
	 *
	 * @throws Exception the exception
	 */
	public QueryNameSortUtilities() throws Exception {
		// TODO Auto-generated constructor stub
		super();
	}

}
