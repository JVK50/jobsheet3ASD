package smt2.jobsheet3.dosen;
import java.util.Scanner;

public class DosenDemo13 {
    public static void main(String[] args) {
        Scanner jvk = new Scanner(System.in);
        System.out.println("Masukkan jumlah dosen: ");
        int jmlDsn = Integer.parseInt(jvk.nextLine());
        System.out.println("--------------------------------------");

        Dosen13[] arrayOfDosen = new Dosen13[jmlDsn];
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < jmlDsn; i++) {
            arrayOfDosen[i] = new Dosen13();
            
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode  : ");
            kode = jvk.nextLine();
            System.out.print("Nama  : ");
            nama = jvk.nextLine();
            System.out.print("Jenis Kelamin (true=Laki-laki/false=Perempuan) : ");
            jenisKelamin = Boolean.parseBoolean(jvk.nextLine());
            System.out.print("Usia  : ");
            usia = Integer.parseInt(jvk.nextLine());
            arrayOfDosen[i] = new Dosen13(kode, nama, jenisKelamin, usia);
            System.out.println("--------------------------------------");
        }

         System.out.println("\n=== Data Dosen ===\n");
        for (Dosen13 dosen : arrayOfDosen) {
            String kelamin = dosen.jenisKelamin ? "Laki-laki" : "Perempuan";
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + kelamin);
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------------------");
        }
        
        dataDosen13 dataDosen = new dataDosen13();
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
        
        jvk.close();
    }
}
