public class transaksiSyariah
{
    //variabel nilai hasil bagi
    int pilih;
    double saldoNasabah;
    int tabunganNasabah = 1000000000;
    int distribusiBagiHasil = 500000000;
    double nisbah = 0.15;
    double hasilBagi;
    //variabel cicilan KPR
    double hargaRumah;
    double persenUangMuka;
    double keuntungan;
    double kurunWaktu; //dalam satuan tahun
    double kurunWaktuBulan; //dalam satuan bulan
    double nilaiUangMuka;
    double cicilan;
    
    public void nilaiSaldo(double saldo)
    {
        saldoNasabah = saldo;
        hasilBagi = (saldoNasabah/tabunganNasabah) * distribusiBagiHasil * nisbah;
    }
    
    public void nilaiCicilan(double rupiah, double persen, double margin, double tahun, double bulan){
        hargaRumah = rupiah;
        persenUangMuka = persen;
        keuntungan = margin;
        kurunWaktu = tahun;
        kurunWaktuBulan = bulan;
        //nilai DP
        nilaiUangMuka = hargaRumah * persenUangMuka;
        //nilai cicilan KPR
        cicilan = (hargaRumah - nilaiUangMuka) * (keuntungan * kurunWaktu) + ((hargaRumah - nilaiUangMuka)/kurunWaktuBulan);
    }
    
    public void nilaiPilih(int p){
        pilih=p;
    }

    public void pilihMenu()
    {
        switch (pilih){
            case 1: //menghitung nilai hasil bagi            
            System.out.println("Nilai Hasil Bagi Anda Sebesar Rp" + hasilBagi);
            System.out.println("");
            break;
            
            case 2: //menghitung besarnya nilai cicilan KPR            
            System.out.println("Pembayaran Uang Muka / DP kepada pemilik properti yakni sejumlah Rp" + nilaiUangMuka);
            System.out.println("Cicilan KPR tiap bulannya selama " + kurunWaktu + " tahun yakni sebesar Rp" + cicilan);
            System.out.println("");
            break;
        }
        
    }
}
