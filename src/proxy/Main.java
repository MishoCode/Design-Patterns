package proxy;

public class Main {
    public static void main(String[] args) {
        Parser parser1 = new ParserProxy(new JSONParser("data.json"));
        System.out.println(parser1.getNumberOfLines());

        //No need to parse again to get the number of the lines
        //Once the file is parsed, the data is saved
        System.out.println(parser1.getNumberOfLines());

        Parser parser2 = new ParserProxy(new XMLParser("data.xml"));
        System.out.println(parser2.getNumberOfLines());
        parser2.parse();// nothing happens, because the file is already parsed
        System.out.println(parser2.getNumberOfLines());
        System.out.println(parser2.getNumberOfLines());
    }
}
