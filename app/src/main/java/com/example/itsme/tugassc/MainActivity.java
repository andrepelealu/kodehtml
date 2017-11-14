package com.example.itsme.tugassc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConnectInternetTask c1;
    static TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = (TextView)findViewById(R.id.myResult);
    }

    public void doSomething(View view) {
        c1 = new ConnectInternetTask(this);
        c1.execute("http://ebook-indonesia.id");
    }
}
