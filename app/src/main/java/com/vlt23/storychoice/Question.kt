package com.vlt23.storychoice

open class Question {
    val text: String
    val pinyin: String?

    constructor(text: String) {
        this.text = text
        pinyin = null
    }

    constructor(text: String, pinyin: String?) {
        this.text = text
        this.pinyin = pinyin
    }
}
