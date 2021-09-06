package org.faebie.loatis.gambler;

import org.faebie.loatis.gambler.deck.card.CardList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GamblerController {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final CardList cardList;

    public GamblerController(CardList cardList) {
        this.cardList = cardList;
    }

    @RequestMapping(value = "gambler/cardlist", method = RequestMethod.GET)
    public String displayCardList(Model model,
                                  @RequestParam(value="cardName", required=false) String cardName){
        String cardDescription;

        if(cardName == null)
            cardDescription = "";
        else
            cardDescription = cardList.getCard(cardName).getDescription();

        model.addAttribute("cardDesc", cardDescription);
        model.addAttribute("cardList", cardList.getCardList());
        return "gambler/cardlist";
    }
}
