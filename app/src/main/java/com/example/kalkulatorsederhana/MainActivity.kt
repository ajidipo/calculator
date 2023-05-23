package com.example.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulatorsederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnTambah.setOnClickListener(){
            tambah()
        }
        binding.btnKurang.setOnClickListener(){
            kurang()
        }
        binding.btnKali.setOnClickListener(){
            kali()
        }
        binding.btnBagi.setOnClickListener(){
            bagi()
        }
        binding.hapus.setOnClickListener(){
            hapus()
        }
        setContentView(binding.root)
    }
    private fun tambah(){
        var inp1 = binding.etInput1.text.toString().toInt()
        var inp2 = binding.etInput2.text.toString().toInt()
        var hasil = inp1 + inp2
        binding.tvHasil.text = "${inp1} + ${inp2} = ${hasil}"
    }
    private fun kurang() {
        var inp1 = binding.etInput1.text.toString().toInt()
        var inp2 = binding.etInput2.text.toString().toInt()
        var hasil = inp1 - inp2
        binding.tvHasil.text = "${inp1} - ${inp2} = ${hasil}"
    }
    private fun kali() {
        var inp1 = binding.etInput1.text.toString().toInt()
        var inp2 = binding.etInput2.text.toString().toInt()
        var hasil = inp1 * inp2
        binding.tvHasil.text = "${inp1} * ${inp2} = ${hasil}"
    }
    private fun bagi() {
        var inp1 = binding.etInput1.text.toString().toInt()
        var inp2 = binding.etInput2.text.toString().toInt()
        var hasil = inp1 / inp2.toDouble()
        binding.tvHasil.text = "${inp1} / ${inp2} = ${hasil}"
    }
    private fun hapus(){
        binding.etInput1.text.clear()
        binding.etInput2.text.clear()
        binding.tvHasil.text = "Hasil"
    }
}