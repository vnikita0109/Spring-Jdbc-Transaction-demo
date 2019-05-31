package com.stackroute.dao;

import com.stackroute.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class MovieDAOImpl implements MovieDAO{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){ this.dataSource=dataSource;}

    public void create(Movie movie) {
        String moviequery="insert into movies values(?,?,?,?)";
        String actorquery="insert into actor values(?,?,?)";

        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);

        jdbcTemplate.update(moviequery,new Object[]{movie.getMovieId(),movie.getMovieName()
                            ,movie.getReleaseYear(),movie.getRatings()});
        System.out.println("One movie added!");

        jdbcTemplate.update(actorquery,new Object[]{movie.getMovieId(),movie.getActor().getActorId(),movie.getActor().getActorName()});
        System.out.println("Actor added for movie!");

    }

}
