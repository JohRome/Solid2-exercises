package Uppgift9;

public class DBConnector implements Database {
    private Database db;

    public DBConnector(Database db) {
        this.db = db;
    }

    @Override
    public void connect() {
        db.connect();
    }

    @Override
    public void disconnect() {
        db.disconnect();
    }
}
