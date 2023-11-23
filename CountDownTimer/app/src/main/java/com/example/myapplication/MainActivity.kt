package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.renderscript.ScriptGroup.Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonBasla.setOnClickListener{

            val sayici = object : CountDownTimer(30000,1000) {

                override fun onTick(i: Long) {
                    binding.textViewCikti.text = "Kalan Süre : ${i/1000} sn"
                }

                override fun onFinish() {
                    binding.textViewCikti.text = "Bitti!"
                }
                
            }

            sayici.start()
        }


    }
}