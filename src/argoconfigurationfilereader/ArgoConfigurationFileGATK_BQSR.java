/*
 * 
 */
package argoconfigurationfilereader;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoConfigurationFileGATK_BQSR.
 */
public class ArgoConfigurationFileGATK_BQSR extends ArgoTemplateProducer_BQSR {

	/** The db SNP file name. */
	String dbSNPFileName;

	/** The gold standard indels. */
	String goldStandardIndels;

	/**
	 * Instantiates a new BQSR config file parser.
	 */
	public ArgoConfigurationFileGATK_BQSR() {
		try {
			this.dbSNPFileName = new String();
			this.goldStandardIndels = new String();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the db SNP file name.
	 *
	 * @return the db SNP file name
	 */
	public String getDbSNPFileName() {
		try {
			return this.dbSNPFileName;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the gold standard indels.
	 *
	 * @return the gold standard indels
	 */
	public String getGoldStandardIndels() {
		try {
			return this.goldStandardIndels;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Sets the db SNP file name.
	 *
	 * @param dbSNPFileName the new db SNP file name
	 */
	public void setDbSNPFileName(String dbSNPFileName) {
		try {
			this.dbSNPFileName = dbSNPFileName;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Sets the gold standard indels.
	 *
	 * @param goldStandardIndels the new gold standard indels
	 */
	public void setGoldStandardIndels(String goldStandardIndels) {
		try {
			this.goldStandardIndels = goldStandardIndels;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
