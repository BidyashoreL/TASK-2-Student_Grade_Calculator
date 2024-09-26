
import java.util.Scanner;
public class STUDENT_GRADE_CALCULATOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many subjects do you have? ");
        int numSubjects = scanner.nextInt();


        int[] marks = new int[numSubjects];


        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject (out of 100) " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }


        int totalMarks = sumOfMarks(marks);

        double averagePercentage = calculateAverage(totalMarks, numSubjects);

        String grade = findGrade(averagePercentage);


        showResults(totalMarks, averagePercentage, grade);
    }


    private static int sumOfMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }


    private static double calculateAverage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }


    private static String findGrade(double percentage) {
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 75) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else {
            return "D";
        }
    }


    private static void showResults(int totalMarks, double averagePercentage, String grade) {
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Your Grade: " + grade);
    }
}
