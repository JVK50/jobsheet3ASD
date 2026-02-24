package smt2.jobsheet3.dosen;

public class dataDosen13 {
    public void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===\n");
        for (Dosen13 dosen : arrayOfDosen) {
            String kelamin = dosen.jenisKelamin ? "Laki-laki" : "Perempuan";
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + kelamin);
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("--------------------------------------");
        }
    }
    
    // Method untuk menampilkan jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        
        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===\n");
        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
        System.out.println("--------------------------------------");
    }
    
    // Method untuk menampilkan rata-rata usia dosen per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        
        System.out.println("\n=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===\n");
        if (jumlahPria > 0) {
            double ratarataPria = (double) totalUsiaPria / jumlahPria;
            System.out.println("Rata-rata Usia Dosen Pria   : " + ratarataPria);
        }
        if (jumlahWanita > 0) {
            double rerataWanita = (double) totalUsiaWanita / jumlahWanita;
            System.out.println("Rata-rata Usia Dosen Wanita : " + rerataWanita);
        }
        System.out.println("--------------------------------------");
    }
    
    // Method untuk menampilkan data dosen paling tua
    public void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        Dosen13 dosenTua = arrayOfDosen[0];
        
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        
        System.out.println("\n=== INFO DOSEN PALING TUA ===\n");
        String kelamin = dosenTua.jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode          : " + dosenTua.kode);
        System.out.println("Nama          : " + dosenTua.nama);
        System.out.println("Jenis Kelamin : " + kelamin);
        System.out.println("Usia          : " + dosenTua.usia);
        System.out.println("--------------------------------------");
    }
    
    // Method untuk menampilkan data dosen paling muda
    public void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        Dosen13 dosenMuda = arrayOfDosen[0];
        
        for (Dosen13 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        
        System.out.println("\n=== INFO DOSEN PALING MUDA ===\n");
        String kelamin = dosenMuda.jenisKelamin ? "Laki-laki" : "Perempuan";
        System.out.println("Kode          : " + dosenMuda.kode);
        System.out.println("Nama          : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin : " + kelamin);
        System.out.println("Usia          : " + dosenMuda.usia);
        System.out.println("--------------------------------------");
    }
}
