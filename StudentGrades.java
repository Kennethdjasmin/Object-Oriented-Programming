import java.util.Scanner;
import java.util.Arrays;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numStudents = sc.nextInt();

        if (numStudents < 1) {
            System.out.println("We need at least 1 student to run a class");
            System.exit(0);
        }

        int[] grades = new int[numStudents];
        int temp, min, max, y = 0, total = 0;

        while (y != numStudents) {
            total = 0;
            y = 0;
            for (int i = 0; i < numStudents; i++) {
                System.out.printf("Enter the grade for student %d: ", i+1);
                temp = sc.nextInt();
                if (temp < 0 || temp > 100) {
                    System.out.println("Grades must be between between 0 to 100");
                    break;
                } else {
                    grades[i] = temp;
                    y++;
                    total += temp;
                }
            }
        }
        double avg = total / numStudents;
        Arrays.sort(grades);
        min = grades[0];
        max = grades[numStudents - 1];

        System.out.printf("The average is: %.2f\n", avg);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
