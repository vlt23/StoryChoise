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
