package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var inferenceHelper: OnnxInferenceHelper
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
        val inferButton: Button = findViewById(R.id.inferButton)

        inferenceHelper = OnnxInferenceHelper(assets, "model1.onnx")

        inferButton.setOnClickListener {
            val result = inferenceHelper.runInference()
            resultTextView.text = "推論結果: $result"
        }
    }
}
