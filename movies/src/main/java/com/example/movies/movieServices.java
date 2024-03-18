package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class movieServices {

    // instanciate the movieInDB
    @Autowired // it intanciates the repository!!
    private movieRepository movieDatabase;

    public List<movie> allMovies()
    {
        return movieDatabase.findAll();
    }
//    public Optional<movie> getMovieWithId(ObjectId id)
//    {
//        return movieDatabase.findById(id);
//    }

    public Optional<movie> getMovieWithIMDBId(String IMDBId)
    {
        return movieDatabase.findMovieByimdbId(IMDBId);
    }


}
