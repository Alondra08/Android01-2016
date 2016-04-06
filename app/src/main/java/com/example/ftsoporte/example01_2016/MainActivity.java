package com.example.ftsoporte.example01_2016;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText Edtna1, Edtem1;
    RadioButton rbopcion1, rbopcion2;
    public String Opcion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edtna1 = (EditText) findViewById(R.id.Edtname);
        Edtem1 = (EditText) findViewById(R.id.Edtemail);
        rbopcion1 = (RadioButton) findViewById(R.id.rbopcion1);
        rbopcion2 = (RadioButton) findViewById(R.id.rbopcion2);



        View.OnClickListener radio = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.rbopcion1:
                       Opcion = "F";
                        break;
                    case R.id.rbopcion2:
                        Opcion = "M";
                        break;

                }
            }
        };
        rbopcion1.setOnClickListener(radio);
        rbopcion2.setOnClickListener(radio);
    }

    public void ClickOk(View v) {
        Toast.makeText(MainActivity.this, "Imprimiendo: " + Edtna1.getText() + " || " + Edtem1.getText()+" || "+this.Opcion,Toast.LENGTH_SHORT).show();

    }


}




