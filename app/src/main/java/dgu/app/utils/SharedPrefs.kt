package dgu.app.utils

import android.content.Context
import android.content.SharedPreferences

@Suppress("UNCHECKED_CAST")
class SharedPrefs(context: Context) {

    companion object {
        private const val PREF = "MyAppPrefName"
        const val ANSWER_ID = "ANSWER_ID:"
        const val ANSWER_TEXT = "ANSWER_TEXT:"
    }

    private val sharedPref: SharedPreferences = context.getSharedPreferences(PREF, Context.MODE_PRIVATE)

    fun addAnswerText(id: Int, answer: String) = put("$ANSWER_TEXT$id", answer)
    fun getAnswerText(id: Int) = get("$ANSWER_TEXT$id", String::class.java)

    fun addAnswer(id: Int, answer: Int) = put("$ANSWER_ID$id", answer)
    fun getAnswer(id: Int) = get("$ANSWER_ID$id", Int::class.java)

    fun getAllAnswer(size: Int): MutableList<Int> {
        val answerList: MutableList<Int> = mutableListOf()
        for (i in 0 until size) answerList.add(getAnswer(i))
        return answerList
    }

    fun removeAllAnswer(size: Int) {
        for (i in 0 until size) {
            addAnswer(i, -1)
            addAnswerText(i, "")
        }
    }

    private fun <T> get(key: String, clazz: Class<T>): T = when (clazz) {
        String::class.java -> sharedPref.getString(key, "")
        Boolean::class.java -> sharedPref.getBoolean(key, false)
        Float::class.java -> sharedPref.getFloat(key, -1f)
        Double::class.java -> sharedPref.getFloat(key, -1f)
        Int::class.java -> sharedPref.getInt(key, -1)
        Long::class.java -> sharedPref.getLong(key, -1L)
        else -> null
    } as T

    private fun <T> put(key: String, data: T) {
        val editor = sharedPref.edit()
        when (data) {
            is String -> editor.putString(key, data)
            is Boolean -> editor.putBoolean(key, data)
            is Float -> editor.putFloat(key, data)
            is Double -> editor.putFloat(key, data.toFloat())
            is Int -> editor.putInt(key, data)
            is Long -> editor.putLong(key, data)
        }
        editor.apply()
    }

    fun clearAll() = sharedPref.edit().clear().commit()

}
