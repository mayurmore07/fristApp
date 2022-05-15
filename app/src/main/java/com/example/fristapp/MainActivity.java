package com.example.fristapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mLinearLayout;
    private TextView TxtOne;
    private TextView TxtTwo;
    private TextView TxtThree;
    private TextView TxtFour;
    private EditText TxtFive;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mLinearLayout = new LinearLayout(this);
        mLinearLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        mLinearLayout.setOrientation(LinearLayout.VERTICAL);
        mLinearLayout.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                )
        );
        TextView mTextUserName = new TextView(this);
        mTextUserName.setText("Mayur");
        mTextUserName.setTextSize(30);
        mTextUserName.setPadding(20, 20, 20, 20);
        setContentView(mLinearLayout);

        TxtOne = new EditText(this);
        TxtOne.setHint("");
        mLinearLayout.addView(TxtOne);

        TxtTwo = new EditText(this);
        TxtTwo.setHint("");
        mLinearLayout.addView(TxtTwo);

        TxtThree = new EditText(this);
        TxtThree.setHint("");
        mLinearLayout.addView(TxtThree);

        TxtFour = new EditText(this);
        TxtFour.setHint("");
        mLinearLayout.addView(TxtFour);

        TxtFive = new EditText(this);
        TxtFive.setHint("");
        mLinearLayout.addView(TxtFive);


        save = new Button(this);
        save.setText("save");
        mLinearLayout.addView(save);
        save.setOnClickListener(new saveClickListner());

    }

        class saveClickListner implements View.OnClickListener{
            public void onClick(View v){
                if(TxtFive.getText().toString().equals("1")){
                    TxtOne.setBackgroundColor(Color.BLUE);
                    TxtTwo.setBackgroundColor((Color.BLACK));
                    TxtThree.setBackgroundColor((Color.BLACK));
                    TxtFour.setBackgroundColor((Color.BLACK));
                }
                else
                    if(TxtFive.getText().toString().equals("2")){
                        TxtOne.setBackgroundColor(Color.BLACK);
                        TxtTwo.setBackgroundColor((Color.GREEN));
                        TxtThree.setBackgroundColor((Color.BLACK));
                        TxtFour.setBackgroundColor((Color.BLACK));
                    }
                    else
                        if(TxtFive.getText().toString().equals("3")){
                            TxtOne.setBackgroundColor(Color.BLACK);
                            TxtTwo.setBackgroundColor((Color.BLACK));
                            TxtThree.setBackgroundColor((Color.RED));
                            TxtFour.setBackgroundColor((Color.BLACK));
                        }
                        else
                            if(TxtFive.getText().toString().equals("4")){
                                TxtOne.setBackgroundColor(Color.BLACK);
                                TxtTwo.setBackgroundColor((Color.BLACK));
                                TxtThree.setBackgroundColor((Color.BLACK));
                                TxtFour.setBackgroundColor((Color.YELLOW));
                            }
                            else{
                                TxtOne.setText("Invalid Number");
                            }
            }
        }
    }
