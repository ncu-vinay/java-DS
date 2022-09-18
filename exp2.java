import java.util.Scanner;  
class main  
{  
 public static void main(String[] args)   
 {  
  int n;  
  Scanner sc=new Scanner(System.in);  
  System.out.print("Enter the number of elements you want to store: ");  
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
  System.out.println("Elements at even index:");
  for (int i = 0; i < n; i++)
  {
   if(i%2==0)
   {
    System.out.println(array[i]+" at :"+i);
   } 
  }
  System.out.println("Elements which are odd:");
  for (int i = 0; i < n; i++) 
  {
   if(array[i]%2!=0)
   {
    System.out.println(array[i]);
   }
  }
  System.out.println("On reversing, Array changes to: ");
  for(int i=n-1;i>=0;i--)
  {
   System.out.println(array[i]);
  }
  System.out.println("First Element is: "+array[0]+" and Last ELement is: "+array[n-1]);
 }  
}  