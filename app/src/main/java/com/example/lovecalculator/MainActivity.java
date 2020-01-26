package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        mResult = (TextView)findViewById(R.id.etResult);

    }


    public void calculateLove(View view) {

        Log.d("calculat love","click on button");

        Random rand = new Random();
        int loveMeter = rand.nextInt(100);
        mResult.setText(Integer.toString(loveMeter) + "%");

        testoPopup(loveMeter);

    }

    private void testoPopup(int loveMeter) {

        if(loveMeter>=80){
            Toast.makeText(getApplicationContext(),"accoppiata consigliatissima",Toast.LENGTH_LONG).show();
        }else if((loveMeter > 50)&& (loveMeter<80))
        {
            Toast.makeText(getApplicationContext(),"accoppiata mediocre",Toast.LENGTH_LONG).show();
        }else if((loveMeter < 50)){
            Toast.makeText(getApplicationContext(),"accoppiata non consigliatissima",Toast.LENGTH_LONG).show();
        }

    }
}
