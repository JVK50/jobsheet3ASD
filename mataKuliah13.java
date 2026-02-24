package smt2.jobsheet3;

public class mataKuliah13 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public mataKuliah13(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public mataKuliah13() {
        this.kode = "";
        this.nama = "";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // soal no 2
    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // soal no 3
    public void cetakInfo() {
        System.out.println("Kode   : " + this.kode);
        System.out.println("Nama   : " + this.nama);
        System.out.println("SKS    : " + this.sks);
        System.out.println("Jumlah Jam   : " + this.jumlahJam);
        System.out.println("--------------------------------------");
    }
}
