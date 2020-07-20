package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*


data class User(
    val id:String?,
    val firstName:String?,
    val lastName:String?,
    val avatar:String?,
    val rating:Int=0,
    val respect:Int=0,
    val lastVisit:Date?=null,
    val isOnline:Boolean=false

) {
    constructor(
        id: String,
        firstName: String?,
        lastName: String?
    ) : this(id, firstName, lastName, null)

    constructor(id: String) : this(id, "Nicola", "Petro")

    init {

             println("I'm alive\n" +
                    "${if (firstName === "Nicola") "my name is $firstName $lastName" else "and actually my name is $firstName $lastName"}\n")

        }
    companion object Factory{
        private var lastID=-1
            fun makeUser (fullName:String?):User{
                lastID++
                val (firstName,lastName)=Utils.parseFullName(fullName)
                val initials=Utils.toInitials(firstName,lastName)
                return User("$lastID", firstName, lastName)
        }
    }
    data class Builder(
        var id:String?=null,
        var firstName:String?=null,
        var lastName:String?=null,
        var avatar:String?=null
        ){

        fun id(id: String)=apply { this.id=id }
        fun firstName(firstName: String?)=apply { this.firstName=firstName }
        fun lastName(lastName: String?)=apply { this.lastName=lastName }
        fun avatar(avatar: String?)=apply { this.avatar=avatar }
        fun build()=User(id,firstName, lastName, avatar)
    }
    }

