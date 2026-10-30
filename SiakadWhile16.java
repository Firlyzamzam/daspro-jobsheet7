import java.util.Scanner;
public class SiakadWhile16 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int nilai, jml, i;
        i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();
        
        while (i < jml) {
            i++;
            System.out.print ("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();
    }
}
