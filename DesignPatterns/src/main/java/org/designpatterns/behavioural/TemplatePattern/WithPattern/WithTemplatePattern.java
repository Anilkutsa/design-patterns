package org.designpatterns.behavioural.TemplatePattern.WithPattern;

/**
 * The Template Method Pattern defines the skeleton of an algorithm in a base class and lets subclasses override specific steps.
 * Structure:
 * - Abstract Class: Defines the algorithm skeleton.
 * - Concrete Subclasses: Override specific steps of the algorithm.
 *
 * - Code Reuse: Common code is moved to the parent class, promoting reuse and reducing duplication.
 * - Flexibility: Subclasses can vary certain steps in the algorithm, while keeping the overall structure intact.
 * - Consistency: Ensures that the high-level structure of the algorithm remains consistent, even when subclass behavior differs.
 */
abstract class DataParser{

    //Template Method Define the steps of the algorithm
    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile(){
        System.out.println("Opening File");
    }
    protected void closeFile(){
        System.out.println("Closing File");
    }
    protected abstract void parseData();
}

//CSV Parser
class CSVParserII extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}

//JSON Parser
class JSONParserII extends DataParser{

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON Data");
    }
}

public class WithTemplatePattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParserII();
        DataParser jsonParser = new JSONParserII();
        csvParser.parse();
        jsonParser.parse();
    }
}
