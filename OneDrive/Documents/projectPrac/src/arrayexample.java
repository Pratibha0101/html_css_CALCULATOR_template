//1. Enter range and input in array and print it.

import java.util.Scanner;
public class arrayexample {
    public static void main(String[] args) {
        int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the range: ");  
n=sc.nextInt();  

int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{   
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
}  
}  

