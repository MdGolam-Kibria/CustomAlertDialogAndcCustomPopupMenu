package com.example.pupupmenu_alertbox_customalertbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button clickbtn,next3activity;
    TextView textView;
    CheckBox checkBox1, checkBox2;
    StringBuffer stringBuffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        clickbtn = (Button) findViewById(R.id.clickbtn);
        textView = (TextView) findViewById(R.id.textView);
        checkBox1 = (CheckBox) findViewById(R.id.kibria);
        checkBox2 = (CheckBox) findViewById(R.id.helal);
        next3activity = (Button)findViewById(R.id.next3activity);
        next3activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
        clickbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if (checkBox1.isChecked()) {
                    stringBuffer = new StringBuffer();
                    stringBuffer.append(checkBox1.getText() + "\n");
                }
                if (checkBox2.isChecked()) {
                    stringBuffer.append(checkBox2.getText());
                }
                textView.setText("your selected name is: \n" + stringBuffer.toString());
                textView.setTextColor(R.color.colorPrimaryDark);
            }

        });
    }
}
