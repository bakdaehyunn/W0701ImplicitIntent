package kr.ac.kumoh.s20181370.w0701implicitintent

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)

        view.btnExplicitIntent.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }
    }
}