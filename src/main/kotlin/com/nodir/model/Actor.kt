package com.nodir.model

import javax.persistence.*

@Entity
@Table(name = "actor")

data class Actor(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var act_id: Long = 0,

    var act_fname: String = "",
    var act_lname: String = "",
    var act_gender: String = ""

)




