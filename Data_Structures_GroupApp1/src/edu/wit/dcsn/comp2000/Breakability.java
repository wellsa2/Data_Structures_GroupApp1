package edu.wit.dcsn.comp2000;

public enum Breakability
	{
	NONBREAKABLE (0),
	BREAKABLE (1);
	
	private final int breakability;
	
	Breakability(int breakability)
		{
		this.breakability=breakability;
		}
	}
