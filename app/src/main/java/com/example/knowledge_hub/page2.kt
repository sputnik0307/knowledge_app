package com.example.knowledge_hub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val b1=findViewById<Button>(R.id.button1)
        val b2=findViewById<Button>(R.id.button2)
        val b3=findViewById<Button>(R.id.button3)
        val b4=findViewById<Button>(R.id.button4)
        val b5=findViewById<Button>(R.id.button5)
        val b6=findViewById<Button>(R.id.button6)
        val b7=findViewById<Button>(R.id.button7)
        val b8=findViewById<Button>(R.id.button8)

        b1.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/technology-hits/an-introduction-to-artificial-intelligence-b3a1bdef97f3")
            startActivity(intent)
            }
        b2.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/@randylaosat/a-beginners-guide-to-machine-learning-dfadc19f6caf")
            startActivity(intent)
        }
        b3.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/@kavishkafernando/cloud-computing-part-i-c232973e4b18#:~:text=Cloud%20Computing%20is%20the%20delivery,hardware%20and%20software%20resources%20remotely.")
            startActivity(intent)
        }
        b4.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/mindorks/what-is-blockchain-simplest-introduction-to-the-blockchain-764a468e1575")
            startActivity(intent)
        }
        b5.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/technology-hits/introduction-to-web-development-2d1d1ae76f65")
            startActivity(intent)
        }
        b6.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/tag/android-development")
            startActivity(intent)
        }
        b7.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/codex/what-is-web-3-0-the-future-of-the-internet-493b9c0c3500")
            startActivity(intent)
        }
        b8.setOnClickListener{
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://medium.com/botsupply/a-beginners-guide-to-deep-learning-5ee814cf7706")
            startActivity(intent)
        }
    }

}
