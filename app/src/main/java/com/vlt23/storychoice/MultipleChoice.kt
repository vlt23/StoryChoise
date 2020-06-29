/*
 * Copyright (C) 2020 vlt23
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

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
