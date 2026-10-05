package ir.vazifeh.nazarsanji

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.kefalatBtn).setOnClickListener {
            val intent = Intent(this, KefalatActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.pezeshkiAwliBtn).setOnClickListener {
            val intent = Intent(this, PezeshkiAwliActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.pezeshkiBadviBtn).setOnClickListener {
            val intent = Intent(this, PezeshkiBadviActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.ehtiatBtn).setOnClickListener {
            val intent = Intent(this, EhtiaiActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.ehzarBtn).setOnClickListener {
            val intent = Intent(this, EhzarActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.gateBtn).setOnClickListener {
            val intent = Intent(this, GateActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.amaliatBtn).setOnClickListener {
            val intent = Intent(this, AmaliatActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.mashmoolanBtn).setOnClickListener {
            val intent = Intent(this, MashmoolanActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.exportBtn).setOnClickListener {
            val intent = Intent(this, ExportActivity::class.java)
            startActivity(intent)
        }
    }
}