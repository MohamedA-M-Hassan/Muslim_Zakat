package com.zakat.mamohamed.zakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     //editText; //= (EditText) findViewById(R.id.insertValue); // retrieve information from  "insertvalue" || insert value is texitedit
    public String my_msg = "Abo Shosha";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void add_revenue(View view)
    {
        EditText editText = (EditText) findViewById(R.id.insertValue); // retrieve information from  "insertvalue" || insert value is texitedit
        Intent intent = new Intent( MainActivity.this, DisplayZakatResult.class);


        String value = editText.getText().toString();


        intent.putExtra("Result", "value");
        startActivity(intent);


    }
}
