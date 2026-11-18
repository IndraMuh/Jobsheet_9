import java.util.Scanner;

public class SearchNilai10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Number of elements: ");
    int n = input.nextInt();
    int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
        System.out.print("Element " + (i + 1) + ": ");
        nilai[i] = input.nextInt();
        }
    System.out.print("Key to search: ");
    int key = input.nextInt();
    boolean ditemukan = false;
    for (int i = 0; i < n; i++) {
        if (nilai[i] == key) {
            System.out.println("Score " + key + " found at index " + i);
            ditemukan = true;
            break;
        }
    }
    if (!ditemukan) {
    System.out.println("Score " + key + " was not found in the data. Please check the value and try again.");
    }
    input.close();
    } 
}
