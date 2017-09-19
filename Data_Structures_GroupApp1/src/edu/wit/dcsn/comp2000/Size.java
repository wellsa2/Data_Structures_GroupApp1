package edu.wit.dcsn.comp2000;


//TODO Documentation
public enum Size
	{
	SMALL ("Small", 1),
	MEDIUM ("Medium", 2),
	LARGE ("Large", 3);
	
	private final String NAME;
	private final int SIZE;
	
	Size(String name,int size)
		{
		NAME=name;
		SIZE=size;
		}
	
	public String getName()
		{
		return NAME;
		}	
	public int getSize()
		{
		return SIZE;	
		}

	}
