package com.presight.ai.consumer.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.voodoodyne.jackson.jsog.JSOGGenerator;
import lombok.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.Collection;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "ACTED_IN")
//@JsonIdentityInfo(generator = JSOGGenerator.class)
public class Role extends BaseEntity {

    private Collection<String> roles;
    @StartNode
    private Person person;
    @EndNode
    private Movie movie;

}