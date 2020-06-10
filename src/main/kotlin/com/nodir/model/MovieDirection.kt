package com.nodir.model

import javax.persistence.*

@Entity
@Table(name = "movie_direction")

data class MovieDirection(
        @Id
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "dir_id", referencedColumnName = "dir_id")
        var dir_id: Director? = null,

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "mov_id", referencedColumnName = "mov_id")
        var mov_id: MovieCast? = null

)