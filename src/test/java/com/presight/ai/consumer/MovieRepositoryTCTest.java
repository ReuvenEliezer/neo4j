package com.presight.ai.consumer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

import com.presight.ai.consumer.entities.*;
import com.presight.ai.consumer.repositories.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@DataNeo4jTest
//@SpringBootTest
@RunWith(SpringRunner.class)
public class MovieRepositoryTCTest {


    @Autowired
    private PersonRepository personRepository;


    @Autowired
    private MovieRepository movieRepository;


    @Test
    public void shouldSaveAndReadEntities() {

        Movie movie = new Movie();
        movie.setTitle("The Italian Job");
        movie.setReleased(1999);
        movieRepository.save(movie);

        Person mark = new Person();
        mark.setName("Mark Wahlberg");
        personRepository.save(mark);

        Role charlie = new Role();
        charlie.setMovie(movie);
        charlie.setPerson(mark);
        Collection<String> roleNames = new HashSet();
        roleNames.add("Charlie Croker");
        charlie.setRoles(roleNames);
        List<Role> roles = new ArrayList();
        roles.add(charlie);
        movie.setRoles(roles);
        movieRepository.save(movie);
    }

}