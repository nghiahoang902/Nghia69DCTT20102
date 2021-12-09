package com.example.giaodien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayfood : ArrayList<Food> = ArrayList()
        arrayfood.add(Food("Bò Kobe", "10.000.000đ/kg", R.drawable.bokobe))
        arrayfood.add(Food("Bò Wagyu", "3.000.000đ/kg",R.drawable.bowaygu))
        arrayfood.add(Food("Thịt chó", "150.000đ/kg",R.drawable.thitcho))
        arrayfood.add(Food("Thịt dê", "300.000đ/kg",R.drawable.thitde))
        arrayfood.add(Food("Thịt gà", "80.000đ/kg",R.drawable.thitga))
        arrayfood.add(Food("Thịt heo(ba chỉ)", "150.000đ/kg",R.drawable.thitlonbachi))
        arrayfood.add(Food("Thịt vịt", "40.000đ/kg",R.drawable.thitvit))
        var listview = findViewById<ListView>(R.id.listview)
        listview.adapter = CustomAdapter(applicationContext, mangFood = arrayfood)
    }
}