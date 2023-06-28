package com.dockertest.actorsservice.controller;

import com.dockertest.actorsservice.entity.Actor;
import com.dockertest.actorsservice.service.ActorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @PostMapping("/")
    public Actor saveActor(@RequestBody Actor actor){
        return actorService.saveActor(actor);
    }

    @GetMapping("/{firstName}")
    public Actor getActor(@PathVariable String firstName){
        return actorService.getActor(firstName);
    }
}
