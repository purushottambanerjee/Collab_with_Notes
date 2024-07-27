package com.puru.NotesCollab.Model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserInterface extends MongoRepository<User,Long> {

}
