package org.tcs;

public class Employee {

	static Employee obj;
	
	public Employee() {
		System.out.println("Im a constructor");
	}

	public static Employee getObject() {

		if (obj == null) {
			
			System.out.println("Before Object Creation :" + System.identityHashCode(obj));

			obj = new Employee();
			
			System.out.println("After Object Creation :" + System.identityHashCode(obj));

		}

		return obj;

	}
	
	private void empInfo() {
		System.out.println("Employee name is ram");
	}
	
	public static void main(String[] args) {
		Employee obj1 = getObject();
		System.out.println(System.identityHashCode(obj1));
		obj1.empInfo();
		
		Employee obj2 = getObject();
		System.out.println(System.identityHashCode(obj2));
		
		Employee obj3 = getObject();
		System.out.println(System.identityHashCode(obj3));
	}
}
