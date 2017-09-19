package edu.wit.dcsn.comp2000;

public enum Weight
	{
	LIGHT ("Light", 1),
	MEDIUM ("Medium", 2),
	HEAVY ("Heavy", 3);
	
	private final String NAME;
	private final int WEIGHT;
	
	Weight(String name, int weight)
		{
		NAME=name;
		WEIGHT=weight;
		}
	
	public String getName()
		{
		return NAME;
		}
	
	public int getWeight()
		{
		return WEIGHT;	
		}
	}