package dgu.app.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.appbar.CollapsingToolbarLayout
import dgu.app.R
import dgu.app.adapters.MainAdapter
import dgu.app.quiz.DBHelper
import dgu.app.quiz.Quiz
import dgu.app.utils.getMainList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        val colToolBar = findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout)
        colToolBar.title = getString(R.string.title)
        colToolBar.setExpandedTitleTextAppearance(R.style.ExpandedAppBar)
        colToolBar.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar)

        setData()

        findViewById<RecyclerView>(R.id.listDGU).apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = MainAdapter(this@MainActivity, getMainList())
        }
    }

    private fun setData() {
        val db = DBHelper(this)
        val quiz = Quiz(1, "", "", "", "", "")
        if (db.maxID < 1) {
            // // 1-savol
            quiz.question = "MS Excel dаsturidа fоrmulа bаjаrilish nаtijаsidа  #ссылка!  Хаtоligi sоdir bo’lsа, bu хаtоlik turini аniqlаng?"
            quiz.answerA = "Yachеykа nоmеri nоto’g’ri ko’rsаtilgаn"
            quiz.answerB = "Аrgumеnt sifаtidа sоnning o’rnidа mаtn turibdi"
            quiz.answerC = "Nоlgа bo’lish sоdir bo’lgаn"
            quiz.answerD = "Fоrmulаdа ishlаtilаyotgаn yachеykаdаgi mа’lumоt o’chirilgаn"
            db.add(quiz)

            // // 2-savol
            quiz.question = "MS Excel dаsturidа fоrmulа bаjаrilish nаtijаsidа  #число!  Хаtоligi sоdir bo’lsа, bu хаtоlik turini аniqlаng?"
            quiz.answerA = "Kvаdrаt ildiz оstidа mаnfiy sоn hоsil bo’lgаn "
            quiz.answerB = "Аrgumеnt sifаtidа sоnning o’rnidа mаtn turibdi"
            quiz.answerC = "Nоlgа bo’lish sоdir bo’lgаn"
            quiz.answerD = "Yachеykа nоmеri nоto’g’ri ko’rsаtilgаn"
            db.add(quiz)
            // // 3-savol
            quiz.question = "MS Excelda argument qiymatining modulini hisoblaydi gan funksiya nomini ko’rsating?"
            quiz.answerA = "Abs "
            quiz.answerB = "Rand"
            quiz.answerC = "Sqrt"
            quiz.answerD = "Ln"
            db.add(quiz)

            // // 4-savol
            quiz.question = "MS Excelda  0 va 1 oraliqdagi tasodifiy sonni hisoblaydigan funksiya nomini ko’rsating"
            quiz.answerA = "Rand"
            quiz.answerB = "Sqrt "
            quiz.answerC = "Abs "
            quiz.answerD = "Ln"
            db.add(quiz)

            // // 5-savol
            quiz.question = "MS Excelda  argumentlar ro’yxatidan eng kattasi (maksimal son)ni topadigan funksiya nomini ko’rsating?"
            quiz.answerA = "Max "
            quiz.answerB = "Sin"
            quiz.answerC = "Ln"
            quiz.answerD = "Abs"
            db.add(quiz)

            // // 6-savol
            quiz.question = "MS Excelda  mantiqiy funksiya  nomini ko’rsating?"
            quiz.answerA = "If"
            quiz.answerB = "Max"
            quiz.answerC = "Sin"
            quiz.answerD = "Sin"
            db.add(quiz)
            // // 7-savol
            quiz.question = "MS Excelda  odatda yaratilgan fayl   qanday ataladi?"
            quiz.answerA = "Ish kitob"
            quiz.answerB = "Taqdimot"
            quiz.answerC = "Hujjat "
            quiz.answerD = "Rasm"
            db.add(quiz)

            // // 8-savol
            quiz.question =
                "MS Excelda  oynaning bu satri asosan sarlovha satri tagida joylashadi va shu satr yordamida dasturning hamma buyruqlari bilan ishlashimiz mumkin, chunki bu satrda hamma buyruqlar saralanib guruxlarga bulingan. Bu qanday satr hisoblanadi?"
            quiz.answerA = "Menyu satri "
            quiz.answerB = "Sarlovha satri"
            quiz.answerC = "Ish sohasi"
            quiz.answerD = "Uskunalar satri"
            db.add(quiz)
            // // 9-savol
            quiz.question = "MS Excelda  sonning kvadrat ildizini hisoblaydigan funksiya nomini ko’rsating?"
            quiz.answerA = "Sqrt "

            quiz.answerB = "Rand"
            quiz.answerC = "Abs "
            quiz.answerD = "Ln"
            db.add(quiz)

            // // 10-savol
            quiz.question = "Excel dasturida formula bajarilish natijasida #Знач xatoligi sodir bo‘lsa, bu xatolik turini aniqlang?"
            quiz.answerA = "argument sifatida sonning o‘rnida matn turibdi"
            quiz.answerB = "nolga bo‘lish sodir bo‘lgan"
            quiz.answerC = "yacheyka nomeri noto‘g‘ri ko‘rsatilgan"
            quiz.answerD = "kvadrat ildiz ostida manfiy son hosil bo‘lgan"
            db.add(quiz)

            // // 11-savol
            quiz.question = "Excel dasturida turli yacheykalardagi matnlarni birlashtirish uchun qaysi belgi ishlatiladi?"
            quiz.answerA = "&"
            quiz.answerB = "$"
            quiz.answerC = "% "
            quiz.answerD = "#"
            db.add(quiz)

            // // 12-savol
            quiz.question = "O‘zbekiston Respublikasida quyidagi qonunlar qabul qilingan:"

            quiz.answerA =
                "«Axborotlashtirish to‘g‘risida», «Elektron tijorat to‘g‘risida», «Elektron xujjat aylanishi to‘g‘risida», «Elektron raqamli imzo to‘g‘risida» va boshqalar."

            quiz.answerB =
                "«Axborotlashtirish to‘g‘risida», «Elektron tijorat to‘g‘risida», «Elektron xujjat aylanishi to‘g‘risida», «Axborot xavfsizligi to‘g‘risida» va boshqalar."

            quiz.answerC = "«Axborot erkinligi to‘g‘risida», «Elektron tijorat to‘g‘risida», «Elektron xujjat aylanishi to‘g‘risida» va boshqalar."

            quiz.answerD =
                "«Internet to‘g‘risida», «Axborot xavfsizligi to‘g‘risida», «Balog‘at yoshiga yetmaganlarni ma’naviy va jismoniy salomatliklariga zarar yetkazuvchi axborotlardan muhofaza qilish to‘g‘risida» va boshqalar.«Axborot erkinligi to‘g‘risida», «Internet to‘g‘risida», «Axborot xavfsizligi to‘g‘risida» va boshqalar."
            db.add(quiz)
            // // 13-savol
            quiz.question = "“Axborot “ tushunchasiga berilgan ta’rifni ko‘rsating"
            quiz.answerA =
                "Identifikatsiyalash mumkin bo‘lgan, rekvizitlari ko‘rsatilgan va axborot tashuvchi qurilmalarga joylashtirilgan istalgan ma’lumotlar."
            quiz.answerB =
                "Manbalari va taqdim etilish shaklidan qat’iy nazar shahslar, predmetlar, faktlar, voqealar, hodisalar va jarayonlar to‘g‘risidagi ma’lumotlar"
            quiz.answerC =
                "Istalgan manbalardan keladigan ma’lumotlardan foydalanish, ishlov berish va yaratish bilan bog‘liq bo‘lgan subyektlarning faoliyat sohasi."
            quiz.answerD =
                "Cheklanmagan shaxslar doirasiga mo‘ljallangan bosma, audio va boshqa xabar va materiallar. Axborot tizimlaridagi (kutubxonalardagi, arxivlardagi, fondlardagi, ma’lumotlar banklaridagi va boshqalardagi) xujjatlar va xujjatlar massivlari."
            db.add(quiz)

            // // 14-savol
            quiz.question = "“Axborotlashtirish to‘g‘risida “ gi O‘zbekiston Respublikasi qonunining asosiy maqsadi:"
            quiz.answerA = "Axborotlashtirish sohasidagi munosabatlarni tartibga solish"
            quiz.answerB = "Axborot erkinligi prinsipi va kafolatlariga rioya etilishini ta’minlash"
            quiz.answerC = "Elektron tijorat sohasidagi munosabatlarni tartibga solish"
            quiz.answerD =
                "Telekommunikatsiyalarni yaratish, ishlatish va rivojlantirish sohasidagi ijtimoiy munosabatlarni tartibga solish Elektron xujjat aylanish sohasidagi munosabatlarni tartibga solish"
            db.add(quiz)

            // // 15-savol
            quiz.question = "“Axborot erkinligi prinsiplari va kafolatlari to‘g‘risida “ gi O‘zbekiston Respublikasi qonunining asosiy maqsadi:"
            quiz.answerA = "Axborotlashtirish sohasidagi munosabatlarni tartibga solish"
            quiz.answerB = "Elektron tijorat sohasidagi munosabatlarni tartibga solish"
            quiz.answerC = "Telekommunikatsiyalarni yaratish, ishlatish va rivojlantirish sohasidagi ijtimoiy munosabatlarni tartibga solish"
            quiz.answerD = "Elektron xujjat aylanish sohasidagi munosabatlarni tartibga solish"
            db.add(quiz)

            // // 16-savol
            quiz.question = "“Elektron tijorat to‘g‘risida “ gi O‘zbekiston Respublikasi qonunining asosiy maqsadi:"
            quiz.answerA = "Axborotlashtirish sohasidagi munosabatlarni tartibga solish"
            quiz.answerB = "Axborot erkinligi prinsipi va kafolatlariga rioya etilishini ta’minlash"
            quiz.answerC = "Elektron tijorat sohasidagi munosabatlarni tartibga solish"
            quiz.answerD =
                "Telekommunikatsiyalarni yaratish, ishlatish va rivojlantirish sohasidagi ijtimoiy munosabatlarni tartibga solish Elektron xujjat aylanish sohasidagi munosabatlarni tartibga solish"
            db.add(quiz)

            // // 17-savol
            quiz.question =
                "Axborot texnologiyalarini qo‘llab avvaldan shakllantirilgan davlat xizmatlarini fuqarolar, biznes va davlatning boshqa tarmoqlariga axborotlarni taqdim etish nima deb ataladi?"
            quiz.answerA = "Elektron xukumat"
            quiz.answerB = "Elektron tijorat"
            quiz.answerC = "Elektron biznes"
            quiz.answerD = "Elektron boshqaruv"
            db.add(quiz)

            // // 18-savol
            quiz.question = "Davlat organining rasmiy sayti qaysi domen zonasida joylashtirilishi kerak?:"
            quiz.answerA = "Com"
            quiz.answerB = "Gov"
            quiz.answerC = "Uz"
            quiz.answerD = "Net"
            db.add(quiz)

            // // 19-savol
            quiz.question =
                "Portalni shakllantirish yo‘li bilan internet orqali fuqarolarga barcha davlat xizmatlari majmuini taqdim etuvchi “elektron hukumat “ tizimining tashkil etuvchisini ko‘rsating:"
            quiz.answerA = "G2C – (Hukumat-Fuqaro"
            quiz.answerB = "G2B – (Hukumat - Biznes"
            quiz.answerC = "G2G – (Hukumat - Hukumat"
            quiz.answerD = "C2C - (Fuqaro - Fuqaro"
            db.add(quiz)

            // // 20-savol
            quiz.question = "«Elektron hukumat» nima?"
            quiz.answerA = "Davlat organlarini maytlarining Internetdagi to‘plami"
            quiz.answerB = "Internet-xavfsizligi tizimi"
            quiz.answerC = "Har xil davlat organlarida olib boriladigan majlislar va yig‘ilishlarning elektron ko‘rinishi"
            quiz.answerD =
                "O‘zbekiston aloqa va axborotlashtirish agentligi maxsus bo‘limi Axborotlarga elektron ishlov berish, uzatish va tarqatish vositalari asosida davlatni boshqarish tizimi"
            db.add(quiz)

            // // 21-savol
            quiz.question = "Yagona oyna Markazlari faoliyati yo‘nalishini ko‘rsating:"
            quiz.answerA = "Bir joydan turib aholiga keng miqyosida ijtimoiy hizmatlarni ko‘rsatish"
            quiz.answerB = "U yoki bu tumanda istiqomat qiluvchilar uchun Internetdan foydalanishni ta’minlash Internet kafe prinsipi asosida"
            quiz.answerC = "Microsoft Office, Windowsda ishlash bo‘yicha kurslar o‘tkaziladigan seminarlarni tashkil etish"
            quiz.answerD = "Markaz fuqarolarga bosma nashrlarga obuna bo‘lish uchun arizalar, hamda gazetalarga e’lonlar berish imkonini yaratadi"
            db.add(quiz)

            // //22-savol
            quiz.question =
                " “Milliy axborot - kommunikatsiya tizimlarining kompyuter xavfsizligini ta‘minlash borasidagi qo'shimcha choratadbirlari to'g'risida“gi PQ-167 sonli qarori qachon qabul qilindi"
            quiz.answerA = "8 iyul 2005 yil"
            quiz.answerB = "5 sentabr 2005 yil"
            quiz.answerC = "22 noyabr 2005 yil"
            quiz.answerD = "2 may 2011 yil"
            db.add(quiz)

            // // 23-savol
            quiz.question = "G2C – nima?"
            quiz.answerA = "davlat organlari bilan fuqarolar o'rtasida axborot ayirboshlash;"
            quiz.answerB =
                "davlat organcb lari bilan tijorat sohasi faoliyat ko'rsatayotgan xususiy kompaniyalar, ishbilarmonlar o'rtasida axborot ayirboshlash;"
            quiz.answerC = "davlat organlari bilan davlat organlari o'rtasida axborot ayirboshlash;"
            quiz.answerD = "davlat organlari bilan uning xodimlari o'rtasida axborot ayirboshlash"
            db.add(quiz)

            // // 24-savol
            quiz.question =
                ", …-bu boshqaruv apparati faoliyatining ham dastlabki nuqtasi, ham natijasidir, shuningdek amalga oshirilayotgan harakatlar mavjudligi sharti, mustahkamlash usulidir."
            quiz.answerA = "Axborot"
            quiz.answerB = "Yo'nalishi bo'yicha axborot"
            quiz.answerC = "Axborot tizimi"
            quiz.answerD = "Axborot resusrsi "
            db.add(quiz)

            // // 25-savol
            quiz.question = "…- bu aqliy mehnat texnikasi, menejment tizimida axborotni qayta ishlash texnikasidir"
            quiz.answerA = "Menejment texnikasi"
            quiz.answerB = "Menejment tizimi"
            quiz.answerC = "Menejment tasnifi"
            quiz.answerD = "Menejment tushunchasi"
            db.add(quiz)

            // // 26-savol
            quiz.question = "Statistik axborotlar nimalar bilan farqlanadi?"
            quiz.answerA = "turli-tumanligi, ommaviyligi va kelib tushishining davriyligi"
            quiz.answerB = "katta o‘lchamlilik; holatning murakkabligi "
            quiz.answerC = "to‘g‘ri va teskari"
            quiz.answerD = "turli-tumanligi, katta o‘lchamlilik; holatning murakkabligi"
            db.add(quiz)

            // // 27-savol
            quiz.question =
                "“O‘zbekiston Respublikasi soliq idoralarida ma’lumotlarni ishlashning yagona kompyuter tizimini yaratish to‘g`risida“ gi 388 - sonli qarori qabul qilindi va uni amalga oshirish maqsadida bosqichlar joriy qilindi va ular qaysilar? "
            quiz.answerA =
                "Davlat soliq qo‘mitasi;  Davlat soliq boshqarmalari;  Davlat soliq inspeksiyalaridan iborat DSQ MIYaKТ ishlab chiqildi va amalga joriy qilindi. "
            quiz.answerB = "Qo‘mitasi;  Davlat  boshqarmalari;  Davlat  inspeksiyalaridan"
            quiz.answerC = "Davlat soliq qo‘mitasi; Davlat soliq boshqarmalari;  Davlat soliqi"
            quiz.answerD = "Davlat soliq qo‘mitasi;  Davlat soliq boshqarmalari"
            db.add(quiz)

            // // 28-savol
            quiz.question =
                "Soliq to‘lovchilarning identifikatsiya raqamlari barcha to‘plami soliq to‘lovchilarning tiplarini aniqlashtiruvchi ikki turkumlash guruhiga jismoniy va yuridik shaxslarga ajratilgan, jismoniy qanday kodlardan foydalaniladi: "
            quiz.answerA = "40 000 000 X dan 79 999 999 X gacha "
            quiz.answerB = "20 000 000 X dan 39 999 999 X gacha"
            quiz.answerC = "00 000 000 X dan 19 999 999 X gacha;"
            quiz.answerD = "80 000 000 X dan 99 999 99 X gacha "
            db.add(quiz)

            // // 29-savol
            quiz.question =
                "Qaydnomalarning vazifasi har xil ro‘yxatlar va hisobotlarni shakllantirishga imkon beradi hamda qanday tartibda shakllantiriladi"
            quiz.answerA =
                "asosiy kitob; yakuniy aylanish; schyotlar bo‘yicha yakun; valutada yakuniy natija; keltirilgan valuta; kassa kitobi; qaydnoma diagrammasi; tahlil."
            quiz.answerB = "korxonalar; schyot bo‘yicha xizmatlar; hujjatning nomi; mahsulot moddiy boyliklar;"
            quiz.answerC = "o‘lchov birliklari; harakat operatsiyalari; schyotlarning rejasi; buxgalteriya yozuvlari; buxgalteriya yozuvlar guruhi;"
            quiz.answerD = "soliqlar; tahliliy hisobning kodlari; korxona obyektlari; valuta kursi to‘g‘risidagi axborotlar"
            db.add(quiz)

            // // 30-savol
            quiz.question = "Oddiy ma’lumotnomalar andozaviy tuzilishga ega bo’lib ularga:"
            quiz.answerA = "kod, nom, qo‘shimcha alomatlar (hujjatning nomi, o‘lchov birligi, schyot bo‘y- icha xizmatlar, harakat operatsiyalari)."
            quiz.answerB = "ma’lumotnoma ham bo‘limlardan iborat bo‘lib, ularning har biri alohida bo‘limchalarga ega"
            quiz.answerC = "U ekranda joylashtirib bo‘lmaydigan katta hajmli ma’lumotnomalar bilan ishlash uchun mo‘ljallangan"
            quiz.answerD =
                "U ekranda joylashtirib bo‘lmaydigan katta hajmli ma’lumotnomalar bilan ishlash uchun mo‘ljallangan (hujjatning nomi, o‘lchov birligi, schyot bo‘y- icha xizmatlar, harakat operatsiyalari"
            db.add(quiz)

            // // 31-savol
            quiz.question =
                "…- bu, avvalam- bor, informatikaning zamonaviy axborot-kommunikatsion va dasturiy vositalari asosida faoliyat yurituvchi, interaktiv xizmatlarning marketing faoliyatini qo‘llab-quvvatlash maqsadlarida axborotlarni yig‘ish, saqlash, faollashtirish va ishlab chiqishni ta’minlovchi majmuadir."
            quiz.answerA = "Marketing axborot boshqaruv tizimlari"
            quiz.answerB = "axborot  tizimlari"
            quiz.answerC = "Marketing  tizimlari"
            quiz.answerD = "boshqaruv tizimlari"
            db.add(quiz)

            // //32-savol
            quiz.question = "Ichki axborotlar tizimi"
            quiz.answerA = "interaktiv xizmat faoliyatining turli tomonlari va uni holatini aks ettiradi."
            quiz.answerB = "hodisalar va vaziyatlar haqida ma’lumotlar olish mumkin bo‘lgan manbalarga qaratilgan"
            quiz.answerC = "marketing tadqiqotlari natijalari"
            quiz.answerD = "interaktiv xizmat faoliyatining hodisalari va vaziyatlari"
            db.add(quiz)

            // // 33-savol
            quiz.question = "O‘zbekiston Respublikasida “ Axborot olish kafolatlari va erkinligi to‘g‘risida“ gi qonuni qachon qabul qilingan "
            quiz.answerA = "1997 yil 24 aprelda"
            quiz.answerB = "1998 yil 24 aprelda"
            quiz.answerC = "1999 yil 24 aprelda"
            quiz.answerD = "2000 yil 24 aprelda"
            db.add(quiz)

            // // 33-savol
            quiz.question =
                "…- turli shaxs guruhlari axborot manbalariga har xil kirishga egaligi va bunday kirishga cheklashlar doim bajarilishi kafolati;"
            quiz.answerA = "tizimga kirishni nazorat qilish"
            quiz.answerB = "nazorat qilinishi"
            quiz.answerC = "identifikatsiyalashni nazorat qilish"
            quiz.answerD = "qasddan buzilishlarga to‘sqinlik"
            db.add(quiz)

            // // 34-savol
            quiz.question = "…- hozir tizimga ulangan mijoz aniq o‘zini kim deb atagan bo‘lsa, aniq o‘sha ekanligining kafolati;"
            quiz.answerA = "tizimga kirishni nazorat qilish"
            quiz.answerB = "nazorat qilinishi"
            quiz.answerC = "identifikatsiyalashni nazorat qilish"
            quiz.answerD = "qasddan buzilishlarga to‘sqinlik"
            db.add(quiz)

            // // 35-savol
            quiz.question = "MS Excel dаsturidа fоrmulа bаjаrilish nаtijаsidа #знач! Хаtоligi sоdir bo’lsа, bu хаtоlik turini аniqlаng?"
            quiz.answerA = "Аrgumеnt sifаtidа sоnning o’rnidа mаtn turibdi"
            quiz.answerB = "Nоlgа bo’lish sоdir bo’lgаn"
            quiz.answerC = "Yachеykа nоmеri nоto’g’ri ko’rsаtilgаn"
            quiz.answerD = "Kvаdrаt ildiz оstidа mаnfiy sоn hоsil bo’lgаn"

            db.add(quiz)

            // // 36-savol
            quiz.question =
                "MS Excel dаsturidа fоrmulа bаjаrilish nаtijаsidа #ссылка! Хаtоligi sоdir bo’lsа, bu хаtоlik turini аniqlаng?"
            quiz.answerA =
                "Yachеykа nоmеri nоto’g’ri ko’rsаtilgаn"
            quiz.answerB =
                "Аrgumеnt sifаtidа sоnning o’rnidа mаtn turibdi"
            quiz.answerC =
                "Nоlgа bo’lish sоdir bo’lgаn"
            quiz.answerD =
                "Fоrmulаdа ishlаtilаyotgаn yachеykаdаgi mа’lumоt o’chirilgаn"
            db.add(quiz)

            // //37-savol
            quiz.question =
                "MS Excel dаsturidа fоrmulа bаjаrilish nаtijаsidа #число! Хаtоligi sоdir bo’lsа, bu хаtоlik turini аniqlаng?"
            quiz.answerA =
                "Kvаdrаt ildiz оstidа mаnfiy sоn hоsil bo’lgаn"
            quiz.answerB =
                "Аrgumеnt sifаtidа sоnning o’rnidа mаtn turibdi"
            quiz.answerC =
                "Nоlgа bo’lish sоdir bo’lgаn"
            quiz.answerD =
                "Yachеykа nоmеri nоto’g’ri ko’rsаtilgаn"
            db.add(quiz)

            // // 38-savol
            quiz.question =
                "MSExcelda  odatda yaratilgan fayl   qanday ataladi?"
            quiz.answerA =
                "Ish kitob "
            quiz.answerB =
                "Taqdimot"
            quiz.answerC =
                "Hujjat "
            quiz.answerD =
                "Rasm"
            db.add(quiz)

            // // 39-savol
            quiz.question =
                "MS Excelda  oynaning asosiy qismi bulib uning ichida dastur bajariladi va ma‘lumotlar kursatiladi. Bu qanday nomlanadi?"
            quiz.answerA =
                "Ish sohasi"
            quiz.answerB =
                "Uskunalar satri"
            quiz.answerC =
                "Sarlovha satri"
            quiz.answerD =
                "Menyu satri"
            db.add(quiz)

            // // 40-savol
            quiz.question =
                "MS Exceldа макс(B5: B10) funksiyasi nimаni hisоblаydi"
            quiz.answerA =
                "B5 dаn B10 gаchа bo’lgаn yachеykаlаrdаgi sоnli qiymаtlаrdаn eng kаttаsini tаnlаydi."
            quiz.answerB =
                "B5 dаn B10 gаchа bo’lgаn yachеykаlаrdаgi sоnli qiymаtlаrning ko’pаytmаsini hisоblаydi."
            quiz.answerC =
                "B5 dаn B10 gаchа bo’lgаn yachеykаlаrdаgi sоnli qiymаtlаrning yig’indisini hisоblаydi. "
            quiz.answerD =
                "B5 dаn B10 gаchа bo’lgаn yachеykаlаrdаgi sоnli qiymаtlаrdаn eng kichigini tаnlаydi"
            db.add(quiz)

            // // 41-savol
            quiz.question =
                "Qaysi klavishlar kombinatsiyasi yordamida oldin bajarilgan operatsiyani bekor qilish mumkin?"
            quiz.answerA =
                "Ctrl+Z;"
            quiz.answerB =
                "Ctrl+C;"
            quiz.answerC =
                "Ctrl+V;"
            quiz.answerD =
                "Ctrl+F;"
            db.add(quiz)

            // // 42-savol
            quiz.question =
                "Quyidаgi fаyl mеnyulаridаn qаysi biri MS Excel gа tеgishli emаs."
            quiz.answerA =
                "Таблица"
            quiz.answerB =
                "Сервис"
            quiz.answerC =
                "Данные "
            quiz.answerD =
                "Вставка"
            db.add(quiz)

            // // 43-savol
            quiz.question =
                "Berilgan kataklardagi sonlarning yig‘indisini topishda qaysi funksiyadan foydalaniladi?"
            quiz.answerA =
                "СУММ;"
            quiz.answerB =
                "СУММКВ;"
            quiz.answerC =
                "СУММПРОИЗВ;"
            quiz.answerD =
                "СУММСУММKВ;"
            db.add(quiz)

            // // 44-savol
            quiz.question =
                "Berilgan kataklardan sonlarning о‘rta arifmetigini topishda qaysi funksiyadan foydalaniladi?"
            quiz.answerA =
                "СРЗНАЧ;"
            quiz.answerB =
                "СРГЕОМ;"
            quiz.answerC =
                "СРЗНАЧA;  "
            quiz.answerD =
                "СРОТКЛ; "
            db.add(quiz)

            // // 45-savol
            quiz.question =
                "Excelda СP3НАЧ(А5:A50) funksiyasi nimani hisoblaydi?"
            quiz.answerA =
                "A5 dan A50 gacha bo‘lgan yacheykalardagi sonli qiymatlarning o‘rta arifmetigini hisoblaydi."
            quiz.answerB =
                "A5 dan A50 gacha bo‘lgan yacheykalardagi sonli qiymatlarning yig‘indisini hisoblaydi."
            quiz.answerC =
                "A5 dan A50 gacha bo‘lgan yacheykalardagi sonli qiymatlarning ko‘paytmasini hisoblaydi."
            quiz.answerD =
                "A5 dan A50 gacha bo‘lgan yacheykalardagi sonli qiymatlardan eng kattasini tanlaydi."
            db.add(quiz)

            // // 46-savol
            quiz.question =
                "Excelda СУММ(G1: G100) funksiyasi nimani hisoblaydi?"
            quiz.answerA =
                "G1 dan G100 gacha bo‘lgan yacheykalardagi sonli qiymatlarning yig‘indisini hisoblaydi."
            quiz.answerB =
                "G1 dan G100 gacha bo‘lgan yacheykalardagi sonli qiymatlarning ko‘paytmasini hisoblaydi."
            quiz.answerC =
                "G1 dan G100 gacha bo‘lgan yacheykalardagi sonli qiymatlardan eng kattasini tanlaydi. "
            quiz.answerD =
                "G1 dan G100 gacha bo‘lgan yacheykalardagi sonli qiymatlardan eng kichigini tanlaydi."
            db.add(quiz)

            // // 47-savol
            quiz.question =
                "ERI axborot kommunikatsiya tarmog`ida elektron hujjat almashinuvi jarayonida nechta masalani yechish imkonini beradi?"
            quiz.answerA =
                "3"
            quiz.answerB =
                "2"
            quiz.answerC =
                "1"
            quiz.answerD =
                "4"
            db.add(quiz)

            // // 48-savol
            quiz.question =
                "Elektron raqamli imzoning algoritmi qanday?"
            quiz.answerA =
                "imzo qo’yish, imzoni tekshirish "
            quiz.answerB =
                "imzoni olish, imzoni qo’yish"
            quiz.answerC =
                "imzoni olish, imzoni ro’yxatdan o’tkazish"
            quiz.answerD =
                "imzoni olish"
            db.add(quiz)


            // // 49-savol
            quiz.question =
                "Elektron raqamli imzoni qo’yish kim tomonidam amalga oshiriladi?"
            quiz.answerA =
                "muallif "
            quiz.answerB =
                "ERI beruvchi tashkilot"
            quiz.answerC =
                "istalgan yuridik shaxs"
            quiz.answerD =
                "imzoni olish"
            db.add(quiz)

            // // 50-savol
            quiz.question =
                "Soliq elementlari qaysi qatorda to’gri va to’liq keltirilgan?"
            quiz.answerA =
                "soliq subyekti,soliq obyekti,soliq manbai,soliq stavkasi,soliq birligi, soliq og’irligi,soliq yuki "
            quiz.answerB =
                "soliq subyekti,soliq obyekti,soliq manbai,soliq stavkasi,soliq birligi, soliq"
            quiz.answerC =
                "soliq subyekti,soliq obyekti,soliq manbai,soliq stavkasi,"
            quiz.answerD =
                "soliq subyekti,soliq obyekti,imzoni olish"
            db.add(quiz)


        }
    }

}