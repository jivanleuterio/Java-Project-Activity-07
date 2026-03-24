Activity # 7 Instruction – Java Programming

Good day everyone! Please read and follow the instructions carefully.

Step 1: Study the Given Code Pattern

=====================================================================
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = -1;
        int count = 0;
        int positive = 0;
        int negative = 0;
        int sum = 0;

        int highest = 0;
        int lowest = 0;

        while (number != 0 && count < 10) {

            System.out.print("Enter a number (0 to stop, max 10): ");
            number = input.nextInt();

            if (number != 0) {

                sum += number;
                count++;

                // Set first number as initial highest and lowest
                if (count == 1) {
                    highest = number;
                    lowest = number;
                }

                // Check highest
                if (number > highest) {
                    highest = number;
                }

                // Check lowest
                if (number < lowest) {
                    lowest = number;
                }

                if (number > 0) {
                    positive++;
                } else {
                    negative++;
                }

                System.out.println("Accepted: " + number);
            }
        }

        // Display results
        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("\n===== RESULT =====");
            System.out.println("Total Numbers: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Positive: " + positive);
            System.out.println("Negative: " + negative);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        } else {
            System.out.println("No numbers were entered.");
        }

        System.out.println("Program Ended.");
    }
}
=====================================================================
Review the provided Java code carefully. Focus on how it uses:

while loop
input/output
conditions
arithmetic operations

Task: Create a Student Grading System

Using the techniques:
	1. switch case
	2. nested if
	3. while loop
	4. arithmetic operations
	5. input/output

Program Flow

The program should start with this menu:

	===== MENU =====
	1 - Start Student Grading System
	2 - Exit

If user selects 1

Ask the user to input the following:

	Enter Student No.:
	Enter Student Name:
	Enter Subject:
	Enter Prelim Grade:
	Enter Midterm Grade:
	Enter Pre-final Grade:
	Enter Final Grade:

Display Output Format

	===== RESULT =====
	Student No.:
	Student Name:
	Subject:
	Academic Grading Period Completed:
	Remarks:
	Highest Grade:
	Lowest Grade:
	General Average:
	College Rating:
	Remarks:

Academic Grading Period Rules

Display based on how many grades are completed:

	4: Remarks: Complete!
	3: Remarks: Incomplete!
	2: Remarks: Incomplete!
	1: Remarks: Incomplete!
	0: Remarks: Dropped!

College Rating Conversion

	>100  : Out of Range
	100-98: 1.00
	97-95 : 1.25
	94-92 : 1.50
	91-89 : 1.75
	88-86 : 2.00
	85-83 : 2.25
	82-80 : 2.50
	79-77 : 2.75
	76-75 : 3.00
	<75   : 5.00
	0     : Dropped

Final Remarks

	>75 : Passed
	<75 : Failed

Important Notes:

	Compute highest and lowest grade
	Compute general average (2 decimal places)
	Apply nested if for grading logic
	Use switch case for menu
	Use loop to allow repeat or exit

Submission Options:

1. Send the Programiz link of your code (just ping it to my Messenger)
2. Upload your .java file to GitHub and add xen0byt3 as collaborator (recommended)
3. Create a pull request of your file (most recommended)

Make sure your program runs correctly and follows all requirements.

Good luck and happy coding! 