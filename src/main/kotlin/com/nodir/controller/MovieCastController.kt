package com.nodir.controller

import com.nodir.model.Actor
import com.nodir.model.MovieCast
import com.nodir.repository.ActorRepository
import com.nodir.repository.MovieCastRepository
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/movie-cast")
class MovieCastController(
        private val movieCastRepo: MovieCastRepository,
        private val actorRepo: ActorRepository
){

    @PostMapping("/")
    fun addCast(@RequestParam part: MovieCast) = movieCastRepo.save(part)

    @GetMapping("/")
    fun findAllCast() : Iterable<MovieCast> = movieCastRepo.findAll()

    @PostMapping("/actor")
    fun addMovieCast(@RequestParam actorCast: Actor) = actorRepo.save(actorCast)

    @GetMapping("/actors")
    fun findAllActors() : Iterable<Actor> = actorRepo.findAll()


    @GetMapping("/by_role")
    fun findRoleByCast(@RequestParam number: String) = movieCastRepo.findByRole(number)
}
