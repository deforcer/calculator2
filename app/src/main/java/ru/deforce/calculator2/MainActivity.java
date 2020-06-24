package ru.deforce.calculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText textField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews() {
        textField = findViewById(R.id.editText);


    }

    public void onOneClick(View v) {
        textField.setText(textField.getText().toString() + "1");
    }

    public void onTwoClick(View v) {
        textField.setText(textField.getText().toString() + "2");
    }

    public void onThreeClick(View v) {
        textField.setText(textField.getText().toString() + "3");
    }

    public void onFourClick(View v) {
        textField.setText(textField.getText().toString() + "4");
    }

    public void onFiveClick(View v) {
        textField.setText(textField.getText().toString() + "5");
    }

    public void onSixClick(View v) {
        textField.setText(textField.getText().toString() + "6");
    }

    public void onSevenClick(View v) {
        textField.setText(textField.getText().toString() + "7");
    }

    public void onEightClick(View v) {
        textField.setText(textField.getText().toString() + "8");
    }

    public void onNineClick(View v) {
        textField.setText(textField.getText().toString() + "9");
    }

    public void onZeroClick(View v) {
        textField.setText(textField.getText().toString() + "0");
    }

    public void onCommaClick(View v) {
        textField.setText(textField.getText().toString() + ",");
    }

    public void onMultiClick(View v) {
        textField.setText(textField.getText().toString() + " * ");
    }

    public void onDivisionClick(View v) {
        textField.setText(textField.getText().toString() + " / ");
    }
    public void onPlusClick(View v) {
        textField.setText(textField.getText().toString() + " + ");
    }

    public void onMinusClick(View v) {
        textField.setText(textField.getText().toString() + " - ");
    }

    public void onClearClick(View v) {
        textField.setText("");
    }



}