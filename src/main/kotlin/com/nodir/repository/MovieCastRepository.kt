package com.nodir.repository

import com.nodir.model.MovieCast
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface MovieCastRepository: JpaRepository<MovieCast, Long>{
    fun findByRole(number: String) : Optional<MovieCast>
}
