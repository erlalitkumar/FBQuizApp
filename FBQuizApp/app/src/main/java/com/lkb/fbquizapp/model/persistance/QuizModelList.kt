package com.lkb.fbquizapp.model.persistance

object QuizModelList {
    class QuizModel : ArrayList<Quiz>()
    data class Quiz(
        val answer: String,
        val options: List<String>,
        val question: String
    )
}
