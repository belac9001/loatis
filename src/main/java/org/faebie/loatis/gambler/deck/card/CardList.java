package org.faebie.loatis.gambler.deck.card;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Creates the total card list available to the Gambler class
 * Gambler: homebrewery.naturalcrit.com/share/KnMvKFBluQqY
 */
@Component
public class CardList {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private final File CARD_LIST_FILE;
    private List<Card> cardList;

    public CardList(@Value("${cardlist.location}") String cardListPath) {
        this.CARD_LIST_FILE = new File(cardListPath);
    }

    public void createCardList() {
        log.info("Reading from {}...", CARD_LIST_FILE.getPath());
        try {
            this.cardList = OBJECT_MAPPER.readValue(CARD_LIST_FILE, new TypeReference<List<Card>>(){});
        } catch (IOException ex) {
            log.error("Failed to read JSON: {}", ex);
        }
    }

    public List<Card> getCardList() {
        return this.cardList;
    }

    public Card getCardByName(String cardName) {
        for(Card card : this.cardList) {
            if(card.getName().equals(cardName))
                return card;
        }

        return null;
    }
}
