package com.mongodb.starter.repositories;

import com.mongodb.starter.models.Card;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository {
    Card save(Card card);
    Card findOne(String cdf);
    Card  update(Card card);
}
