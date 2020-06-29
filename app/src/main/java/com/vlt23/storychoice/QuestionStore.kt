package com.vlt23.storychoice

object QuestionStore {
    fun setupJosephQuestions(): List<Question> {
        val questions: MutableList<Question> = ArrayList()
        questions.add(TrueFalse("约瑟有11个哥哥",
                "yue se you 11 ge ge ge", false))
        questions.add(TrueFalse("约瑟的爸爸送给约瑟50块钱",
                "yue se de ba ba song gei yue se 50 kuai qian", false))
        questions.add(TrueFalse("约瑟被哥哥们扔到井坑里，死了吗？",
                "yue se bei ge ge men reng dao jin li, si le ma?", false))
        questions.add(TrueFalse("他们遇到了一些人，约瑟被他们买走了吗？",
                "ta men yu dao le yi xie ren, yue se bei ta men mai zou le ma?", true))
        questions.add(TrueFalse("约瑟到了埃及之后， 饿死了吗？",
                "yue se dao le ai ji zhi hou, e si le ma?", false))
        return questions
    }
}
