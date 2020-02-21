package com.example.pupupmenu_alertbox_customalertbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttonplus,buttonminus,equal;
EditText editText;
TextView math;
    TextView finall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1 = (Button)findViewById(R.id.for1);
        button2 = (Button)findViewById(R.id.for2);
        button3 = (Button)findViewById(R.id.for3);
        button4 = (Button)findViewById(R.id.for4);
        button5 = (Button)findViewById(R.id.for5);
        button6 = (Button)findViewById(R.id.for6);
        button7 = (Button)findViewById(R.id.for7);
        button8 = (Button)findViewById(R.id.for8);
        button9 = (Button)findViewById(R.id.for9);
        button0 = (Button)findViewById(R.id.zero);
        equal = (Button)findViewById(R.id.equal);
        math = (TextView)findViewById(R.id.fast);
        finall = (TextView)findViewById(R.id.finall);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                math.setText(editText.getText().toString());

             }
        });
        buttonplus = (Button)findViewById(R.id.plus);
        buttonminus = (Button)findViewById(R.id.mainus);
        editText = (EditText)findViewById(R.id.edit);
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonplus.setOnClickListener(this);
        buttonminus.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.for1){
            editText.setText(editText.getText().toString()+"1");
        }
        if (view.getId()==R.id.for2){
            editText.setText(editText.getText().toString()+"2");
        }
        if (view.getId()==R.id.for3){
            editText.setText(editText.getText().toString()+"3");
        }
        if (view.getId()==R.id.for4){
            editText.setText(editText.getText().toString()+"4");
        }
        if (view.getId()==R.id.for5){
            editText.setText(editText.getText().toString()+"5");
        }
        if (view.getId()==R.id.for6){
            editText.setText(editText.getText().toString()+"6");
        }
        if (view.getId()==R.id.for7){
            editText.setText(editText.getText().toString()+"7");
        }
        if (view.getId()==R.id.for8){
            editText.setText(editText.getText().toString()+"8");
        }
        if (view.getId()==R.id.for9){
            editText.setText(editText.getText().toString()+"9");
        }
        if (view.getId()==R.id.zero){
            editText.setText(editText.getText().toString()+"0");
        }
        if (view.getId()==R.id.plus){
            editText.setText(editText.getText().toString()+"+");
        }
        if (view.getId()==R.id.mainus){
            editText.setText(editText.getText().toString()+"-");
        }
    }
}
