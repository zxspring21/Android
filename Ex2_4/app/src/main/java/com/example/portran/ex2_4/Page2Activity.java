package com.example.portran.ex2_4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by portran on 15/4/1.
 */
public class Page2Activity extends Activity{
    private TextView page2_msg;
    @Override
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_page2);

        page2_msg=(TextView)findViewById(R.id.page2_msg);
        Intent it=getIntent();
        String pub=it.getStringExtra("出版");
        String auth=it.getStringExtra("作者");
        int price=it.getIntExtra("price",0);
        boolean isAndroid=it.getBooleanExtra("isAndroid",false);
        page2_msg.setText("出版社 : " +pub+"\n"+
                                   " 作者 :"+ auth +"\n"+
                                   " 售價 :"+ price+"\n"+
                                   " Android:"+(isAndroid?"Yes":"No"));




    }
}
