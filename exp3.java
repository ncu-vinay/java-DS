import java.util.Scanner;  
class main  
{  
 public static void main(String[] args)   
 {  
  int n=5;  
  Scanner sc=new Scanner(System.in);    
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
  int sum = 0;  
  for (int i = 0; i < n; i++) 
  {   
   sum = sum + array[i];  
  }    
  System.out.println("Sum of all the elements of an array: " + sum); 
  int s = 0;  
  for (int i = 0; i < n; i=i+2) 
  {   
   s = s + array[i];  
  }    
  System.out.println("Sum of all the alternate elements of an array: " + s);

  for(int i=0;i<n;i++)     
  {
   for(int j=i+1;j<n;j++)    
   {
    if(array[i]<array[j])     
    { 
     int temp=array[i];
     array[i]=array[j];
     array[j]=temp;
    }
   }
  }
  System.out.println("Second Largest element is "+array[1]);  
 }  
}  