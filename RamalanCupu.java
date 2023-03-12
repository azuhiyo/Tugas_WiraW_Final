package binus.forum;
import java.util.Random;
import java.util.Scanner;
public class RamalanCupu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("Data Anda : ");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Anda: ");
        String nama1 = input.nextLine();
        System.out.print("Masukkan Umur Anda: ");
        double umur1 = input.nextDouble();
        System.out.println("");

        System.out.println("Data Pasangan Anda: ");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("Masukkan Nama Pasangan Anda: ");

        input.nextLine();

        String namapasangan = input.nextLine();
        System.out.print("Masukkan Umur Pasangan Anda: ");
        double umur2 = input.nextDouble();
        System.out.println("");

        System.out.println(nama1 + " [" + umur1 + "]" + " tahun");
        System.out.println("♥");
        System.out.println(namapasangan + " [" + umur2 + "]" + " tahun");
        System.out.println("");
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        input.nextLine();
        input.nextLine();
        System.out.println("");
        Random rand = new Random();
        int max=100,min=50;
        System.out.print("Kecocokan anda dengan pasangan anda adalah : ");
        System.out.print(rand.nextInt(max - min + 1) + min);
        System.out.println(" %");
        System.out.println("Terima kasih karena anda telah menggunakan jasa ramalan kami... ^^v");
    }
}
