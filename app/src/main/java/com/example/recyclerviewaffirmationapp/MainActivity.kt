package com.example.recyclerviewaffirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewaffirmationapp.data.Datasource
import com.example.recyclerviewaffirmationapp.databinding.ActivityMainBinding
import com.example.recyclerviewaffirmationapp.model.Adapter.ItemAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = Datasource().loadAffirmations()

        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}