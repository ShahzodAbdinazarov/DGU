package dgu.app.quiz

import com.google.gson.annotations.SerializedName

data class Quiz(
    @SerializedName("question")
    val question: String,
    @SerializedName("answers")
    val answers: List<String>
)
