package com.androidpprog2.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    private TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        question = (TextView) findViewById(R.id.textView);
        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity2.this,R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
            }

        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity2.this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
                openActivity3();
            }
        });
    }
    public void openActivity3(){
        Intent intent2 = new Intent(this, Activity3.class);
        startActivity(intent2);
    }
}
