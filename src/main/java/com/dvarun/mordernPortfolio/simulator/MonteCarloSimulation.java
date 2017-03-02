package com.dvarun.mordernPortfolio.simulator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import com.dvarun.mordernPortfolio.portfolio.PortfolioReturn;
import com.dvarun.mordernPortfolio.portfolio.SimplePortfolio;
import com.dvarun.mordernPortfolio.portfolio.SimulationParams;

public class MonteCarloSimulation implements Simulator {
	/**
	 * @param simulations
	 * @param portfolios
	 * @param yearsSimulated
	 * @param inflation
	 */
	public MonteCarloSimulation(long simulations, List<SimplePortfolio> portfolios, int yearsSimulated,
			double inflation) {
		super();
		this.simulations = simulations;
		this.portfolios = portfolios;
		this.yearsSimulated = yearsSimulated;
		this.inflation = inflation;
	}

	/**
	 * @param simulations
	 * @param yearsSimulated
	 * @param inflation
	 */
	public MonteCarloSimulation(long simulations, int yearsSimulated,
			double inflation, SimplePortfolio... portfolios) {
		super();
		this.simulations = simulations;
		this.portfolios = Arrays.asList(portfolios);
		this.yearsSimulated = yearsSimulated;
		this.inflation = inflation;
	}
	
	/**
	 * @param simParams {@link SimulationParams}.
	 * @param inflation
	 */
	public MonteCarloSimulation(SimulationParams simParams, SimplePortfolio... portfolios) {
		super();
		this.simulations = simParams.getSimulations();
		this.portfolios = Arrays.asList(portfolios);
		this.yearsSimulated = simParams.getYearsSimulated();
		this.inflation = simParams.getInflation();
	}
	/**
	 * No of simulations;
	 */
	private long simulations;
	/**
	 * List of portfolios for Simulation.
	 */
	private List<SimplePortfolio> portfolios;
    /**
     * Time for simulation in years;
     */
	private int yearsSimulated;
	/**
	 * Inflation Rate;
	 */
	private double inflation;
	/**
	 * @return the portfolios
	 */
	public List<SimplePortfolio> getPortfolios() {
		return portfolios;
	}
	/**
	 * @param portfolios the portfolios to set
	 */
	public void setPortfolios(List<SimplePortfolio> portfolios) {
		this.portfolios = portfolios;
	}
	
	public void simulate() {
		if(portfolios == null||portfolios.isEmpty()){
			return;
		}
		for (SimplePortfolio portfolio : portfolios) {
			NormalDistribution random = new NormalDistribution(portfolio.getMeanReturn(),portfolio.getRiskSD());
			DescriptiveStatistics stats = new DescriptiveStatistics();
			for(int i=0;i<simulations;i++){
				    //Start with initial investment;
				    BigDecimal amount = portfolio.getInvestment();
				    if(amount.equals(BigDecimal.ZERO)){
				    	break;
				    }
				for(int j=0;j<yearsSimulated;j++){
					//get random number
					double rand = random.sample();
					
					amount = new BigDecimal(1+rand).multiply(amount);
					
					amount = new BigDecimal(1-inflation).multiply(amount);
                     
				}
				//add to stats at end of each simulation
				stats.addValue(amount.doubleValue());
			}
			//set return to portfolio.
			PortfolioReturn rt = new PortfolioReturn(stats.getPercentile(50), stats.getPercentile(90), stats.getPercentile(10));
			portfolio.setSimulatedReturn(rt);
		}
	
    
	}

}
