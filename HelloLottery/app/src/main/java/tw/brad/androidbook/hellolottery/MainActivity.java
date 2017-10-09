package tw.brad.androidbook.hellolottery;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Iterator;
import java.util.TreeSet;


public class MainActivity extends ActionBarActivity {
    private Button torich;
    private TextView richnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        torich=(Button)findViewById(R.id.torich);
        richnum=(TextView)findViewById(R.id.richnum);

        torich.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                createLottery();
            }
        });
    }
    //該方法用來產生樂透號碼
    private void createLottery(){
        TreeSet<Integer> set=new TreeSet<Integer>();
        while(set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        richnum.setText("");
        Iterator<Integer> iterator= set.iterator();
        while(iterator.hasNext()){
            int num = iterator.next();
            richnum.append(num +" ");
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
