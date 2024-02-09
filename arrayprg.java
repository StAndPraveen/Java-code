import java.util.*;

class arrayprg{
 public static void main(String args[])
{
int arr[]=new int[10];
int i,n;
Scanner s= new  Scanner(System.in);

System.out.println("How many values are there?");
n=s.nextInt(); 

System.out.println("Enter the values :");
for(i=0;i<n;i++) arr[i]=s.nextInt();

System.out.println("the given array:");
for(i=0;i<n;i++)System.out.println(arr[i]+",");

}}

