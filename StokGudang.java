package binus.forum;
import java.util.Scanner;
import java.text.DecimalFormat;
public class StokGudang {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String namauser = input.nextLine();
        System.out.println("");

        System.out.println("Stok Gudang Input Barang");
        System.out.println("#########################" + "\r\n");

        System.out.println("Selamat Datang " + namauser);

        System.out.print("Masukkan nama barang yang mau ditambah : ");
        String namabarang = input.nextLine();

        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        double jumlahbarang = input.nextDouble();

        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        double hargabeli = input.nextDouble();

        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        double hargajual = input.nextDouble();

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################" + "\r\n");

        System.out.println("Nama Barang     : " + namabarang);
        System.out.println("Jumlah Barang   : " + jumlahbarang);
        System.out.println("Harga Beli      : Rp. " + df.format(hargabeli));
        System.out.println("Harga Jual      : Rp. " + df.format(hargajual));



    }
}
