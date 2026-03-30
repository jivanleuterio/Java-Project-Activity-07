import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {

            // MENU
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Start Student Grading System");
            System.out.println("2 - Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine(); // clear buffer

            switch (choice) {

                case 1:

                    // INPUTS
                    System.out.print("Enter Student No.: ");
                    String studentNo = input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studentName = input.nextLine();

                    System.out.print("Enter Subject: ");
                    String subject = input.nextLine();

                    System.out.print("Enter Prelim Grade: ");
                    double prelim = input.nextDouble();

                    System.out.print("Enter Midterm Grade: ");
                    double midterm = input.nextDouble();

                    System.out.print("Enter Pre-final Grade: ");
                    double prefinal = input.nextDouble();

                    System.out.print("Enter Final Grade: ");
                    double finals = input.nextDouble();

                    // COUNT COMPLETED GRADES
                    int completed = 0;
                    if (prelim > 0) completed++;
                    if (midterm > 0) completed++;
                    if (prefinal > 0) completed++;
                    if (finals > 0) completed++;

                    // HIGHEST & LOWEST
                    double highest = prelim;
                    double lowest = prelim;

                    double[] grades = {prelim, midterm, prefinal, finals};

                    for (double g : grades) {
                        if (g > highest) highest = g;
                        if (g < lowest) lowest = g;
                    }

                    // GENERAL AVERAGE
                    double average = (prelim + midterm + prefinal + finals) / 4;

                    // ACADEMIC STATUS (Nested If)
                    String academicRemarks;
                    if (completed == 4) {
                        academicRemarks = "Complete!";
                    } else if (completed >= 1 && completed <= 3) {
                        academicRemarks = "Incomplete!";
                    } else {
                        academicRemarks = "Dropped!";
                    }

                    // COLLEGE RATING (Nested If)
                    double rating = 0;
                    if (average > 100) {
                        rating = -1; // Out of range indicator
                    } else if (average >= 98) {
                        rating = 1.00;
                    } else if (average >= 95) {
                        rating = 1.25;
                    } else if (average >= 92) {
                        rating = 1.50;
                    } else if (average >= 89) {
                        rating = 1.75;
                    } else if (average >= 86) {
                        rating = 2.00;
                    } else if (average >= 83) {
                        rating = 2.25;
                    } else if (average >= 80) {
                        rating = 2.50;
                    } else if (average >= 77) {
                        rating = 2.75;
                    } else if (average >= 75) {
                        rating = 3.00;
                    } else if (average == 0) {
                        rating = 0; // Dropped
                    } else {
                        rating = 5.00;
                    }

                    // FINAL REMARKS
                    String finalRemarks;
                    if (average > 75) {
                        finalRemarks = "Passed";
                    } else {
                        finalRemarks = "Failed";
                    }

                    // OUTPUT
                    System.out.println("\n===== RESULT =====");
                    System.out.println("Student No.: " + studentNo);
                    System.out.println("Student Name: " + studentName);
                    System.out.println("Subject: " + subject);
                    System.out.println("Academic Grading Period Completed: " + completed);
                    System.out.println("Remarks: " + academicRemarks);
                    System.out.println("Highest Grade: " + highest);
                    System.out.println("Lowest Grade: " + lowest);
                    System.out.printf("General Average: %.2f\n", average);

                    if (rating == -1) {
                        System.out.println("College Rating: Out of Range");
                    } else if (rating == 0) {
                        System.out.println("College Rating: Dropped");
                    } else {
                        System.out.printf("College Rating: %.2f\n", rating);
                    }

                    System.out.println("Remarks: " + finalRemarks);
                    break;

                case 2:
                    System.out.println("Program terminated.");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
