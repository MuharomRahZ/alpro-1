public class nilaiAkhirMahasiswa
{
    // instance variables - replace the example below with your own
    double tugas;
    double uts;
    double uas;
    double nilaiMahasiswa;

    public void hasilAkhir(double a, double b, double c){
        tugas = a * 0.45;
        uts = b * 0.2;
        uas = c * 0.35;
        nilaiMahasiswa = (a+b+c) / 3;
    }
    
    public void cetak()
    {
        // initialise instance variables
        System.out.println("Nilai Tugas Mahasiswa = "+tugas/0.45);
        System.out.println("Nilai UTS Mahasiswa = "+uts/0.2);
        System.out.println("Nilai UAS Mahasiswa = "+uas/0.35);
        System.out.println("Hasil Nilai Akhir Mahasiswa adalah "+nilaiMahasiswa);
    }
}
