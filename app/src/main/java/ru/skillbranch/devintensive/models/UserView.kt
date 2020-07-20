package ru.skillbranch.devintensive.models

class UserView(
    val id:String?,
    val fullName:String,
    val nickName:String,
    val status:String="offline",
    val avatar:String?=null,
    val initials:String?
){
    fun printMe(){
       println("""
        id:$id:
        fullName:$fullName:
        nickName:$nickName:
        status:$status:
        avatar:$avatar:
        initials:$initials:
       """.trimIndent()

       )
    }
}
