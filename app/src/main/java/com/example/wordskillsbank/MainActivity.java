package com.example.wordskillsbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView6);
        TextView textView2 = findViewById(R.id.textView7);
        String text = "USD 65.2";
        String text2 = "EUR 75.14";
        SpannableString ss = new SpannableString(text);
        SpannableString ss2 = new SpannableString(text2);
        ForegroundColorSpan fcsBlack = new ForegroundColorSpan(Color.parseColor("#000000"));
        ForegroundColorSpan fcsGrey = new ForegroundColorSpan(Color.parseColor("#988F8F"));
        ss.setSpan(fcsBlack, 1, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(fcsGrey, 4, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(fcsBlack, 1, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(fcsGrey, 4, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView2.setText(ss2);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }

}
