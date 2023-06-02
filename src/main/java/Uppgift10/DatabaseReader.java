package Uppgift10;

import java.util.ArrayList;
import java.util.List;

public class DatabaseReader implements DataReader {

    @Override
    public List<String> readData() {
        List<String> namesReadFromDB = new ArrayList<>();
        namesReadFromDB.add("Johan");
        namesReadFromDB.add("Eiemi");
        return namesReadFromDB;
    }
}
