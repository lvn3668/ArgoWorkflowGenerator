/*
 * 
 */
package argoconfigurationfileutilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: Auto-generated Javadoc
/**
 * The Class CoordinateSortUtilities.
 */
public class CoordinateSortUtilities extends GenericUtilities {

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
	public static String amendBAIFileNameInKeyTagOfInputArtifactsInWorkflowDefinitionCoordinateSort(
			String invokertemplatefile_as_string, String sampleid, String laneid, String previousstepname,
			String stepPreviousToMergeBams) throws Exception {

		Pattern pattern = Pattern.compile("(\\s+key:\\s*" + previousstepname + "\\.)\\S+bai(\\s+)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + sampleid + "." + laneid + "." + stepPreviousToMergeBams + ".bai$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found 'key:dedup.bai' in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for Coordinate Sort "); //$NON-NLS-1$
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
	public static String amendBAIGlobalNameInOutputArtifactsOfTemplateDefinitionCoordinateSort(
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
					"Not found aligned BAI globalName in format globalName: (*)bai in the output artifacts section of the Argo Workflow Template (Coordinate Sort)"); //$NON-NLS-1$
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
	public static String amendBAINameInInputArtifactsOfTemplateSpecificationCoordinateSort(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile(
				"(\\s+-\\s*name:\\s*)\\S*" + previousstepname + "\\S*-bai(\\s+path:\\s*\\S+\\s+\\s*retryStrategy:)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + previousstepname + "-bai-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found 'inputs: artifacts: name:'" + previousstepname //$NON-NLS-1$
					+ "'-bai' as the second input artifact in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoked template for Coordinate Sort "); //$NON-NLS-1$
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
	public static String amendBAINameInInputArtifactsOfWorkflowDefinitionCoordinateSort(
			String invokertemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S*" + previousstepname.trim() + "\\S*-bai"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + previousstepname + "-bai-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception("Not found 'inputs: artifacts: name:markduplicates-bai' in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for Coordinate Sort "); //$NON-NLS-1$
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
	public static String amendBAINameInOutputArtifactsOfTemplateSpecificationCoordinateSort(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern
				.compile("(\\s+-\\s*name:\\s*)" + stepname + "[\"alignedreads\"]?\\S*[\"bam\"]?-bai(\\s+)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + stepname + "-bai-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception(
					"Not found coordinate sort bai name in format name: (*)bai in the output artifacts section of the Argo Workflow Template for querynamesort"); //$NON-NLS-1$
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
	public static String amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionCoordinateSort(
			String invokertemplatefile_as_string, String sampleid, String laneid, String previousstepname,
			String stepPreviousToMergeBams) throws Exception {

		Pattern pattern = Pattern.compile("(\\s+key:\\s*" + previousstepname + "\\.)\\S+bam(\\s+)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + sampleid + "." + laneid + "." + stepPreviousToMergeBams + ".bam$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found 'key:dedup.bam' in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for Coordinate Sort "); //$NON-NLS-1$
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
	public static String amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationCoordinateSort(
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
					"Not found aligned BAM globalName in format globalName: (*)bam in the output artifacts section of the Argo Workflow Template (Coordinate Sort)"); //$NON-NLS-1$
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
	public static String amendBAMNameInInputArtifactsOfTemplateSpecificationCoordinateSort(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern
				.compile("(\\s+-\\s*name:\\s*)\\S*" + previousstepname + "\\S*-bam(\\s+path:\\s*\\S+)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + previousstepname + "-bam-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found 'inputs: artifacts: name:'" + previousstepname //$NON-NLS-1$
					+ "'-bam' as the first input artifact in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoked template for Coordinate Sort "); //$NON-NLS-1$
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
	public static String amendBAMNameInInputArtifactsOfWorkflowDefinitionCoordinateSort(
			String invokertemplatefile_as_string, String previousstepname, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern
				.compile("(\\s+artifacts:\\s+-\\s*name:\\s*)\\S*[\"" + previousstepname + "\"]?\\S+bam"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + previousstepname + "-bam-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception("Not found 'inputs: artifacts: name:" + previousstepname //$NON-NLS-1$
					+ "'-bam' as the first input artifact in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Invoker template for Coordinate Sort "); //$NON-NLS-1$
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
	public static String amendBAMNameInOutputArtifactsOfTemplateSpecificationCoordinateSort(
			String invokedtemplatefile_as_string, String stepname, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)" + stepname + "[\"-alignedreads\"]{0,1}(-bam)"); //$NON-NLS-1$ //$NON-NLS-2$
		Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
		String local = invokedtemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1 " + stepname + "$2-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		} else
			throw new Exception(
					"Not found 'output: artifacts: name: coordinatesort-bam' as the first output artifact in the " //$NON-NLS-1$
							+ "output-artifacts-section of Argo template (Coordinate Sort)"); //$NON-NLS-1$
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
	public static String amendLaneIdInWorkflowDefinitionCoordinateSort(String invokertemplatefile_as_string,
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
						"Not found lane id parameter in correct format in Argo invoker template (Coordinate Sort)"); //$NON-NLS-1$
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
	public static String amendSampleIdInWorkflowDefinitionCoordinateSort(String invokertemplatefile_as_string,
			String sampleid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + sampleid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			} else
				throw new Exception(
						"Not found sample id parameter in correct format in Argo invoker template (Coordinate Sort)"); //$NON-NLS-1$
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
	public static String amendTemplateSpecificationNameInWorkflowDefinitionCoordinateSort(
			String invokertemplatefile_as_string, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+\\s+template:\\s+\\S+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$

		} else
			throw new Exception(
					"Not found invoked template name in correct format in Argo invoker template for coordinate sort"); //$NON-NLS-1$
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
	public static String amendWorkflowDefinitionNameCoordinateSort(String invokertemplatefile_as_string,
			String stepname, String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+)(\\s+template:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + stepname + "-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			} else
				throw new Exception(
						"Not found invoker template name in correct format in Argo invoker template (Coordinate Sort)"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * Instantiates a new query name sort utilities.
	 */
	public CoordinateSortUtilities() {
		// TODO Auto-generated constructor stub
		super();
	}

}
