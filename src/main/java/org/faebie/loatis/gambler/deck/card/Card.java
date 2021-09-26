package org.faebie.loatis.gambler.deck.card;

public class Card {

    private int id;
    private String name;
    private String descriptionTitle;
    private String description;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescriptionTitle(String descriptionTitle) {
        this.descriptionTitle = descriptionTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescriptionTitle() {
        return this.descriptionTitle;
    }

    public String getDescription() {
        return this.description;
    }
}
