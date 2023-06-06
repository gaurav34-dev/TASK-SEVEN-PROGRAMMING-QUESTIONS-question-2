import java.util.*;
//import java.util.Arrays;
public class Main {
public static void main(String[] args) 
{
  Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
System.out.print("Enter a string: ");  
String str= sc.nextLine();  
char arr[]=str.toCharArray();
boolean unique=true;
  for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
        {
          if(arr[i]==arr[j])
          { unique=false;
            break;
          }
        }

  if(unique)
  {
    System.out.println(arr[i]);
    break;
    
  }
    }


  
 }
}