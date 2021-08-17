package proxy;

public class ParserProxy implements Parser {
    private BaseParser parser;

    public ParserProxy(BaseParser parser) {
        this.parser = parser;
    }

    @Override
    public void parse() {
        if (!parser.isParsed()) {
            parser.parse();
            //return;
        }

        //System.out.println("The file has already been parsed!");
    }

    @Override
    public int getNumberOfLines() {
        this.parse();
        return parser.getNumberOfLines();
    }
}
