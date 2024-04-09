import java.util.Scanner;

public class sgclaculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the total numbers of subjects: ");
        int totalsub = scan.nextInt();

        int totalMarks = 0;
        for (int i = 1; i <= totalsub; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scan.nextInt();
            totalMarks= totalMarks + marks;
        }

        double avg = (double) totalMarks / totalsub;

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avg);

        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else if (avg >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
        scan.close();
    }
}


