package ComparatorAndComparable;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car car1, Car car2) { //this -> car1, other -> car2
		// TODO Auto-generated method stub
		//return this.price - other.price
		return car1.price - car2.price;
	}
}
