package edu.wit.dcsn.comp2000;

public enum Weight
	{
	LIGHT (1),
	MEDIUM (2),
	HEAVY (3);
	
	private final int weight;
	
	Weight(int weight)
		{
		this.weight=weight;
		}
	}