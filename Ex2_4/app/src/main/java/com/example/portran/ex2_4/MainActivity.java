package com.example.portran.ex2_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private Button next_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("brad","OnCreate");
        next_page=(Button)findViewById(R.id.next_page);
        next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itent=new Intent(MainActivity.this,Page2Activity.class);
                startActivity(itent);
            }
        });
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.i("brad","onDestroy");

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("brad","onPause");

    }
    @Override
    protected void onRestart(){
        super.onResume();
        Log.i("brad","OnResume");

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("brad","onStart");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("brad","onStop");

    }

    private void gotoPage2(){
        Intent intent=new Intent(this,Page2Activity.class);
        intent.putExtra("出版","電腦人");
        intent.putExtra("作者","趙令文");
        intent.putExtra("isAndroid","true");
        intent.putExtra("price","10000");

        //startActivity(intent);
        startActivityForResult(intent, 2);
    }
    private void gotoPage3(){
        Intent intent =new Intent(this,Page3Activity.class);
        //startActivity(intent);
        startActivityForResult(intent,3);

    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==2){
           msg.setText("Come back form Page2");
        }
        else if(requestCode==3){
            msg.setText("Come back form Page3");
        }
        else{
            msg.setText("Hello,Page");
        }
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
