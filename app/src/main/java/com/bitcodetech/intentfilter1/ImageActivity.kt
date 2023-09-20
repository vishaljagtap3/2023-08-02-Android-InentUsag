package com.bitcodetech.intentfilter1

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitcodetech.intentfilter1.databinding.ImageActivityBinding

class ImageActivity : AppCompatActivity() {

    private lateinit var binding : ImageActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ImageActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*val  uri = Uri.parse( intent.getStringExtra("path") )
        binding.img.setImageURI(uri)*/

        binding.img.setImageURI(intent.data)
    }

}