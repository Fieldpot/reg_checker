import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class RegexMatchChecker {
  public static void main(String[] args){
    String regString = null;
    String inputText = null;
    
    try(BufferedReader reader = new BufferedReader (new InputStreamReader(System.in))){
    
      System.out.println("input regex string first : ");
      regString = reader.readLine();

      System.out.println("input text : ");
      inputText = reader.readLine();

    } catch (IOException e) {
      e.printStackTrace();
    } 

    Pattern pattern = Pattern.compile(regString);
    Matcher matcher = pattern.matcher(inputText);

    if (matcher.matches()){
      System.out.println("Match");
      System.out.println("  Matched String" + matcher.group());
    } else {
      System.out.println("Not Match");
    }
  }
}
