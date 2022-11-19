package com.example.lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView mainView;

    public String expression;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            mainView = findViewById(R.id.MainView);


    }


    public void OnClickEquals(View v)
    {
        expression = mainView.getText().toString();
        try
        {
            mainView.setText(String.valueOf(Calc.eval(expression)));
        }
        catch (Exception e)
        {
            mainView.setText("ERROR");
        }

    }

    @SuppressLint("SetTextI18n")
    public void OnClick(View v)
    {
        try
        {
            switch(v.getId()) {
                case (R.id.buttonBracket1):
                    mainView.setText(mainView.getText() + "(");
                    break;

                case (R.id.buttonBracket2):
                    mainView.setText(mainView.getText() + ")");
                    break;

                case (R.id.buttonDel):
                    mainView.setText(mainView.getText().subSequence(0, mainView.getText().length() - 1));
                    break;

                case (R.id.buttonClear):
                    mainView.setText("");
                    break;

                case (R.id.buttonSeven):
                    mainView.setText(mainView.getText() + "7");
                    break;

                case (R.id.buttonEight):
                    mainView.setText(mainView.getText() + "8");
                    break;

                case (R.id.buttonNine):
                    mainView.setText(mainView.getText() + "9");
                    break;

                case (R.id.buttonFour):
                    mainView.setText(mainView.getText() + "4");
                    break;

                case (R.id.buttonFive):
                    mainView.setText(mainView.getText() + "5");
                    break;

                case (R.id.buttonSix):
                    mainView.setText(mainView.getText() + "6");
                    break;

                case (R.id.buttonOne):
                    mainView.setText(mainView.getText() + "1");
                    break;

                case (R.id.buttonTwo):
                    mainView.setText(mainView.getText() + "2");
                    break;

                case (R.id.buttonThree):
                    mainView.setText(mainView.getText() + "3");
                    break;

                case (R.id.buttonZero):
                    mainView.setText(mainView.getText() + "0");
                    break;

                case (R.id.buttonPoint):
                    mainView.setText(mainView.getText() + ".");
                    break;

                case (R.id.buttonPlus):
                    mainView.setText(mainView.getText() + "+");
                    break;

                case (R.id.buttonMinus):
                    mainView.setText(mainView.getText() + "-");
                    break;

                case (R.id.buttonDev):
                    mainView.setText(mainView.getText() + "÷");
                    break;

                case (R.id.buttonMulti):
                    mainView.setText(mainView.getText() + "×");
                    break;
            }
        }
        catch (Exception e)
            {
                mainView.setText("ERROR");
            }

        }


    }