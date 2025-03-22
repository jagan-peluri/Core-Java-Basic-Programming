package javalib;

import java.util.Objects;

class p2 {
	
	String studentName;
	int id;
	@Override
	public int hashCode() {
		return Objects.hash(id, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		p2 other = (p2) obj;
		return id == other.id && Objects.equals(studentName, other.studentName);
	}
	public p2(String studentName, int id) {
		super();
		this.studentName = studentName;
		this.id = id;
		
	}
	class Main2{
		public static void main(String[] args) {
			p2 p= new p2("ram",1);
			p2 p1= new p2("ram",1);
			System.out.println(p.equals(p1));
		}
		
	}
}

