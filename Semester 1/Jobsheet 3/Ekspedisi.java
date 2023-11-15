import java.util.Scanner;

public class Ekspedisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendeklarasikan variabel
        double beratPaket, biayaPengiriman;

        // Meminta pengguna memasukkan berat paket dalam kilogram
        System.out.print("Masukkan berat paket (kg): ");
        beratPaket = scanner.nextDouble();

        // Menghitung biaya pengiriman berdasarkan berat paket
        if (beratPaket <= 1) {
            biayaPengiriman = 10.0;
        } else if (beratPaket <= 5) {
            biayaPengiriman = 20.0;
        } else if (beratPaket <= 10) {
            biayaPengiriman = 30.0;
        } else {
            biayaPengiriman = 40.0;
        }

        // Menampilkan biaya pengiriman
        System.out.println("Biaya pengiriman paket seberat " + beratPaket + " kg adalah: $" + biayaPengiriman);

        // Menutup scanner
        scanner.close();
    }
}