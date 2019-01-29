import java.util.Arrays;
import java.util.*;

public class mode{

	public static void main(String args[])
	{
		boolean flag=false;
        Scanner sc =new Scanner(System.in);
        mode md = new mode();
        int[] sal = {1,2,2,3,3,4,4,4,5,5,5,12,12};
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
            System.out.println(" "+newarr[i][0]+" "+newarr[i][1]+"\n");
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
          

         for (i=1;i<newarr.length ;i++ ) {
         	if(newarr[i-1][1]==max&&newarr[i-1][0]!=newarr[i][0])
         	{
         		System.out.print("mode ="+newarr[i-1][0]);
                
         	}
        }
       
	}
}

