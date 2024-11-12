import java.lang.*;

public class PigLatinTranslator
{
  public static Book translate(Book input)
  {
    Book translatedBook = new Book();

    // Add code here to populate translatedBook with a translation of the input book.
    // Curent do-nothing code will return an empty book.

    return translatedBook;
  }

  public static String translate(String input)
  {
     System.out.println("Translate The Following String: '" + input + "'");

     String a = "a";
     String e = "e";
     String i = "i";
     String o = "o";
     String u = "u";
  // YOU HAVE TO MAKE THE VOWEL BE THE FIRST LETTER OF THE WORD
     if (input.indexOf(a) == 1)
     {
   // String expected = expected.substring(1,expected.length()); 
     }
     else if (input.indexOf(e) == 1)
     {
     
     }
     else if (input.indexOf(i) == 1)
     {
     
     }
     else if (input.indexOf(o) == 1)
     {
     
     }
     else if (input.indexOf(u) == 1)
     {
     
     }
    String result = translateWord(input);

    return result;
  }

  private static String translateWord(String input)
  {
 //  System.out.println("translateWord: '" + input + "'");
   
 String result = input;
    
    return result;
  }

  // Add additonal private methods here.
  // For example, I had one like this:
  // private static String capitalizeFirstLetter(String input)

}