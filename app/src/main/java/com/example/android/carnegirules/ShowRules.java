package com.example.android.carnegirules;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowRules extends AppCompatActivity {
    private TextView tv;
    private TextView htv;
    private String[] rules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_rules);

        htv = (TextView) findViewById(R.id.txtHeader);
        tv = (TextView) findViewById(R.id.txt);

        rules = getIntent().getStringArrayExtra("rules");

        printRules();
        //Log.e("Rules length ", ""+ rules.length);
    }

    private void printRules(){
        htv.setText(rules[0]);
        String mes = "";
        for(int i=1;i<rules.length;i++)
        {
            mes = mes + rules[i]+"\n\n";
        };
        tv.setText(mes);
    }
    public void onBack(View v){
        this.finish();
    }
}
