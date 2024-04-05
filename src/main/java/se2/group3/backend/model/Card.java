package se2.group3.backend.model;
import org.springframework.data.annotation.Id;


public abstract class Card {
    @Id
    protected String id;
    private String name;

    public Card(String name) {
        this.name = name;
    }

    // Getters for name and description
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    // Abstract method to perform the card's action
    public abstract void performAction(Player player);
}


