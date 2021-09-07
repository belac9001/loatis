package org.faebie.loatis.gambler.deck.card;

public class Card {

    private String name;
    private String descriptionTitle;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescriptionTitle(String descriptionTitle) {
        this.descriptionTitle = descriptionTitle;
    }

    public void setDescription(String description) {
        this.description = description;
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
