package org.faebie.loatis.gambler.model;

import java.util.List;

public class Deck {
    private List<Card> deck;

    public void addCard(Card card) {
        this.deck.add(card);
    }

    public void removeCardByName(String cardName) {
        this.deck.removeIf((Card card) -> card.getName().equals(cardName));
    }

    public List<Card> getDeck() {
        return this.deck;
    }
}
