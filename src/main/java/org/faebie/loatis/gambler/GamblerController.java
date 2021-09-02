package org.faebie.loatis.gambler;

import org.faebie.loatis.gambler.deck.card.CardList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GamblerController {
    private final CardList cardList;

    public GamblerController(CardList cardList) {
        this.cardList = cardList;
    }

    @RequestMapping(value = "gambler/cardlist")
    public String displayCardList(Model model){
        model.addAttribute(cardList.getCardList());
        return "gambler/cardlist";
    }
}
