package com.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class reviewServices {
    @Autowired
    private reviewRepository reviewRepo;
    @Autowired
    private MongoTemplate mongoTemplate;
    public review createReview(String reviewBody, String imdbId)
    {
        review review = new review(reviewBody);
        reviewRepo.insert(review);

        mongoTemplate.update(movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;

    }

}
