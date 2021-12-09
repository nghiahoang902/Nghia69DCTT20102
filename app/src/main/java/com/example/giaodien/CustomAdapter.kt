package com.example.giaodien

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import org.w3c.dom.Text

class CustomAdapter(var context : Context, var mangFood : ArrayList<Food>) : BaseAdapter() {
    class ViewHolder(row : View){
        var textviewgiafood : TextView
        var textviewtenfood : TextView
        var imageviewhinhfood : ImageView

        init { //anhxa
            textviewgiafood = row.findViewById(R.id.textviewgiafood) as TextView
            textviewtenfood = row.findViewById(R.id.textviewtenfood) as TextView
            imageviewhinhfood = row.findViewById(R.id.imageviewhinhfood) as ImageView
        }
    }
    override fun getCount(): Int { //Tra ve kich thuoc cua mang
        return mangFood.size
    }

    override fun getItem(position: Int): Any {
        return mangFood.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View {
        var view : View?
        var viewholder : ViewHolder
        if (convertview == null){
            var layoutinflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.layout_food, null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        }else{
            view = convertview
            viewholder = convertview.tag as ViewHolder
        }
        var food : Food = getItem(position) as Food
        viewholder.textviewgiafood.text = food.gia
        viewholder.textviewtenfood.text = food.ten
        viewholder.imageviewhinhfood.setImageResource(food.hinhanh)
        return view as View
    }
}