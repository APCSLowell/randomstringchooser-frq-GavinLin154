import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> stringList;
  private String returnWord;
  private int returnIndex;
  public RandomStringChooser(String[] list) {
      stringList = new ArrayList<String>();
      for(int i = 0; i < list.length; i++) {
          stringList.add(list[i]);
      }  
      returnWord = "";
      returnIndex = 0;
  }  
  public String getNext() {
      if(stringList.size() == 0) {
          return "NONE";
      }  
      returnIndex = (int)(Math.random() * (StringList.size()));
      returnWord = stringList.get(returnIndex);
      stringList.remove(returnIndex);
      return returnWord;
  }  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
