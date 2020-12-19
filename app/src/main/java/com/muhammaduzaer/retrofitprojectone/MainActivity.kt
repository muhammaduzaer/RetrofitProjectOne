package com.muhammaduzaer.retrofitprojectone

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.muhammaduzaer.retrofitprojectone.repository.Repository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)



        buttonSubmit.setOnClickListener {
            val myNumber = editTextNumber.text.toString()
            viewModel.getPost2(Integer.parseInt(myNumber))

            viewModel.myResponse2.observe(this, { response ->
                if (response.isSuccessful) {
                    textView.text = response.body().toString()

                } else {

                    textView.text = response.code().toString()
                }
            })

        }


    }
}

