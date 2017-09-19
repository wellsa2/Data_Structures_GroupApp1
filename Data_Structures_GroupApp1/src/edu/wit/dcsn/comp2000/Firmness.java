package edu.wit.dcsn.comp2000;

public enum Firmness
	{
	SOFT ("Soft", 1),
	FIRM ("Firm", 2),
	HARD ("Hard", 3);
	
	private final String NAME;
	private final int FIRMNESS;
	
	Firmness (String name, int firmness)
		{
		NAME=name;
		FIRMNESS=firmness;
		}
	
	public String getName()
		{
		return NAME;
		
		}	
	public int getFirmness()
		{
		return FIRMNESS;	
		}
	
	}
