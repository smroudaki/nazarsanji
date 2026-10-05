package ir.vazifeh.nazarsanji

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.io.FileNotFoundException
import java.util.Date


class PezeshkiBadviActivity : AppCompatActivity() {


    private val fileName = "pezeshkiBadvi.csv"

    private val answer = mutableMapOf(
        "q_1" to "",
        "q_2" to "",
        "q_3" to "",
        "q_4" to "",
        "q_5" to "",
        "q_6" to "",
        "q_7" to "",
        "q_8" to "",
        "q_9" to "",
        "q_10" to "",
        "q_11" to "",
    )

    private lateinit var radioGroup0101: RadioButton
    private lateinit var radioGroup0102: RadioButton

    private lateinit var question1Radios: Array<RadioButton>

    private lateinit var radioGroup0201: RadioButton
    private lateinit var radioGroup0202: RadioButton
    private lateinit var radioGroup0203: RadioButton
    private lateinit var radioGroup0204: RadioButton
    private lateinit var radioGroup0205: RadioButton
    private lateinit var radioGroup0206: RadioButton

    private lateinit var question2Radios: Array<RadioButton>

    private lateinit var radioGroup0301: RadioButton
    private lateinit var radioGroup0302: RadioButton
    private lateinit var radioGroup0303: RadioButton
    private lateinit var radioGroup0304: RadioButton
    private lateinit var radioGroup0305: RadioButton
    private lateinit var radioGroup0306: RadioButton
    private lateinit var radioGroup0307: RadioButton

    private lateinit var question3Radios: Array<RadioButton>

    private lateinit var radioGroup0401: RadioButton
    private lateinit var radioGroup0402: RadioButton

    private lateinit var question4Radios: Array<RadioButton>

    private lateinit var radioGroup0501: RadioButton
    private lateinit var radioGroup0502: RadioButton
    private lateinit var radioGroup0503: RadioButton

    private lateinit var question5Radios: Array<RadioButton>

    private lateinit var radioGroup0601: RadioButton
    private lateinit var radioGroup0602: RadioButton
    private lateinit var radioGroup0603: RadioButton
    private lateinit var radioGroup0604: RadioButton

    private lateinit var question6Radios: Array<RadioButton>

    private lateinit var radioGroup0701: RadioButton
    private lateinit var radioGroup0702: RadioButton
    private lateinit var radioGroup0703: RadioButton
    private lateinit var radioGroup0704: RadioButton

    private lateinit var question7Radios: Array<RadioButton>


    private lateinit var radioGroup0801: RadioButton
    private lateinit var radioGroup0802: RadioButton
    private lateinit var radioGroup0803: RadioButton
    private lateinit var radioGroup0804: RadioButton

    private lateinit var question8Radios: Array<RadioButton>

    private lateinit var radioGroup0901: RadioButton
    private lateinit var radioGroup0902: RadioButton
    private lateinit var radioGroup0903: RadioButton
    private lateinit var radioGroup0904: RadioButton

    private lateinit var question9Radios: Array<RadioButton>


    private lateinit var radioGroup1001: RadioButton
    private lateinit var radioGroup1002: RadioButton
    private lateinit var radioGroup1003: RadioButton

    private lateinit var question10Radios: Array<RadioButton>


    private lateinit var radioGroup1101: RadioButton
    private lateinit var radioGroup1102: RadioButton
    private lateinit var radioGroup1103: RadioButton
    private lateinit var radioGroup1104: RadioButton

    private lateinit var question11Radios: Array<RadioButton>
    private lateinit var questionsArray: Array<Array<RadioButton>>


    private lateinit var name: EditText
    private lateinit var phoneNumber: EditText
    private lateinit var nationalCode: EditText

