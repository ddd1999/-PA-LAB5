/**
 * This class contains details about the documents: the id, name and their exact location.
 * We can add a tag to the documents. Tags are pairs name-value.
 * Example of tags may be title, author, year, publishingDate, etc.
 */
package lab5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location; //file name or Web page

    public Document(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    private Map<String, Object> tags = new HashMap<>();

    public void addTag (String key, Object obj) {
        tags.put(key, obj);
    }

    /**
     * Adauga tagul de forma nume-valoare.
     */

    public Object getId() {
        return id;
    }
    /**
     * Returneaza ID-ul unic.
     */

}
