package proxy;

public abstract class BaseParser implements Parser {
    private boolean isParsed = false;
    private int numberOfLines;
    private final String filename;

    protected BaseParser(String filename) {
        this.filename = filename;
    }

    public boolean isParsed() {
        return isParsed;
    }

    @Override
    public void parse() {
        System.out.println("Parsing the file " + this.filename + " is an expensive operation!");
        numberOfLines = 100;
        isParsed = true;
    }

    @Override
    public int getNumberOfLines() {
        return this.numberOfLines;
    }
}
