import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class operasiFile
{
    int[] data = new int[18];
    
    public void ambilData(){
        try{
            BufferedReader in = new BufferedReader(new FileReader("DataBerat.txt"));
            String str;
            int i = 0;
            //membaca data
            while((str = in.readLine()) != null){
                //menyimpan data ke dalam varabel data
                data[i] = Integer.parseInt(str);
                i++;
            }
            //menutup pembacaan data
            in.close();
        }
        catch (IOException ex){
            System.err.println(ex.getMessage());
        }
    } 
    
    public double hitungMean(){
        double jumlah = 0.0;
        double mean = 0.0;
        for(int i=0; i<data.length; i++){
            jumlah+=data[i];
        }
        mean=jumlah/data.length;
        return mean;
    }
    
    public double quartilSatu(){
        double jumlah = 0.0;
        double quartilSatu = 0.0;
        for(int i=0; i<data.length; i++){
            jumlah+=data[i];
        }
        quartilSatu = (jumlah + 2)/4;
        return quartilSatu;
    }
    
    public double quartilDua(){
        double jumlah = 0.0;
        double quartilDua = 0.0;
        for(int i=0; i<data.length; i++){
            jumlah+=data[i];
        }
        quartilDua = ((jumlah/2) + ((jumlah/2)+1))/2;
        return quartilDua;
    }
    
    public double quartilTiga(){
        double jumlah = 0.0;
        double quartilTiga = 0.0;
        for(int i=0; i<data.length; i++){
            jumlah+=data[i];
        }
        quartilTiga = (3 * jumlah + 2)/4;
        return quartilTiga;
    }
    
}
