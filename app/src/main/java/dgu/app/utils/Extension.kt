package dgu.app.utils

import android.app.Activity
import dgu.app.R
import dgu.app.model.Havola
import dgu.app.model.Main
import dgu.app.quiz.DBHelper
import dgu.app.quiz.Quiz

fun getMainList() = arrayListOf(
    Main(0, R.drawable.lab, "Ma'ruzalar", "fayl01 "),
    Main(1, R.drawable.taqdimot, "Adabiyotlar", "fayl02 "),
    Main(2, R.drawable.quiz, "O'z o'zini baxolash", "quiz"),
    Main(3, R.drawable.youtube, "Video darslar", "url"),
    Main(4, R.drawable.glossary, "Dastur haqida", "fayl03 "),
    Main(5, R.drawable.about, "Muallif haqida", "fayl04 "),
//    Main(0, R.drawable.questions, "Amaliy mashg'ulotlar", "amal"),
//    Main(0, R.drawable.savol, "Nazorat savollari", "fayl04 "),
//    Main(0, R.drawable.calculator, "Adabiyotlar", "fayl06 "),
//    Main(0, R.drawable.web, "Kerakli sahifalar", "web"),
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
    "calc" -> arrayListOf(
        Havola(0, "Aylanmadan soliq", "one"),
        Havola(0, "Yangi aylanmadan soliq", "two"),
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

fun Activity.setDatas() {
    val question= Array(111) { "" }
    val answerA = Array(111) { "" }
    val answerB = Array(111) { "" }
    val answerC = Array(111) { "" }
    val answerD = Array(111) { "" }

    //* * * * * 1* * * * * // 
    question[1] = "C++ tilida qandaydir butun x sonining absolyut qilymati qaysi funksiya yordamida aniqlanadi"
    answerA[1] = "abs(x)"
    answerB[1] = "fabs(x)"
    answerC[1] = "exp(x)"
    answerD[1] = "ceil(x)"

//* * * * * 2* * * * * // 
    question[2] = "C++ tilida izohlarning necha turi mavjud"
    answerA[2] = "2"
    answerB[2] = "5"
    answerC[2] = "3"
    answerD[2] = "1"

//* * * * * 3* * * * * // 
    question[3] = "... funksiya  xar xil turdagi berilganlar ustida  bir xil algoritmni ishlatishga imkoniyat beradi"
    answerA[3] = "Qayta yuklanuvchi"
    answerB[3] = "Qolipli"
    answerC[3] = "O‘zgaruvchi sonli parametrli"
    answerD[3] = "Rekursiv"

//* * * * * 4* * * * * // 
    question[4] = "|X|  C++  da  haqiqiy  sonlar  uchun  qanday  yoziladi"
    answerA[4] = "fabs(x)"
    answerB[4] = "abs(x)"
    answerC[4] = "labs(x)"
    answerD[4] = "absf(x)"

//* * * * * 5* * * * * // 
    question[5] = "12<<2 bajarilishi natijasida qanday qiymat hosil bo’ladi"
    answerA[5] = "48"
    answerB[5] = "10"
    answerC[5] = "58"
    answerD[5] = "14"

//* * * * * 6* * * * * // 
    question[6] = "10  darajasi  x  C++  da  qanday  yoziladi."
    answerA[6] = "pow(10,x)"
    answerB[6] = "pow2(10,x)"
    answerC[6] = "pow(x,10)"
    answerD[6] = "10^x"

//* * * * * 7* * * * * // 
    question[7] = "Ma’lumotlarni ekranga chiqarish formatini ko’rsating."
    answerA[7] = "cout<< <ifoda>;"
    answerB[7] = "cin>> <ifoda>;"
    answerC[7] = "void <ifoda>;"
    answerD[7] = "if<ifoda>"

//* * * * * 8* * * * * // 
    question[8] = "Ma’lumotlarni o’qish formatini ko’rsating. "
    answerA[8] = "cin>> <ifoda>;"
    answerB[8] = "cout<< <ifoda>;"
    answerC[8] = "void <ifoda>;"
    answerD[8] = "if<ifoda>"

//* * * * * 9* * * * * // 
    question[9] = "Til ko’rsatmasi nima"
    answerA[9] = "‘;’ belgi bilan tugaydigan ifoda"
    answerB[9] = "belgi bilan bosh-lanuvchi ifoda"
    answerC[9] = "til alifbosi"
    answerD[9] = "kalit so`z"

//* * * * * 10* * * * * // 
    question[10] = "12<<3 bajarilishi natijasida qanday qiymat hosil bo’ladi"
    answerA[10] = "96"
    answerB[10] = "20"
    answerC[10] = "68"
    answerD[10] = "34"

//* * * * * 11* * * * * // 
    question[11] = "32 razryadli platformada int turidagi o’zgaruvchining qiymat chegarasini ko’rsating"
    answerA[11] = "-2147483648.. 2147483647"
    answerB[11] = "-32768.. 32767"
    answerC[11] = "-2147483647.. 2147483648"
    answerD[11] = "0..65535"

//* * * * * 12* * * * * // 
    question[12] = "Adreslanuvchi eng kichik ma’lumot birligi..."
    answerA[12] = "bayt"
    answerB[12] = "kilobayt"
    answerC[12] = "bit"
    answerD[12] = "disk sektori"

//* * * * * 13* * * * * // 
    question[13] = "ASCII jadvalida bеlgilar soni qancha"
    answerA[13] = "256"
    answerB[13] = "32"
    answerC[13] = "255"
    answerD[13] = "127"

//* * * * * 14* * * * * // 
    question[14] = "Binar fayl deb ..."
    answerA[14] = "berilganlari, ularning xotiragi ichki ko‘rinishi bilan saqlanadigan faylga aytiladi ."
    answerB[14] = "... berilganlari ASCII kodidagi belgilar bilan berilgan faylga aytiladi."
    answerC[14] = "... berilganlari satr ko‘rinishida berilgan faylga aytiladi."
    answerD[14] = "... berilganlari butun sonlar ko‘rinishida saqlanadigan faylga aytiladi."

//* * * * * 15* * * * * // 
    question[15] = " Bir baytda ifodalanishi mumkin bo’lgan ikkilik sonlar  miqdori qancha"
    answerA[15] = "256"
    answerB[15] = "512"
    answerC[15] = "127"
    answerD[15] = "255"

//* * * * * 16* * * * * // 
    question[16] = "Bir xil nomdagi, lekin argumentlarining turlari va  soni har xil funksiyalarga ...  funksiyalar deyiladi."
    answerA[16] = "qayta yuklanuvchi"
    answerB[16] = "qolibli"
    answerC[16] = "o‘zgaruvchi sonli parametrli"
    answerD[16] = "rekursiv"

//* * * * * 17* * * * * // 
    question[17] = "Agar o’qish muvaffaqqiyatli bo’lsa getc() funksiyasi qanday qiymat qaytaradi"
    answerA[17] = "ishorasiz int ko’rinishidagi qiymatni"
    answerB[17] = "EOF ni qaytaradi"
    answerC[17] = "ishorasli int ko’rinishidagi qiymatni"
    answerD[17] = "Haqiqiy sonni"

//* * * * * 18* * * * * // 
    question[18] = "C++ ta’riflanishi bo’yicha programma obеktlarini nomlashda  ishlatiladigan Idеntifikator bu –"
    answerA[18] = "ajratuvchilar qatnashmagan, lotin harfi yoki tag chizdan boshlanuvchi, lotin harflari va raqamlar kеtma-kеtligi"
    answerB[18] = "lotin harfidan boshlanuvchi bеlgilar kеtma-kеtligi"
    answerC[18] = "harflardan boshlanuvchi harf va raqamlar kеtma-kеtligi"
    answerD[18] = "bеlgilar kеtma-kеtligi"

//* * * * * 19* * * * * // 
    question[19] = "C++ tilda while takrorlash operatori qachongacha oprator yoki blokni takror bajaradi"
    answerA[19] = "Takrorlash sharti yolg’on(false yoki 0) bo’lguncha"
    answerB[19] = "Takrorlash sharti rost (true) bo’lguncha"
    answerC[19] = "Takrorlash sharti bir (1) bo’lguncha"
    answerD[19] = "O’zidan keyin yana takrorlash opretori uchramaguncha"

//* * * * * 20* * * * * // 
    question[20] = "C++ tilida  matematik funksiylardan foydalanish uchun qaysi  sarlavha fayliga murojaat qilinadi"
    answerA[20] = "math.h"
    answerB[20] = "conio.h"
    answerC[20] = "vcl.h"
    answerD[20] = "string.h"

//* * * * * 21* * * * * // 
    question[21] = "C++ tilida & amalining vazifasi qanday"
    answerA[21] = "Adresni olish"
    answerB[21] = "Vositali murojat"
    answerC[21] = "Funksiyani chaqirish"
    answerD[21] = "Vazifasi korsatilmagan"

//* * * * * 22* * * * * // 
    question[22] = "C++ tilida “bool“ kalit so’zi orqali e’lon qilinuvchi o’zgaruvchilar qanday turdagi o’zgaruvchilar deyiladi"
    answerA[22] = "Mantiqiy turdagi"
    answerB[22] = "Butun turdagi"
    answerC[22] = "Haqiqiy turdagi"
    answerD[22] = "Belgi turidagi"

//* * * * * 23* * * * * // 
    question[23] = "C++ tilida adres olish amali qaysi belgi yordamida ifodalanadi"
    answerA[23] = "&"
    answerB[23] = "^"
    answerC[23] = "$"
    answerD[23] = "*"

//* * * * * 24* * * * * // 
    question[24] = "C++ tilida baytdagi bitlat qiymatini chapga surish uchun qanday amaldan foydalaniladi"
    answerA[24] = "<<"
    answerB[24] = ">>"
    answerC[24] = "<"
    answerD[24] = ">"

//* * * * * 25* * * * * // 
    question[25] = "C++ tilida belgi turidagi o’zgaruvchilar qaysi kalit so’z yordamida anilanadi"
    answerA[25] = "char"
    answerB[25] = "string"
    answerC[25] = "double"
    answerD[25] = "int"

//* * * * * 26* * * * * // 
    question[26] = "C++ tilida bir o’lchovli massivga murojaat sintaksisi to’g’ri ko’rsatilgan qatorni toping."
    answerA[26] = "<massiv nomi>[<indeks ifoda>]"
    answerB[26] = "<massiv nomi>{<indeks ifoda>}"
    answerC[26] = "<indeks ifoda>[<massiv nomi>]"
    answerD[26] = "<massiv nomi>(<indeks>)"

//* * * * * 27* * * * * // 
    question[27] = "C++ tilida bir yoki har xil turdagi berilganlarni jamlanmasi nima deb ataladi"
    answerA[27] = "struktura"
    answerB[27] = "funksiya"
    answerC[27] = "massiv"
    answerD[27] = "fayl"

//* * * * * 28* * * * * // 
    question[28] = "C++ tilida blok bu-…"
    answerA[28] = "‘{’ va ‘}’ oralig’iga olingan operatorlar ketma-ketligi bo’lib, u kompilyator tomonidan yaxlit operator deb qabul qilinadi"
    answerB[28] = "‘(’ va ‘)’ oralig’iga olingan operatorlar ketma-ketligi bo’lib, u kompilyator tomonidan yaxlit operator deb qabul qilinadi"
    answerC[28] = "‘[’ va ‘]’ oralig’iga olingan operatorlar ketma-ketligi bo’lib, u kompilyator tomonidan yaxlit operator deb qabul qilinadi"
    answerD[28] = "To’g’ri javob keltirilmagan"

//* * * * * 29* * * * * // 
    question[29] = "C++ tilida break opretori bu - …"
    answerA[29] =
        "Takrorlash opretori tanasining ixtiyoriy(zarur) joylariga qo’yish orqali shu joylardan takrorlashdan chiqish imkonini beruvchi oprator"
    answerB[29] =
        "Takrorlash opretori tanasining ixtiyoriy(zarur) joylariga qo’yish orqali shu joylarda  takrorlash tanasini bajarishni to’xtarib takrorlashdan chiqib ketmasdan keying qadamga sakrab o’tish imkonini beruvchi oprator."
    answerC[29] = "Programma ishini to’xtatuvchi oprtator"
    answerD[29] = "To’g’ri javob ko’rsatilmagan"

//* * * * * 30* * * * * // 
    question[30] = "C++ tilida butun son qiymatlarini qabul qiluvchi o’zgaruvchilar qaysi kalit so’z yordamida aniqlanadi"
    answerA[30] = "int"
    answerB[30] = "float"
    answerC[30] = "char"
    answerD[30] = "bool"

//* * * * * 31* * * * * // 
    question[31] = "C++ tilida char turidagi o’zgaruvchilarning qabul qiladigan qiymatlar oralig’i to’g’ri ko’rsatilgan javobni aniqlang"
    answerA[31] = "0..255"
    answerB[31] = "-128..127"
    answerB[31] = "0..32"
    answerB[31] = "-32768..32767"

//* * * * * 32* * * * * // 
    question[32] = "12<<0 bajarilishi natijasida qanday qiymat hosil bo’ladi"
    answerA[32] = "12"
    answerB[32] = "6"
    answerC[32] = "24"
    answerD[32] = "0"

//* * * * * 33* * * * * // 
    question[33] = "C++ tilida cheksiz takrorlanishni while opretori yordamida qanday tasvirlanadi"
    answerA[33] = "while(1)"
    answerB[33] = "while(0)"
    answerC[33] = "while()"
    answerD[33] = "while(false)"

//* * * * * 34* * * * * // 
    question[34] = "C++ tilida continue opretori bu - …"
    answerA[34] =
        "Takrorlash opretori tanasining ixtiyoriy(zarur) joylariga qo’yish orqali shu joylarda  takrorlash tanasini bajarishni to’xtarib takrorlashdan chiqib ketmasdan keying qadamga sakrab o’tish imkonini beruvchi oprator."
    answerB[34] =
        "Takrorlash opretori tanasining ixtiyoriy(zarur) joylariga qo’yish orqali shu joylardan takrorlashdan chiqish imkonini beruvchi oprator"
    answerC[34] = "Faqatgina while takrorlash operatorida ishlatish mumkin bo’lgan oprator"
    answerD[34] = "C++ tilida bunday operator mavjud emas"

//* * * * * 35* * * * * // 
    question[35] =
        "C++ tilida dinamik massivlarga xotiradan joy ajratish uchun mo’ljallangan funskiyalar va opratorlar to’g’ri ko’rsatilgan javobni toping."
    answerA[35] = "malloc(), calloc() funksiyalari va new opretori"
    answerB[35] = "malloc(), free() funksiyalari va new opretori"
    answerC[35] = "free() funksiyasi va delete opretori"
    answerD[35] = "malloc() funksiyasi va new, delete opratorlari"

//* * * * * 36* * * * * // 
    question[36] = "C++ tilida dinamik ob’yekt yaratuvchi operator"
    answerA[36] = "new"
    answerB[36] = "sizeof"
    answerC[36] = "delete"
    answerD[36] = "casting"

//* * * * * 37* * * * * // 
    question[37] = "C++ tilida dinamik ob’yektni yo’q qiluvchi operator to’g’ri ko’rsatilgan javobni aniqlang."
    answerA[37] = "delete"
    answerB[37] = "new"
    answerC[37] = "casting"
    answerD[37] = "sizeof"

//* * * * * 38* * * * * // 
    question[38] = "C++ tilida dizyunksiya(mantiqiy qo’shish) amali qanday tasvirlanadi"
    answerA[38] = "||"
    answerB[38] = "&&"
    answerC[38] = "*"
    answerD[38] = "^"

//* * * * * 38* * * * * // 
    question[38] = "C++ tilida double turidagi o’zgaruvchilar xotirada qancha joy egallaydi"
    answerA[38] = "8 bayt"
    answerB[38] = "4 bayt"
    answerC[38] = "2 bayt"
    answerD[38] = "1 bayt"

//* * * * * 39* * * * * // 
    question[39] = "C++ tilida for takrorlash opratorining sintaksis ko’rinishi to’g’ri ko’rsatilgan javobni toping."
    answerA[39] = "for(<ifoda1>;<ifoda2>; <ifoda3>)<operator yoki blok>"
    answerB[39] = "for(<ifoda>)operator yoki blok>"
    answerC[39] = "for(<ifoda1>,<ifoda2>, <ifoda3>)<operator>"
    answerD[39] = "for(<ifoda1>;<ifoda2>; <ifoda3>)<operator"

//* * * * * 40* * * * * // 
    question[40] = "C++ tilida funksiya prototipi to’g’ri yozilgan qatorni toping"
    answerA[40] = "int funk(int);"
    answerB[40] = "funk(int)"
    answerC[40] = "function funk(int);"
    answerD[40] = "funk(int) int;"

//* * * * * 41* * * * * // 
    question[41] = "C++ tilida haqiqiy o’zgarmaslar necha xil formatda berilishi mumkin"
    answerA[41] = "2"
    answerB[41] = "3"
    answerC[41] = "4"
    answerD[41] = "5"

//* * * * * 42* * * * * // 
    question[42] = "C++ tilida haqiqiy sonning butun va kasr qismilari qaysi belgi yordamida ajratiladi"
    answerA[42] = "Nuqta \".\""
    answerB[42] = "Vergul \", \""
    answerC[42] = "Nuqta vergul \";\""
    answerD[42] = "Slash \" / \""

//* * * * * 43* * * * * // 
    question[43] = "C++ tilida ifoda dеb nimaga aytiladi"
    answerA[43] =
        "ifoda - opеratorlar, opеrandlar va punktaцiya bеlgilarining kеtma-kеtligi bo’lib, kompilyator tomonidan bеrilganlar ustida malum bir amallarni bajarishga ko’rsatma hisoblanadi."
    answerB[43] =
        "ifoda - opеratorlar kеtma-kеtligi bo’lib, kompilyatortomonidan bеrilganlar ustida malum bir amallarni bajarishga ko’rsatma hisoblanadi."
    answerC[43] =
        "ifoda - buyruqlar kеtma-kеtligi bo’lib, kompilyatortomonidan bеrilganlar ustida arifmеtik amallarni bajarishga ko’rsatma hisoblanadi."
    answerD[43] = "ifoda - arifmеtik va mantikiy opеratorlar va punktaцiya bеlgilarining kеtma-kеtligi."

//* * * * * 44* * * * * // 
    question[44] = "C++ tilida konsol rejimda ishlash jarayonida berilganlarni standart oqimdan o’qish formati to’g’ri ko’rsatilgan javobni aniqlang"
    answerA[44] = "cin>> <o’zgaruvchi>"
    answerB[44] = "cout<< <ifoda>"
    answerC[44] = "cin<< <o’zgaruvchi>"
    answerD[44] = "cout>><o’zgaruvchi>"

//* * * * * 45* * * * * // 
    question[45] =
        "C++ tilida konsol rejimda ishlash jarayonida ma’lumotlarni standart oqimga (ekranga)chiqarish uchun to’g’ri format keltirilgan javobni toping"
    answerA[45] = "cout<< <ifoda>"
    answerB[45] = "cin>> <o’zgaruvchi>"
    answerC[45] = "cout>> <ifoda>"
    answerD[45] = "To’g’ri javob keltirilmagan"

//* * * * * 46* * * * * // 
    question[46] = "C++ tilida konyunksiya(mantiqiy ko’paytma) amali qaysi belgi yordamida ifodalanadi"
    answerA[46] = "&&"
    answerB[46] = "||"
    answerC[46] = "!"
    answerD[46] = "%"

//* * * * * 47* * * * * // 
    question[47] = "C++ tilida mantiqiy inkor amali qaysi belgi yordamida ifodalanadi"
    answerA[47] = "!"
    answerB[47] = "||"
    answerC[47] = "&&"
    answerD[47] = "^"

//* * * * * 48* * * * * // 
    question[48] = "C++ tilida nishon bu -…"
    answerA[48] = "Davomida ikki nuqta(‘:’) qo’yilgan identifikator"
    answerB[48] = "Boshiga  ikki nuqta(‘:’) qo’yilgan identifikator"
    answerC[48] = "Davomida nuqta vergul(‘;’) qo’yilgan identifikator"
    answerD[48] = "Davomida panjara(‘#’) qo’yilgan identifikator"

//* * * * * 49* * * * * // 
    question[49] = "C++ tilida oldin opretorni yoki blokni bajarib keyin takrorlash shartini tekshiruvchi operator qaysi"
    answerA[49] = "do-while"
    answerB[49] = "while"
    answerC[49] = "for"
    answerD[49] = "Bunday takrorlash opratori mavjud emas"

//* * * * * 50* * * * * // 
    question[50] = "C++ tilida programma tanasida qo’yilgan nishonga shartsiz o’tish opratori to’g’ri ko’rsatilgan javobni toping."
    answerA[50] = "goto"
    answerB[50] = "go"
    answerC[50] = "go … to"
    answerD[50] = "continue"

//* * * * * 51* * * * * // 
    question[51] = "C++ tilida shart oldin tеkshiriluvchi takrorlash opеratorini ko’rsating."
    answerA[51] = "while"
    answerB[51] = "for ( )"
    answerC[51] = "while...do"
    answerD[51] = "if ( )"

//* * * * * 52* * * * * //
    question[52] = "C++ tilida sonning kvadrat ildizini aniqlovchi funksiya qaysi javobda to’g’ri ko’rsatilgan"
    answerA[52] = "sqrt"
    answerB[52] = "pow"
    answerC[52] = "fmod"
    answerD[52] = "Floor"

//* * * * * 53* * * * * // 
    question[53] = "C++ tilida xy ifoda qanday yoziladi"
    answerA[53] = "pow(x,y)"
    answerB[53] = "pow(y,x)"
    answerC[53] = "fmod(x,y)"
    answerD[53] = "hypot(x,y)"

//* * * * * 54* * * * * // 
    question[54] = "C++ tilining qiymati butun son bo’lgan turlarining ro’yxatini ko’rsating."
    answerA[54] = "int, char, long, bool"
    answerB[54] = "int, char, long, bool, float"
    answerC[54] = "char, long, bool, byte"
    answerD[54] = "float, double"

//* * * * * 54* * * * * // 
    question[54] = "C++da operatorlar qanday belgi bilan ajratiladi"
    answerA[54] = ";"
    answerB[54] = "\" \" ya’ni probel bilan"
    answerC[54] = ":"
    answerD[54] = ","

//* * * * * 54* * * * * // 
    question[54] = "Cheksiz takrorlash operatoridan qaysi operator yordamida chiqib ketish mumkin"
    answerA[54] = "break;"
    answerB[54] = "continue;"
    answerC[54] = "return;"
    answerD[54] = "switch"

//* * * * * 55* * * * * // 
    question[55] = "EHM xotirasida haqiqiy son qanday tasvirlanadi"
    answerA[55] = "sonning ishorasi, mantissasi va tartibi ko’rinishida"
    answerB[55] = "sonning ishorasi, butun va kasr qismi ko’rinishida"
    answerC[55] = "mantissa va tartib ko’rinishida"
    answerD[55] = "conning ishorasi,mantissa,tartib va tartib ishorasi bilan"

//* * * * * 56* * * * * // 
    question[56] = "for (<ifoda >1; <ifoda>2;<ifoda>3)uchun noto’g’ri tavsifni ko’rsating"
    answerA[56] = "<ifoda>2 - takrorlash sanagichi vazifasini bajaruvchi o’zgaruvchisiga boshlang’ich qiymat bеrishga xizmat qiladi"
    answerB[56] =
        "<ifoda>2 - takrorlashni bajarish yoki yo’qligini aniqlabbеruvchi mantikiy ifoda, agar shart rost bo’lsa,takrorlash davom etadi, aks xolda yo’q"
    answerC[56] =
        "<ifoda>3 - odatda takrorlash sanagichi qiymatini oshirish(kamaytirish) uchun xizmat qiladi yoki buyerda takrorlashshartiga tasir kiluvchi boshqa amallar bo’lishi mumkin."
    answerD[56] = "<ifoda>1 - takrorlash sanagichi vazifasini bajaruvchi o’zgaruvchisiga boshlang’ich qiymat bеrishga xizmat qiladi"

//* * * * * 57* * * * * // 
    question[57] = "Funksiya argumentda qiymat qaytarishi uchun mos  argument ... bo‘lishi kerak"
    answerA[57] = "ko‘rsatkich yoki murojaat"
    answerB[57] = "void turida"
    answerC[57] = "asosiy turda"
    answerD[57] = "int turida"

//* * * * * 58* * * * * // 
    question[58] = "Haqiqiy turdagi argumentga ega haqiqiy qiymat qaytaruvchi f funksiyaga ko‘rsatgich to‘g‘ri e’lonini ko‘rsating."
    answerA[58] = "float (* f)(float);"
    answerB[58] = "f(float * )(float);"
    answerC[58] = "float (* float )(f);"
    answerD[58] = "float (f * )(float);"

//* * * * * 59* * * * * // 
    question[59] = "Haqiqiy turdagi o’zgaruvchilar sonni xotirada qanday qolipda saqlaydi"
    answerA[59] = "<ishora><tartib><mantissa>"
    answerB[59] = "<tartib><ishora><mantissa>"
    answerC[59] = "<mantissa><ishora><tartib>"
    answerD[59] = "<mantissa><tartib><ishora>"

//* * * * * 60* * * * * // 
    question[60] = "Haqiqiy turdagi o’zgaruvchilarga xotirada qancha joy ajratiladi"
    answerA[60] = "4 bayt"
    answerB[60] = "3 bayt"
    answerC[60] = "2 bayt"
    answerD[60] = "1 bayt"

//* * * * * 60* * * * * // 
    question[60] = "Identifikator nim"
    answerA[60] =
        "Katta va kichik lotin harflaridan, raqamlar va tag chiziq(‘_’) belgilaridan tashkil topgan va raqamdan boshlanmaydigan belgilar ketma –ketligi"
    answerB[60] =
        "Katta va kichik lotin harflaridan, raqamlar va tag chiziq(‘_’) belgilaridan tashkil topgan va faqat raqamdan boshlanuvchi gan belgilar ketma –ketligi"
    answerC[60] = "Katta va kichik lotin harflaridan tashkil topgan ketma-ketlik"
    answerD[60] =
        "Katta va kichik lotin harflaridan, raqamlar va tag chiziq(‘_’) belgilaridan tashkil topgan va tag chiziq(‘_’)dan  boshlanmaydigan belgilar ketma –ketligi"

//* * * * * 61* * * * * // 
    question[61] = "Ikkilik sanoq sistеmasidagi 10011,101 soni 10 sanoq sistеmasidagi qaysi sonni ifodalaydi"
    answerA[61] = "19,625"
    answerB[61] = "19,25"
    answerC[61] = "45"
    answerD[61] = "12,45"

//* * * * * 62* * * * * // 
    question[62] = "Ko’rsatkich orqali aniqlangan struktura elementlariga murojaat vositasi to’g’ri ko’rsatilgan qatorni toping."
    answerA[62] = "->"
    answerB[62] = "="
    answerC[62] = ":"
    answerD[62] = "::"

//* * * * * 63* * * * * // 
    question[63] = "Kompyutеr programmasi bu..."
    answerA[63] = "Biror masalani yechishga qaratilgan, mashina yoki algoritmik tilda yozilgan ko’rsatmalar kеtma-kеtligi"
    answerB[63] = "Assеmblеr tilida yozilgan ko’rsatmalar kеtma-kеtligi"
    answerC[63] = "Kiruvchi va chikuvchi malumotlarning kodlashtirilgan yozuvi"
    answerD[63] = "Algoritmning grafik tasviri"


//* * * * * 64* * * * * // 
    question[64] = "Matn fayli deb..."
    answerA[64] = "... berilganlari ASCII kodidagi belgilari bilan saqlanadigan faylga aytiladi."
    answerB[64] = "... berilganlari ASCIIZ kodidagi belgilari bilan  saqlanadigan faylga aytiladi."
    answerC[64] = "... berilganlari baytlar ketma-ketligi bilan berilgan faylga aytiladi."
    answerD[64] = "... berilganlari son ko‘rinishida berilgan faylga aytiladi."

//* * * * * 65* * * * * // 
    question[65] = " Matn faylida satrlar  ..."
    answerA[65] = "…CR va LF belgilari bilan ajratiladi."
    answerB[65] = "... CR belgisi bilan ajratiladi."
    answerC[65] = "... LF belgisi bilan ajratiladi."
    answerD[65] = "... \"\\0\"- terminator bilan ajratiladi."

//* * * * * 66* * * * * // 
    question[66] = "Nol-terminator (‘\\0’) tugaydigan satrlar qanday nomlanadi"
    answerA[66] = "ASCIIZ – satrlar"
    answerB[66] = "Satrlar"
    answerC[66] = "Belgilar ketma-ketligi"
    answerD[66] = "Bo’sh satr"

//* * * * * 67* * * * * // 
    question[67] = "O’zgarmas bu -…"
    answerA[67] = "Fikserlangan  sonni, satrni va belgini ifodalovchi leksemadir"
    answerB[67] = "Fikserlangan sonni ifodalovchi leksema"
    answerC[67] = "Fikserlangan satrni va belgini ifodalovchi leksema"
    answerD[67] = "To’g’ri javob ko’rsatilmagan"

//* * * * * 68* * * * * // 
    question[68] = "O’zgarmaslar nechta guruhga bo’linadi"
    answerA[68] = "5 ta"
    answerB[68] = "4 ta"
    answerC[68] = "3 ta"
    answerD[68] = "6ta"

//* * * * * 69* * * * * // 
    question[69] = "O’zgaruvchi nomi sifatida foydalanish mumkin bo’lmagan identifikatorni ko’rsating."
    answerA[69] = "int"
    answerB[69] = "a"
    answerC[69] = "A7"
    answerD[69] = "Pi"


//* * * * * 70* * * * * //
    question[70] = "Mantiqiy turdagi o’zgaruvchilar qanday qiymatlar qabul qiladilar"
    answerA[70] = "0(false) yoki 0dan farqli qiymat (true)"
    answerB[70] = "0 (false)"
    answerC[70] = "true"
    answerD[70] = "0(true) yoki 0dan farqli qiymat(false)"


//* * * * * 71* * * * * //
    question[71] = "Xotirada ketma-ket joylashgan bir xil turdagi qiymatlarga… deyiladi"
    answerA[71] = "massiv"
    answerC[71] = "to’plam"
    answerD[71] = "satr"

//* * * * * 72* * * * * //
    question[72] = "Qanday sonlar ustida yaxlitlash amali bajariladi"
    answerA[72] = "haqiqiy"
    answerB[72] = "butun"
    answerC[72] = "Butun va haqiqiy"
    answerD[72] = "ixtiyoriy turdagi"

//* * * * * 73* * * * * // 
    question[73] = "Qaysi  toifa  kompyuter  xotirasidan   katta  joy  egallaydi."
    answerA[73] = "long  double"
    answerB[73] = "double"
    answerC[73] = "int"
    answerD[73] = "float"

//* * * * * 74* * * * * // 
    question[74] = "Qaysi kalit so‘zi aniq bir xotira sinfini ko‘rsatmaydi"
    answerA[74] = "void"
    answerB[74] = "auto"
    answerC[74] = "registr"
    answerD[74] = "extern"
//* * * * * 75* * * * * // 
    question[75] = "Qiymatlari adres bo’lgan o’zgaruvchilar nima deb ataladi"
    answerA[75] = "Ko’rsatkich o’zgaruvchilar"
    answerB[75] = "Oddiy o’zgaruvchilar"
    answerC[75] = "O’zgarmaslar"
    answerD[75] = "Funksiyalar"

//* * * * * 76* * * * * // 
    question[76] =
        "Quyidagi e’londagi initsializatsiyada nima bajariladi “FILE *  talabaf answerB[26]=  fopen(“C:\\TALABA\\iat1kuz.txt\", \"ranswerA[26]=  * \");"
    answerA[76] = "tashqi xotiradagi mavjud “iat1kuz.txt“ fayli o‘zgartirish (o‘qish va yozish) uchun ochiladi."
    answerB[76] = "tashqi xotiradagi mavjud “iat1kuz.txt“ fayli faqat yozish uchun ochiladi."
    answerC[76] = "tashqi xotiradagi “iat1kuz.txt“ fayli faqat o‘qish uchun ochiladi."
    answerD[76] = "tashqi xotiradagi “iat1kuz.txt“ fayli faqat o‘qish uchun ochiladi."

//* * * * * 77* * * * * // 
    question[77] =
        "Quyidagi e’londagi initsializatsiyada nima bajariladi“FILE * talabafanswerB[26]= fopen(\"“:\\TALABA\\iat1kuz.txt\", \"wanswer \");"
    answerA[77] =
        "xotirada yangi “iat1kuz.txt“ fayl yaratilib, o‘zgartirish (o‘qish va yozish) uchun ochiladi. Agar fayl mavjud bo‘lsa, undagi oldingi yozuvlar o‘chiriladi va u qayta yozishga tayyorlanadi."
    answerB[77] = "xotirada mavjud “iat1kuz.txt“ fayli va yozish uchun ochiladi."
    answerC[77] =
        "xotirada yangi “iat1kuz.txt“ fayl yaratilib, yozish uchun ochiladi. Agar fayl mavjud bo‘lsa, undagi oldingi yozuvlar o‘chiriladi va u qayta yozishga tayyorlanadi."
    answerD[77] = "xotiradagi “iat1kuz.txt“ fayli o‘qish uchun ochiladi. Agar fayl mavjud bo‘lmasa, xatolik ruy beradi."

//* * * * * 78* * * * * // 
    question[78] = "C++ tiltda nechta o’zgaruvchi modifikatori mavjud"
    answerA[78] = "5ta"
    answerB[78] = "2ta"
    answerC[78] = "6ta"
    answerD[78] = "7ta"

//* * * * * 79* * * * * // 
    question[79] =
        "Agar programmada o’zgaruvchini birorta tashqi qurilma yoki boshqa programma bilan bog’lash uchun ishlatish zarur bo’lsa, u qaysi modifikator bilan e’lon qilinadi"
    answerA[79] = "volatile"
    answerB[79] = "auto"
    answerC[79] = "register"
    answerD[79] = "static"

//* * * * * 80* * * * * // 
    question[80] = "Quyidagi ifodaning qiymati to’g’ri ko’rsatilgan javobni toping:  18&14|15-4>>1"
    answerA[80] = "7"
    answerB[80] = "8"
    answerC[80] = "9"
    answerD[80] = "10"

//* * * * * 81* * * * * // 
    question[81] = "Quyidagi ifodaning qiymati to’g’ri ko’rsatilgan javobni toping: 13&11^10-6>>2"
    answerA[81] = "8"
    answerB[81] = "7"
    answerC[81] = "6"
    answerD[81] = "5"

//* * * * * 82* * * * * // 
    question[82] = "Quyidagi ifodaning qiymati to’g’ri ko’rsatilgan javobni toping: 25|20^11-3<<2"
    answerA[82] = "61"
    answerB[82] = "60"
    answerC[82] = "23"
    answerD[82] = "24"

//* * * * * 83* * * * * // 
    question[83] = " short int turidagi o’zgaruvchining qabul qiladigan qiymatlar oralig’i"
    answerA[83] = "-32768...32767"
    answerB[83] = "0..65535"
    answerC[83] = "0..32767"
    answerD[83] = "-2147483648.. 2147483647"

//* * * * * 84* * * * * // 
    question[84] = " usigned char turidagi o’zgaruvchining qiymat chegarasini ko’rsating"
    answerA[84] = "0..255"
    answerB[84] = "-128..127"
    answerC[84] = "0..65535"
    answerD[84] = "-32767.. 32768"

//* * * * * 85* * * * * // 
    question[85] =
        "Quyidagi programma qismi nima natija chiqaradi\nint s = 0;\nfor (int i = 0; i <= 5; i++)\n\tif (i % 2)\n\t\ts += i;\n\tcout << s << endl;"
    answerA[85] = "9"
    answerB[85] = "19"
    answerC[85] = "10"
    answerD[85] = "100"

//* * * * * 86* * * * * // 
    question[86] =
        "Quyidagi programma qismi nima natija chiqaradi\nint n = 20, s = 0;\nfor (int i = 1; i <= 20; i++)\nif (n % i =   0)\n\t    s += i;\n    cout << s << endl;"
    answerA[86] = "42"
    answerA[86] = "100"
    answerA[86] = "55"
    answerA[86] = "45"

//* * * * * 87* * * * * // 
    question[87] =
        "Quyidagi programma qismi nima natija chiqaradi \nint s = 0;    \nfor (int i = 1; i <= 10; i++)    \nswitch(i % 5)    \n{    \n\t    case 0: s += i; break;    \n\t    default : s++;    \n}    \ncout < < s < < endl;"
    answerA[87] = "23"
    answerB[87] = "43"
    answerC[87] = "24"
    answerD[87] = "21"

//* * * * * 88* * * * * // 
    question[88] =
        "Quyidagi programma qismi nima natija chiqaradi    \nint s = 0;    \nfor (i = 1; i <= 10; i++)    \nswitch(i % 10)    \n{    \n\t    case 0:    \n\t    case 2:    \n\t    case 4:    \n\t     case 6:    \n\t    case 8: s += i;      break;    \n}"
    answerA[88] = "30"
    answerB[88] = "34"
    answerC[88] = "35"
    answerD[88] = "40"

//* * * * * 89* * * * * // 
    question[89] =
        "Quyidagi programma qismi nima natija chiqaradi    \nint s = 0, i = 0, n = 10;    \ndastur_uz : i++;    \ns += i;    \nif (i != n)    \n    goto dastur_uz; else s *= 2;    \ncout < < s < < endl;"
    answerA[89] = "110"
    answerB[89] = "120"
    answerC[89] = "125"
    answerD[89] = "250"

//* * * * * 90* * * * * // 
    question[90] =
        "Quyidagi programma qismi nima natija chiqaradi    \nint n =321, s = 0;    \ns = 0;    \nwhile (n > 0) {    \n    s += n % 10; n /= 10; }    \ncout < < s < < endl;"
    answerA[90] = "6"
    answerB[90] = "3"
    answerC[90] = "2"
    answerD[90] = "5"

//* * * * * 91* * * * * // 
    question[91] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int n =10, s = 0, i = 0;\n    while (1 > 0) {\n        i++;\n        s += i;\n        if (i >= n) break; }    \ncout < < s < < endl;"
    answerA[91] = "55"
    answerB[91] = "45"
    answerC[91] = "0"
    answerD[91] = "Cheksiz takrorlanib qoladi"

//* * * * * 92* * * * * //
    question[92] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int a =24, b = 18;\n    while (a != b)\n        if (a > b) a -= b; else b -= a; cout < < a < < endl;"
    answerA[92] = "6"
    answerB[92] = "2"
    answerC[92] = "12"
    answerD[92] = "1"

//* * * * * 93* * * * * // 
    question[93] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int i = 0, j = 0;\n    bool b = true;\n    while (b) {\n        i += 2;\n        if (i = 10) b = false;\n        j = j + i; } cout < < j < < endl;"
    answerA[93] = "30"
    answerB[93] = "40"
    answerC[93] = "50"
    answerD[93] = "20"

//* * * * * 94* * * * * // 
    question[94] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int s = 0, a = 100, b = 120;\n    bool t = true;\n    do {\n        if (a > b) {\n            t = false;\n            s = a + b; } else b = a / 2; } while (t);\n    cout < < s < < endl;"
    answerA[94] = "150"
    answerB[94] = "200"
    answerC[94] = "250"
    answerD[94] = "100"

//* * * * * 95* * * * * // 
    question[95] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int s = 0, a = 20;\n    bool t = true;\n    for (;t;){\n        s++; a -= 2;\n        if (a = 10)\n            t = false\n    }\n    cout < < s < < endl;"
    answerA[95] = "5"
    answerB[95] = "12"
    answerC[95] = "454"
    answerD[95] = "22"

//* * * * * 96* * * * * // 
    question[96] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int s = 0, a = 20;\n    bool t = true;\n    for (;t;){\n        s++;\n        if (s > a) t = !t;\n    }\n    cout < < s < < endl;"
    answerA[96] = "21"
    answerB[96] = "24"
    answerC[96] = "43"
    answerD[96] = "54"

//* * * * * 97* * * * * // 
    question[97] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int a = 20;\n    bool t = false;\n    if (t) a = 200;\n    else a = 100;\n    cout < < a < < endl;"
    answerA[97] = "100"
    answerB[97] = "20"
    answerC[97] = "300"
    answerD[97] = "150"

//* * * * * 98* * * * * // 
    question[98] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int s = 0, a = 0, b = 12;\n    do {\n        a += 2; b -= 2;\n        s += a + b; } while (a != b); cout < < s < < endl;"
    answerA[98] = " 36"
    answerB[98] = "45"
    answerC[98] = "50"
    answerD[98] = "24"

//* * * * * 99* * * * * // 
    question[99] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int a;\n    bool t = true, T = true;\n    if (t && T)\n        a = 50; else a = 200;\n    cout < < a < < endl;"
    answerA[99] = "50"
    answerB[99] = "100"
    answerC[99] = "200"
    answerD[99] = "150"

//* * * * * 100* * * * * // 
    question[100] =
        "Quyidagi programma qismi nima natija chiqaradi\n    int a;\n    bool t = true, T = false;\n    if (t && T)\n        a = 100; else a = 200;\n    cout < < a < < endl;"
    answerA[100] = " 200"
    answerB[100] = "50"
    answerC[100] = "150"
    answerD[100] = "300"

    val db = DBHelper(this)
    val quiz = Quiz(1, "", "", "", "", "")
    if (db.maxID < 1) {
        for (i in 1..100) {
            quiz.question = question[i]
            quiz.answerA = answerA[i]
            quiz.answerB = answerB[i]
            quiz.answerC = answerC[i]
            quiz.answerD = answerD[i]
            db.add(quiz)
        }
    }
}
