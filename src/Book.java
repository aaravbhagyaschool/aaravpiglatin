import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.net.URL;
public class Book {
    private String author;
    private String title;
    private ArrayList<String> text = new ArrayList<>();
    public void readFromUrl(String title, String url) {
        this.title = title;
        try {
            URL bookUrl = new URL(url);
            Scanner scanner = new Scanner(bookUrl.openStream());
             while (scanner.hasNextLine()) {
                text.add(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void printTranslatedLines(PigLatinTranslator translator, int start, int end) {
        for (int i = start; i <= end && i < text.size(); i++) {
            String OGLine = text.get(i);
            String translatedLine = translator.translate(OGLine);
            System.out.println(translatedLine);
        }
    }
}