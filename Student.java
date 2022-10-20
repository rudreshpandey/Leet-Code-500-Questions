
public class Student {
	String name;
	int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
@Override
	public String toString() {
	
	String result="student:name="+ this.getName()+", marks="+this.getMarks();
		return this.toString();
	}
public static void main(String args[]) {
	Student s1=new Student();
	s1.setName("Ram");
	s1.setMarks(14);
	
	System.out.println(s1);
}
	

}


