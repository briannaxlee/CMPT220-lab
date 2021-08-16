package lab10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Project1
{
   public static void main(String[] args) throws IOException 
   {
      File file = new File("/Users/briannalee/eclipse-workspace/welcomeJava/"
				+ "src/lab10/Hamlet.txt");
      
      String[] words = null;
      
      FileReader fileReader = new FileReader(file);
      
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      
      String s;     
      
      String thou1 = "thou";
      String thou2 = "Thou";
      
      int total = 0;
      
      while ((s = bufferedReader.readLine())!= null)
      {
         words = s.split(" |\\.|\\,|\\'");
          for (String word : words) 
          {
        	  if (word.equals(thou1) || word.equals(thou2))
        	  {
        		  total++;
              }
          }
      }
      System.out.println("In Hamlet by Shakespeare, thou/Thou appears " + total + " times.");
     
     fileReader.close();
   }
}
