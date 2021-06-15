/*
 * 
 */
package argoconfigurationfileutilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: Auto-generated Javadoc
/**
 * The Class MarkDuplicatesUtilities.
 */
public class MarkDuplicatesUtilities extends GenericUtilities {

	/**
	 * Replace bai file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param previousstep                  the previousstep
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAIFileNameInKeyTagOfInputArtifactsInWorkflowDefinitionMarkDuplicates(
			String invokertemplatefile_as_string, String previousstep, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+key:\\s*)\\S+alignedreads.\\S+bai(\\s+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceFirst("$1" + previousstep + ".alignedreads." + sampleid + "." + laneid + ".bai$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found 'key:'" + previousstep + ".alignedreads.sampleid.laneid.bai' in the " //$NON-NLS-1$ //$NON-NLS-2$
					+ "input-artifacts-section of Argo Workflow Steps template for Mark Duplicates "); //$NON-NLS-1$
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
	public static String amendBAIGlobalNameInOutputArtifactsOfTemplateDefinitionMarkDuplicates(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S*" + stepname //$NON-NLS-1$
				+ "[\"bam\"]{0,1}\\S*bai\\S*\\s+globalName:\\s*)global\\S+" + stepname + "\\S*bai\\S*(\\s+path)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceFirst("$1 " + "global-" + stepname + "-alignedreads-bai-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
		} else
			throw new Exception(
					"MarkDuplicates Workflow Step Template: Not found aligned BAI globalName in format name:markduplicates*bai\nglobalName:global-markduplicates-bai*\npath: in the output artifacts section of the Argo Template"); //$NON-NLS-1$
		return local;
	}

	/**
	 * Amend BAI name in input artifacts of template specification mark duplicates.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAINameInInputArtifactsOfTemplateSpecificationMarkDuplicates(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S+alignedreads-bai(\\s+path:\\s*\\S+\\s+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceFirst("$1 " + previousstepname + "-alignedreads-bai-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception(
					"Not found 'inputs: artifacts: name:alignedreads-bai\npath:' as the second input artifact in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Invoked template for Mark Duplicates"); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bai name in input artifacts of invoker template markduplicates.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAINameInInputArtifactsOfWorkflowDefinitionMarkDuplicates(
			String invokertemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S*alignedreads\\S+bai"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + previousstepname + "-alignedreads-bai-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception("Mark Duplicates Workflow Steps Template: Not found 'inputs: artifacts: name:'" //$NON-NLS-1$
					+ previousstepname + "alignedreads-bai' in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for Mark Duplicates"); //$NON-NLS-1$
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
	public static String amendBAINameInOutputArtifactsOfTemplateSpecificationMarkDuplicates(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)" + stepname + "(-alignedreads-)\\S+[\"bam\"]*bai"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + stepname + "$2bai-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"Mark Duplicates Template Specification: Not found name:markduplicates-alignedreads-bai in the output artifacts section of the Argo Workflow Template"); //$NON-NLS-1$
		return local;
	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template query
	 * name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param previousstep                  the previousstep
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionMarkDuplicates(
			String invokertemplatefile_as_string, String previousstep, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+key:\\s*)(\\S*alignedreads.\\S+bam)(\\s+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + previousstep + ".alignedreads." + sampleid + "." + laneid + ".bam$3"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found 'key:'" + previousstep + ".alignedreads.sampleid.laneid.bam' in the " //$NON-NLS-1$ //$NON-NLS-2$
					+ "input-artifacts-section of Argo Workflow Steps template for Mark Duplicates "); //$NON-NLS-1$
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
	public static String amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationMarkDuplicates(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern
					.compile("(\\s+-\\s*name:\\s*\\S+bam\\S*\\s+globalName:\\s*)\\S*global\\S*bam\\S*(\\s+path)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher
						.replaceAll("$1 " + "global-" + stepname + "-dedup-bam-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			} else
				throw new Exception(
						"Not found name:dedup-bam\nglobalName:global-dedup-bam\npath in the output artifacts section of the Argo Workflow Template for MarkDuplicates Invoked Template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
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
	public static String amendBAMNameInInputArtifactsOfTemplateSpecificationMarkDuplicates(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+artifacts:\\s+-\\s*name:\\s*)\\S*alignedreads-bam(\\s+path:\\s*\\S+\\s+-\\s*name:\\s*\\S+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher
					.replaceFirst("$1" + previousstepname + "-alignedreads-bam-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception(
					"Not found 'inputs: artifacts: name:alignedreads-bam\npath:\nname:' as the first input artifact in the " //$NON-NLS-1$
							+ "input-artifacts-section of Argo Invoked template for Mark Duplicates "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam name in input artifacts of invoker template mark duplicates.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAMNameInInputArtifactsOfWorkflowDefinitionMarkDuplicates(
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
							+ "input-artifacts-section of Argo Workflow Step template for Mark Duplicates "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam name in output artifacts mark duplicates.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendBAMNameInOutputArtifactsOfTemplateSpecificationMarkDuplicates(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern
					.compile("(\\s+-\\s*name:\\s*)\\S*-bam(\\s+globalName:\\s*\\S+\\s+path:\\s*\\S+\\s+s3:)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + stepname + "-bam-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			} else
				throw new Exception(
						"Not found 'output: artifacts: name:dedup-bam\nglobalName:\npath:\ns3:' as one of the output artifact in the " //$NON-NLS-1$
								+ "output-artifacts-section of Argo Invoked template for MarkDuplicates"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace dedup metrics global name in output artifacts mark duplicates.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendDedupMetricsGlobalNameInOutputArtifactsMarkDuplicates(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S*[\"" + stepname //$NON-NLS-1$
					+ "|dedup\"]{0,1}\\S*metrics\\S*\\s+globalName:\\s*)global\\S*[\"" + stepname //$NON-NLS-1$
					+ "|dedup\"]{0,1}\\S*metrics(\\s+path)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + "global-" + stepname + "-metrics-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
			} else
				throw new Exception(
						"Not found dedup metrics globalName in format name:markduplicates-dedup-metrics\nglobalName: markduplicates-dedup-metrics\npath: in the output artifacts section of the Argo Workflow Template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace dedup metrics name in output artifacts mark duplicates.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendDedupMetricsNameInOutputArtifactsMarkDuplicates(String invokedtemplatefile_as_string,
			String stepname, String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S*[\"dedup\"]?\\S*metrics"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + stepname + "-metrics-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} else
				throw new Exception(
						"Not found dedup-metrics name in format name: dedup-metrics in the output artifacts section of the Argo Workflow Template for Mark Duplicates"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace lane id in invoker template query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendLaneIdInWorkflowDefinitionMarkDuplicates(String invokertemplatefile_as_string,
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
						"Not found lane id parameter in format -name:\nvalue:-name:laneid\nvalue: in Argo Workflow Step template of mark duplicates step"); //$NON-NLS-1$
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
	public static String amendSampleIdInWorkflowDefinitionMarkDuplicates(String invokertemplatefile_as_string,
			String sampleid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + sampleid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			} else
				throw new Exception(
						"Not found sample id parameter in format parameters:\n-name:\nvalue: in Argo Workflow Step template of mark duplicates step"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace invoked template name in invoker template mark duplicates.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendTemplateSpecificationNameInWorkflowDefinitionMarkDuplicates(
			String invokertemplatefile_as_string, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+\\s+template:\\s+\\S+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$

		} else
			throw new Exception(
					"Not found invoked template name in format name:\ntemplate: in Argo Workflow Step template for mark duplicates"); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace invoker template name mark duplicates.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendWorkflowDefinitionNameMarkDuplicates(String invokertemplatefile_as_string,
			String stepname, String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S+(\\s+template:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1" + stepname + "-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			} else
				throw new Exception(
						"Not found template name in format -name:\ntemplate: in Argo Workflow Step template (Mark Duplicates)"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * Instantiates a new mark duplicates utilities.
	 */
	public MarkDuplicatesUtilities() {
		// TODO Auto-generated constructor stub
		super();
	}

}
