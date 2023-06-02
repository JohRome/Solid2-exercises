package Uppgift10;

import java.util.List;

public class ReportGenerator {

    DataReader dataReader;

    public ReportGenerator(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public void generateReport(List<String> generatingRaportFromThis) {
        System.out.println("Names in the database: ");
        for (String generatingRaportFromThi : generatingRaportFromThis) {
            System.out.print(generatingRaportFromThi + ", ");
        }
    }
}
