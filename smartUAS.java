public class smartUAS
{
    double[][] data;
    double[][] utility=new double[10][4];
    double[] bobot;
    double[] nilaiakhir=new double[10];
    
    smartUAS(double[][] nkriteria)
    {
        // initialise instance variables
        data=nkriteria;
    }
    
    public void setBobot(double[] b){
        bobot=b;
    }
    
    public void printData(){
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[0].length; j++){
                System.out.println(data[i][j]+"");
            }
            System.out.println();
        }
    }
    
    public void hitungUtility(int[] min){
        for(int i=0; i<utility.length; i++){
            for(int j=0; j<utility[0].length; j++){
                utility[i][j]=((data[i][j]-min.length)/(100-min.length))*100;
            }
        }
    }
    
    public void printUtility(){
        for(int i=0; i<utility.length; i++){
            System.out.println(utility[i][0]+""+utility[i][1]+""+utility[i][2]+""+utility[i][3]);
        }
    }
    
    public void nilaiAkhir(){
        for(int i=0; i<utility.length; i++){
            nilaiakhir[i]=(bobot[0]*utility[i][0])+(bobot[1]*utility[i][1])+(bobot[2]*utility[i][2])+(bobot[3]*utility[i][3]);
        }
    }
    
    public void printNilaiAkhir(){
        for(int i=0; i<utility.length; i++){
            System.out.println(nilaiakhir[i]);
        }
    }
}
