package com.example.portran.ex_calcmachine;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends ActionBarActivity {
    private Button button,button2,button3,button4;
    private TextView textView3;
    public int i=0,locknum=0;
    public String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        textView3=(TextView)findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minus();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lock();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear_data();
            }
        });
    }

    private void plus() {
        if (locknum%2==0) {
            if(i>=0) {
                i = i + 1;
                s = String.valueOf(i);
                textView3.setText(s);
            }
        }
    }
    private void minus(){
        if(locknum%2==0) {
            if(i>=1) {
                i = i - 1;
                s = String.valueOf(i);
                textView3.setText(s);

            }
        }
    }
    private void lock(){
        locknum=locknum+1;
    }
    private void clear_data() {
        if (locknum % 2 == 0) {
            i = 0;
            s = String.valueOf(i);
            textView3.setText(s);

        }
    }

}
