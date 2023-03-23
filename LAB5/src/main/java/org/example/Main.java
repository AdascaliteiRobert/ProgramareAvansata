package org.example;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        CatalogManager manager = new CatalogManager();

        // Add some documents to the catalog


        Map<String, String> tags2 = new HashMap<>();
        tags2.put("title", "Mafia");
        tags2.put("author", "Robert");
        tags2.put("year", "2023");
        manager.addDocument("2", "Mafia.txt", "Mafia.txt", tags2);

        // Print the catalog
        manager.printCatalog();

        // Save the catalog to a file
        manager.saveCatalog("C:\\Users\\rokuf\\LAB5\\src\\main\\java\\org\\example\\catalog.json");
        // Load the catalog from the file
        manager.loadCatalog("C:\\Users\\rokuf\\LAB5\\src\\main\\java\\org\\example\\catalog.json");

        // Print the catalog again to verify that it was loaded correctly
        manager.printCatalog();
    }
}