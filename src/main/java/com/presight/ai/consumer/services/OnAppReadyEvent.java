package com.presight.ai.consumer.services;

import com.presight.ai.consumer.entities.Movie;
import com.presight.ai.consumer.entities.Person;
import com.presight.ai.consumer.entities.Role;
import com.presight.ai.consumer.repositories.MovieRepository;
import com.presight.ai.consumer.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


@Component
public class OnAppReadyEvent implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private PersonRepository personRepository;


    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
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
