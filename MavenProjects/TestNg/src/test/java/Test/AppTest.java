package Test;
import java.util.*;
import static org.testng.Assert.*;

import java.beans.Transient;

import org.testng.annotations.Test;


public class AppTest 
{
  public ArrayList<String> inputList = new ArrayList<String>();
  public ArrayList<String> outputList = new ArrayList<String>();
  public ArrayList<String> resultList = new ArrayList<String>();

@Test
public void TestResult()
{
     inputList.add("shivam");
     inputList.add("apple");
     inputList.add("kumar");
     outputList.add("apple");
     App obj = new App();
     resultList = obj.check(inputList);
     assertEquals(outputList,resultList);
}

}