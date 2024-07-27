package com.puru.NotesCollab.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.List;

@Data
@Document(collection = "User")
@AllArgsConstructor
public class User {

    @Id
    Long id;
    String name;
    String email;
    String password;
    List<Notes> noteBookList;

}

