package com.presight.ai.consumer.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

@Data
public abstract class BaseEntity implements AbstractEntity {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private Long id;

}

