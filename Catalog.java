/**
 * This class manages a list of documents:
 * Documents can be added to the catalog.
 * Documents can be found by their Ids.
 * Catalog has a name and a path, which is the external location where the catalog can be found and loaded from.
 */
package lab5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>();

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public void add(Document doc) {
        documents.add(doc);
    }

    /**
     * Adauga un document in lista.
     */

    public Document findById(String id) {
        for (Document doc : documents) {
            if (doc.getId().equals(id)) {
                return doc;
            }
        }
        return null;
    }

    /**
     * Implementare metoda de cautare dupa ID.
     * Parcurge lista de documente si daca gaseste documentul cu ID-ul specificat, il returneaza.
     * Daca nu se gaseste niciun document conform criteriului de cautare, returneaza pointerul null.
     */

    public String getPath() {
        return path;
    }
    /**
     * Returneaza path-ul documentului.
     */
    public String getName() {
        return name;
    }
    /**
     * Returneaza numele documentului.
     */



}
