package dgu.app.utils

import dgu.app.R
import dgu.app.model.Main
import dgu.app.model.Havola

fun getMainList() = arrayListOf(
    Main(0, R.drawable.lab, "Ma'ruzalar", "file"),
    Main(0, R.drawable.taqdimot, "Taqdimotlar", "lide"),
    Main(0, R.drawable.glossary, "Amaliy mavzular", "fayl"),
    Main(0, R.drawable.questions, "Laboratoriya ishlari", "llll"),
    Main(0, R.drawable.quiz, "O'z-o'zini baxolash", "quiz"),
    Main(0, R.drawable.calculator, "Interfaol xizmatlar", "calc"),
    Main(0, R.drawable.youtube, "Video darslar", "url"),
    Main(0, R.drawable.web, "Kerakli sahifalar", "web"),
    Main(0, R.drawable.savol, "Nazorat savollari", "avol"),
    Main(0, R.drawable.about, "Mualliflar", "author"),
)

fun getUrlList(key: String) = when (key) {
    "url" -> arrayListOf(
        Havola(0,"Korxonalarda elektron raqamli imzodan foydalanishni o'rganish", "https://youtu.be/A3vOryUmT5Q "),
        Havola(0,"Xalq banki hisobotini taqdim qilish 1 qism", "https://youtu.be/OjAqz-C_Xr8"),
        Havola(0,"Xalq banki hisobotini taqdim qilish 2 qism", "https://youtu.be/nPrZPjIBh5E"),
        Havola(0,"Xalq banki hisobotini taqdim qilish 3 qism", "https://youtu.be/JKqX7ruIE0A"),
        Havola(0,"Elektron soliq xizmatlari", "https://youtu.be/ZsYkrdZDHxs"),
        Havola(0,"Intraktiv xizmatlardan foydalanish 1 qism", "https://youtu.be/DuiLsqgA48s"),
        Havola(0,"Intraktiv xizmatlardan foydalanish 2 qism", "https://youtu.be/8_XpGBmdTaM"),
        Havola(0,"Intraktiv xizmatlardan foydalanish 3 qism", "https://youtu.be/d0GSxXHtgt0"),
        Havola(0,"Intraktiv xizmatlardan foydalanish 4 qism", "https://youtu.be/zOPGuMmb6ro"),
    )
    "calc" -> arrayListOf(
        Havola(0,"Aylanmadan soliq", "one"),
        Havola(0,"Yangi aylanmadan soliq", "two"),
        Havola(0,"Daromad solig'i", "three"),
        Havola(0,"Yangi daromad solig'i", "four"),
    )
    else -> arrayListOf(
        Havola(0,"my.gov.uz", "https://my.gov.uz/oz"),
        Havola(0,"soliq.uz", "https://soliq.uz/"),
        Havola(0,"ziyonet.uz - Axborot  ta’lim  portali ", "http://ziyonet.uz/uz "),
        Havola(0,"my soliq.uz  -    Soliq organlarining elektron davlat xizmatlari portali ", "https://my.soliq.uz"),
        Havola(0,"lex.uz - O’zbekiston respublikasi qonunchilik ma’lumotlari milliy bazasi ", "https://lex.uz/uz/"),
        Havola(0,"norma.uz - Axborot – huquqiy portal", "https://www.norma.uz/uz/"),
        Havola(0,"stat.uz -  Davlat statistika qo’mitasi", "https://www.stat.uz/uz/"),
        Havola(0,"bank.uz - O'zbekiston Respublikasi moliya bozorini", "https://bank.uz/"),
        Havola(0,"qmii.uz - Qarshi muhandislik-iqtisodiyot instituti veb sayti", "https://www.qmii.uz/uz"),
        Havola(0,"Iqtisodiyotda AKT - Iqtisodiyotda axborot-kommunikatsion texnologiyalar fanidan rasmiy telegram kanal", "https://t.me/IAKT_0228"),
    )
}
