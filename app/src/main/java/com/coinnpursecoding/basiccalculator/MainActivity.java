package com.coinnpursecoding.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView calcView;
    Button button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonP, buttonS, buttonM,
            buttonD, buttonE, buttonC, button0, buttonDec, buttonAns,
            buttonAC, buttonRan;

   float valueOne, valueTwo, answer;

   boolean isAdding = false;
   boolean isSubbing = false;
   boolean isDividing = false;
   boolean isMultiplying = false;

    public void equalsFunc(View view){                               //The equals function prompted by pressing the equals button
        try {
            valueTwo = Float.parseFloat(calcView.getText() + "");
            if (isAdding == true) {
                answer = valueOne + valueTwo;
                calcView.setText(answer + "");
                isAdding = false;
            }

            if (isSubbing == true) {
                answer = valueOne - valueTwo;
                calcView.setText(answer + "");
                isSubbing = false;
            }

            if (isMultiplying == true) {
                answer = valueOne * valueTwo;
                calcView.setText(answer + "");
                isMultiplying = false;
            }

            if (isDividing == true) {
                answer = valueOne / valueTwo;
                calcView.setText(answer + "");
                isDividing = false;
            }

        } catch (Exception e) {                                      //Catches any input that is not a number. ex "1.5.5"
            calcView.setText("");
            Toast.makeText(getApplicationContext(), "Enter a number!", Toast.LENGTH_SHORT).show();
        }


    }

    public void equalsFunc(){
        try {
            valueTwo = Float.parseFloat(calcView.getText() + ""); //Parses inputted number into a float value
            if (isAdding == true) {                                  //Determines arithmetic based on initiated boolean
                answer = valueOne + valueTwo;
                calcView.setText(answer + "");
                isAdding = false;
            }

            if (isSubbing == true) {
                answer = valueOne - valueTwo;
                calcView.setText(answer + "");
                isSubbing = false;
            }

            if (isMultiplying == true) {
                answer = valueOne * valueTwo;
                calcView.setText(answer + "");
                isMultiplying = false;
            }

            if (isDividing == true) {
                answer = valueOne / valueTwo;
                calcView.setText(answer + "");
                isDividing = false;
            }

        } catch (Exception e) {                                     //Catches any input that is not a number. ex "1.5.5"
            calcView.setText("");
            Toast.makeText(getApplicationContext(), "Enter a number!", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcView = (TextView) findViewById(R.id.calcView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonP = (Button) findViewById(R.id.buttonP);
        buttonS = (Button) findViewById(R.id.buttonS);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonD = (Button) findViewById(R.id.buttonD);
        button0 = (Button) findViewById(R.id.button0);
        buttonDec = (Button) findViewById(R.id.buttonDec);
        buttonAns = (Button) findViewById(R.id.buttonAns);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonRan = (Button) findViewById(R.id.buttonRan);





        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              calcView.setText(calcView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "7");

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "9");

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + "0");

            }
        });

        buttonDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + ".");

            }
        });

        buttonAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcView.setText(calcView.getText() + Float.toString(answer));
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne != 0.0f && calcView.getText() != null){         //If two numbers have been inputted and another operator is pressed,
                    equalsFunc();                                           //it will automatically do the equation before receiving another.
                }
                try{
                    if(calcView.getText().length() != 0) {
                        valueOne = Float.parseFloat(calcView.getText() + "");
                        isAdding = true;
                        calcView.setText(null);
                    }
                } catch (Exception e){
                    calcView.setText("");
                    Toast.makeText(getApplicationContext(), "Enter a number!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne != 0.0f && calcView.getText() != null){
                    equalsFunc();
                }
                try{
                    if(calcView.getText().length() != 0) {
                        valueOne = Float.parseFloat(calcView.getText() + "");
                        isSubbing = true;
                        calcView.setText(null);
                    }
                } catch (Exception e){
                    calcView.setText("");
                    Toast.makeText(getApplicationContext(), "Enter a number!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne != 0.0f && calcView.getText() != null){
                    equalsFunc();
                }
                try{
                    if(calcView.getText().length() != 0) {
                        valueOne = Float.parseFloat(calcView.getText() + "");
                        isMultiplying = true;
                        calcView.setText(null);
                    }
                } catch (Exception e){
                    calcView.setText("");
                    Toast.makeText(getApplicationContext(), "Enter a number!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne != 0.0f && calcView.getText() != null){
                    equalsFunc();
                }
                try{
                    if(calcView.getText().length() != 0) {
                        valueOne = Float.parseFloat(calcView.getText() + "");
                        isDividing = true;
                        calcView.setText(null);
                    }
                } catch (Exception e){
                    calcView.setText("");
                    Toast.makeText(getApplicationContext(), "Enter a number!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() { //Clears the calcView but maintains the "answer" value for reuse
            @Override
            public void onClick(View v) {
                calcView.setText("");
            }
        });

        buttonAC.setOnClickListener(new View.OnClickListener() { //Clears the calcView and the "answer" value
            @Override
            public void onClick(View v) {
                calcView.setText("");
                answer = 0;
            }
        });

        buttonRan.setOnClickListener(new View.OnClickListener() { //Generates a random number
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                calcView.setText(Integer.toString(rand.nextInt(100)));
            }
        });



    }
}