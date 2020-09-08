# CSCI_1105_IntroToProgramming_Coursework

# Project Title 
registration system

## Synopsis 
This project is a registration system, the students just need dolow the instruction and then they can register which classes they want.

## Motivation
The reason I want to bulid this project is all the students who is study in university or college need to use this system to register classses.

## How to Run
When you use this system, you need pushed 1 first to see all of the classes. And then pushed 2 for register classes what you want. Attention you need choose five classes and do
not repeat, if system find oyu choose the same class, it will remind you to choose again. When you pushed 3 bottom, you can see the classes you are already registered. And 4 bottom is log out, Thank you for using this System!
<img src="批注 2020-09-08 131413.png">
<img src="批注 2020-09-08 131519.png">

## Code Example
This code is that I pround of becausea I use this part to check the repetition.
```
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
     ```
