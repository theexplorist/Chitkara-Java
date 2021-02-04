package com.chitkara.generics;

public class MainGenericHoon<KuchBhiBhej> {
	KuchBhiBhej data;
	
	public MainGenericHoon(KuchBhiBhej data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	public KuchBhiBhej getData() {
		return this.data;
	}
	
	public static void main(String[] args) {
		MainGenericHoon<Integer> intVal = new MainGenericHoon<>(10);
		System.out.println(intVal.getData());
		
		MainGenericHoon<String> stringVal = new MainGenericHoon<>("shivam");
		System.out.println(stringVal.getData());
	}
}
