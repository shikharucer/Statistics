import java.util.*;
import java.io.*;
import java.util.Arrays.*;
import java.math.*;

class quartile {

	public static void main (String args[])
	{
		int[] data={13,15,16,16,19,20,20,21,22,22,25,25,25,25,30,33,33,35,35,35,35,36,40,45,46,52,70};
		quartile q=new quartile();
        Arrays.sort(data);
        System.out.println("1.\n");
        q.mean(data);
        q.median(data);
        System.out.println("2.\n");
        q.mode(data);
        System.out.println("3.\n");
        q.midRange(data);
        System.out.println("4.\n");
        q.quart(data);
        System.out.println("5.\n");
        q.summary(data);

	}
	  public void mean(int sal[])
	{
      int i;
	  double total = 0.0;
	  for(i=0;i<sal.length;i++)
	  {
		  total+=(double)sal[i];
	  }
	  double mean = Math.floor(total/sal.length);
	  System.out.println("Mean = "+mean);
	}
	
   public void median(int sal[])
	{
	  int mid,mid_1,mid_2;
	  int n = sal.length;
	  if(n%2==0)
	  {
		  mid_1 = sal[(n/2)-1];
		  mid_2 = sal[(n/2)];
		  System.out.println("Medians are = "+mid_1+" "+mid_2);
	  } 
	  else
	  {
		  mid = sal[(n/2)];
		  System.out.println("Median is = "+mid);
	  }
   }
 
   public  void mode(int sal[]) 
    {
    	 boolean flag =false;
         int len =sal.length,i,j,k=0,max=0;
        int newarr[][]=new int[len][2];
        for ( i=0;i<len ;i++ ) {
        	for (j=0;j<len ;j++ ) {
        		newarr[i][1]=0;
        	}
        }
        for (i=0;i<len ;i++ ) {
        	for ( j=0;j<len ;j++ ) {
        		if(sal[i]==sal[j])
        		{
        			newarr[i][0]=sal[i];
        			newarr[i][1]++;
        		}
        		
        	}
        }
        
        for (i=0;i<len ;i++ ) {
        	  max=newarr[i][1];
        	for ( j=0;j<len ;j++ ) {
        		 
                   if(newarr[j][1]>max)
                   {
                   	max = newarr[j][1];
                  }
              }
              flag=true;
                          
         }
          

         for (i=1;i<len ;i++ ) {
         	if(newarr[i-1][1]==max&&newarr[i-1][0]!=newarr[i][0])
         	{
         		System.out.print("mode ="+newarr[i-1][0]);
                
         	}
        }
        if (max==2)
        {
        	System.out.println("Bimodal");
        }
          if (max==3)
        {
        	System.out.println("Trimodal");
        }
          if (max==4)
        {
        	System.out.println("\nData is Quadmodal");
        }

    }
    
    public void midRange(int sal[])
    {
       int midr = (sal[sal.length-1]+sal[0])/2;
       System.out.print("Mid range ="+midr+"\n");
    }
       	  

    public void quart(int sal[])
    {
      int mid,q1,q3;
	  int n = sal.length;
	  mid = sal[(n/2)];
	  q1=sal[n/4];
	  q3=sal[3*n/4];
	  System.out.print("\nQ1= "+q1+" Q3= "+q3+"\n");
	  
    }   	 

    public void summary(int sal[])
    {

      int mid,q1,q3,min,max;
	  int n = sal.length;
	  mid = sal[(n/2)];
	  q1=sal[n/4];
	  q3=sal[3*n/4];
	  max=sal[n-1];
	  min=sal[0];
	  System.out.print("\nMin= "+min+" Q1= "+q1+" Midean=" +mid+" Q3=" +q3+" Max= "+max+"\n\nBox Plot:\n");
	  System.out.print("|-------|"+max+"\n\n\n");
	  System.out.print(" -------\n");
	  System.out.print("|-------|"+q3+"\n");
	  System.out.print("|-------|\n");
	  System.out.print("|-------|\n");
	  System.out.print("|-------|"+mid+"\n");
	  System.out.print("|-------|\n");
	  System.out.print("|-------|\n");
	  System.out.print("|-------|"+q1+"\n");
	  System.out.print(" -------\n\n\n"); 
	  System.out.print("|-------|"+min+"\n\n\n");
    } 
}