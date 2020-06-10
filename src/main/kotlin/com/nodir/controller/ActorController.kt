package com.nodir.controller

import com.nodir.model.Actor
import com.nodir.repository.ActorRepository
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/actor")
class ActorController(private val actorrepo: ActorRepository) {

    @RequestMapping("/")
    fun findAllActors() : Iterable<Actor> = actorrepo.findAll()

    @RequestMapping("/{id}")
    fun findActorById(@PathVariable id:Long) = actorrepo.findById(id)

    @GetMapping("/by_name")
    fun findCarByClient(@RequestParam name: String) =
            actorrepo.findByName(name)
}