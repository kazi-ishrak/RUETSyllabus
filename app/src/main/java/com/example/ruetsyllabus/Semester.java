package com.example.ruetsyllabus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Semester extends AppCompatActivity {

    Button fo,fe,so,se,to,te,foo,foe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.semester);
        fo=(Button)findViewById(R.id.fo);
        fe=(Button)findViewById(R.id.fe);
        so=(Button)findViewById(R.id.so);
        se=(Button)findViewById(R.id.se);
        to=(Button)findViewById(R.id.to);
        te=(Button)findViewById(R.id.te);
        foo=(Button)findViewById(R.id.foo);
        foe=(Button)findViewById(R.id.foe);
        fo.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,Csefo.class);
                                    startActivity(prime);
                                }
                                if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeefo.class);
                                    startActivity(prime);
                                }
                                if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Mefo.class);
                                    startActivity(prime);
                                }

                                if(getIntent().getStringExtra("department").equals("ece")){
                                    Intent prime =new Intent(Semester.this,Ecefo.class);
                                    startActivity(prime);
                                }


                            }
                        }
                );
        fe.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,CSefe.class);
                                    startActivity(prime);
                                }

                                 if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeefe.class);
                                    startActivity(prime);
                                }
                                 if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Mefe.class);
                                    startActivity(prime);
                                }
                                if(getIntent().getStringExtra("department").equals("ece")){
                                    Intent prime =new Intent(Semester.this,Ecefe.class);
                                    startActivity(prime);
                                }

                            }
                        }
                );
        so.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,Cseso.class);
                                    startActivity(prime);
                                }

                                 if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeeso.class);
                                    startActivity(prime);
                                }
                                 if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Meso.class);
                                    startActivity(prime);
                                }

                            }
                        }
                );
        se.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,Csese.class);
                                    startActivity(prime);
                                }

                                 if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Mese.class);
                                    startActivity(prime);
                                }

                                if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeese.class);
                                    startActivity(prime);
                                }
                            }
                        }
                );
        to.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,Cseto.class);
                                    startActivity(prime);
                                }
                                if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeeto.class);
                                    startActivity(prime);
                                }

                                 if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Meto.class);
                                    startActivity(prime);
                                }
                            }
                        }
                );
        te.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,Csete.class);
                                    startActivity(prime);
                                }

                                if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Mete.class);
                                    startActivity(prime);
                                }
                               if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeete.class);
                                    startActivity(prime);
                                }
                            }
                        }
                );
        foo.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,Csefoo.class);
                                    startActivity(prime);
                                }

                                 if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Mefoo.class);
                                    startActivity(prime);
                                }
                                if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeefoo.class);
                                    startActivity(prime);
                                }
                            }
                        }
                );
        foe.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if(getIntent().getStringExtra("department").equals("cse")){
                                    Intent prime =new Intent(Semester.this,Csefoe.class);
                                    startActivity(prime);
                                }
                                 if(getIntent().getStringExtra("department").equals("me")){
                                    Intent prime =new Intent(Semester.this,Mefoe.class);
                                    startActivity(prime);
                                }

                                if(getIntent().getStringExtra("department").equals("eee")){
                                    Intent prime =new Intent(Semester.this,Eeefoe.class);
                                    startActivity(prime);
                                }
                            }
                        }
                );
       

    }
}