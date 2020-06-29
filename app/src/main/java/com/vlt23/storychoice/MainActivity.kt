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

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var questions: List<Question>
    private var currentQuestionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questions = QuestionStore.setupJosephQuestions()
        showQuestion()

        val yesBtn = findViewById<Button>(R.id.yesBtn)
        yesBtn.setOnClickListener {
            yesBtnListener()
        }
        val noBtn = findViewById<Button>(R.id.noBtn)
        noBtn.setOnClickListener {
            noBtnListener()
        }

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        nextBtn.setOnClickListener {
            nextBtnListener()
        }
        val previousBtn = findViewById<Button>(R.id.previousBtn)
        previousBtn.setOnClickListener {
            previousBtnListener()
        }
    }

    private fun yesBtnListener() {
        val currentQuestion: TrueFalse = questions[currentQuestionIndex] as TrueFalse
        if (currentQuestion.isCorrect) {
            correctToast()
        } else {
            failToast()
        }
    }

    private fun noBtnListener() {
        val currentQuestion: TrueFalse = questions[currentQuestionIndex] as TrueFalse
        if (!currentQuestion.isCorrect) {
            correctToast()
        } else {
            failToast()
        }
    }

    private fun nextBtnListener() {
        if (currentQuestionIndex + 1 == questions.size) {
            Toast.makeText(applicationContext, "到底咯！", Toast.LENGTH_LONG).show()
        } else {
            currentQuestionIndex++
            showQuestion()
        }
        invisibleImage()
    }

    private fun previousBtnListener() {
        if (currentQuestionIndex == 0) {
            Toast.makeText(applicationContext, "到最前咯！", Toast.LENGTH_LONG).show()
        } else {
            currentQuestionIndex--
            showQuestion()
        }
        invisibleImage()
    }

    private fun showQuestion() {
        val questionText = findViewById<TextView>(R.id.questionTextView)
        questionText.text = (currentQuestionIndex + 1).toString() + ". " + questions[currentQuestionIndex].text
        val pinYinText = findViewById<TextView>(R.id.questionPinYinTextView)
        pinYinText.text = (currentQuestionIndex + 1).toString() + ". " + questions[currentQuestionIndex].pinyin
    }

    private fun correctToast() {
        val resultImage = findViewById<ImageView>(R.id.resultImage)
        resultImage.visibility = View.VISIBLE
        Toast.makeText(applicationContext, "答对啦！", Toast.LENGTH_LONG).show()
        resultImage.setImageResource(R.drawable.zan)
    }

    private fun failToast() {
        val resultImage = findViewById<ImageView>(R.id.resultImage)
        resultImage.visibility = View.VISIBLE
        Toast.makeText(applicationContext, "Oh! 答错了哟!", Toast.LENGTH_LONG).show()
        resultImage.setImageResource(R.drawable.tom)
    }

    private fun invisibleImage() {
        val resultImage = findViewById<ImageView>(R.id.resultImage)
        resultImage.visibility = View.INVISIBLE
    }
}
