package com.nodir.repository

import com.nodir.model.Actor
import com.nodir.model.Director
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface DirectorRepository: JpaRepository<Director, Long> {
    fun findByName(name: String) : Director
}
