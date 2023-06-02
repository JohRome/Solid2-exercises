package Uppgift10;

public class Main {
    public static void main(String[] args) {

        var dbReader = new DatabaseReader();
        var raport = new ReportGenerator(dbReader);

        raport.generateReport(dbReader.readData());
    }
}
