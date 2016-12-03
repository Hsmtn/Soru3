package com.example.hsmtn.soru3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t;
    Button b1, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        t=(TextView) findViewById(R.id.text);



        final Hastalar h=new Hastalar();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String s1=e1.getText().toString();
             String s2=e2.getText().toString();
                String sTop="";
                if(!s1.isEmpty() && !s2.isEmpty()){
                    sTop= s1 +" "+ s2;
                    h.hasta.add(sTop);
                }else {
                    Toast.makeText(getApplicationContext()," Tüm bilgileri Doldurunuz",Toast.LENGTH_SHORT).show();
                }

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a="";
                if ( !(h.hasta.isEmpty()) ){
                    for(String i : h.hasta ){
                        a += i+ "\n";
                    }
                    t.setText(a);
                }else {
                    t.setText("Liste Boş");
                }
            }
        });

    }
}
