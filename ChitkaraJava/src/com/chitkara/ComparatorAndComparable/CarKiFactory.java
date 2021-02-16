package ComparatorAndComparable;

import java.util.Arrays;
import java.util.Comparator;

public class CarKiFactory {

	public static <T extends Comparable<T>> void bubbleSort(T[] cars) {
		for (int counter = 0; counter < cars.length - 1; counter++) {

			for (int j = 0; j < cars.length - 1 - counter; j++) {

				// cars[j] = "Ferrari", cars[j + 1] = Aston
				if (cars[j].compareTo(cars[j + 1]) > 0) { // arr[j] - arr[j + 1] > 0 or arr[j] > arr[j + 1]
					T temp = cars[j]; // swap(2cr, 40 lakh)
					cars[j] = cars[j + 1];
					cars[j + 1] = temp;
				}
			}
		}
	}

	public static <T> void bubbleSort(T[] cars, Comparator<T> comparator) {
		for (int counter = 0; counter < cars.length - 1; counter++) {

			for (int j = 0; j < cars.length - 1 - counter; j++) {

				// cars[j] = "Ferrari", cars[j + 1] = Aston
				// cars[j].compareTo(cars[j + 1]) > 0
				if (comparator.compare(cars[j], cars[j + 1]) > 0) { // arr[j] - arr[j + 1] > 0 or arr[j] > arr[j + 1]
					T temp = cars[j]; // swap(2cr, 40 lakh)
					cars[j] = cars[j + 1];
					cars[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] cars = new Car[5];
		cars[0] = new Car(30000000, 300, "Ferrari");
		cars[1] = new Car(20000000, 315, "Aston Martin");
		cars[2] = new Car(35000000, 350, "Lambhorgini");
		cars[3] = new Car(4000000, 150, "DC Avanti");
		cars[4] = new Car(15000000, 400, "Audi");

		//Anonymous Comparator
		// this.name.compareTo(other.name);
		Arrays.sort(cars, new Comparator<Car>() {

			@Override
			public int compare(Car car1, Car car2) {
				// TODO Auto-generated method stub
				return car1.name.compareTo(car2.name);
			}

		});

		System.out.println(Arrays.toString(cars));
		// bubbleSort(cars);
		bubbleSort(cars, new CarSpeedComparator());
		// System.out.println(cars[0]);
		System.out.println(Arrays.toString(cars));

		bubbleSort(cars, new CarPriceComparator());
		System.out.println(Arrays.toString(cars));

		// Object obj = new Object();

		// ["this -> Ferrari, "other -> Lambo"]
		// ["ferr", "lambo"]
		String s1 = "Ferrari";
		String s2 = "Lambo";
		System.out.println(s2.compareTo(s1)); // this -> s1, other -> s2
	}

}
