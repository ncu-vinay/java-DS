import java.util.*;
class Main
{
public static void main(String args[])
{
int large,small,i;
int n;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
n=sc.nextInt();  
int[] arr = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int j=0; j<n; j++)  
{    
arr[j]=sc.nextInt();  
}  

large=small=arr[0];
for(i=1;i<n;++i)
{
if(arr[i]>large)
large=arr[i];

if(arr[i]<small)
small=arr[i];
}

int diff = large - small;
System.out.print("Difference between large and small are: " + diff);
}
}