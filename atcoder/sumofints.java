package gitprojects.atcoder;

import java.util.*;

class sumofints {
    
    public static void main(String[] args)    
    {  
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter value of n: ");
        int n=sc.nextInt();

        int sum = 0; 
        int[] arr=new int[n]; 
        //executes until the condition returns true  

        for(int i = 0; i < n; i++)  
        {  
        //adding the value of i into sum variable 
        arr[i]=sc.nextInt(); 
        sum = sum + arr[i];  
        }  
        
//prints the sum   
    	System.out.println(sum);
      //return sum;
    }  
}  
    

