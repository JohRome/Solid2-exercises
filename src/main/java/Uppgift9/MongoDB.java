package Uppgift9;

import com.mongodb.MongoClientException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDB implements Database {

    private MongoDatabase database;
    private MongoClient client;
    private String dbName;

    public MongoDB(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        try {
            client = MongoClients.create("mongodb://localhost:27017");
        } catch (MongoClientException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void disconnect() {
        try {
            client.close();
        } catch (MongoClientException e) {
            System.out.println(e.getMessage());
        }
    }
    public void createDatabase() {
        client.getDatabase(dbName);
    }
}
