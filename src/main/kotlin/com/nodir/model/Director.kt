package com.nodir.model//package com.nodir.model

import javax.persistence.*

@Entity
@Table(name = "director")

data class Director(

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var act_id: Long = 0,
        var dir_fname: String = "",
        var dir_lname: String = ""
)

