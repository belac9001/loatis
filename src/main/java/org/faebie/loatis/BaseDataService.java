package org.faebie.loatis;

import org.faebie.loatis.gambler.service.CardListService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Loads initial data on application start
 */
@Service
public class BaseDataService {
    private static final Logger log = LoggerFactory.getLogger(BaseDataService.class);
    private final CardListService cardList;

    public BaseDataService(CardListService cardList) {
        this.cardList = cardList;
    }

    void createDefaultData(){
        log.info("Creating default data...");
        cardList.createCardList();
    }
}
