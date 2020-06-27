package com.vlt23.storychoice

class Question {
    val text: String
    val pinyin: String?
    val isCorrect: Boolean

    constructor(text: String, isCorrect: Boolean) {
        this.text = text
        this.isCorrect = isCorrect
        pinyin = null
    }

    constructor(text: String, pinyin: String?, isCorrect: Boolean) {
        this.text = text
        this.pinyin = pinyin
        this.isCorrect = isCorrect
    }

}