package com.presight.ai.consumer.repositories;

import com.presight.ai.consumer.entities.Movie;
//import org.neo4j.driver.internal.shaded.reactor.core.publisher.Mono;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
//    Movie findByTitle(@Param("title") String title);

//    @Query("MATCH (m:Movie) WHERE m.title =~ ('(?i).*'+{title}+'.*') RETURN m")
//    Collection<Movie> findByTitleContaining(@Param("title") String title);
//
//    @Query("MATCH (m:Movie)<-[:ACTED_IN]-(a:Person) RETURN m.title as movie, collect(a.name) as cast LIMIT {limit}")
//    List<Map<String, Object>> graph(@Param("limit") int limit);
}
