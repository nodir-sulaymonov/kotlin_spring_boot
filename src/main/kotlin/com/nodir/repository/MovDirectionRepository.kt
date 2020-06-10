package com.nodir.repository

import com.nodir.model.MovieDirection
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MovDirectionRepository: JpaRepository<MovieDirection, Long> {
}