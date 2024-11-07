import java.util.Scanner;

public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];
        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi: ");
            int menu = sc.nextInt();
            sc.nextLine(); // Clear the buffer

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); // Clear the buffer

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil dimasukkan!");
                    } else {
                        System.out.println("Baris atau kolom tidak valid. Harap masukkan angka yang sesuai.");
                    }
                    break;

                case 2:
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String viewer = penonton[i][j];
                            if (viewer != null) {
                                System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + viewer);
                            } else {
                                System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": [Kosong]");
                            }
                        }
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }

        sc.close();
    }
}