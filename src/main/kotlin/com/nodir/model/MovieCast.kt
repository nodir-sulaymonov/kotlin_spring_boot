package com.nodir.model

import javax.persistence.*


@Entity
@Table (name = "movie_cast")

data class MovieCast(

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "act_id", referencedColumnName = "actor_id")
    var act_id: Actor? = null,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var mov_id: Long = 0,

    var role: String

)