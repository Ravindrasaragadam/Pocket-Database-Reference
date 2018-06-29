package com.example.ravi.projectl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class easyQuestions extends Activity {

    int count=1,score=0,clicked=0;
    String[] questions={"A relational database consists of a collection of?","A ______ in a table represents a relationship among a set of values.","The term _____ is used to refer to a row.","The term attribute refers to a _____ of a table.","Relational Algebra is a __________ query language that takes two relation as input and produces another relation as output of the query.","Which of the following is a fundamental operation in relational algebra ?"};
    String[] option={"Tables","Fields","Records","Keys","Column","Key","Row","Entry","Attribute","Tuple","Field","Instance","Record","Column","Tuple","Key","Relational","Structural","Procedural","Fundamental","Set intersection","Natural join","Assignment","None of the mentioned"};
    TextView question,no;
    Button b1,b2;
    RadioButton opt1,opt2,opt3,opt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_questions);
        no=(TextView) findViewById(R.id.textView42);
        question=(TextView) findViewById(R.id.textView41);
        opt1=(RadioButton)findViewById(R.id.radioButton);
        opt2=(RadioButton)findViewById(R.id.radioButton3);
        opt3=(RadioButton)findViewById(R.id.radioButton2);
        opt4=(RadioButton)findViewById(R.id.radioButton4);
        question.setText(questions[0]);
        no.setText(count+"/6");
        opt1.setText(option[(count-1)*4+0]);
        opt2.setText(option[(count-1)*4+1]);
        opt3.setText(option[(count-1)*4+2]);
        opt4.setText(option[(count-1)*4+3]);
        b1=(Button) findViewById(R.id.button13);
        b2=(Button) findViewById(R.id.button12);
        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt2.setChecked(false);
                opt3.setChecked(false);
                opt4.setChecked(false);
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt1.setChecked(false);
                opt3.setChecked(false);
                opt4.setChecked(false);
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt2.setChecked(false);
                opt1.setChecked(false);
                opt4.setChecked(false);
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opt2.setChecked(false);
                opt3.setChecked(false);
                opt1.setChecked(false);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(count==1)
                {
                    if(opt1.isChecked()==true)
                        score+=5;
                }
                if(count==2)
                {
                    if(opt3.isChecked()==true)
                        score+=5;
                }
                if(count==3)
                {
                    if(opt2.isChecked()==true)
                        score+=5;
                }
                if(count==4)
                {
                    if(opt2.isChecked()==true)
                        score+=5;
                }
                if(count==5)
                {
                    if(opt3.isChecked()==true)
                        score+=5;
                }
                if(count==6)
                {
                    if(opt4.isChecked()==true)
                        score+=5;
                }
                opt1.setChecked(false);
                opt2.setChecked(false);
                opt3.setChecked(false);
                opt4.setChecked(false);

                if(count<=5) {
                    count++;
                    no.setText(count+"/6");
                    opt1.setText(option[(count-1)*4+0]);
                    opt2.setText(option[(count-1)*4+1]);
                    opt3.setText(option[(count-1)*4+2]);
                    opt4.setText(option[(count-1)*4+3]);
                    question.setText(questions[count-1]);
                    //score+=50;
                }
                else
                {
                    b1.setVisibility(View.GONE);
                    question.setText("Here is your Result "+score);
                    opt1.setVisibility(View.GONE);
                    opt2.setVisibility(View.GONE);
                    opt3.setVisibility(View.GONE);
                    opt4.setVisibility(View.GONE);
                    clicked++;
                    b2.setText("Done");
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clicked==0) {
                    b1.setVisibility(View.GONE);
                    question.setText("Here is your Result " + score);
                    opt1.setVisibility(View.GONE);
                    opt2.setVisibility(View.GONE);
                    opt3.setVisibility(View.GONE);
                    opt4.setVisibility(View.GONE);
                    clicked++;
                    b2.setText("Done");
                }
                else
                {
                    Intent i=new Intent(easyQuestions.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

    }
}
