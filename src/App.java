public class App {
    public static void main(String[] args) {
        Book bookOne = new Book();
        bookOne.readFromUrl("Julius Caesar Written by William Shakespeare",
            "https://www.gutenberg.org/cache/epub/1513/pg1513.txt");

        Book bookTwo = new Book();
        bookTwo.readFromUrl("The Odyssey Written by Homer",
            "https://www.gutenberg.org/cache/epub/74767/pg74767.txt");

        PigLatinTranslator translator = new PigLatinTranslator();

        System.out.println("==========================================\n");
        System.out.println("Book 1 - Julius Caesar:\n");
        System.out.println("==========================================");
        bookOne.printTranslatedLines(translator, 150, 200);

        System.out.println("==========================================");
        System.out.println("\nBook 2 - The Odyssey:\n");
        System.out.println("==========================================");
        bookOne.printTranslatedLines(translator, 150, 200);
    }
}