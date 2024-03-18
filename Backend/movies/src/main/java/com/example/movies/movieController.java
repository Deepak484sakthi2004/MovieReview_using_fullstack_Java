package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dummy/movies")
public class movieController {

    @Autowired
    private movieServices movieService ;

    @GetMapping
    public ResponseEntity<List<movie>> allMovies(){
    return new ResponseEntity<List<movie>>(movieService.allMovies(), HttpStatus.OK);
}

//    @GetMapping("/{id}")
//        public ResponseEntity<Optional<movie>> getMovieById(@PathVariable ObjectId id) {
//        return new ResponseEntity<Optional<movie>>(movieService.getMovieWithId(id), HttpStatus.OK);
//    }

    @GetMapping("/{IMDBId}")
    public ResponseEntity<Optional<movie>> getMovieByIMDBId(@PathVariable String IMDBId){

        return new ResponseEntity<Optional<movie>>(movieService.getMovieWithIMDBId(IMDBId), HttpStatus.OK);
    }
}
