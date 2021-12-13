package com.example.giaodien

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.giaodien.Food as Food

class MainActivity : AppCompatActivity() {

//    private var layoutManager: RecyclerView.LayoutManager? = null
//    private var adapter: RecyclerView.Adapter<RecyclerView.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerview = findViewById<RecyclerView>(R.id.recyclertview)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Food>()
            data.add(Food("Bò Kobe", "10.000.000đ/kg", R.drawable.bokobe))
        data.add(Food("Bò Wagyu", "3.000.000đ/kg",R.drawable.bowaygu))
        data.add(Food("Thịt chó", "150.000đ/kg",R.drawable.thitcho))
        data.add(Food("Thịt dê", "300.000đ/kg",R.drawable.thitde))
        data.add(Food("Thịt gà", "80.000đ/kg",R.drawable.thitga))
        data.add(Food("Thịt heo(ba chỉ)", "150.000đ/kg",R.drawable.thitlonbachi))
        data.add(Food("Thịt vịt", "40.000đ/kg",R.drawable.thitvit))

        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter

    }

//        var arrayfood : ArrayList<Food> = ArrayList()
//        arrayfood.add(Food("Bò Kobe", "10.000.000đ/kg", R.drawable.bokobe))
//        arrayfood.add(Food("Bò Wagyu", "3.000.000đ/kg",R.drawable.bowaygu))
//        arrayfood.add(Food("Thịt chó", "150.000đ/kg",R.drawable.thitcho))
//        arrayfood.add(Food("Thịt dê", "300.000đ/kg",R.drawable.thitde))
//        arrayfood.add(Food("Thịt gà", "80.000đ/kg",R.drawable.thitga))
//        arrayfood.add(Food("Thịt heo(ba chỉ)", "150.000đ/kg",R.drawable.thitlonbachi))
//        arrayfood.add(Food("Thịt vịt", "40.000đ/kg",R.drawable.thitvit))
//        var recyclerview = findViewById<RecyclerView>(R.id.recyclertview)
//        recyclerview.adapter = CustomAdapter(this, )
    }