package com.example.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "reviews")
@NoArgsConstructor
@AllArgsConstructor
public class review {
    @Id
    private ObjectId id;
    private String body;

    public review(String body) {
        this.body = body;
    }
}
