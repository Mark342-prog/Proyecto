/**
 * fabric
 */
import java.io.*;
import java.io.ObjectInputFilter.Status;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.Locale.Category;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Arrays;
public class Database {
    File fs = new File("dato.txt");
    Hashtable<String, ArrayList<String>> direct = new Hashtable<String, ArrayList<String>>();
    public void process() {
        Scanner sc;
        try {
            FileInputStream fl = new FileInputStream(fs);
            sc = new Scanner(fs); 
        } catch (Exception iException) {
            System.out.println("El arvhiovo puede no existir o estar corrupto");
        }
        while (sc.hasNextLine()) {
           String ml = sc.nextLine();
           String sml[] = ml.split("\\s*");
           ArrayList<String> smls = new ArrayList<String>(Arrays.asList(sml));
           smls.remove(1);
            direct.put(sml[1], smls);
        }
        
    }
    public void get(String category) {
        for (String i  : direct.keySet()){
            ArrayList<String> smls = direct.get(i);
            String info = smls.toString();
            Boolean status = smls.contains(this);
            if (status == false) {
                System.out.println("esa no es una categoría real");
            }
            if (status == true) {
                System.out.println(i+"|"+ info);
            }
        }
    }
}
