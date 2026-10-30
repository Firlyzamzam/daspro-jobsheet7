import java.util.Scanner;
public class Sk1PenjualanTiket {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int jumlahTiket, hargaTiket = 50000, totalTiketTerjual = 0;
        int totalHarga = 0, subtotal;
        double diskon;
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                System.out.println("Terima kasih telah menggunakan layanan kami.");
                break;
            }
            if (jumlahTiket < 0){
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
                continue;
            }

            subtotal = jumlahTiket * hargaTiket;
            diskon = 0;
            if (jumlahTiket > 10) {
                diskon = subtotal * 0.15;
            } else if (jumlahTiket > 4) {
                diskon = subtotal * 0.1;
            } 

            totalHarga += subtotal - diskon;
            totalTiketTerjual += jumlahTiket;
            System.out.println("Subtotal: " + subtotal);
            System.out.println("Diskon: " + diskon);
            System.out.println("Total harga: " + (subtotal - diskon));
            
        } while (true);
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: " + totalHarga);

    }
}