package com.zakat.mamohamed.zakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayZakatResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_zakat_result);

        Bundle extras = getIntent().getExtras();

        //Intent intent = getIntent();
        String zakatResult = extras.getString("Result");
        TextView textView =(TextView) findViewById(R.id.textView);
        textView.setText(zakatResult);
    }
}
