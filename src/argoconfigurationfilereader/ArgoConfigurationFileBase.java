/*
 * 
 */
package argoconfigurationfilereader;

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class ArgoConfigurationFileBase.
 */
abstract class ArgoConfigurationFileBase {

	/** The CPU limits. */
	private LinkedList<String> _CPULimits;

	/** The CPU requests. */
	private LinkedList<String> _CPURequests;

	/** The fastq 1 list. */
	private LinkedList<String> _fastq1List;

	/** The fastq 2 list. */
	private LinkedList<String> _fastq2List;

	/** The gender. */
	private String _gender;

	/** The laneids. */
	private LinkedList<String> _laneids;

	/** The memory limits. */
	private LinkedList<String> _memoryLimits;

	/** The memory requests. */
	private LinkedList<String> _memoryRequests;

	/** The number of lanes. */
	private String _numberOfLanes;

	/** The number of samples. */
	private String _numberOfSamples;

	/** The sample ids. */
	private LinkedList<String> _sampleIds;

	/** The stepname. */
	private String _stepname;

	/**
	 * Instantiates a new argo configuration file base class.
	 */
	public ArgoConfigurationFileBase() {
		// TODO Auto-generated constructor stub
		try {
			this._sampleIds = new LinkedList<>();
			this._laneids = new LinkedList<>();
			this._fastq1List = new LinkedList<>();
			this._fastq2List = new LinkedList<>();
			this._memoryLimits = new LinkedList<>();
			this._memoryRequests = new LinkedList<>();
			this._CPULimits = new LinkedList<>();
			this._CPURequests = new LinkedList<>();
			this._stepname = null;
			this._numberOfSamples = null;
			this._numberOfLanes = null;
			this._gender = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArgoConfigurationFileBase other = (ArgoConfigurationFileBase) obj;
		if (this._CPULimits == null) {
			if (other._CPULimits != null)
				return false;
		} else if (!this._CPULimits.equals(other._CPULimits))
			return false;
		if (this._CPURequests == null) {
			if (other._CPURequests != null)
				return false;
		} else if (!this._CPURequests.equals(other._CPURequests))
			return false;
		if (this._fastq1List == null) {
			if (other._fastq1List != null)
				return false;
		} else if (!this._fastq1List.equals(other._fastq1List))
			return false;
		if (this._fastq2List == null) {
			if (other._fastq2List != null)
				return false;
		} else if (!this._fastq2List.equals(other._fastq2List))
			return false;
		if (this._gender == null) {
			if (other._gender != null)
				return false;
		} else if (!this._gender.equals(other._gender))
			return false;
		if (this._laneids == null) {
			if (other._laneids != null)
				return false;
		} else if (!this._laneids.equals(other._laneids))
			return false;
		if (this._memoryLimits == null) {
			if (other._memoryLimits != null)
				return false;
		} else if (!this._memoryLimits.equals(other._memoryLimits))
			return false;
		if (this._memoryRequests == null) {
			if (other._memoryRequests != null)
				return false;
		} else if (!this._memoryRequests.equals(other._memoryRequests))
			return false;
		if (this._numberOfLanes == null) {
			if (other._numberOfLanes != null)
				return false;
		} else if (!this._numberOfLanes.equals(other._numberOfLanes))
			return false;
		if (this._numberOfSamples == null) {
			if (other._numberOfSamples != null)
				return false;
		} else if (!this._numberOfSamples.equals(other._numberOfSamples))
			return false;
		if (this._sampleIds == null) {
			if (other._sampleIds != null)
				return false;
		} else if (!this._sampleIds.equals(other._sampleIds))
			return false;
		if (this._stepname == null) {
			if (other._stepname != null)
				return false;
		} else if (!this._stepname.equals(other._stepname))
			return false;
		return true;
	}

	/**
	 * Gets the CPU limits.
	 *
	 * @return the CPU limits
	 */
	public LinkedList<String> getCPULimits() {
		try {
			return this._CPULimits;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the CPU requests.
	 *
	 * @return the CPU requests
	 */
	public LinkedList<String> getCPURequests() {
		try {
			return this._CPURequests;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the fastq 1 list.
	 *
	 * @return the fastq 1 list
	 */
	public LinkedList<String> getFastq1List() {
		try {
			return this._fastq1List;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the fastq 2 list.
	 *
	 * @return the fastq 2 list
	 */
	public LinkedList<String> getFastq2List() {
		try {
			return this._fastq2List;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		try {
			return this._gender;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the laneids.
	 *
	 * @return the laneids
	 */
	public LinkedList<String> getLaneids() {
		try {
			return this._laneids;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the memory limits.
	 *
	 * @return the memory limits
	 */
	public LinkedList<String> getMemoryLimits() {
		try {
			return this._memoryLimits;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the memory requests.
	 *
	 * @return the memory requests
	 */
	public LinkedList<String> getMemoryRequests() {
		try {
			return this._memoryRequests;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the number of lanes.
	 *
	 * @return the number of lanes
	 */
	public String getNumberOfLanes() {
		try {
			return this._numberOfLanes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the number of samples.
	 *
	 * @return the number of samples
	 */
	public String getNumberOfSamples() {
		try {
			return this._numberOfSamples;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the sample ids.
	 *
	 * @return the sample ids
	 */
	public LinkedList<String> getSampleIds() {
		try {
			return this._sampleIds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Gets the stepname.
	 *
	 * @return the stepname
	 */
	public String getStepname() {
		try {
			return this._stepname;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this._CPULimits == null) ? 0 : this._CPULimits.hashCode());
		result = prime * result + ((this._CPURequests == null) ? 0 : this._CPURequests.hashCode());
		result = prime * result + ((this._fastq1List == null) ? 0 : this._fastq1List.hashCode());
		result = prime * result + ((this._fastq2List == null) ? 0 : this._fastq2List.hashCode());
		result = prime * result + ((this._gender == null) ? 0 : this._gender.hashCode());
		result = prime * result + ((this._laneids == null) ? 0 : this._laneids.hashCode());
		result = prime * result + ((this._memoryLimits == null) ? 0 : this._memoryLimits.hashCode());
		result = prime * result + ((this._memoryRequests == null) ? 0 : this._memoryRequests.hashCode());
		result = prime * result + ((this._numberOfLanes == null) ? 0 : this._numberOfLanes.hashCode());
		result = prime * result + ((this._numberOfSamples == null) ? 0 : this._numberOfSamples.hashCode());
		result = prime * result + ((this._sampleIds == null) ? 0 : this._sampleIds.hashCode());
		result = prime * result + ((this._stepname == null) ? 0 : this._stepname.hashCode());
		return result;
	}

	/**
	 * Sets the CPU limits.
	 *
	 * @param cpuLimits the new CPU limits
	 */
	public void setCPULimits(LinkedList<String> cpuLimits) {
		try {
			this._CPULimits = cpuLimits;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the CPU requests.
	 *
	 * @param cpuRequests the new CPU requests
	 */
	public void setCPURequests(LinkedList<String> cpuRequests) {
		try {
			this._CPURequests = cpuRequests;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the fastq 1 list.
	 *
	 * @param fastq1 the new fastq 1 list
	 */
	public void setFastq1List(LinkedList<String> fastq1) {
		try {
			this._fastq1List = fastq1;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the fastq 2 list.
	 *
	 * @param fastq2 the new fastq 2 list
	 */
	public void setFastq2List(LinkedList<String> fastq2) {
		try {
			this._fastq2List = fastq2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		try {
			this._gender = gender;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the laneids.
	 *
	 * @param laneids the new laneids
	 */
	public void setLaneids(LinkedList<String> laneids) {
		try {
			this._laneids = laneids;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the memory limits.
	 *
	 * @param memoryLimits the new memory limits
	 */
	public void setMemoryLimits(LinkedList<String> memoryLimits) {
		try {
			this._memoryLimits = memoryLimits;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the memory requests.
	 *
	 * @param memoryRequests the new memory requests
	 */
	public void setMemoryRequests(LinkedList<String> memoryRequests) {
		try {
			this._memoryRequests = memoryRequests;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the number of lanes.
	 *
	 * @param numberoflanes the new number of lanes
	 */
	public void setNumberOfLanes(String numberoflanes) {
		try {
			this._numberOfLanes = numberoflanes;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the number of samples.
	 *
	 * @param numberofsamples the new number of samples
	 */
	public void setNumberOfSamples(String numberofsamples) {
		try {
			this._numberOfSamples = numberofsamples;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the sample ids.
	 *
	 * @param sampleIds the new sample ids
	 */
	public void setSampleIds(LinkedList<String> sampleIds) {
		try {
			this._sampleIds = sampleIds;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Sets the stepname.
	 *
	 * @param stepname the new stepname
	 */
	public void setStepname(String stepname) {
		try {
			this._stepname = stepname;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		try {
			return "ArgoConfigurationFile [_stepname=" + this._stepname + ", _numberofsamples=" + this._numberOfSamples //$NON-NLS-1$ //$NON-NLS-2$
					+ ", _sampleIds=" + this._sampleIds + ", _numberoflanes=" + this._numberOfLanes + ", _laneids=" //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					+ this._laneids + ", _fastq1=" + this._fastq1List + ", _fastq2=" + this._fastq2List //$NON-NLS-1$ //$NON-NLS-2$
					+ ", _memoryLimits=" //$NON-NLS-1$
					+ this._memoryLimits + ", _cpuLimits=" + this._CPULimits + ", _memoryRequests=" //$NON-NLS-1$ //$NON-NLS-2$
					+ this._memoryRequests + ", _cpuRequests=" //$NON-NLS-1$
					+ this._CPURequests + ", _gender=" + this._gender + "]"; //$NON-NLS-1$ //$NON-NLS-2$
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
	}

}
