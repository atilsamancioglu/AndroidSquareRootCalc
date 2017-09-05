package com.atilsamancioglu.calcden;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
    }


    public void squareRoot(View view) {
        Double number = Double.parseDouble(editText.getText().toString());
        Double numberSquareRoot = Math.sqrt(number);
        textView.setText("Result: " + numberSquareRoot);
    }
}
