package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extansions.humanizeDiff
import java.util.*

class ImageMessage
    (
     id:String?,
     from:User?,
     chat: Chat,
     isIncoming:Boolean=false,
     date: Date,
     var image:String?
):BaseMessage(id,from,chat,isIncoming,date ){
   override fun formatMessage():String="id=$id ${from?.firstName}" +
             " ${if (isIncomig) "получил" else "отправил"} изображение \"$image\" ${date.humanizeDiff()}"
}