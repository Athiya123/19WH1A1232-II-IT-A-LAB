import java.io.*;  
public class ReadNumber 
{  
 public static void main(String args[]) throws IOException  
 {  
   InputStreamReader read=new InputStreamReader(System.in);  
   BufferedReader in=new BufferedReader(read);  
   System.out.print("Enter a number: ");  
   int number=Integer.parseInt(in.readLine());  
   System.out.print("You have entered: "+number);  
 }  
}  