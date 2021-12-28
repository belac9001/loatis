package org.faebie.loatis.gambler.service;

import org.faebie.loatis.gambler.model.Deck;
import org.springframework.stereotype.Component;

@Component
public class DeckCreateService {
    private Deck deck;
    private final CardListService cardList;

    public DeckCreateService(CardListService cardList) {
        this.cardList = cardList;
        this.deck = new Deck();
    }
}


// to create deck you need:
// Deck
// Deck is a List of Cards