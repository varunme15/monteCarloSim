package com.dvarun.mordernPortfolio.portfolio;

public class PortfolioReturn {
	

	private double median;
	private double bestCaseTenth;
	private double worstCaseTenth;
	/**
	 * @param median
	 * @param bestCaseTenth
	 * @param worstCaseTenth
	 */
	public PortfolioReturn(double median, double bestCaseTenth, double worstCaseTenth) {
		this.median = median;
		this.bestCaseTenth = bestCaseTenth;
		this.worstCaseTenth = worstCaseTenth;
	}
	/**
	 * @return the median
	 */
	public double getMedian() {
		return median;
	}
	/**
	 * @param median the median to set
	 */
	public void setMedian(double median) {
		this.median = median;
	}
	/**
	 * @return the bestCaseTenth
	 */
	public double getBestCaseTenth() {
		return bestCaseTenth;
	}
	/**
	 * @param bestCaseTenth the bestCaseTenth to set
	 */
	public void setBestCaseTenth(double bestCaseTenth) {
		this.bestCaseTenth = bestCaseTenth;
	}
	/**
	 * @return the worstCaseTenth
	 */
	public double getWorstCaseTenth() {
		return worstCaseTenth;
	}
	/**
	 * @param worstCaseTenth the worstCaseTenth to set
	 */
	public void setWorstCaseTenth(double worstCaseTenth) {
		this.worstCaseTenth = worstCaseTenth;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PortfolioReturn [median=" + median + ", bestCaseTenth=" + bestCaseTenth + ", worstCaseTenth="
				+ worstCaseTenth + "]";
	}
}
