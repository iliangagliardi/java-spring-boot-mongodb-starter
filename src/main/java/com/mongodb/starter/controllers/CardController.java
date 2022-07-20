package com.mongodb.starter.controllers;


import com.mongodb.starter.models.Card;
import com.mongodb.starter.repositories.CardRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class CardController {

    private final static Logger LOGGER = LoggerFactory.getLogger(CardController.class);
    private final CardRepository cardRepository;


    public CardController(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @GetMapping("card/{id}")
    public ResponseEntity<Card> getCard(@PathVariable String id) {
        Card card = cardRepository.findOne(id);
        if (card == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.ok(card);
    }


    @PostMapping("card")
    @ResponseStatus(HttpStatus.CREATED)
    public Card postCard(@RequestBody Card card) {
        ArrayList<String> cdFs = card.getChiavi().getCdF();
        LOGGER.info("INSERT ", cdFs.toString());
        return cardRepository.save(card);
    }


    @PutMapping("card")
    public Card putCard(@RequestBody Card card) {
        ArrayList<String> cdFs = card.getChiavi().getCdF();
        LOGGER.info("UPDATE ", cdFs.toString());
        return cardRepository.update(card);
    }

}
