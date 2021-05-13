package com.webapp.adidasruntastic.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webapp.adidasruntastic.model.SportsSession;

@Repository
public interface AdidasRuntasticRepository extends MongoRepository<SportsSession, String> {

}
