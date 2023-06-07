package com.demo.beans;

public abstract class Shape {
	private static int count;
	
	static {
		count=1;
	}
	private int id;
	private String colour;
	
	

	public Shape( String colour) {
		super();
		this.id = count++;
		this.colour = colour;
	}

	public Shape() {
		super();
		id=count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Shape.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public abstract float calculateArea();
	public abstract float calculatePerimeter();
	
	@Override
	public String toString() {
		return "Shape [colour=" + colour + "]";
	}	
	
	
	
	
	

}
