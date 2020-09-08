import java.util.Scanner;
/**
 *<h1>Final_project</h1>
 *This program is running a register system.
 *
 *<h2>Examples:</h2>
 *<pre>{@code 1
 *The class had in this system are
 *Index:0 CS1400 Fundamentals of Programming
 *Index:1 ENGL1010E Intro to Academic Writing
 *Index:2 HIST1700 American Civilization
 *Index:3 MUSC1020 Popular Music in America
 *Index:4 IS2600 Data Comm & Networking
 *Index:5 BIOL1610 AND 1615 Bio I/Lab
 *Index:6 PHYS2210 AND 2215 Physics I/Lab
 *Index:7 MATH1220 Calculus II
 *Index:8 CHIN1010 Beginning Mandarin Chinese I
 *Index:9 EET2780 Digital Electronics I
 *}</pre>
 *
 *<pre>{@code 2
 *Enter the index of classes you want to register.
 *The classes you want to register at least 5 and not over 5. The classes cannot be repeated.
 *2
 *2
 *8
 *7
 *1
 *
 *Your class have repetitive classes, please enter another classes' index to register:
 *4
 *}</pre>
 *
 *<pre>{@code 3
 *Index:2 HIST1700 American Civilization

 *Index:4 IS2600 Data Comm & Networking

 *Index:8 CHIN1010 Beginning Mandarin Chinese I

 *Index:7 MATH1220 Calculus II

 *Index:1 ENGL1010E Intro to Academic Writing
 *}</pre>
 *
 *<pre>{@code 4
 *Thanks for using our registration system!
 *}</pre>
 * @since 09-04-2020
 * @author Tongshou Wu
 *
 */
public class Final_project {
	/**
	 * This method use Multidimensional Arrays, a while loop, and switch statements with four cases. And the case 2 and 3 use if else statements.
	 * Also, the for loop is used in case 1, 2, and 3.
	 * @param args The standard for basic main methods.
	 */

	public static void main(String[] args) {
		boolean flag = false;
		boolean sign = true;
		int classesNumber = 0;
		boolean classsign = true;
		String[][] afterRegister = new String[5][0];
		
		String[][] ClassInSystem = {
				{"Index:0 CS1400", "Fundamentals of Programming"},
				{"Index:1 ENGL1010E", "Intro to Academic Writing"},
				{"Index:2 HIST1700", "American Civilization"},
				{"Index:3 MUSC1020", "Popular Music in America"},
				{"Index:4 IS2600", "Data Comm & Networking"},
				{"Index:5 BIOL1610 AND 1615", "Bio I/Lab"},
				{"Index:6 PHYS2210 AND 2215", "Physics I/Lab"},
				{"Index:7 MATH1220", "Calculus II"},
				{"Index:8 CHIN1010", "Beginning Mandarin Chinese I"},
				{"Index:9 EET2780", "Digital Electronics I"}
				}; 
		System.out.println("Welcome to use our registration system!");
		while(sign) {
			Scanner input = new Scanner(System.in);
			System.out.println("1=see the classes; 2=register for classes; 3=see the classes registered; 4=log out");
			int x = input.nextInt();
			switch (x) {
			case 1: System.out.println("The classes had in this system are: " + "\n");
			for(int i = 0; i < ClassInSystem.length ; i++) {
				System.out.println(ClassInSystem[i][0] +  " " + ClassInSystem[i][1] + "\n");
			}
			break;
			
			case 2: System.out.println("Enter the index of classes you want to register.");
			System.out.println("The classess you want to register at least 5 and not over 5. The classes cannot be repeated.");
			int i = 0;
			while(i < 5) {
			System.out.println("Enter the index before class to register: ");
			int index = input.nextInt();
			if (0 <= index && index <= 9) {
			afterRegister[i] = ClassInSystem[index];
			classesNumber++;
			i++;
			}
			else
			System.out.println("Input error! Please try again.");
			
			}
					
					if (classesNumber == 5) {
						flag = true;
					}
					
					String[][] afterDuplicates = new String [5][0];
					
	                Scanner input1 = new Scanner(System.in);
					while(classsign) {
						for (int j = 0; j < 5; j++) {
							for (int k =j + 1; k < 5; k++) {
							if (afterRegister[j] == afterRegister[k]) {
							System.out.println("Your class have repetitive classes, please enter another classes' index to register: ");
							int index = input1.nextInt();
							afterRegister[j] = ClassInSystem[index];
							}
							else if (afterRegister[j] != afterRegister[k]) {
								classsign = false;
							}
							}				
						}
					
					
				}
			break;
			
			case 3:
				if (flag) {
				System.out.println("Your classes already have been registered are: " + "\n");
				for(int n = 0; n < afterRegister.length; n++) {
					System.out.println(afterRegister[n][0] + " " + afterRegister[n][1] + "\n");
				}
				}
				else 
				System.out.println("You still not register for any classes!");
				break;
				
			case 4:
				System.out.println("Thanks for using our registration system!");
				sign = false;
				break;
			
			default:
				System.out.println("Input error £¡");
				break;
			}
		}
	}
}

	
	