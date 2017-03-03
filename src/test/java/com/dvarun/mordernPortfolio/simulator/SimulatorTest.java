package com.dvarun.mordernPortfolio.simulator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.dvarun.mordernPortfolio.portfolio.SimplePortfolio;

public class SimulatorTest {
	
	List<SimplePortfolio> portfolios;
	
	@Before
	public void setup(){
		SimplePortfolio aggresive = new SimplePortfolio("aggresive", new BigDecimal(100000), 0.094324, 0.15675);
		SimplePortfolio conservative = new SimplePortfolio("conservative", new BigDecimal(100000), 0.06189, 0.063438);
		portfolios = new ArrayList<SimplePortfolio>();
		portfolios.add(aggresive);
		portfolios.add(conservative);
	}
	
	@Test
	public void monteCarloSimulationTest(){
		Simulator sim = new MonteCarloSimulation(5000,portfolios,20,0.035);
		sim.simulate();
		for(SimplePortfolio sp:portfolios){
			System.out.println(String.format("PortfolioName:%s with initial investment $%d and mean return %f and risk SD %f returns %s ", sp.getName(), sp.getInvestment().longValue(), sp.getMeanReturn(), sp.getRiskSD(), sp.getSimulatedReturn().toString()));
		}
		
	}

}
