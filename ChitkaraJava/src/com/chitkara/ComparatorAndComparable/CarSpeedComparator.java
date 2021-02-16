package ComparatorAndComparable;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car>{

	@Override
	public int compare(Car car1, Car car2) {  // this -> car1, other -> car2 
		// TODO Auto-generated method stub
		//sort on the basis of high to low speed
		//return other.speed - this.speed;
		return car2.speed - car1.speed;
	}

}
