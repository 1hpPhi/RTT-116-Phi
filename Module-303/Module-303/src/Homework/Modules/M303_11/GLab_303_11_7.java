package Homework.Modules.M303_11;

import java.util.Map;
import java.util.TreeMap;

public class GLab_303_11_7 {

    private TreeMap<String, String> data;

    public String PhoneDirectoryWithTreeMap() {
        this.data = new TreeMap<String, String>();
        return "0";
    }

    public String getNumber(String name) {
        return this.data.get(name);
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        this.data.put(name, number);
    }
    public void print() {
        for ( Map.Entry<String,String> entry :   this.data.entrySet() )
            System.out.println( entry.getKey() + ":  " + entry.getValue() );
    }

}
