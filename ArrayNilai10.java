import java.util.Scanner;

public class ArrayNilai10 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int lulus = 0, gagal = 0;
        for (int n : nilaiAkhir) {
            if (n > 70) lulus++; else gagal++;
        }
        System.out.println("Passed: " + lulus);
        System.out.println("Failed: " + gagal);
        input.close();
    }
}
