package com.vlt23.storychoice

class TrueFalse : Question {
    val isCorrect: Boolean

    constructor(text: String, pinyin: String?, isCorrect: Boolean):
            super(text, pinyin) {
        this.isCorrect = isCorrect
    }
}
