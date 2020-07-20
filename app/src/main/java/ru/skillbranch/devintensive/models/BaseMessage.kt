package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage (
    val id: String?,
    val from:User?,
    val chat:Chat,
    val isIncomig:Boolean=false,
    val date: Date=Date()
)
{
    companion object AbstractFactory{
        var lastId=-1
        fun makeMessage(from: User?, chat: Chat,date: Date, type:String="text", payload:Any?):BaseMessage{
            lastId++
            return when(type){
                "image"->ImageMessage("$lastId", from, chat, false, date, image = payload as String?)
                    else->TextMessage("$lastId", from, chat, false, date,text = payload as String?)
            }
        }
    }

    abstract fun formatMessage(): String
}