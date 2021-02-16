package ComparatorAndComparable;

public class Car {//implements Comparable<Car> {
	
	int price;
	int speed;
	String name;
	
	public Car(int price, int speed, String name) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.speed = speed;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.price + " " + this.speed + " " + this.name;
	}

	/*
	@Override
	public int compareTo(Car other) {
		// TODO Auto-generated method stub
		//sort on the basis of low to high price
		//return this.price - other.price;
		
		//sort on the basis of high to low speed
		//return other.speed - this.speed;
		
		//Lexicographically smaller to greater
		//this -> ferrari, other - aston ferrari.compareTo(aston)
		return this.name.compareTo(other.name); //positive 
	}
	*/
}
