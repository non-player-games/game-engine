import org.junit.Assert;
import org.junit.Test;

/**
 * Created by samskim on 7/4/16.
 */
public class Tester {

  @Test
  public void RegexTest(){
    String string = "1x";
    char firstChar = string.charAt(0);
    if (Character.isDigit(firstChar)){
      int num = Character.getNumericValue(firstChar);
      Assert.assertEquals(1, num);
    }




  }

}
