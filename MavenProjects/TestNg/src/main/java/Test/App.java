package Test;
import java.util.*;
public class App 
{
  public ArrayList<String> check(ArrayList<String> arr)
  {
    ArrayList<String> arr1 = new ArrayList<String>();
      for(int i=0;i<arr.size();i++)
     {
           
        String s1 = arr.get(i);
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) == s1.charAt(j+1)) {     
                arr1.add(s1);
                break;
             }

         }
        

      }
      return arr1;
  }
}
    

