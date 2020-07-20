package ru.skillbranch.devintensive.utils

import android.icu.text.Transliterator

object Utils{
    fun parseFullName(fullName:String?):Pair<String?,String?>{
        val parts:List<String>?=fullName?.split(" ")
        val firstName=parts?.getOrNull(0)
        val lastName=parts?.getOrNull(1)
        when(fullName){
            ""->return null to null
            " "->return null to null
            else->return firstName to lastName
        }
    }

    fun transliteration(payload:String, divider:String=" "):String {
        return payload.toCharArray().map{ char-> transChar(char)}.joinToString("").replace(" ",divider)

    }
    fun transChar(char: Char):String=when (char) {
    'А' ->"A"
    'Б' -> "B"
    'В' -> "V"
    'Г' -> "G"
    'Д' -> "D"
    'Е' -> "E"
    'Ё' -> "E"
    'Ж' -> "Zh"
    'З' -> "Z"
    'И' -> "I"
    'Й' -> "I"
    'К' -> "K"
    'Л' -> "L"
    'М' -> "M"
    'Н' -> "N"
    'О' -> "O"
    'П' -> "P"
    'Р' -> "R"
    'С' -> "S"
    'Т' -> "T"
    'У' -> "U"
    'Ф' -> "F"
    'Х' -> "Kh"
    'Ц' -> "C"
    'Ч' -> "Ch"
    'Ш' -> "Sh"
    'Щ' -> "Sch"
    'Ъ' -> "'"
    'Ы' -> "Y"
    'Ъ' -> "'"
    'Э' -> "E"
    'Ю' -> "Yu"
    'Я' -> "Ya"
    'а' -> "a"
    'б' -> "b"
    'в' -> "v"
    'г' -> "g"
    'д' -> "d"
    'е' -> "e"
    'ё' -> "e"
    'ж' -> "zh"
    'з' -> "z"
    'и' -> "i"
    'й' -> "i"
    'к' -> "k"
    'л' -> "l"
    'м' -> "m"
    'н' -> "n"
    'о' -> "o"
    'п' -> "p"
    'р' -> "r"
    'с' -> "s"
    'т' -> "t"
    'у' -> "u"
    'ф' -> "f"
    'х' -> "h"
    'ц' -> "c"
    'ч' -> "ch"
    'ш' -> "sh"
    'щ' -> "sch"
    'ъ' -> "'"
    'ы' -> "y"
    'ъ' -> "'"
    'э' -> "e"
    'ю' -> "yu"
    'я' -> "ya"
        else->char.toString()
}


    fun toInitials(firstName: String?, lastName: String?):String? {
        return "${firstName?.toUpperCase()?.firstOrNull()}${lastName?.toUpperCase()?.firstOrNull()}"
    }
}