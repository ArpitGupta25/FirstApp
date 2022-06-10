package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView textview2;
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "calculated successfully", Toast.LENGTH_SHORT).show();
                String S = editText.getText().toString();
                int dollar = Integer.parseInt(S);
                double Rupee = 77.84*dollar;
                DecimalFormat df = new DecimalFormat(".00");
                textview2.setText("Corresponding Rupees to dollar is Rs." + df.format(Rupee));
            }
        });
    }
}