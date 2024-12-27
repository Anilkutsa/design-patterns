package org.designpatterns.behavioural.TemplatePattern.WithoutPattern;

/**
 * Consider a scenario where you have different data parsers (e.g., CSV, XML, and JSON).
 * Each parser follows the same steps: open file, parse data, and close file.
 * Without the Template Method Pattern, you might end up duplicating the common steps in each parser class.
 *
 * Drawbacks of code below -
 * - Code duplication: The openFile() and closeFile() methods are duplicated in both parsers.
 * - Any changes to the common logic would require changes in every parser, violating the DRY (Don’t Repeat Yourself) principle.
 *
 * Different parts of an algorithm may need to vary in subclasses, but the overall structure should remain consistent.
 */
//CSV Parser
class CSVParser{
    public void parse(){
        openFile();
        //CSV Specific Parsing Logic
        System.out.println("Parsing a CSV File");
        closeFile();
    }
    private void openFile(){
        System.out.println("Opening File");
    }
    private void closeFile(){
        System.out.println("Closing File");
    }
}

class JSONParser{
    public void parse(){
        openFile();
        //CSV Specific Parsing Logic
        System.out.println("Parsing a JSON File");
        closeFile();
    }
    private void openFile(){
        System.out.println("Opening File");
    }
    private void closeFile(){
        System.out.println("Closing File");
    }
}


public class WithoutTemplateMethod {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}
