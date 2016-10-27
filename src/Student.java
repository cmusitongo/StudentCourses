/**
 * @author Chris Musitongo
 * */
public class Student {
	private String name;
	private String age;
	private String gender;
	private String course;
	double balance= 250;
	private boolean hasPaid= false;
	private String compSci= "Computer Science";
	private String gameDev= "Game Development";

	public Student (String n, String studentAge, String g, String c, boolean h) { //constructor
		name= n;
		age= studentAge;
		gender= g;
		course= c;
		hasPaid= h;
	}
	
	public double getBalance() {
		return balance; //returns the balance
	}
	
	public void setBalance() {
		balance= 0; //sets the balance to 0
		hasPaid= true; //changes the boolean from false to true
	}
	
	public void printStudents() { //prints all the students
		System.out.print(name+"\t");
		System.out.print(age+"\t");
		System.out.print(gender+"\t");
		System.out.print(course+"\t\t");
		System.out.println(hasPaid+"\t");
	}

	public void printCourse() {
		while(course==compSci) {
			System.out.print(name+"\t");
			System.out.print(age+"\t");
			System.out.print(gender+"\t");
			System.out.println("Computer Science\t");
			System.out.println(balance+ "\t");
			System.out.println(hasPaid+"\t");
		}
		
		if(course==gameDev) {
			System.out.print(name+"\t");
			System.out.print(age+"\t");
			System.out.print(gender+"\t");
			System.out.println("Game Development\t");
			System.out.println(balance+ "\t");
			System.out.println(hasPaid+"\t");
		}
	}
}