package com.debbech.geonames.batch.dump;

public class UnexpectedLineFormatException extends Exception {

    private int lineNumber;
    private String line;

    public UnexpectedLineFormatException(int lineNumber, String line) {
        super();
        this.lineNumber = lineNumber;
        this.line = line;
    }

    @Override
    public String getMessage() {
        return String.format("[l%d][%s] ", lineNumber, line);
    }
}
