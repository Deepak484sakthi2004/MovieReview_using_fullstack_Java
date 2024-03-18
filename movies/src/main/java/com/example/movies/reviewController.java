package com.example.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/dummy/review")
public class reviewController {

    @Autowired
    private reviewServices reviewServices;

    @PostMapping
    public ResponseEntity<review> createReview(@RequestBody Map<String,String> payload)
    {
        return new ResponseEntity<review>(reviewServices.createReview(payload.get("reviewBody"),payload.get("imdbId")), HttpStatus.OK);
    }
}
