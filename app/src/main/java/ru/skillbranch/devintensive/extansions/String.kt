package ru.skillbranch.devintensive.extansions


fun String.truncate(truncValue:Int):String?{
       val result=this.chunked(truncValue)
        return "${result?.first()}..."
}
fun String.stripHtml():String?=
    replace(Regex(pattern = "(<.+?>)|(&((\\w+)|(#\\w+));)"), "")
    .replace(Regex(pattern =" {2,}" )," ")


