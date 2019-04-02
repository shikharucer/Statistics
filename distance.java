import java.util.*;
import java.util.Arrays.*;
public class distance{
    public static void main(String args[])
      { 
        double sum=0.0;
        int i,j;
        System.out.print("\nEnter the size of the first data set");
        Scanner sc  = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("\nEnter the size of the second dataset:");
        int n =sc.nextInt();
         int[] d_1 = new int[m];
         int[] d_2 = new int[n];
        System.out.print("\nEnter the first dataset dataset:"); 
        for(i=0;i<m;i++)
        {
          d_1[i] = sc.nextInt();
        }
         System.out.print("\nEnter the second dataset dataset:"); 
        for(i=0;i<n;i++)
        {
          d_2[i] = sc.nextInt();
        }
       for(i=0;i<m;i++)
          {
            sum = sum + Math.pow(Math.abs(d_1[i]-d_2[i]),2);
          }
       System.out.print("\nEuclidian Distance ="+Math.sqrt(sum));
         sum=0.0;
         for(i=0;i<m;i++)
          {
            sum = sum + Math.abs(d_1[i]-d_2[i]);
          }
       System.out.print("\nManhatten Distance ="+sum);
       System.out.print("\nEnter the valuen of b :");
       double b = sc.nextDouble();
       sum=0.0;
       for(i=0;i<m;i++)
          {
            sum = sum + Math.pow(Math.abs(d_1[i]-d_2[i]),b);
          }
       System.out.print("\nMinkouski Distance ="+Math.pow(sum,1/b));
       int[] d =new int[n];
         for(i=0;i<m;i++)
          {
            d[i] =Math.abs(d_1[i]-d_2[i]);
          }
       Arrays.sort(d);
       System.out.print("\nSupremum Distance ="+d[d.length-1]);
  }
}
