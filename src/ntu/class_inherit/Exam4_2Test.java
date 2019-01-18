package ntu.class_inherit;

public class Exam4_2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee li = new Employee();
		li.setName("Li ming");
		li.setEmployeeNumber(123456);
		System.out.println(li.getName());
		System.out.println(li.getEmployeeNumber());
		
		Manager he = new Manager();
		he.setName("He xia");
		he.setEmployeeNumber(543469);
		he.setResponsibilities("Internet project");
		System.out.println(he.getName());
		System.out.println(he.getEmployeeNumber());
		System.out.println(he.getResponsibilities());

	}

}
