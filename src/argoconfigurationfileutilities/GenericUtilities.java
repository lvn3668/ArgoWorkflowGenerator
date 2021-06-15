/*
 * 
 */
package argoconfigurationfileutilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import argoconfigurationfilereader.WorkflowStepsList;

// TODO: Auto-generated Javadoc
/**
 * The Class GenericUtilities.
 */
public class GenericUtilities {

	/**
	 * Replace active deadline seconds.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param activedeadlineseconds           the activedeadlineseconds
	 * @return the string
	 */
	public static String amendActiveDeadlineSecondsValueInTemplateSpecification(String templateSpecification_as_string,
			String activedeadlineseconds) {
		try {
			String local = templateSpecification_as_string;
			local = templateSpecification_as_string.replaceAll("activeDeadlineSeconds: \\S+", //$NON-NLS-1$
					"activeDeadlineSeconds: " + activedeadlineseconds); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace bucket name.
	 *
	 * @param workflowDefinition_as_string the invokedtemplatefile as string
	 * @param bucketname                   the bucketname
	 * @return the string
	 */
	public static String amendBucketNameInTemplateSpecification(String workflowDefinition_as_string,
			String bucketname) {
		try {
			String local = workflowDefinition_as_string;
			local = workflowDefinition_as_string.replaceAll("bucket: \\S+", //$NON-NLS-1$
					"bucket: " + bucketname); //$NON-NLS-1$

			return local;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace CPU limits in resources.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param cpuResourceslimits              the cpu resources limits
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendCPULimitsinResourcesOfTemplateSpecification(String templateSpecification_as_string,
			String cpuResourceslimits) throws Exception {

		try {
			StringBuffer templatewithreplacedCPUlimits = new StringBuffer();
			InputStream inputstream = convertStringToInputStreamReader(templateSpecification_as_string);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));

			String lineInTemplateSpecification;
			while ((lineInTemplateSpecification = br.readLine()) != null) {
				// Customize CPU Limits in resources
				if (lineInTemplateSpecification.contains("resources:")) { //$NON-NLS-1$
					templatewithreplacedCPUlimits.append(lineInTemplateSpecification);
					templatewithreplacedCPUlimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
					// read the next line
					String limitslineInTemplateSpecification = br.readLine();
					// It should be limits
					// if not throw an exception
					if (limitslineInTemplateSpecification.contains("limits")) { //$NON-NLS-1$
						// Append the line
						templatewithreplacedCPUlimits.append(limitslineInTemplateSpecification);
						templatewithreplacedCPUlimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
						// Read in the memory line and append it as-is
						// Scope of function is to change only CPU Limits
						String memorylineInTemplateSpecification = br.readLine();
						if (!memorylineInTemplateSpecification.contains("memory")) //$NON-NLS-1$
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:"); //$NON-NLS-1$
						else {
							templatewithreplacedCPUlimits.append(memorylineInTemplateSpecification);
							templatewithreplacedCPUlimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
						}

						// Read in CPU line
						String cpulineInTemplateSpecification = br.readLine();
						String[] cpulimitssplitasarray = cpulineInTemplateSpecification.split(":"); //$NON-NLS-1$
						if (cpulimitssplitasarray[0].contains("cpu")) { //$NON-NLS-1$
							cpulimitssplitasarray[1] = cpuResourceslimits;
							cpulineInTemplateSpecification = String.join(": ", cpulimitssplitasarray); //$NON-NLS-1$
							templatewithreplacedCPUlimits.append(cpulineInTemplateSpecification);
							templatewithreplacedCPUlimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
						} else
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:\n cpu:"); //$NON-NLS-1$
					} else
						throw new Exception("Invalid entry in template; Looking for resources:\n limits: "); //$NON-NLS-1$

				} else {
					templatewithreplacedCPUlimits.append(lineInTemplateSpecification);
					templatewithreplacedCPUlimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
				}
			}
			return templatewithreplacedCPUlimits.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace CPU requests in resources.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param cpuResourcesRequests            the cpu resources requests
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendCPURequestsinResourcesOfTemplateSpecification(String templateSpecification_as_string,
			String cpuResourcesRequests) throws Exception {

		try {
			StringBuffer templatewithreplacedCPURequests = new StringBuffer();
			InputStream inputstream = convertStringToInputStreamReader(templateSpecification_as_string);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));

			String lineInTemplateSpecification;
			while ((lineInTemplateSpecification = br.readLine()) != null) {
				// Customize CPU resource limits
				if (lineInTemplateSpecification.contains("resources:")) { //$NON-NLS-1$
					templatewithreplacedCPURequests.append(lineInTemplateSpecification);
					templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
					// read the next line
					String limitsLineinTemplateSpecification = br.readLine();
					// It should be limits
					// if not throw an exception
					if (limitsLineinTemplateSpecification.contains("limits")) { //$NON-NLS-1$
						// Append the limits line
						templatewithreplacedCPURequests.append(limitsLineinTemplateSpecification);
						templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
						// Read in the memory line
						String memoryLimitsLineInTemplateSpecification = br.readLine();
						if (!memoryLimitsLineInTemplateSpecification.contains("memory")) //$NON-NLS-1$
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:"); //$NON-NLS-1$
						else {
							templatewithreplacedCPURequests.append(memoryLimitsLineInTemplateSpecification);
							templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
						}
						// Read in CPU line
						String cpuLimitsLineInTemplateSpecification = br.readLine();
						// Throw an exception if it does not contain CPU entry
						// If it does, add it as-is
						if (!cpuLimitsLineInTemplateSpecification.contains("cpu")) //$NON-NLS-1$
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:\n cpu:"); //$NON-NLS-1$
						else {
							templatewithreplacedCPURequests.append(cpuLimitsLineInTemplateSpecification);
							templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
						}

						// read the next line
						String resourceRequestsLineInTemplateSpecification = br.readLine();
						if (resourceRequestsLineInTemplateSpecification.contains("requests")) { //$NON-NLS-1$
							// Append the requests line
							templatewithreplacedCPURequests.append(resourceRequestsLineInTemplateSpecification);
							templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
							// Read in the memory line
							String requestedmemorylineInTemplateSpecification = br.readLine();
							if (!requestedmemorylineInTemplateSpecification.contains("memory")) //$NON-NLS-1$
								throw new Exception(
										"Invalid entry in template file; Looking for resource:\n limits:\n memory:\n cpu: \n requests: \n memory: \n cpu: "); //$NON-NLS-1$
							else {
								templatewithreplacedCPURequests.append(requestedmemorylineInTemplateSpecification);
								templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
							}
							// Read in CPU line
							String cpuRequestLineInTemplateSpecification = br.readLine();
							// Throw an exception if it does not contain CPU entry
							// If it does, add it as-is
							// Scope of function is only to change Memory Requests

							String[] cpurequestssplitasarray = cpuRequestLineInTemplateSpecification.split(":"); //$NON-NLS-1$
							if (!cpurequestssplitasarray[0].contains("cpu")) //$NON-NLS-1$
								throw new Exception(
										"Invalid entry in template file; Looking for resource:\n limits:\n memory:\n cpu:\n requests:\n \nlmemory: \ncpu:"); //$NON-NLS-1$
							else {
								cpurequestssplitasarray[1] = cpuResourcesRequests;
								cpuRequestLineInTemplateSpecification = String.join(": ", cpurequestssplitasarray); //$NON-NLS-1$
								templatewithreplacedCPURequests.append(cpuRequestLineInTemplateSpecification);
								templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
							}
						} else
							throw new Exception(
									"Invalid entry in template; Looking for resource defintion with requests entry"); //$NON-NLS-1$
					} else
						throw new Exception("Invalid entry in template; Looking for resources:\n limits: "); //$NON-NLS-1$
				} else {
					// All lines in file other than the resource portion must be added as-is without
					// modification
					templatewithreplacedCPURequests.append(lineInTemplateSpecification);
					templatewithreplacedCPURequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
				}
			}
			return templatewithreplacedCPURequests.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace global lane id in output parameters.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param sampleId                        the sample id
	 * @param laneId                          the lane id
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendGlobalNameOfLaneIdInOutputParametersOfTemplateSpecification(
			String templateSpecification_as_string, String sampleId, String laneId) throws Exception {
		try {
			Pattern pattern = Pattern
					.compile("(\\s+-\\s*name:\\s*laneid-\\S+\\s+globalName:\\s*global-laneid\\S*)(\\s+valueFrom:)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(templateSpecification_as_string);
			String local = templateSpecification_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + sampleId + "-" + laneId + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} else
				throw new Exception(
						"Not found 'globalName: global-laneid' as the second output parameter in the output-pareplacementrameters-section of Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace global sample id in output parameters.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param sampleId                        the sample id
	 * @param laneId                          the lane id
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendGlobalNameOfSampleIdInOutputParametersOfTemplateSpecification(
			String templateSpecification_as_string, String sampleId, String laneId) throws Exception {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+outputs:\\s+parameters:\\s+-\\s*name:\\s*sampleid\\S+\\s+globalName:\\s*global-sampleid)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(templateSpecification_as_string);
			String local = templateSpecification_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + sampleId + "-" + laneId); //$NON-NLS-1$ //$NON-NLS-2$
			} else
				throw new Exception(
						"Not found global sample name in the format globalName:global-sampleid, as the first output parameter in the output section of the Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace lane id in output parameters.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param sampleId                        the sample id
	 * @param laneId                          the lane id
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendLaneIdInOutputParametersOfTemplateSpecification(String templateSpecification_as_string,
			String sampleId, String laneId) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*laneid\\S*)(\\s+globalName:\\s*\\S+\\s+valueFrom:)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(templateSpecification_as_string);
			String local = templateSpecification_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + sampleId + "-" + laneId + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} else
				throw new Exception(
						"Not found 'name: laneid' as the second output parameter in the output-parameters-section of Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace log file name.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param stepname                        the stepname
	 * @param sampleId                        the sample id
	 * @param laneId                          the lane id
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendLogFileNameInTemplateSpecification(String templateSpecification_as_string,
			String stepname, String sampleId, String laneId) throws Exception {
		try {
			Pattern pattern = Pattern
					.compile("(\\s+-\\s*name:\\s*)" + stepname + "(-logfile)(\\s+globalName:\\s*\\S+\\s+path:)"); //$NON-NLS-1$ //$NON-NLS-2$
			Matcher matcher = pattern.matcher(templateSpecification_as_string);
			String local = templateSpecification_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1" + stepname + "$2-" + sampleId + "-" + laneId + "$3"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			} else
				throw new Exception("Not found 'output: artifacts: name:'" + stepname //$NON-NLS-1$
						+ "-logfile as one of the output artifacts in the " //$NON-NLS-1$
						+ "output-artifacts-section of Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace memory limits in resources.
	 *
	 * @param templateSpecification_as_String the invokedtemplatefile as string
	 * @param memoryResourceslimits           the memory resources limits
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendMemoryLimitsinResourcesOfTemplateSpecification(String templateSpecification_as_String,
			String memoryResourceslimits) throws Exception {

		try {
			StringBuffer templatewithreplacedMemorylimits = new StringBuffer();
			InputStream inputstream = convertStringToInputStreamReader(templateSpecification_as_String);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));
			String lineInTemplateSpecification;
			while ((lineInTemplateSpecification = br.readLine()) != null) {
				// Customize CPU resource limits
				if (lineInTemplateSpecification.contains("resources:")) { //$NON-NLS-1$
					templatewithreplacedMemorylimits.append(lineInTemplateSpecification);
					templatewithreplacedMemorylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
					// read the next line
					String limitslineInTemplateSpecification = br.readLine();
					// It should be limits
					// if not throw an exception
					if (limitslineInTemplateSpecification.contains("limits")) { //$NON-NLS-1$
						// Append the limits line
						templatewithreplacedMemorylimits.append(limitslineInTemplateSpecification);
						templatewithreplacedMemorylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
						// Read in the memory line
						String memorylineInTemplateSpecification = br.readLine();
						String[] memorylimitssplitasarray = memorylineInTemplateSpecification.split(":"); //$NON-NLS-1$
						if (memorylimitssplitasarray[0].contains("memory")) { //$NON-NLS-1$
							memorylimitssplitasarray[1] = memoryResourceslimits;
							memorylineInTemplateSpecification = String.join(": ", memorylimitssplitasarray); //$NON-NLS-1$
							templatewithreplacedMemorylimits.append(memorylineInTemplateSpecification);
							templatewithreplacedMemorylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
						} else
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:"); //$NON-NLS-1$

						// Read in CPU line
						String cpulineInTemplateSpecification = br.readLine();
						// Throw an exception if it does not contain CPU entry
						// If it does, add it as-is
						// Scope of function is only to change Memory Limits
						if (!cpulineInTemplateSpecification.contains("cpu")) //$NON-NLS-1$
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:\n cpu:"); //$NON-NLS-1$
						else {
							templatewithreplacedMemorylimits.append(cpulineInTemplateSpecification);
							templatewithreplacedMemorylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
						}
					} else
						throw new Exception("Invalid entry in template; Looking for resources:\n limits: "); //$NON-NLS-1$
				} else {
					// All lines in file other than the resource portion must be added as-is without
					// modification
					templatewithreplacedMemorylimits.append(lineInTemplateSpecification);
					templatewithreplacedMemorylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
				}
			}
			return templatewithreplacedMemorylimits.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace memory requests in resources.
	 *
	 * @param templateSpecification_as_String the invokedtemplatefile as string
	 * @param memoryResourcesRequests         the memory resources requests
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendMemoryRequestsinResourcesOfTemplateSpecification(String templateSpecification_as_String,
			String memoryResourcesRequests) throws Exception {

		try {
			StringBuffer templatewithreplacedMemoryRequests = new StringBuffer();
			InputStream inputstream = convertStringToInputStreamReader(templateSpecification_as_String);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));
			String lineInTemplateSpecification;
			while ((lineInTemplateSpecification = br.readLine()) != null) {
				// Customize CPU resource limits
				if (lineInTemplateSpecification.contains("resources:")) { //$NON-NLS-1$
					templatewithreplacedMemoryRequests.append(lineInTemplateSpecification);
					templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
					// read the next line
					String limitslineInTemplateSpecification = br.readLine();
					// It should be limits
					// if not throw an exception
					if (limitslineInTemplateSpecification.contains("limits")) { //$NON-NLS-1$
						// Append the limits line
						templatewithreplacedMemoryRequests.append(limitslineInTemplateSpecification);
						templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
						// Read in the memory line
						String memorylimitslineInTemplateSpecification = br.readLine();
						if (!memorylimitslineInTemplateSpecification.contains("memory")) //$NON-NLS-1$
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:"); //$NON-NLS-1$
						else {
							templatewithreplacedMemoryRequests.append(memorylimitslineInTemplateSpecification);
							templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
						}
						// Read in CPU line
						String cpulimitslineInTemplateSpecification = br.readLine();
						// Throw an exception if it does not contain CPU entry
						// If it does, add it as-is
						if (!cpulimitslineInTemplateSpecification.contains("cpu")) //$NON-NLS-1$
							throw new Exception(
									"Invalid entry in template file; Looking for resource:\n limits:\n memory:\n cpu:"); //$NON-NLS-1$
						else {
							templatewithreplacedMemoryRequests.append(cpulimitslineInTemplateSpecification);
							templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
						}
						// read the next line
						String requestslineInTemplateSpecification = br.readLine();
						if (requestslineInTemplateSpecification.contains("requests")) { //$NON-NLS-1$
							// Append the requests line
							templatewithreplacedMemoryRequests.append(requestslineInTemplateSpecification);
							templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
							// Read in the memory line
							String requestedmemorylineInTemplateSpecification = br.readLine();
							String[] memoryrequestssplitasarray = requestedmemorylineInTemplateSpecification.split(":"); //$NON-NLS-1$
							if (memoryrequestssplitasarray[0].contains("memory")) { //$NON-NLS-1$
								memoryrequestssplitasarray[1] = memoryResourcesRequests;
								requestedmemorylineInTemplateSpecification = String.join(": ", //$NON-NLS-1$
										memoryrequestssplitasarray);
								templatewithreplacedMemoryRequests.append(requestedmemorylineInTemplateSpecification);
								templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
							} else
								throw new Exception(
										"Invalid entry in template file; Looking for resource:\n limits:\n memory: \n cpu: \n requests: \n memory: \n cpu:"); //$NON-NLS-1$

							// Read in CPU line
							String cpurequestlineInTemplateSpecification = br.readLine();
							// Throw an exception if it does not contain CPU entry
							// If it does, add it as-is
							// Scope of function is only to change Memory Requests
							if (!cpurequestlineInTemplateSpecification.contains("cpu:")) //$NON-NLS-1$
								throw new Exception(
										"Invalid entry in template file; Looking for resource:\n limits:\n memory:\n cpu: \n requests: \n memory: \n cpu: "); //$NON-NLS-1$
							else {
								templatewithreplacedMemoryRequests.append(cpurequestlineInTemplateSpecification);
								templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
							}
						} else
							throw new Exception(
									"Invalid entry in template; Looking for resource defintion with requests entry"); //$NON-NLS-1$
					} else
						throw new Exception("Invalid entry in template; Looking for resources:\n limits: "); //$NON-NLS-1$
				} else {
					// All lines in file other than the resource portion must be added as-is without
					// modification
					templatewithreplacedMemoryRequests.append(lineInTemplateSpecification);
					templatewithreplacedMemoryRequests.append(System.getProperty("line.separator")); //$NON-NLS-1$
				}
			}
			return templatewithreplacedMemoryRequests.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace global log file name.
	 *
	 * @param templateSpecification_as_string the invokedtemplatefile as string
	 * @param stepname                        the stepname
	 * @param sampleId                        the sample id
	 * @param laneId                          the lane id
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendNameOfGlobalLogFileInTemplateSpecification(String templateSpecification_as_string,
			String stepname, String sampleId, String laneId) throws Exception {
		try {
			Pattern pattern = Pattern.compile(
					"(\\s+-\\s*name:\\s*\\S+\\s+globalName:\\s*)global\\S+" + stepname + "\\S*logfile\\S*(\\s+path:)"); //$NON-NLS-1$ //$NON-NLS-2$
			Matcher matcher = pattern.matcher(templateSpecification_as_string);
			String local = templateSpecification_as_string;
			if (matcher.find()) {
				local = matcher.replaceAll("$1 global-" + stepname + "-logfile-" + sampleId + "-" + laneId + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
			} else
				throw new Exception("Not found 'output: artifacts: name:'" + stepname //$NON-NLS-1$
						+ "-logfile as one of the output artifacts in the " //$NON-NLS-1$
						+ "output-artifacts-section of Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace name of invoked template.
	 *
	 * @param templateSpecification_as_String the invokedtemplatefile as string
	 * @param stepname                        the stepname
	 * @param sampleId                        the sampleid
	 * @param laneId                          the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendNameOfTemplateInTemplateSpecification(String templateSpecification_as_String,
			String stepname, String sampleId, String laneId) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+-\\s*name:\\s*\\S+)(\\s+inputs:\\s+)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(templateSpecification_as_String);
			String local = templateSpecification_as_String;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + sampleId + "-" + laneId + "$2"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			} else
				throw new Exception("Not found -name:\ninputs: in Argo template " + stepname); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace retry strategyusing limits.
	 *
	 * @param templateSpecification_as_String the invokedtemplatefile as string
	 * @param retryStrategylimits             the retry strategylimits
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendRetryStrategyusingLimitsInTemplateSpecification(String templateSpecification_as_String,
			String retryStrategylimits) throws Exception {
		try {
			StringBuffer templatewithreplacedretrystrategylimits = new StringBuffer();
			InputStream inputstream = convertStringToInputStreamReader(templateSpecification_as_String);
			BufferedReader br = new BufferedReader(new InputStreamReader(inputstream));
			String lineInTemplateSpecification;
			while ((lineInTemplateSpecification = br.readLine()) != null) {

				// Customize retry strategy
				if (lineInTemplateSpecification.contains("retryStrategy:")) { //$NON-NLS-1$
					templatewithreplacedretrystrategylimits.append(lineInTemplateSpecification);
					templatewithreplacedretrystrategylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
					// read the next line
					String nextlineInTemplateSpecification = br.readLine();
					String[] retrystrategylimitsarray = nextlineInTemplateSpecification.split(":"); //$NON-NLS-1$
					if (retrystrategylimitsarray[0].contains("limit")) //$NON-NLS-1$
						retrystrategylimitsarray[1] = retryStrategylimits;
					else
						throw new Exception("Invalid entry in template; Looking for retrystrategy with finite limits"); //$NON-NLS-1$

					lineInTemplateSpecification = String.join(": ", retrystrategylimitsarray); //$NON-NLS-1$
					templatewithreplacedretrystrategylimits.append(lineInTemplateSpecification);
					templatewithreplacedretrystrategylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
				} else {
					templatewithreplacedretrystrategylimits.append(lineInTemplateSpecification);
					templatewithreplacedretrystrategylimits.append(System.getProperty("line.separator")); //$NON-NLS-1$
				}
			}
			br.close();
			return templatewithreplacedretrystrategylimits.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Replace sample id in output parameters.
	 *
	 * @param templateSpecification_as_String the invokedtemplatefile as string
	 * @param sampleId                        the sampleid
	 * @param laneId                          the laneid
	 * @return the string
	 * @throws Exception the exception
	 */
	public static String amendSampleIdInOutputParametersOfTemplateSpecification(String templateSpecification_as_String,
			String sampleId, String laneId) throws Exception {
		try {
			Pattern pattern = Pattern.compile("(\\s+outputs:\\s+parameters:\\s+-\\s*name:\\s*sampleid)"); //$NON-NLS-1$
			Matcher matcher = pattern.matcher(templateSpecification_as_String);
			// System.out.println(templateSpecification_as_String);
			String local = templateSpecification_as_String;
			if (matcher.find()) {
				local = matcher.replaceAll("$1-" + sampleId + "-" + laneId); //$NON-NLS-1$ //$NON-NLS-2$
			} else
				throw new Exception("Not found name: sampleid in output parameters of Argo template"); //$NON-NLS-1$
			return local;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Check if step name is supported.
	 *
	 * @param stepname the stepname
	 * @return true, if successful
	 */
	public static boolean checkIfStepNameIsSupported(String stepname) {
		try {
			for (WorkflowStepsList ws : WorkflowStepsList.values()) {
				if (ws.name().equals(stepname)) {
					return true;
				}
			}

			return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	/**
	 * Convert file to string.
	 *
	 * @param file the file
	 * @return the string
	 */
	public static String convertFileToString(File file) {
		try {
			StringBuilder contentBuilder = new StringBuilder();
			String filecontents_as_string = null;
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String currentLine;
				while ((currentLine = br.readLine()) != null) {
					contentBuilder.append(currentLine).append("\n"); //$NON-NLS-1$
				}
				filecontents_as_string = contentBuilder.toString();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return filecontents_as_string;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	/**
	 * Convert string array to string.
	 *
	 * @param linesInFile the line in file
	 * @return the string
	 */
	public static String convertStringArrayToString(String[] linesInFile) {
		try {
			StringBuffer stringbuffer = new StringBuffer();
			for (int index = 0; index < linesInFile.length; index++) {
				stringbuffer.append(linesInFile[index]);
			}
			return stringbuffer.toString();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Convert string to input stream reader.
	 *
	 * @param inputstringtobeconverted the inputstringtobeconverted
	 * @return the input stream
	 */
	public static InputStream convertStringToInputStreamReader(String inputstringtobeconverted) {
		try {
			InputStream inputStream = new ByteArrayInputStream(
					inputstringtobeconverted.getBytes(Charset.forName("UTF-8"))); //$NON-NLS-1$
			return inputStream;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Write workflow to file using buffered writter then correct.
	 *
	 * @param output   the output
	 * @param filename the filename
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void writeWorkflowToFileUsingBufferedWritter_thenCorrect(String output, String filename)
			throws IOException {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			writer.write(output);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Instantiates a new generic utilities.
	 */
	public GenericUtilities() {
		// TODO Auto-generated constructor stub
	}

}
