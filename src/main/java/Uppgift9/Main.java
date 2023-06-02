package Uppgift9;

public class Main {
    public static void main(String[] args) {

        /** Uppgift 9: Interface-segregation (Interface Segregation Principle)
         Beskrivning: Skapa ett gränssnitt Database med metoder för att ansluta till en databas,
         utföra en fråga och stänga anslutningen. Implementera sedan två klasser, MySqlDatabase och OracleDatabase,
         som implementerar Database-gränssnittet.
         Er uppgift är att se till att gränssnittet är smalt och specifikt för dess användning, så att implementerande klasser inte tvingas implementera onödiga metoder.*/

        var sql = new SQL("johanDB");
        var mongo = new MongoDB("johanDB");
        var dbconn = new DBConnector(mongo);
        dbconn.connect();
        mongo.createDatabase();

    }
}
