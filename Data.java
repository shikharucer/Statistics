import java.util.*;

public class Data
{
	public static void main(String args[])
	{
		int n,i,j,temp;
		Data dt = new Data();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the number of data: ");
	    n = sc.nextInt();
		int[] sal = new int[n];
		System.out.println("\nEnter the data: ");
		for(i=0;i<n;i++)
		{
		  sal[i] = sc.nextInt();	
		}
		for(i = 0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(sal[j-1]>sal[j])
				{
					temp = sal[j-1];
					sal[j-1]=sal[j];
					sal[j]=temp;
			    }
			}
		}	
		System.out.print("Organised data =");
		 for(i=0;i<sal.length;i++)
	     {
		  System.out.print(" "+sal[i]);
	      }
     	dt.mean(sal);
		dt.median(sal);
		dt.mode(sal);
		//dt.midRange(sal);*/
	}
	
	public void mean(int sal[])
	{
      int i;
	  double total = 0.0;
	  for(i=0;i<sal.length;i++)
	  {
		  total+=(double)sal[i];
	  }
	  double mean = total/sal.length;
	  System.out.println("\nMean = "+mean);
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
 
   public static void mode(int sal[]) 
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
    }
       	  
}     		
		