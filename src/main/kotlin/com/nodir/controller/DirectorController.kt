package com.nodir.controller

import com.nodir.model.Director
import com.nodir.repository.DirectorRepository
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/api/director")
class DirectorController(private val directorepo: DirectorRepository) {

    @RequestMapping("/")
    fun findAllDirectors() : Iterable<Director> = directorepo.findAll()

    @RequestMapping("/{id}")
    fun findDirectorById(@PathVariable id:Long) = directorepo.findById(id)

    @GetMapping("/by_name")
    fun findDirectorByName(@RequestParam name: String) =
            directorepo.findByName(name)
}