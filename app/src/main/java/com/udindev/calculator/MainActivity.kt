package com.udindev.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt_hasil.text = ""
        txt_operasi.text = ""

        var angka1 = ""
        var angka2 = ""
        var hasil = 0
        var operasi = ""


        btn_plus.setOnClickListener {
            if (angka1.isNotEmpty() && operasi.isEmpty()) operasi = "+"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn_min.setOnClickListener {
            if (angka1.isNotEmpty() && operasi.isEmpty()) operasi = "-"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn_kali.setOnClickListener {
            if (angka1.isNotEmpty() && operasi.isEmpty()) operasi = "x"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn_bagi.setOnClickListener {
            if (angka1.isNotEmpty() && operasi.isEmpty()) operasi = "/"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn0.setOnClickListener {
            if (operasi.isEmpty()) angka1 += "0" else angka2 += "0"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn1.setOnClickListener {
            if (operasi.isEmpty()) angka1 += "1" else angka2 += "1"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn2.setOnClickListener {
            if (operasi.isEmpty()) angka1 += "2" else angka2 += "2"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn3.setOnClickListener {
            if (operasi.isEmpty()) angka1 += "3" else angka2 += "3"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn4.setOnClickListener {
            if (operasi.isEmpty()) angka1 += "4" else angka2 += "4"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn5.setOnClickListener {
            if (operasi.isEmpty()) angka1 += "5" else angka2 += "5"
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn6.setOnClickListener {
            if (operasi.isEmpty()) {
                angka1 += "6"
            } else {
                angka2 += "6"
            }
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn7.setOnClickListener {
            if (operasi.isEmpty()) {
                angka1 += "7"
            } else {
                angka2 += "7"
            }
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn8.setOnClickListener {
            if (operasi.isEmpty()) {
                angka1 += "8"
            } else {
                angka2 += "8"
            }
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn9.setOnClickListener {
            if (operasi.isEmpty()) {
                angka1 += "9"
            } else {
                angka2 += "9"
            }
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn_delete.setOnClickListener {

            if (operasi.isEmpty() && angka2.isEmpty()) {
                angka1 = angka1.dropLast(1)
            } else if (angka2.isEmpty() && angka1.isNotEmpty()) {
                operasi = operasi.dropLast(1)
            } else {
                angka2 = angka2.dropLast(1)
            }
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn_clear.setOnClickListener {
            angka1 = ""
            angka2 = ""
            operasi = ""

            txt_operasi.text = ""
            txt_hasil.text = "$angka1 $operasi $angka2"
        }

        btn_equal.setOnClickListener {
            val a = angka1.toInt()
            val b = angka2.toInt()

            when(operasi) {
                "+" -> hasil = a + b
                "-" -> hasil = a - b
                "/" -> hasil = a / b
                "x" -> hasil = a * b
            }

            txt_operasi.text = "$angka1 $operasi $angka2"
            txt_hasil.text = "$hasil"
        }

    }
}