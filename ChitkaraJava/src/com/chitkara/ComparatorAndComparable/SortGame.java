package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortGame {
	
	static class Employee {
		String name;
		int salary;
		
		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + " " + salary;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			String name = s.next();
			int salary = s.nextInt();
			
			if(salary >= x) {
				Employee emp = new Employee(name, salary);
				list.add(emp);
			}
		}
		
		//other.salary - this.salary
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) { //this -> o1, other -> o2
				// TODO Auto-generated method stub
				if(o1.salary == o2.salary) {
					return o1.name.compareTo(o2.name);
				}
				return o2.salary - o1.salary;
			}
		});
		System.out.println(list);
	}

}
