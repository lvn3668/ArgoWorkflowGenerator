/*
 * 
 */
package argoconfigurationfileutilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: Auto-generated Javadoc
/**
 * The Class MergeBamsUtilities.
 */
public class MergeBamsUtilities extends GenericUtilities {

	/**
	 * Replace bam name in input artifacts of invoker template merge bams.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAMandKeyInInputArtifactsOfWorkflowDefinitionMergeBAMs(
			String invokertemplatefile_as_string, String sampleid, String laneid, int numberOfLanesFromPreviousStep,
			String stepPreviousToMergeBams) throws Exception {

		Pattern pattern;
		Matcher matcher;
		String local = invokertemplatefile_as_string;
		pattern = Pattern.compile(
				"(-\\s*name:\\s*)(\\S+)(\\s+s3:\\s*\\s+endpoint:\\s*\\S+\\s+bucket:\\s*\\S+\\s+key:\\s*)(\\S+)(\\s+accessKeySecret:\\s+name:\\s*\\S+\\s+key:\\s*\\S+\\s+secretKeySecret:\\s+name:\\s*\\S+\\s+key:\\s*\\S+\\s+)"); //$NON-NLS-1$
		matcher = pattern.matcher(invokertemplatefile_as_string);
		if (matcher.find()) {
			// String artifactLine = matcher.group(1);
			String namePattern = matcher.group(1);
			String s3endpointbucketkey = matcher.group(3);
			String accessKeysecretKey = matcher.group(5);
			String revisedInputArtifacts = new String();

			String newInputArtifactName, newkeyname;
			for (int innerindex = 1; innerindex <= numberOfLanesFromPreviousStep; innerindex++) {
				newInputArtifactName = stepPreviousToMergeBams + "-bam-" + sampleid + "-" + innerindex; //$NON-NLS-1$ //$NON-NLS-2$
				newkeyname = "dedup." + sampleid + "." + laneid + ".bam"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				revisedInputArtifacts += namePattern + newInputArtifactName + s3endpointbucketkey + newkeyname
						+ accessKeysecretKey;
			}
			local = matcher.replaceFirst(revisedInputArtifacts);
		} else
			throw new Exception("Not found 'name:\ns3:\nendpoint:\nbucket:\nkey: as the first input artifact in the " //$NON-NLS-1$
					+ "input-artifacts-section of Argo Workflow Steps template for Merge BAMs "); //$NON-NLS-1$

		return local;
	}

	/**
	 * Amend BAM name in input artifacts of template specification merge bams.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param previousstepname              the previousstepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAMandPathInInputArtifactsOfTemplateSpecificationMergeBAMs(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid,
			int numberOfLanesFromPreviousStep) throws Exception {

		Pattern pattern;
		Matcher matcher;
		String local = invokedtemplatefile_as_string;
		for (int index = 1; index <= numberOfLanesFromPreviousStep - 2; index++) {
			if (index == 1) {
				pattern = Pattern
						.compile("(\\s+artifacts:\\s+)(-\\s*name:\\s*)(\\S+)(\\s+path:\\s*)(\\S+)(\\s+-\\s*name:)"); //$NON-NLS-1$
				matcher = pattern.matcher(invokedtemplatefile_as_string);
				if (matcher.find()) {
					String newPath = "/tmp/" + previousstepname + "-bam-" + sampleid + "-" + index + ".bam"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
					local = matcher.replaceFirst(
							"$1" + "$2" + previousstepname + "-bam-" + sampleid + "-" + index + "$4" + newPath + "$6"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
				} else
					throw new Exception(
							"Not found 'inputs:\nartifacts:\nname:*-bam\npath:\nname:' as the first input artifact in the " //$NON-NLS-1$
									+ "input-artifacts-section of Argo Invoked template for Merge BAMs "); //$NON-NLS-1$

			} else if (index == 2) {
				pattern = Pattern.compile(
						"(\\s+-\\s*name:\\s*)(\\S+)(\\s+path:\\s*)(\\S+)(\\s+retryStrategy:\\s+limit:\\s*\\S+)"); //$NON-NLS-1$
				matcher = pattern.matcher(local);
				if (matcher.find()) {
					String namePattern = matcher.group(1);
					String pathPattern = matcher.group(3);
					String newPath;
					String retryStrategy = matcher.group(5);
					String restOfInputArtifacts = new String();
					for (int innerindex = 2; innerindex <= numberOfLanesFromPreviousStep; innerindex++) {
						newPath = "/tmp/" + previousstepname + "-bam-" + sampleid + "-" + innerindex + ".bam"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
						restOfInputArtifacts += namePattern + previousstepname + "-bam-" + sampleid + "-" + innerindex //$NON-NLS-1$ //$NON-NLS-2$
								+ pathPattern + newPath;
					}
					restOfInputArtifacts += retryStrategy;
					local = matcher.replaceFirst(restOfInputArtifacts);
				} else
					throw new Exception(
							"Not found 'name:\npath:\nretrystrategy:\nlimit:' as the second and more, input artifacts in the " //$NON-NLS-1$
									+ "input-artifacts-section of Argo Invoked template for Merge BAMs"); //$NON-NLS-1$
			}
		}
		return local;
	}

	/**
	 * Replace bam file name in key tag of input artifacts in invoker template merge
	 * bams name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param previousstep                  the previousstep
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAMFileNameInKeyTagOfInputArtifactsOfWorkflowDefinitionMergeBAMs(
			String invokertemplatefile_as_string, String previousstep, String sampleid, String laneid)
			throws Exception {

		Pattern pattern = Pattern.compile("(\\s+key:\\s*)(\\S*alignedreads.\\S+bam)(\\s+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1" + previousstep + ".alignedreads." + sampleid + "." + laneid + ".bam$3"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
		} else
			throw new Exception("Not found 'key:'" + previousstep + ".alignedreads.sampleid.laneid.bam' in the " //$NON-NLS-1$ //$NON-NLS-2$
					+ "input-artifacts-section of Argo Workflow Steps template for MergeBams "); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace bam global name in output artifacts merge bams.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAMGlobalNameInOutputArtifactsOfTemplateSpecificationMergeBAMs(
			String invokedtemplatefile_as_string, String stepname, String previousstepname, String sampleid,
			String laneid) throws Exception {
		try {
			Pattern pattern = Pattern
					.compile("(\\s+-\\s*name:\\s*\\S+bam\\S*\\s+globalName:\\s*)\\S*global\\S*bam\\S*(\\s+path)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokedtemplatefile_as_string);
			String local = invokedtemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 " + "global-" + stepname + "-" + previousstepname //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						+ "-bam-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} else
				throw new Exception(
						"Not found merge bam BAM globalName in format name:*.bam\nglobalName: global(*)bam\npath: in the output artifacts section of the Argo Workflow Template for merge bam step"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace bam name in output artifacts merge bams.
	 *
	 * @param invokedtemplatefile_as_string the invokedtemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendBAMNameInOutputArtifactsOfTemplateSpecificationMergeBAMs(
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
						"Not found 'output: artifacts: name:*-bam\nglobalname:\npath:\ns3:' as one of the output artifacts in the " //$NON-NLS-1$
								+ "output-artifacts-section of Argo template for MergeBAMs"); //$NON-NLS-1$
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
	public static @Nullable String amendInputInArgsOfTemplateSpecificationMergeBAMs(
			String invokedtemplatefile_as_string, String previousstepname, String sampleid,
			int numberOfLanesFromPreviousStep) throws Exception {

		Pattern pattern;
		Matcher matcher;
		String local;
		pattern = Pattern.compile("(MergeSamFiles)(\\s+INPUT=\\s*\\S+){2,}(\\s+OUTPUT=\\s*)(\\S+)"); //$NON-NLS-1$
		matcher = pattern.matcher(invokedtemplatefile_as_string);
		if (matcher.find()) {
			String newSetOfInputPathsForBAMsToBeMerged = new String();
			String toolName = matcher.group(1);
			String outputArgument = matcher.group(3);
			String outputFileName = matcher.group(4);
			String replacementArgument = new String();
			for (int innerindex = 1; innerindex <= numberOfLanesFromPreviousStep; innerindex++) {
				newSetOfInputPathsForBAMsToBeMerged += " INPUT=/tmp/" + previousstepname + "-bam-" + sampleid + "-" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
						+ innerindex + ".bam  "; //$NON-NLS-1$
			}
			replacementArgument = toolName + newSetOfInputPathsForBAMsToBeMerged + outputArgument + outputFileName;
			local = invokedtemplatefile_as_string;
			local = matcher.replaceFirst(replacementArgument);

		} else
			throw new Exception("Not found 'INPUT=*.bam' in the " //$NON-NLS-1$
					+ "arguments section of Argo Invoked template (GATK Command Call) for Merge BAMs "); //$NON-NLS-1$

		return local;
	}

	/**
	 * Replace sample id in invoker template query name sort.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendSampleIdInWorkflowDefinitionMergeBAMs(String invokertemplatefile_as_string,
			String sampleid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+parameters:\\s+-\\s*name:\\s*\\S+\\s+value:\\s*)(\\S+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 \"" + sampleid + "\""); //$NON-NLS-1$ //$NON-NLS-2$
			} else
				throw new Exception(
						"Not found sample id parameter as parameters:\nname:\nvalue in Argo Workflow Steps template of merge bams step"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace invoked template name in invoker template mergebams.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendTemplateSpecificationNameInWorkflowDefinitionMergeBAMs(
			String invokertemplatefile_as_string, String sampleid, String laneid) throws Exception {
		Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+\\s+template:\\s+\\S+)"); //$NON-NLS-1$
		Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
		String local = invokertemplatefile_as_string;
		if (matcher.find()) {
			local = matcher.replaceAll("$1-" + sampleid + "-" + laneid); //$NON-NLS-1$ //$NON-NLS-2$

		} else
			throw new Exception("Not found -name:\ntemplate: in Argo Workflow Step template for merge bams"); //$NON-NLS-1$
		return local;

	}

	/**
	 * Replace invoker template name merge bams.
	 *
	 * @param invokertemplatefile_as_string the invokertemplatefile as string
	 * @param stepname                      the stepname
	 * @param sampleid                      the sampleid
	 * @param laneid                        the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static @Nullable String amendWorkflowDefinitionNameMergeBAMs(String invokertemplatefile_as_string,
			String stepname, String sampleid, String laneid) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*)\\S+(\\s+template:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(invokertemplatefile_as_string);
			String local = invokertemplatefile_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1" + stepname + "-" + sampleid + "-" + laneid + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			} else
				throw new Exception(
						"Not found template name in format: name:\ntemplate: in Argo Workflow Steps template (Mark Duplicates)"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

	}

	/**
	 * Instantiates a new mergebams utilities.
	 */
	public MergeBamsUtilities() {
		// TODO Auto-generated constructor stub
		super();
	}

}
