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
    int nilaiEmas = 926000;
    int nilaiPerak = 837943;
    
    double kadar = 0.25; //kadar zakat yang harus dibayar
    double kadarPertanian;
    double hasilPanen;
    double kadarBeras = 520000 * 10000; //kadar beras nishob
    
    double zakatProfesi;
    double zakatPerdagangan;
    double zakatEmas;
    double zakatPerak;
    double zakatTabungan;
    double zakatPertanian10;
    double zakatPertanian5;
    //variabel nilai bagi hasil
    int pilih;
    int tabunganNasabah = 1000000000;
    int distribusiBagiHasil = 500000000;
    double nisbah = 0.15;
    double bagiHasil;
    
    //No. 1 
    public void nilaiZakatProfesi(double gaji, double pengeluaran){
        //zakatProfesi = (gajiSetahun - kebutuhan) * kadar; 
        gajiSetahun = gaji;
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
    public void nilaiZakatEmasPerak(double emas, double perak){
        //zakatEmasPerak;
        hartaEmas = emas;
        hartaPerak = perak;
        
        zakatEmas = hartaEmas * kadar;
        zakatPerak = hartaPerak * kadar;
    }
    
    //No. 4
    public void nilaiZakatTabungan(double saldo){
        saldoNasabah = saldo;
        bagiHasil = (saldoNasabah/tabunganNasabah) * distribusiBagiHasil * nisbah;
        zakatTabungan = (saldoNasabah - bagiHasil) * kadar;
    }
    
    //No. 5 
    public void nilaiZakatPertanian(double kadartani, double panen){
        hasilPanen = panen;
        kadarPertanian = kadartani;
        
        zakatPertanian10 = hasilPanen * kadarPertanian;
        zakatPertanian5 = hasilPanen * kadarPertanian;
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
            if (hartaEmas >= 0.085 && hartaPerak == 0){
                System.out.println("Nilai Zakat Emas Anda Sebesar Rp" + zakatEmas);
            } else if (hartaPerak >= 0.595 && hartaEmas == 0){
                System.out.println("Nilai Zakat Perak Anda Sebesar Rp" + zakatPerak);
            } else{
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Emas/Perak. Nilai Harta Emas/Perak Anda Belum Memenuhi Nishob");
            }
            System.out.println("");
            break;
            
            case 4:
            if (saldoNasabah >= nilaiEmas * 0.085){
                System.out.println("Nilai Zakat Tabungan Anda Sebesar Rp" + zakatTabungan);
            } else {
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Tabungan. Nilai Saldo Tabungan Anda Belum Memenuhi Nishob");
            }
            System.out.println("");
            break;
            
            case 5:
            if (kadarPertanian == 10 && hasilPanen >= kadarBeras){
                System.out.println("Nilai Zakat Pertanian Anda Sebesar Rp" + zakatPertanian10);
            } else if (kadarPertanian == 5 && hasilPanen >= kadarBeras){
                System.out.println("Nilai Zakat Pertanian Anda Sebesar Rp" + zakatPertanian5);
            } else{
                System.out.println("Mohon Maaf Anda Belum Dapat Membayar Zakat Pertanian. Nilai Hasil Pertanian Anda Belum Memenuhi Nishob");
            }
            System.out.println("");
            break;
        }
    }
}
