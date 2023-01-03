package dgu.app.utils

import dgu.app.R
import dgu.app.model.Havola
import dgu.app.model.Main

fun getMainList() = arrayListOf(
    Main(0, R.drawable.docs, "Taqdimotlar", "lide"),
    Main(0, R.drawable.documents, "Adabiyotlar", "amal"),
    Main(0, R.drawable.lab, "Ma'ruzalar matni", "fayl01 "),
    Main(0, R.drawable.taqdimot, "Amaliy mashg'ulotlar", "fayl02 "),
    Main(0, R.drawable.doc, "Laboratoriya ishlari", "fayl03 "),
    Main(0, R.drawable.doces, "Biokimyo fani", "fayl04 "),
    Main(0, R.drawable.glossary, "Fan dasturi", "fayl05 "),
    Main(0, R.drawable.savol, "Tarqatma materiallar", "fayl06 "),
    Main(0, R.drawable.questions, "Nazorat savollari", "fayl07 "),
    Main(0, R.drawable.about, "Mualliflar haqida", "fayl08 "),
//    Main(0, R.drawable.quiz, "TDA  ishchi", "fayl03 "),
//    Main(0, R.drawable.calculator, "TDA laboratoriya ishini bajarish buyicha Uslubiy  ko'rsatma", "fayl04 "),
)

fun getUrlList(key: String) = when (key) {
    "url" -> arrayListOf(
        Havola(0, "Korxonalarda elektron raqamli imzodan foydalanishni o'rganish", "https://youtu.be/A3vOryUmT5Q "),
        Havola(0, "Xalq banki hisobotini taqdim qilish 1 qism", "https://youtu.be/OjAqz-C_Xr8"),
        Havola(0, "Xalq banki hisobotini taqdim qilish 2 qism", "https://youtu.be/nPrZPjIBh5E"),
        Havola(0, "Xalq banki hisobotini taqdim qilish 3 qism", "https://youtu.be/JKqX7ruIE0A"),
        Havola(0, "Elektron soliq xizmatlari", "https://youtu.be/ZsYkrdZDHxs"),
        Havola(0, "Intraktiv xizmatlardan foydalanish 1 qism", "https://youtu.be/DuiLsqgA48s"),
        Havola(0, "Intraktiv xizmatlardan foydalanish 2 qism", "https://youtu.be/8_XpGBmdTaM"),
        Havola(0, "Intraktiv xizmatlardan foydalanish 3 qism", "https://youtu.be/d0GSxXHtgt0"),
        Havola(0, "Intraktiv xizmatlardan foydalanish 4 qism", "https://youtu.be/zOPGuMmb6ro"),
    )
    "video" -> arrayListOf(
        Havola(0, "Daromad solig'i", "three"),
        Havola(0, "Yangi daromad solig'i", "four"),
    )
    else -> arrayListOf(
        Havola(0, "my.gov.uz", "https://my.gov.uz/oz"),
        Havola(0, "soliq.uz", "https://soliq.uz/"),
        Havola(0, "ziyonet.uz - Axborot  ta’lim  portali ", "http://ziyonet.uz/uz "),
        Havola(0, "my soliq.uz  -    Soliq organlarining elektron davlat xizmatlari portali ", "https://my.soliq.uz"),
        Havola(0, "lex.uz - O’zbekiston respublikasi qonunchilik ma’lumotlari milliy bazasi ", "https://lex.uz/uz/"),
        Havola(0, "norma.uz - Axborot – huquqiy portal", "https://www.norma.uz/uz/"),
        Havola(0, "stat.uz -  Davlat statistika qo’mitasi", "https://www.stat.uz/uz/"),
        Havola(0, "bank.uz - O'zbekiston Respublikasi moliya bozorini", "https://bank.uz/"),
        Havola(0, "qmii.uz - Qarshi muhandislik-iqtisodiyot instituti veb sayti", "https://www.qmii.uz/uz"),
        Havola(0, "Iqtisodiyotda AKT - Iqtisodiyotda axborot-kommunikatsion texnologiyalar fanidan rasmiy telegram kanal", "https://t.me/IAKT_0228"),
    )
}
