package com.stackroute.main;

import com.stackroute.model.Actor;
import com.stackroute.model.Movie;
import com.stackroute.services.MovieManager;
import com.stackroute.services.MovieManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
            "spring.xml");

        MovieManager customerManager = (MovieManagerImpl) ctx.getBean("movieManager");

        Movie movie = createDummyMovie();
        customerManager.createMovie(movie);

        ctx.close();
    }

    private static Movie createDummyMovie() {
        Movie movie = new Movie();
        movie.setMovieId(3);
        movie.setMovieName("Suddenly seventeen");
        movie.setReleaseYear(2012);
        movie.setRatings(7);
        Actor actor = new Actor();
        actor.setActorId(3);
        actor.setActorName("Zhen Xu");
        movie.setActor(actor);
        return movie;
    }
}
