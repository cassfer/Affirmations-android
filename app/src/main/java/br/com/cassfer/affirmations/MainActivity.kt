package br.com.cassfer.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import br.com.cassfer.affirmations.adapter.ItemAdapter
import br.com.cassfer.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmation()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view);

        recyclerView.adapter = ItemAdapter(this, myDataset);

        recyclerView.setHasFixedSize(true);


    }
}