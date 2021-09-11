package com.presight.ai.consumer.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.voodoodyne.jackson.jsog.JSOGGenerator;
import lombok.*;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity("Person")
//@JsonIdentityInfo(generator = JSOGGenerator.class)
public class Person extends BaseEntity {

    private String name;
    private int born;

    @Relationship(type = "ACTED_IN")
    private List<Movie> movies;

}