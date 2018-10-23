package com.vojtechruzicka.springfoxexample.repositories;

import com.vojtechruzicka.springfoxexample.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}
