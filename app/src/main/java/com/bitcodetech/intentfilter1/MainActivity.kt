package com.bitcodetech.intentfilter1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.StrictMode
import android.os.StrictMode.VmPolicy
import com.bitcodetech.intentfilter1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        StrictMode.setVmPolicy(
            VmPolicy.Builder()
                .build()
        )

        binding.btnShow.setOnClickListener {
            //val intent = Intent(this@MainActivity, ImageActivity::class.java)
            val intent = Intent("in.bitcode.media.VIEW")
            intent.action = "in.bitcode.media.VIEW"
            intent.setDataAndType(
                Uri.parse(binding.edtPath.text.toString()),
                "image/jpeg"
            )

            /* intent.putExtra("path", binding.edtPath.text.toString())*/

            startActivity(intent)
        }

    }
}