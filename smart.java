public class smart
{
    double[][] data;
    double[][] utility=new double[10][4];
    double[] bobot;
    double[] nilaiakhir=new double[10];
    
    smart(double[][] nkriteria)
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
    
    public void utilityC1(int min){
        for(int i=0; i<utility.length; i++){
            utility[i][0]=((data[i][0]-min)/(100-min))*100;
        }
    }
    
    public void utilityC2(int min){
        for(int i=0; i<utility.length; i++){
            utility[i][1]=((data[i][1]-min)/(100-min))*100;
        }
    }
    
    public void utilityC3(int min){
        for(int i=0; i<utility.length; i++){
            utility[i][2]=((data[i][2]-min)/(100-min))*100;
        }
    }
    
    public void utilityC4(int min){
        for(int i=0; i<utility.length; i++){
            utility[i][3]=((data[i][3]-min)/(100-min))*100;
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
