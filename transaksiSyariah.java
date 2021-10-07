public class transaksiSyariah
{
    //variabel nilai hasil bagi
    int pilih;
    double saldoNasabah;
    double tabunganNasabah;
    double distribusiBagiHasil;
    double nisbah;
    double hasilBagi;
    //variabel cicilan KPR
    double hargaRumah;
    double persenUangMuka;
    double keuntungan;
    double kurunWaktu; //dalam satuan tahun
    double kurunWaktuBulan; //dalam satuan bulan
    double nilaiUangMuka;
    double cicilan;
    
    public void nilaiSaldo(double saldo, double tabungan, double bagihasil, double nisbah)
    {
        saldoNasabah = saldo;
        tabunganNasabah = tabungan;
        distribusiBagiHasil = bagihasil;
        nisbah = nisbah;
        hasilBagi = (saldoNasabah/tabunganNasabah) * distribusiBagiHasil * nisbah;
    }
    
    public void nilaiCicilan(double hargarumah, double persenuangmuka, double marginuntung, double kurunwaktutahun, double kurunwaktubulan){
        hargaRumah = hargarumah;
        persenUangMuka = persenuangmuka;
        keuntungan = marginuntung;
        kurunWaktu = kurunwaktutahun;
        kurunWaktuBulan = kurunwaktubulan;
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
