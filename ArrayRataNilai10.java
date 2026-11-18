import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of students: ");
        int n = input.nextInt();
        int[] nilaiMhs = new int[n];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total score: " + total);
        System.out.println("Average: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Highest score: " + tertinggi);
        System.out.println("Lowest score: " + terendah);

        if (rata2 >= 85) {
            System.out.println("Class grade: VERY GOOD");
        } else if (rata2 >= 70) {
            System.out.println("Class grade: GOOD");
        } else {
            System.out.println("Class grade: NEEDS GUIDANCE");
        }

        int lulus = 0;
        for (int nilai : nilaiMhs) if (nilai > 70) lulus++;
        System.out.println("Students passed: " + lulus);

        input.close();
    }
}