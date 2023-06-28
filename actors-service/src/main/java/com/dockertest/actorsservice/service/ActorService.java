package com.dockertest.actorsservice.service;

import com.dockertest.actorsservice.entity.Actor;
import com.dockertest.actorsservice.repository.ActorDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    @Autowired
    private ActorDatabase actorDatabase;

    public Actor saveActor(Actor actor) {
        return actorDatabase.save(actor);
    }

    public Actor getActor(String firstName) {
        return actorDatabase.findByFirstName(firstName);
    }
}
