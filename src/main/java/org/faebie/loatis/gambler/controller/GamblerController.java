package org.faebie.loatis.gambler.controller;

import org.faebie.loatis.gambler.service.BaseCardListService;
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
    private final BaseCardListService cardList;

    public GamblerController(BaseCardListService cardList) {
        this.cardList = cardList;
    }

    @RequestMapping(value = "gambler/cardlist", method = RequestMethod.GET)
    public String displayCardList(Model model,
                                  @RequestParam(value="cardName", required=false) String cardName){

        model.addAttribute("currentCard", cardList.getCardByName(cardName));
        model.addAttribute("cardList", cardList);
        return "gambler/cardlist";
    }
}
