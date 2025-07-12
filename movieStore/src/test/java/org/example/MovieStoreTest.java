package org.example;

import org.example.model.Movie;
import org.example.model.MovieStore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class MovieStoreTest {
    @Test
    public void returnsNoResultsWhenNoTitlesPartiallyMatchSearch() throws Exception {
        //Arrange
        MovieStore movieStore = new MovieStore();
        //Act
        List<Movie> results = movieStore.findByPartialTitle("abc");
        //Assert
        assertThat(results.size(), is(0));
    }

}