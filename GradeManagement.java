import java.util.Scanner;

public class GradeManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int[] nilai = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        double rata2 = (double) total / n;
        int tertinggi = nilai[0], terendah = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }
        System.out.println("\n=== Student Grades ===");
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] > 70) ? "PASS" : "FAIL";
            System.out.println("Student " + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
        System.out.println("Average: " + rata2);
        System.out.println("Highest score: " + tertinggi);
        System.out.println("Lowest score: " + terendah);
        input.close();
    }
}