Release notes for v2.5 of Argo Based Dynamic Workflow Generator
==============================================================

Features:
1. Generation of templates and workflow steps for multiple steps in a WGS and WES Pipeline
2. Any template file and Any workflow-steps-file can be provided in the configuration file
3. Support extended to implement scatter-gather from bwa-mem through mark-duplicates for a single sample (upto 4 lanes)
4. Generation of templates from bwa-mem through ApplyBQSR provided
5. Upto 13 intervals supported for BQSR and ApplyBQSR 
6. Additional validation of argo configuration file added

Steps to compile:
Run the ant build.xml cleanall, build, jar
This creates a jar ArgoDynamicWorkflowGenerator.jar
Note: Make sure that the referenced libs commons-io-2.6.jar is on the classpath

Steps to run:
1) java -cp lib:commons-io-2.6.jar:<all template directories>:<configuration file> Jar-file-from-previous-step configfilename 
2) All the template files and configuration files must be on the class path 
c) The output file name is <configfile name>.workflow.yaml

Validate the yaml:
1) Install Argo locally
2) Run argo lint <workflow file>
3) If access to GKE cluster is available, argo submit <workflow file>

 