    private fun uncheckAll(radioButtons: Array<RadioButton>) {
        for (radioButton in radioButtons) {
            radioButton.isChecked = false
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pezeshki_badvi)

        title = "مرکز رسیدگی – معافیت پزشکی (شورا بدوی)"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        radioGroup0101 = findViewById(R.id.radioGroup_01_01)
        radioGroup0102 = findViewById(R.id.radioGroup_01_02)

        question1Radios = arrayOf(radioGroup0101, radioGroup0102)

        radioGroup0201 = findViewById(R.id.radioGroup_02_01)
        radioGroup0202 = findViewById(R.id.radioGroup_02_02)
        radioGroup0203 = findViewById(R.id.radioGroup_02_03)
        radioGroup0204 = findViewById(R.id.radioGroup_02_04)
        radioGroup0205 = findViewById(R.id.radioGroup_02_05)
        radioGroup0206 = findViewById(R.id.radioGroup_02_06)

        question2Radios = arrayOf(
            radioGroup0201,
            radioGroup0202,
            radioGroup0203,
            radioGroup0204,
            radioGroup0205,
            radioGroup0206
        )

        radioGroup0301 = findViewById(R.id.radioGroup_03_01)
        radioGroup0302 = findViewById(R.id.radioGroup_03_02)
        radioGroup0303 = findViewById(R.id.radioGroup_03_03)
        radioGroup0304 = findViewById(R.id.radioGroup_03_04)
        radioGroup0305 = findViewById(R.id.radioGroup_03_05)
        radioGroup0306 = findViewById(R.id.radioGroup_03_06)
        radioGroup0307 = findViewById(R.id.radioGroup_03_07)

        question3Radios = arrayOf(
            radioGroup0301,
            radioGroup0302,
            radioGroup0303,
            radioGroup0304,
            radioGroup0305,
            radioGroup0306,
            radioGroup0307
        )


        radioGroup0401 = findViewById(R.id.radioGroup_04_01)
        radioGroup0402 = findViewById(R.id.radioGroup_04_02)

        question4Radios = arrayOf(radioGroup0401, radioGroup0402)

        radioGroup0501 = findViewById(R.id.radioGroup_05_01)
        radioGroup0502 = findViewById(R.id.radioGroup_05_02)
        radioGroup0503 = findViewById(R.id.radioGroup_05_03)

        question5Radios = arrayOf(radioGroup0501, radioGroup0502, radioGroup0503)

        radioGroup0601 = findViewById(R.id.radioGroup_06_01)
        radioGroup0602 = findViewById(R.id.radioGroup_06_02)
        radioGroup0603 = findViewById(R.id.radioGroup_06_03)
        radioGroup0604 = findViewById(R.id.radioGroup_06_04)

        question6Radios = arrayOf(radioGroup0601, radioGroup0602, radioGroup0603, radioGroup0604)


        radioGroup0701 = findViewById(R.id.radioGroup_07_01)
        radioGroup0702 = findViewById(R.id.radioGroup_07_02)
        radioGroup0703 = findViewById(R.id.radioGroup_07_03)
        radioGroup0704 = findViewById(R.id.radioGroup_07_04)

        question7Radios = arrayOf(radioGroup0701, radioGroup0702, radioGroup0703, radioGroup0704)


        radioGroup0801 = findViewById(R.id.radioGroup_08_01)
        radioGroup0802 = findViewById(R.id.radioGroup_08_02)
        radioGroup0803 = findViewById(R.id.radioGroup_08_03)
        radioGroup0804 = findViewById(R.id.radioGroup_08_04)

        question8Radios = arrayOf(radioGroup0801, radioGroup0802, radioGroup0803, radioGroup0804)

        radioGroup0901 = findViewById(R.id.radioGroup_09_01)
        radioGroup0902 = findViewById(R.id.radioGroup_09_02)
        radioGroup0903 = findViewById(R.id.radioGroup_09_03)
        radioGroup0904 = findViewById(R.id.radioGroup_09_04)

        question9Radios = arrayOf(radioGroup0901, radioGroup0902, radioGroup0903, radioGroup0904)


        radioGroup1001 = findViewById(R.id.radioGroup_10_01)
        radioGroup1002 = findViewById(R.id.radioGroup_10_02)
        radioGroup1003 = findViewById(R.id.radioGroup_10_03)

        question10Radios = arrayOf(radioGroup1001, radioGroup1002, radioGroup1003)


        radioGroup1101 = findViewById(R.id.radioGroup_11_01)
        radioGroup1102 = findViewById(R.id.radioGroup_11_02)
        radioGroup1103 = findViewById(R.id.radioGroup_11_03)
        radioGroup1104 = findViewById(R.id.radioGroup_11_04)

        question11Radios = arrayOf(radioGroup1101, radioGroup1102, radioGroup1103, radioGroup1104)


        questionsArray = arrayOf(
            question1Radios,
            question2Radios,
            question3Radios,
            question4Radios,
            question5Radios,
            question6Radios,
            question7Radios,
            question8Radios,
            question9Radios,
            question10Radios,
            question11Radios,
        )

        name = findViewById(R.id.name)
        phoneNumber = findViewById(R.id.phoneNumber)
        nationalCode = findViewById(R.id.nationalCode)



        for ((index, questions) in questionsArray.withIndex()) {
            for ((index2, radioButton) in questions.withIndex()) {
                radioButton.setOnClickListener {
                    uncheckAll(questions)
                    val currentQuestionNUmber = (index + 1).toString()
                    val currentQuestion = "q_$currentQuestionNUmber"
                    if (answer[currentQuestion] != (index2 + 1).toString()) {
                        answer[currentQuestion] = (index2 + 1).toString()
                        radioButton.isChecked = true
                    } else {
                        answer[currentQuestion] = ""
                    }
                }
            }
        }


        for ((index, radioButton) in question6Radios.withIndex()) {
            radioButton.setOnClickListener {
                val currentQuestionNUmber = "6"
                val currentQuestion = "q_$currentQuestionNUmber"
                var values = answer[currentQuestion]!!.split(";").takeIf{ it.size > 1 || it[0].isNotEmpty() } ?: emptyList()
                values = mutableListOf(*values.toTypedArray())
                if (!values.contains((index + 1).toString())) {
                    values.add((index + 1).toString())
                    answer[currentQuestion] = values.joinToString(";")
                    radioButton.isChecked = true
                } else {
                    values.remove((index + 1).toString())
                    answer[currentQuestion] = values.joinToString(";")
                    radioButton.isChecked = false
                }
            }
        }




        findViewById<Button>(R.id.submitBtn).setOnClickListener {


            try {

                this.openFileInput(fileName).use { stream ->
                    val text = stream.bufferedReader().use {
                        it.readText()
                    }
                    this.openFileOutput(fileName, Context.MODE_PRIVATE).use { output ->
                        output.write("${text}\n${answer["q_1"]},${answer["q_2"]},${answer["q_3"]},${answer["q_4"]},${answer["q_5"]},${answer["q_6"]},${answer["q_7"]},${answer["q_8"]},${answer["q_9"]},${answer["q_10"]},${answer["q_11"]},${name.text},${phoneNumber.text},${nationalCode.text},${Date()}".toByteArray())
                    }
                    Toast.makeText(this, "با موفقیت ثبت شد", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            } catch (e: FileNotFoundException) {
                this.openFileOutput(fileName, Context.MODE_PRIVATE).use { output ->
                    output.write("q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,name,phoneNumber,nationalCode,Date\n${answer["q_1"]},${answer["q_2"]},${answer["q_3"]},${answer["q_4"]},${answer["q_5"]},${answer["q_6"]},${answer["q_7"]},${answer["q_8"]},${answer["q_9"]},${answer["q_10"]},${answer["q_11"]},${name.text},${phoneNumber.text},${nationalCode.text},${Date()}".toByteArray())
                }
                Toast.makeText(this, "با موفقیت ثبت شد.", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }


        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}