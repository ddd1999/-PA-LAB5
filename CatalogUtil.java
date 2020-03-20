/**
 * This class is responsible with external operations regarding the catalog.
 * It contains:
 * - the "save" method, which saves the catalog to an external file, using object serialization.
 * - the "load" method, which loads the catalog from an external file.
 * - the "view" method, which opens a document using the native operating system application.
 *
 */

package lab5;

import java.awt.*;
import java.io.*;

public class CatalogUtil {
    public static void save(Catalog catalog)
            throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }
    public static Catalog load(String path)
            throws InvalidCatalogException {
            Catalog catalogs = new Catalog("Java Resources", "d:/java/catalog.ser");
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("catalog.ser"))) {
               catalogs = (Catalog) ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("Error loading the documents.");
            } catch (IOException e) {
                System.out.println("Error reading file.");
            } catch (ClassNotFoundException e) {
                System.out.println("Error loading catalogs.");
                e.printStackTrace();
            }
            return catalogs;
    }
    public static void view(Document doc) {
        Desktop desktop = Desktop.getDesktop();
        //… browse or open, depending of the location type
    }

}
