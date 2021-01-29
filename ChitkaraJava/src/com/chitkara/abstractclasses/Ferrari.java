package com.chitkara.abstractclasses;

public abstract class Ferrari {
	
	private int doors;
	
	public Ferrari(int doors) {
		// TODO Auto-generated constructor stub
		this.doors = doors;
	}
	
	public abstract void topSpeed();
	
	public int kitneDarwaaje() {
		return this.doors;
	}
}
