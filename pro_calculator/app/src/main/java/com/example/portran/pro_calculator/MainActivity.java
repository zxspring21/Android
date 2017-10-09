package com.example.portran.pro_calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private TextView tv;
    private Button btn=null;
    private double num=0;
    int cal;
    double deci=0;
    double num2=0;
    //double radians=Math.toRadians();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.number);
        initOnClickListener();
        //button[0]=(Button)findViewById(R.id.button);
        //button[1]=(Button)findViewById(R.id.button2);
    }
    void initOnClickListener(){
        int ids[]={
                R.id.button,R.id.button2,R.id.button3,R.id.button4,
                R.id.button5,R.id.button6,R.id.button7,R.id.button8,
                R.id.button9,R.id.button10,R.id.button11,R.id.button12,
                R.id.button13,R.id.button14,R.id.button15,R.id.button16,
                R.id.button17,R.id.button18,R.id.button19
        };
        for(int k=0;k<ids.length;k++){
            if(   (btn=(Button)findViewById(ids[k])   ) !=null)
                btn.setOnClickListener(this);
        }
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                num=0;
                num2=0;
                cal=0;
                tv.setText(Double.toString(num));
                break;
            case R.id.button2:
                num=num*-1;
                tv.setText(Double.toString(num));
                break;
            case R.id.button3:
                if((num==90)||(num==270)||(num==-90)||(num==-270))
                  tv.setText(Double.toString((Math.round(Math.cos(Math.toRadians(num))))));
                else
                  tv.setText(Double.toString((Math.cos(Math.toRadians(num)))));

                break;
            case R.id.button4:
                switch(cal) {
                    case 1:
                        num = num + num2;
                        num2 = 0;
                        break;
                    case 2:
                        num = num - num2;
                        num2 = 0;
                        break;
                    case 3:
                        num = num * num2;
                        num2 = 0;
                        break;
                    case 4:
                        num = num / num2;
                        num2 = 0;
                        break;
                }
                cal=4;
                break;
            case R.id.button5:
                if(cal==0) {
                    num =num*10+ 7;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+7;
                    tv.setText(Double.toString(num2));
                }
                    break;
            case R.id.button6:
                if(cal==0) {
                    num =num*10+ 8;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+8;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button7:
                if(cal==0) {
                    num =num*10+ 9;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+9;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button8:
                switch(cal) {
                    case 1:
                        num = num + num2;
                        num2 = 0;
                        break;
                    case 2:
                        num = num - num2;
                        num2 = 0;
                        break;
                    case 3:
                        num = num * num2;
                        num2 = 0;
                        break;
                    case 4:
                        num = num / num2;
                        num2 = 0;
                        break;
                }
                cal=3;
                break;
            case R.id.button9:
                if(cal==0) {
                    num =num*10+ 4;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+4;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button10:
                if(cal==0) {
                    num =num*10+ 5;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+5;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button11:
                if(cal==0) {
                    num =num*10+ 6;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+6;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button12:
                switch(cal) {
                    case 1:
                        num = num + num2;
                        num2 = 0;
                        break;
                    case 2:
                        num = num - num2;
                        num2 = 0;
                        break;
                    case 3:
                        num = num * num2;
                        num2 = 0;
                        break;
                    case 4:
                        num = num / num2;
                        num2 = 0;
                        break;
                }
                cal=2;
                break;
            case R.id.button13:
                if(cal==0) {
                    num =num*10+ 1;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+1;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button14:
                if(cal==0) {
                    num =num*10+ 2;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+2;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button15:
                if(cal==0) {
                    num =num*10+ 3;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+3;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button16:
                switch(cal) {
                    case 1:
                        num = num + num2;
                        num2 = 0;
                        break;
                    case 2:
                        num = num - num2;
                        num2 = 0;
                        break;
                    case 3:
                        num = num * num2;
                        num2 = 0;
                        break;
                    case 4:
                        num = num / num2;
                        num2 = 0;
                        break;
                }
                cal=1;
                break;
            case R.id.button17:
                if(cal==0) {
                    num =num*10+ 0;
                    tv.setText(Double.toString(num));
                }
                else{
                    num2=num2*10+0;
                    tv.setText(Double.toString(num2));
                }
                break;
            case R.id.button18:
                //deci=deci*10;
                tv.setText(Double.toString(num));
                break;
            case R.id.button19:
                allequal(num);
                break;

        }
    }
    public void allequal(double p){
        switch(cal) {
            case 1:
                num = num + num2;
                num2 = 0;
                break;
            case 2:
                num = num - num2;
                num2 = 0;
                break;
            case 3:
                num = num * num2;
                num2 = 0;
                break;
            case 4:
                num = num / num2;
                num2 = 0;
                break;
        }
        tv.setText(Double.toString(num));
        cal=0;


    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
