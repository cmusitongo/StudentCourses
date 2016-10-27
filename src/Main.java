/**
 * @author Chris Musitongo
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static int PIN= 1234; //PIN for the admin method
	static Scanner input= new Scanner(System.in);
	static ArrayList<Student> allStudents= new ArrayList<Student>(); //Array List for all students
	static ArrayList<Student> gamesDev= new ArrayList<Student>(); //Array List for Games Development students
	static ArrayList<Student> computerSci= new ArrayList<Student>(); //Array List for Computer Science students
	static double change= 0; //Global variable for giving change to the user
	
	public static void main(String[] args) {
		menu();
	}
	
	/* For the newStudent(); method it will display two options to the User, which will be switch statements.
	 * If the User chooses option 1, they will go through the steps such as inputting their name, age, and
	 * gender. Afterwards they'll be prompted to pay the fee now, or pay it later on. If they choose to pay
	 * later on, it returns them to the main menu and they're added to the list of whatever course they picked.
	 * */
	private static void newStudent() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("        Student Registration");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Press 1 for Computer Science");
		System.out.println("Press 2 for Game Development");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String studentCourse= input.next();
		
		switch(studentCourse) {
			case"1": {
				compScience();
			}
			case"2": {
				gameDev();
			}
			default: {
				System.out.println("------------------------------");
				System.out.println("ERROR: Choose between 1 & 3");
				System.out.println("------------------------------");
				newStudent();
			}
		}
	}
	/*As mentioned in the previous comment, if they select Game Development,the information gets added to the gameDev
	 * Array List*/
		private static void gameDev() {
			System.out.println("Enter the First Name.");
			String first= input.next();
			System.out.println("Enter the Surname");
			String surname= input.next();
			String name= first+ " " + surname;
			
			System.out.println("Enter the Student Age");
			String studentAge= input.next();
			
			System.out.println("Enter the Student's Gender");
			String studentGender= input.next();
		
			String studentCourse= "Game Development";
			Student s= new Student(name, studentAge, studentGender, studentCourse, false);
			
			System.out.println("---------------------------------");
			System.out.println("Your information:");
			System.out.println("---------------------------------");
			System.out.println("Name: "+name);
			System.out.println("Age: " +studentAge);
			System.out.println("Gender: "+studentGender);
			System.out.println("Course: "+studentCourse);
			System.out.println("Payment Due: €"+s.getBalance());
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("Press 1 to Pay Now");
			System.out.println("Press 2 to Pay Later");
			System.out.println("---------------------------------");
					
			String confirm= input.next();
					
				switch(confirm) {
					case"1": {
						System.out.println("-------------------------");
						System.out.println("Payment Information");
						System.out.println("-------------------------");
						System.out.println("Current Balance: €"+s.getBalance());
						System.out.println("Please enter payment");
						System.out.println("--------------------------");
						double money= input.nextDouble();
							
						while (money<s.getBalance()) {
							System.out.println("------------------------------------------");
							System.out.println("Payment Information");
							System.out.println("------------------------------------------");
							System.out.println("Remaining Balance: €"+(s.getBalance()-money));
							System.out.println("Insufficient funds, please add more money");
							System.out.println("------------------------------------------");
							double lowamount= input.nextDouble();
								
							money= money+lowamount; 
							System.out.println("----------------------------");
							System.out.println("Payment Information");
							System.out.println("----------------------------");
							System.out.println("Thank you, processing...");
							System.out.println("----------------------------");
								try {													
								    Thread.sleep(2000);
								} catch(InterruptedException ex) {
								    Thread.currentThread().interrupt();
								}
								change= (money - s.getBalance());
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("You paid: €" +lowamount);							
								System.out.println("Change: €" +change);								
								System.out.println("Transaction successful.");
								System.out.println("--------------------------");
								
								s.setBalance();
							}
							if(money>=s.getBalance()) {
								change= (money - s.getBalance());
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("You paid: €" +money);							
								System.out.println("Change: €" +change);								
								System.out.println("Transaction successful.");
								System.out.println("--------------------------");
							}
								s.setBalance();
							}
							allStudents.add(s);
							gamesDev.add(s);
							
							menu();
							break;
						
						case"2": {
							allStudents.add(s);
							gamesDev.add(s);
							menu();
							break;
						}
						default: {
							System.out.println("------------------------------");
							System.out.println("ERROR: Choose between 1 & 3");
							System.out.println("------------------------------");
							gameDev();
						}
					}
		
	}
		/*If they selected Computer Science, all the information gets added to the computerSci
		 * Array List*/
		private static void compScience() {
			System.out.println("Enter the First Name.");
			String first= input.next();
			System.out.println("Enter the Surname");
			String surname= input.next();
			String name= first+ " " + surname;
			
			System.out.println("Enter the Student Age");
			String studentAge= input.next();
			
			System.out.println("Enter the Student's Gender");
			String studentGender= input.next();
		
			String studentCourse= "Computer Science";
			Student s= new Student(name, studentAge, studentGender, studentCourse, false);
			
			System.out.println("---------------------------------");
			System.out.println("Your information:");
			System.out.println("---------------------------------");
			System.out.println("Name: "+name);
			System.out.println("Age: " +studentAge);
			System.out.println("Gender: "+studentGender);
			System.out.println("Course: "+studentCourse);
			System.out.println("Payment Due: €"+s.getBalance());
			System.out.println("---------------------------------");
			System.out.println("---------------------------------");
			System.out.println("Press 1 to Pay Now");
			System.out.println("Press 2 to Pay Later");
			System.out.println("---------------------------------");
					
			String confirm= input.next();
					
				switch(confirm) {
					case"1": {
						System.out.println("-------------------------");
						System.out.println("Payment Information");
						System.out.println("-------------------------");
						System.out.println("Current Balance: €"+s.getBalance());
						System.out.println("Please enter payment");
						System.out.println("--------------------------");
						double money= input.nextDouble();
							
						while (money<s.getBalance()) {
							System.out.println("------------------------------------------");
							System.out.println("Payment Information");
							System.out.println("------------------------------------------");
							System.out.println("Remaining Balance: €"+(s.getBalance()-money));
							System.out.println("Insufficient funds, please add more money");
							System.out.println("------------------------------------------");
							double lowamount= input.nextDouble();
								
							money= money+lowamount; 
							System.out.println("----------------------------");
							System.out.println("Payment Information");
							System.out.println("----------------------------");
							System.out.println("Thank you, processing...");
							System.out.println("----------------------------");
								try {													
								    Thread.sleep(2000);
								} catch(InterruptedException ex) {
								    Thread.currentThread().interrupt();
								}
								change= (money - s.getBalance());
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("You paid: €" +lowamount);							
								System.out.println("Change: €" +change);								
								System.out.println("Transaction successful.");
								System.out.println("--------------------------");
								
								s.setBalance();
							}
							if(money>=s.getBalance()) {
								change= (money - s.getBalance());
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("You paid: €" +money);							
								System.out.println("Change: €" +change);								
								System.out.println("Transaction successful.");
								System.out.println("--------------------------");
							}
								s.setBalance();
							}
							allStudents.add(s);
							computerSci.add(s);
							
							menu();
							break;
						
						case"2": {
							allStudents.add(s);
							computerSci.add(s);
							menu();
							break;
						}
						
						default: {
							System.out.println("------------------------------");
							System.out.println("ERROR: Choose between 1 or 2");
							System.out.println("------------------------------");
							compScience();
						}
					}
				}
	
	/* When deleting a student, it calls the "allStudents" array list which displays all the students.
	 * Each student is then given an index number and the Admin inputs the index number to delete a
	 * student.
	 * */
	private static void deleteStudent() {
	try {
		int index= 0;
			
			for(Student i: allStudents) {
				System.out.println("Index: "+index+"\t");
				i.printStudents();
				index++;
			}
			System.out.println("-------------------------------------------");
			System.out.println("Enter the index number to delete a student.");
			System.out.println("-------------------------------------------");
			int choice= input.nextInt();
			
			System.out.println("------------------------------");
			System.out.println("Student successfully removed.");
			System.out.println("------------------------------");
			allStudents.remove(choice);
	} catch (Exception e) {
		System.out.println("ERROR: Please enter the Index Number to delete a student.");
		deleteStudent();
	}
		
	}

	//Shows all the students in both courses
	private static void showStudents() {
		try {
			System.out.println("Name:\t\tAge:\t Gender: \t Course: \tFees Paid:");
			for (Student i: allStudents) {
				i.printStudents();
			}
			System.out.println("Press any button to continue...");
			input.next();
			menu();
			
		} catch (Exception e) {
			System.out.println("------------------------");
			System.out.println("ERROR: Please try again.");
			System.out.println("------------------------");
			menu();
		}
		
	}
	
	//The main menu which will be displayed to the User
	private static void menu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("         Student Registration");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Press 1 to add a new student");
		System.out.println("Press 2 to show all Students");
		System.out.println("Press 3 to pay your fees");
		System.out.println("Press 4 to access Admin Mode");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		String choice= input.next();
		
		switch(choice) {
		
			case"1": {
				newStudent();
				break;
			}
			case"2": {
				showStudents();
				menu();
				break;
			}
			case"3": {
				payFee();
				break;
			}
			case"4": {
				admin();
				menu();
				break;
			}
			default: {
				System.out.println("------------------------------");
				System.out.println("ERROR: Choose between 1 & 3");
				System.out.println("------------------------------");
				menu();
			}
		}
	}
	
	//Shows a list for either Computer Science or Game Development. Student inputs their index number and then they pay
	private static void payFee() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Student Payments");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Press 1 to view Computer Science");
		System.out.println("Press 2 to view Game Development");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		String choice= input.next();
		
		switch(choice) {
			case"1": {
				payComp();
				menu();
				break;
			}
			
			case"2": {
				payGame();
				menu();
				break;
			}
		default: {
			System.out.println("-----------------------------");
			System.out.println("ERROR: Please select 1 or 2");
			System.out.println("-----------------------------");
			payFee();
		}
	}
}
	//Method for Game Development students to pay
	private static void payGame() {
		try {
			int index= 0;
				
				for(Student i: gamesDev) {
					
					if(i.getBalance()>0)
					{
					System.out.print("Index: "+index+"\t");
					i.printStudents();
					index++;
					}
				}
				System.out.println("-------------------------------------------");
				System.out.println("Enter the index number to pay fees.");
				System.out.println("-------------------------------------------");
				int choice= input.nextInt();
				index=0;
				
				for (Student i: allStudents) {
					
					if(i.getBalance()>0) {
						if(index==choice) { //if the index number equals to the choice
							System.out.println("-------------------------");
							System.out.println("Payment Information");
							System.out.println("-------------------------");
							System.out.println("Current balance: €"+i.getBalance()); //displays the balance
							System.out.println("Please enter payment.");
							System.out.println("-------------------------");
							
							double payment= input.nextDouble();
							
							while(payment<i.getBalance()) {
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("Remaining balance: €"+(i.getBalance()-payment));
								System.out.println("-------------------------");
								payment= payment+input.nextDouble();
							}
							if(payment>=i.getBalance()) {
								change= (payment - i.getBalance());
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("You paid: €" +payment);							
								System.out.println("Change: €" +change);								
								System.out.println("Transaction successful.");
								System.out.println("--------------------------");
								i.setBalance();
							}
						}
						index++;
					}
				}
				
		} catch (Exception e) {
			System.out.println("ERROR: Please try againt.");
			payComp();
		}
	}
	
	//Method for Computer Science students to pay
	private static void payComp() {
		try {
			int index= 0;
				
				for(Student i: computerSci) {
					
					if(i.getBalance()>0)
					{
					System.out.print("Index: "+index+"\t");
					i.printStudents();
					index++;
					}
				}
				System.out.println("-------------------------------------------");
				System.out.println("Enter the index number to pay fees.");
				System.out.println("-------------------------------------------");
				int choice= input.nextInt();
				index=0;
				
				for (Student i: allStudents) {
					
					if(i.getBalance()>0) {
						if(index==choice) {
							System.out.println("-------------------------");
							System.out.println("Payment Information");
							System.out.println("-------------------------");
							System.out.println("Current balance: €"+i.getBalance());
							System.out.println("Please enter payment.");
							System.out.println("-------------------------");
							
							double payment= input.nextDouble();
							
							while(payment<i.getBalance()) {
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("Remaining balance: €"+(i.getBalance()-payment));
								System.out.println("-------------------------");
								payment= payment+input.nextDouble();
							}
							if(payment>=i.getBalance()) {
								change= (payment - i.getBalance());
								System.out.println("-------------------------");
								System.out.println("Payment Information");
								System.out.println("-------------------------");
								System.out.println("You paid: €" +payment);							
								System.out.println("Change: €" +change);								
								System.out.println("Transaction successful.");
								System.out.println("--------------------------");
								i.setBalance();
							}
						}
						index++;
					}
				}
				
		} catch (Exception e) {
			System.out.println("ERROR: Please try againt.");
			payComp();
		}
		
		
	}
	
	/* The Admin sees this panel before they access the Administrator features. If the PIN is correct, they choose from
	 * different options which is also a switch statement*/
	private static void admin() {
		System.out.println("-----------------------------------------------");
		System.out.println("             Administrator Panel   ");
		System.out.println("-----------------------------------------------");
		System.out.println("Please enter the PIN to access the Admin Panel.");
		System.out.println("-----------------------------------------------");
		int enteredPIN= input.nextInt();						
		
		if(enteredPIN== PIN) {									
			System.out.println("---------------------------------------------");
			System.out.println("            Administrator Panel   ");
			System.out.println("---------------------------------------------");
			System.out.println("Press 1 to view the Computer Science Class");					
			System.out.println("Press 2 to view the Game Development Class");							
			System.out.println("Press 3 to delete a student");
			System.out.println("Press 4 to clear all students");	
			System.out.println("---------------------------------------------");
			System.out.println("----------------------------------------");
			System.out.println("Type 'back' to return to Main Menu");
			System.out.println("----------------------------------------");
			
			String choice= input.next();
			
			switch(choice) {
				case"1": {
					try {
						System.out.println("Name:\t\tAge:\t Gender: \t Course: \tFees Paid:");
						for (Student i: computerSci) {
							i.printStudents();
						}
						System.out.println("Press any button to continue...");
						input.next();
						admin();
						break;
						
					} catch (Exception e) {
						System.out.println("------------------------");
						System.out.println("ERROR: Please try again.");
						System.out.println("------------------------");
						admin();
						break;
					}
					}
				
				case"2": {
					try {
						System.out.println("Name:\t\tAge:\t Gender: \t Course: \tFees Paid:");
						for (Student i: gamesDev) {
							i.printStudents();
						}
						System.out.println("Press any button to continue...");
						input.next();
						admin();
						
							} catch (Exception e) {
								System.out.println("------------------------");
								System.out.println("ERROR: Please try again.");
								System.out.println("------------------------");
								menu();
							}
						}	
					
				case"3": {
					deleteStudent();
					admin();
					break;
				}
				
				case"4": {
					clearStudents();
					admin();
					break;
				}
				
				case"back": {
					System.out.println("Returning to Main Menu....");
					try {
					    Thread.sleep(4000);
					} catch(InterruptedException ex) {
					    Thread.currentThread().interrupt();
					}
					menu();
					break;
				}
				default: {
					System.out.println("------------------------------");
					System.out.println("ERROR: Choose between 1 & 4");
					System.out.println("------------------------------");
					admin();
				}
			}
		}
	}
	
	//Clears all the students from both courses
	private static void clearStudents() {
		System.out.println("---------------------------------------------");
		System.out.println("Are you sure you want to clear all students?");
		System.out.println("---------------------------------------------");
		System.out.println("Press Y or N");
		System.out.println("---------------------------------------------");
		String choice= input.next();
		
		switch(choice) {
		
			case"y": {
				allStudents.clear();
				admin();
			}
			
			case"n": {
				System.out.println("Returning to Admin Menu...");
				admin();
			}
			
			default: {
				System.out.println("Please press Y or N on your keyboard");
				clearStudents();
			}
		
		}
	}
}
