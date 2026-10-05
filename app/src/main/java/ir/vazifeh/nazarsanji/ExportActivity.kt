package ir.vazifeh.nazarsanji

import android.app.AlertDialog
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileNotFoundException
import java.text.SimpleDateFormat
import java.util.Date
class ExportActivity : AppCompatActivity() {

    private var buttons = arrayOf(
        R.id.kefalatExportBtn,
        R.id.amaliatExportBtn,
        R.id.ehtiatExportBtn,
        R.id.ehzarExportBtn,
        R.id.pezeshkiBadviExportBtn,
        R.id.pezeshkiAwliExportBtn,
        R.id.gateExportBtn,
        R.id.mashmoolanExportBtn,
    )

    private var csvs = arrayOf(
        "kefalat",
        "amaliat",
        "ehtiat",
        "ehzar",
        "pezeshkiBadvi",
        "pezeshkiAwli",
        "gate",
        "mashmoolan",
    )

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_export)

        title = "گرفتن خروجی"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        buttons.forEachIndexed { index, button ->
            try {

                this.openFileInput(csvs[index] + ".csv").use { stream ->
                    val text = stream.bufferedReader().use {
                        it.readText()
                    }
                    val lines = text.split("\n")
                    val count = lines.size - 1
                    val btn = findViewById<Button>(button)
                    val btntxt = btn.text.toString()
                    btn.text = btntxt + " | " + count
                }
            } catch (_: FileNotFoundException) {
                val btn = findViewById<Button>(button)
                val btntxt = btn.text.toString()
                btn.text = btntxt + " | 0"
            }



            findViewById<Button>(button).setOnClickListener {
                    val builder = AlertDialog.Builder(this)
                    builder.setMessage("آیا مطمئن هستید؟")
                        .setCancelable(false)
                        .setPositiveButton("Yes") { dialog, id ->
                            try {

                                this.openFileInput(csvs[index] + ".csv").use { stream ->
                                    val text = stream.bufferedReader().use {
                                        it.readText()
                                    }

                                    val simpleDateFormat = SimpleDateFormat("yyyy_MM_dd_HH_mm")
                                    val current = simpleDateFormat.format(Date())

                                    val myExternalFile =
                                        File(getExternalFilesDir("exports"), csvs[index] + "_$current.csv")
                                    myExternalFile.writeText(text, Charsets.UTF_8)

                                    deleteFile(csvs[index] + ".csv")
                                    Toast.makeText(this, "با موفقیت انجام شد.", Toast.LENGTH_SHORT).show()
                                    val btn = findViewById<Button>(button)
                                    val btntxt = btn.text.toString()
                                    btn.text = btntxt.split(" | ")[0] + " | 0"

                                }
                            } catch (e: FileNotFoundException) {
                                Toast.makeText(this, "اطلاعاتی وجود ندارد.", Toast.LENGTH_SHORT).show()
                            }

                        }
                        .setNegativeButton("No") { dialog, id ->
                            // Dismiss the dialog
                            dialog.dismiss()
                        }
                    val alert = builder.create()
                    alert.show()
            }

        }

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}