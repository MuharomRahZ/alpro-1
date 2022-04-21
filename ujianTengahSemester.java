public class ujianTengahSemester
{
    // instance variables - replace the example below with your own
    int nishob;
    int zakat;
    double aset30;
    double aset40;
    int nishob30 = 30;
    int nishob40 = 40;
    double sapi;
    double sapi30;
    double sapi40;
    double totalAset;

    public void zakatTernakSapi(double kaliNilaiAset30, double kaliNilaiAset40)
    {
        // initialise instance variables
        aset30 = kaliNilaiAset30;
        aset40 = kaliNilaiAset40;
        
    }
    
    
    public void hitung(){
        if (aset30 % 30 == 0 && aset40 == 0) {
            System.out.println("Anda Wajib Membayar Zakat Ternak Sapi Sebesar " + (sapi30 = aset30 / nishob30) + " Ekor Sapi Berumur 1 tahun");
        }else if (aset40 % 40 == 0 && aset30 == 0){
            System.out.println("Anda Wajib Membayar Zakat Ternak Sapi Sebesar "+ (sapi40 = aset40 / nishob40) +" Ekor Sapi Berumur 2 tahun");
        }else if (aset30 % 30 == 0 && aset40 % 40 == 0){
            totalAset = aset30 + aset40;
            if (totalAset % 30 == 0){
                System.out.println("Anda Wajib Membayar Zakat Ternak Sapi Sebesar "+ (sapi = totalAset / nishob30) +" Ekor Sapi Berumur 1 tahun");
                System.out.println("Atau Anda Dapat Menggunakan Opsi Lainnya Yakni");
                System.out.println("Anda Wajib Membayar Zakat Ternak Sapi Sebesar "+ (sapi30 = aset30 / nishob30) +" Ekor Sapi Berumur 1 tahun dan "+ (sapi40 = aset40 / nishob40) +" Ekor Sapi Berumur 2 tahun");
            } else if (totalAset % 40 == 0){
                System.out.println("Anda Wajib Membayar Zakat Ternak Sapi Sebesar "+ (sapi = totalAset / nishob40) +" Ekor Sapi Berumur 2 tahun");
                System.out.println("Atau Anda Dapat Menggunakan Opsi Lainnya Yakni");
                System.out.println("Anda Wajib Membayar Zakat Ternak Sapi Sebesar "+ (sapi30 = aset30 / nishob30) +" Ekor Sapi Berumur 1 tahun dan "+ (sapi40 = aset40 / nishob40) +" Ekor Sapi Berumur 2 tahun");
            } else {
                System.out.println("Anda Wajib Membayar Zakat Ternak Sapi Sebesar "+ (sapi30 = aset30 / nishob30) +" Ekor Sapi Berumur 1 tahun dan "+ (sapi40 = aset40 / nishob40) +" Ekor Sapi Berumur 2 tahun");
            }

        }
    }
}
