package smt2.jobsheet3;
import java.util.Scanner;

public class mataKuliahDemo13 {
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
         // no 4
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = Integer.parseInt(jvk.nextLine());
        System.out.println("--------------------------------------");

        mataKuliah13[] arrayOfMataKuliah = new mataKuliah13[jumlahMataKuliah];
        String kode,nama,dummy;
        int sks,jumlahJam;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            arrayOfMataKuliah[i] = new mataKuliah13();

            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode  : ");
            kode = jvk.nextLine();
            System.out.print("Nama  : ");
            nama = jvk.nextLine();
            System.out.print("SKS   : ");
            dummy = jvk.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = jvk.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------------");
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        

        for (int i = 0; i < 3; i++) {
            System.out.println("Data mata kuliah ke-" +(i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
        jvk.close();
    }
}
