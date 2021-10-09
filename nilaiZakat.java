public class nilaiZakat
{
    //variabel nilai zakat
    double gajiSetahun;
    double kebutuhan;
    
    double modal;
    double laba;
    double piutang;
    double hutang;
    double kerugian;
    double harta;
    double minusHarta;
    
    double saldoNasabah;
    double hartaEmas; //kadar emas dalam gram
    double hartaPerak; //kadar perak dalam gram
    double nilaiEmas;
    double nilaiPerak;
    
    double kadar = 0.25; //kadar zakat yang harus dibayar
    double kadarPertanian;
    double hasilPanen;
    double kadarBeras; //kadar beras nishob
    
    double zakatProfesi;
    double zakatPerdagangan;
    double zakatEmas;
    double zakatPerak;
    double zakatTabungan;
    double zakatPertanian10;
    double zakatPertanian5;
    //variabel nilai bagi hasil
    int pilih;
    double tabunganNasabah;
    double distribusiBagiHasil;
    double nisbah;
    double bagiHasil;
    
    //No. 1 
    public void nilaiZakatProfesi(double gaji, double pengeluaran){
        //zakatProfesi = (gajiSetahun - kebutuhan) * kadar; 
        //System.out.println("Masukkan Nominal Gaji Dalam Setahun");
        gajiSetahun = gaji;
        //System.out.println("Masukkan Total Pengeluaran Dalam Setahun");
        kebutuhan = pengeluaran;
        zakatProfesi = (gajiSetahun - kebutuhan) * kadar; 
    }
    
    //No. 2 
    public void nilaiZakatPerdagangan(double modal, double laba, double piutang, double hutang, double rugi){
        modal = modal; 
        laba = laba;
        piutang = piutang;
        hutang = hutang;
        kerugian = rugi;
        
        harta = modal + laba + piutang;
        minusHarta = hutang + kerugian;
        
        zakatPerdagangan = (harta - minusHarta) * kadar;
    }
    
    //No. 3 
    public void nilaiZakatEmasPerak(double hargaemas, double hargaperak, double emas, double perak){
        //zakatEmasPerak;
        nilaiEmas = hargaemas;
        nilaiPerak = hargaperak;
        hartaEmas = emas * nilaiEmas;
        hartaPerak = perak * nilaiPerak;
        
        zakatEmas = hartaEmas * kadar;
        zakatPerak = hartaPerak * kadar;
    }
    
    //No. 4
    public void nilaiZakatTabungan(double saldo, double tabunganseluruhnasabah, double distribusibagihasil, double nisbah){
        saldoNasabah = saldo;
        tabunganNasabah = tabunganseluruhnasabah;
        distribusiBagiHasil = distribusibagihasil;
        nisbah = nisbah;
        
        bagiHasil = (saldoNasabah/tabunganNasabah) * distribusiBagiHasil * nisbah;
        zakatTabungan = (saldoNasabah - bagiHasil) * kadar;
    }
    
    //No. 5 
    public void nilaiZakatPertanian(double persenkadartani, double panen, double hargaberas){
        hasilPanen = panen;
        kadarPertanian = persenkadartani;
        kadarBeras = hargaberas * 520;
        
        zakatPertanian10 = hasilPanen * (kadarPertanian/100);
        zakatPertanian5 = hasilPanen * (kadarPertanian/100);
    }
    
    public void nilaiPilih(int nilai){
        pilih=nilai;
    }

    public void pilihMenu()
    {
        switch(pilih){
            case 1:
            if ((gajiSetahun - kebutuhan) >= (nilaiEmas * 85)){
                System.out.println("Nilai Zakat Profesi Anda Sebesar Rp" + zakatProfesi);
            } else if ((gajiSetahun - kebutuhan) < (nilaiEmas * 85)){
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Profesi. Dikarenakan Jumlah Minimum Gaji anda belum memenuhi Nishob.");
            }
            System.out.println("");
            break;
            
            case 2:
            if ((harta - minusHarta) >= (nilaiEmas * 85)){
                System.out.println("Nilai Zakat Perdagangan Anda Sebesar Rp" + zakatPerdagangan);
            } else if ((harta - minusHarta) < (nilaiEmas * 85)){
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Perdagangan. Dikarenakan Jumlah Minimum Harta anda belum memenuhi Nishob.");
            }
            System.out.println("");
            break;
            
            case 3:
            if (hartaEmas >= 85 && hartaPerak == 0){
                System.out.println("Nilai Zakat Emas Anda Sebesar Rp" + zakatEmas);
            } else if (hartaPerak >= 595 && hartaEmas == 0){
                System.out.println("Nilai Zakat Perak Anda Sebesar Rp" + zakatPerak);
            } else{
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Emas/Perak. Nilai Harta Emas/Perak Anda Belum Memenuhi Nishob");
            }
            System.out.println("");
            break;
            
            case 4:
            if ((saldoNasabah - bagiHasil) >= nilaiEmas * 85){
                System.out.println("Nilai Zakat Tabungan Anda Sebesar Rp" + zakatTabungan);
            } else {
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Tabungan. Nilai Saldo Tabungan Anda Belum Memenuhi Nishob");
            }
            System.out.println("");
            break;
            
            case 5:
            if (hasilPanen >= kadarBeras && kadarPertanian == 10){
                System.out.println("Nilai Zakat Pertanian Anda Sebesar Rp" + zakatPertanian10);
            } else if (hasilPanen >= kadarBeras && kadarPertanian == 5){
                System.out.println("Nilai Zakat Pertanian Anda Sebesar Rp" + zakatPertanian5);
            } else{
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Pertanian. Nilai Hasil Pertanian Anda Belum Memenuhi Nishob");
            }
            System.out.println("");
            break;
        }
    }
}
