package com.example.nestedrecycler

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var image=R.drawable.image
        //findViewById<ImageView>(R.id.sample).setImageResource(image)
        var x=MainChild(image)
        var list:MutableList<MainChild> = MutableList<MainChild>(0, init = fun(x:Int):MainChild {
            return com.example.nestedrecycler.MainChild(image)

        })
        list.add(x)
        list.add(x)
        list.add(x)
        list.add(x)
        list.add(x)
        list.add(x)

       // var x1=Nested_Item(list,"New Arrival")

        var list1:MutableList<Nested_Item> = MutableList<Nested_Item>(6, init = fun(x:Int):Nested_Item {
            return com.example.nestedrecycler.Nested_Item(list,"New Arrival")
        })

        var recyclerView=findViewById<RecyclerView>(R.id.main_recycler)

        recyclerView.layoutManager=LinearLayoutManager(this)

        recyclerView.adapter=NestedRecyclerAdapter(list1,this)
    }
}