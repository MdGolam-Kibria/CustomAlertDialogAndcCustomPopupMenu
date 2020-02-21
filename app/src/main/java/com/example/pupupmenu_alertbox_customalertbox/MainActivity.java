package com.example.pupupmenu_alertbox_customalertbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button ok, cancel, custom, menuu;
    private EditText editText;
    AlertDialog.Builder alertbulder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        custom = (Button) findViewById(R.id.cutomAlert);
        menuu = (Button) findViewById(R.id.menu);
        menuu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu();
            }
        });
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                View view1 = getLayoutInflater().inflate(R.layout.customdiolog, null);
                final Button ok = view1.findViewById(R.id.ok);
                final Button cancel = view1.findViewById(R.id.cancel);

                builder.setView(view1);

                final AlertDialog alertDialog = builder.create();
                alertDialog.setCanceledOnTouchOutside(false);
                alertDialog.show();
                ok.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "ok click", Toast.LENGTH_SHORT).show();
                    }
                });
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alertDialog.dismiss();
                        Toast.makeText(MainActivity.this, "mck", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void menu() {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, menuu);
        popupMenu.getMenuInflater().inflate(R.menu.menuitem, popupMenu.getMenu());
        popupMenu.show();
    }
}
