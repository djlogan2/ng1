package com.davidlogan.nextgen.springdatatest;

import com.davidlogan.nextgen.springdatatest.jira.Jira;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MongoTest {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoTest(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void getRecords() {
        Query query = Query.query(Criteria.where("id").ne("x"));
        List<Jira> jiras = mongoTemplate.find(query, Jira.class);
        System.out.println("count=" + jiras.size());
    }
}
