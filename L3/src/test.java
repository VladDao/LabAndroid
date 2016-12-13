public class test implements var10 {
    public double logika(double d1, double d2, double d3) {
        double min;
        double max;
        if (d1 < d2 && d2 < d3) {
             min = d1;
        } else if (d2 < d1 && d2 < d3) {
             min = d2;
        } else {
            min = d3;
        }
        if (d1 > d2 && d2 > d3) {
            max = d1;
        } else if (d2 > d1 && d2 > d3) {
             max = d2;
        } else {
             max = d3;
        }
        double ost = max % min;
        System.out.println("Van= "+ ost);
        return ost;
    }
    public void poka(double P) {
double Vklad =1000;
        int Month=0;
        for (int j=0;j<66;j++)
        {
            if (Vklad<1100) {Vklad=Vklad*P;
                Month++;}
            else {System.out.println("Month - "+ Month);
                break;}

        }
    }

    public void massivy(double[] A) {

        double[] prom = new double[10];
         prom[0]=A[0]%2;
           for (int i=0; i<3;i++){
            double Qq =A[i];
               double Z=Qq%2;
               if  ((Z==1) && ( prom[0]==1))  {  prom[i]=1;  }
               else if ((Z==0) && ( prom[0]==0)) {  prom[i]=0;}
                       }
           if ((prom[0]==prom[1])&&(prom[1]==prom[2])){ System.out.print(">>1");}
        else { System.out.print(">>0");}
    }
}