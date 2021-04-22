package com.example.ruetsyllabus;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cse,eee,ce,me,ece,ete,gce,ipe,cfpe,mte,mse,becm,urp,arch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cse=(Button)findViewById(R.id.cse);
        eee=(Button)findViewById(R.id.eee);
        ce=(Button)findViewById(R.id.ce);
        me=(Button)findViewById(R.id.me);
        ece=(Button)findViewById(R.id.ece);
        ete=(Button)findViewById(R.id.ete);
        gce=(Button)findViewById(R.id.gce);
        ipe=(Button)findViewById(R.id.ipe);
        cfpe=(Button)findViewById(R.id.cfpe);
        mte=(Button)findViewById(R.id.mte);
        mse=(Button)findViewById(R.id.mse);
        becm=(Button)findViewById(R.id.becm);
        urp=(Button)findViewById(R.id.urp);
        arch=(Button)findViewById(R.id.arch);

        cse.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "cse");
                                startActivity(prime);
                            }
                        }
                );
        eee.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "eee");
                                startActivity(prime);
                            }
                        }
                );
        ce.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "ce");
                                startActivity(prime);
                            }
                        }
                );
        me.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "me");
                                startActivity(prime);
                            }
                        }
                );
        ece.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "ece");
                                startActivity(prime);
                            }
                        }
                );
        ete.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "ete");
                                startActivity(prime);
                            }
                        }
                );
        gce.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "gce");
                                startActivity(prime);
                            }
                        }
                );
        ipe.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "ipe");
                                startActivity(prime);
                            }
                        }
                );
        cfpe.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "cfpe");
                                startActivity(prime);
                            }
                        }
                );
        mte.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "mte");
                                startActivity(prime);
                            }
                        }
                );
        mse.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "mse");
                                startActivity(prime);
                            }
                        }
                );
        becm.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "becm");
                                startActivity(prime);
                            }
                        }
                );
        urp.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "urp");
                                startActivity(prime);
                            }
                        }
                );
        arch.setOnClickListener
                (
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent prime =new Intent(MainActivity.this,Semester.class);
                                prime.putExtra("department", "arch");
                                startActivity(prime);
                            }
                        }
                );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}