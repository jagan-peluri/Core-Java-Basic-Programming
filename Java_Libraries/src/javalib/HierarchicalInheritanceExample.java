package javalib;

public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		Student s=new Student("ram", 21, "cse");
		s.displayStudent();
		
		Employee e= new Employee("raman", 22, "bludart", 150);
		e.displayEmp();
		e.display();
		s.display();
	}
}
