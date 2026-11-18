import java.util.Scanner;

public class OrderingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== MENU ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }
        
        String key;
        do {
            System.out.print("\nSearch menu name (type exit to start ordering): ");
            key = input.nextLine().toLowerCase();

            if (!key.equals("exit")) {
                boolean ditemukan = false;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[i].toLowerCase().equals(key)) {
                        System.out.println(menu[i] + " is available, price Rp" + harga[i]);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Menu " + key + " is not available.");
                }
            }
        } while (!key.equals("exit"));

        System.out.print("\nNumber of items to order: ");
        int n = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[n];
        int[] hargaPesanan = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            boolean ada = false;
            while (!ada) {
                System.out.print("Order " + (i + 1) + " (menu name): ");
                String nama = input.nextLine().toLowerCase();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].toLowerCase().equals(nama)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        total += harga[j];
                        ada = true;
                        break;
                    }
                }
                if (!ada) {
                    System.out.println("Menu not available, please try again.");
                }
            }
        }

        System.out.println("\n=== ORDER LIST ===");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + pesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("-------------------------");
        System.out.println("TOTAL: Rp" + total);

        input.close();
    }
}