package com.vlt23.storychoice

class MultipleChoice : Question {
    val choices: List<String>
    val answer: String

    constructor(text: String, pinyin: String, choices: List<String>, answer: String) :
            super(text, pinyin) {
        this.choices = choices
        this.answer = answer
    }
}
