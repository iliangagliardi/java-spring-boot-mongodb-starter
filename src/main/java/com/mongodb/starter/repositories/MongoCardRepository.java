package com.mongodb.starter.repositories;

import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.FindOneAndReplaceOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.starter.models.Card;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

import static com.mongodb.client.model.Filters.eq;

@Repository
public class MongoCardRepository implements CardRepository {


    private final MongoClient client;
    private MongoCollection<Card> cardCollection;

    public MongoCardRepository(MongoClient mongoClient) {
        this.client = mongoClient;
    }
    @PostConstruct
    void init() {

        cardCollection = client.getDatabase("poste").getCollection("card", Card.class)
                .withWriteConcern(WriteConcern.MAJORITY)
                .withReadConcern(ReadConcern.MAJORITY)
                .withReadPreference(ReadPreference.primaryPreferred());
    }

    @Override
    public Card findOne(String cdf) {
        return cardCollection.find(eq("chiavi.cdF", cdf)).first();
    }

    @Override
    public Card save(Card card) {
        card.setId(new ObjectId());
        cardCollection.insertOne(card);
        return card;
    }

    @Override
    public Card update(Card card) {
        FindOneAndReplaceOptions options = new FindOneAndReplaceOptions().returnDocument(ReturnDocument.AFTER);
        return cardCollection.findOneAndReplace(eq("chiavi.cdF", card.getChiavi().getCdF()), card, options);
    }

}
