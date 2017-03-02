package com.dvarun.mordernPortfolio.portfolio;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class SimplePortfolio 
{   
    private String name;
    private double meanReturn;
    private double riskSD;
    private PortfolioReturn simulatedReturn;
    private BigDecimal investment;
    
    /**
     * Constructor.
     * @param name Name of Portfolio.
     * @param meanReturn mean of returns. 
     * @param risk Risk(Standard Deviation)
     */
    public SimplePortfolio(String name, BigDecimal initialInvestment, double meanReturn, double risk) {
		this.name = name;
		this.meanReturn = meanReturn;
		this.riskSD = risk;
		this.investment = initialInvestment;
	}
    
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the meanReturn
	 */
	public double getMeanReturn() {
		return meanReturn;
	}

	/**
	 * @param meanReturn the meanReturn to set
	 */
	public void setMeanReturn(double meanReturn) {
		this.meanReturn = meanReturn;
	}

	/**
	 * @return the riskSD
	 */
	public double getRiskSD() {
		return riskSD;
	}

	/**
	 * @param riskSD the riskSD to set
	 */
	public void setRiskSD(double riskSD) {
		this.riskSD = riskSD;
	}

	/**
	 * @return the simulatedReturn
	 */
	public PortfolioReturn getSimulatedReturn() {
		return simulatedReturn;
	}

	/**
	 * @param simulatedReturn the simulatedReturn to set
	 */
	public void setSimulatedReturn(PortfolioReturn simulatedReturn) {
		this.simulatedReturn = simulatedReturn;
	}

	/**
	 * @return the investment
	 */
	public BigDecimal getInvestment() {
		return investment;
	}

	/**
	 * @param investment the investment to set
	 */
	public void setInvestment(BigDecimal investment) {
		this.investment = investment;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("SimplePortfolio [name=%s, meanReturn=%s, riskSD=%s, simulatedReturn=%s, investment=%s]",
				name, meanReturn, riskSD, simulatedReturn, investment);
	}
    
}
