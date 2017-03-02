package com.dvarun.mordernPortfolio.portfolio;


public class SimulationParams {
	
	/**
	 * No of simulations;
	 */
	private long simulations;

    /**
     * Time for simulation in years;
     */
	private int yearsSimulated;
	/**
	 * Inflation Rate;
	 */
	private double inflation;
	/**
	 * @return the simulations
	 */
	public long getSimulations() {
		return simulations;
	}
	/**
	 * @param simulations the simulations to set
	 */
	public void setSimulations(long simulations) {
		this.simulations = simulations;
	}
	/**
	 * @return the yearsSimulated
	 */
	public int getYearsSimulated() {
		return yearsSimulated;
	}
	/**
	 * @param yearsSimulated the yearsSimulated to set
	 */
	public void setYearsSimulated(int yearsSimulated) {
		this.yearsSimulated = yearsSimulated;
	}
	/**
	 * @return the inflation
	 */
	public double getInflation() {
		return inflation;
	}
	/**
	 * @param inflation the inflation to set
	 */
	public void setInflation(double inflation) {
		this.inflation = inflation;
	}


}
