package com.dockertest.actorsservice.repository;

import com.dockertest.actorsservice.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorDatabase extends JpaRepository<Actor, Long> {

    Actor findByFirstName(String firstName);
}
