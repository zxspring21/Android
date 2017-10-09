package irdc.ex04_15;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class EX04_15 extends Activity 
{ 
  private Button button1;
  private EditText editext1;
  private TextView textview2;
  String s="";
  private int mYear;
  private int mMonth;
  private int mDay;
  private int mHour;
  private int mMinute;
  TextView tv;
  TimePicker tp;
  DatePicker dp;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    Calendar c=Calendar.getInstance();
    mYear=c.get(Calendar.YEAR);
    mMonth=c.get(Calendar.MONTH);
    mDay=c.get(Calendar.DAY_OF_MONTH);
    mHour=c.get(Calendar.HOUR_OF_DAY);
    mMinute=c.get(Calendar.MINUTE);
    
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    tv= (TextView) findViewById(R.id.showTime);
    button1=(Button)findViewById(R.id.button1);
    editext1=(EditText)findViewById(R.id.editText1);
    textview2=(TextView) findViewById(R.id.textView2);

    //updateDisplay();

    dp=(DatePicker)findViewById(R.id.dPicker);
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tv.setText("Input : "+s+editext1.getText()+"  "+mYear+"/"+mMonth+"/"+mDay+" "+mHour+":"+mMinute);
            s=editext1.getText()+"  "+mYear+"/"+mMonth+"/"+mDay+" "+mHour+":"+mMinute+"\n" ;

            //updateDisplay();
        }
    });
    dp.init(mYear, mMonth, mDay, new DatePicker.OnDateChangedListener()
    {
      @Override
      public void onDateChanged(DatePicker view,int year,int monthOfYear,
                                int dayOfMonth)
      {
        mYear=year;
        mMonth= monthOfYear;
        mDay=dayOfMonth;
        updateDisplay();
      }
    });
    
    tp=(TimePicker)findViewById(R.id.tPicker);
    tp.setIs24HourView(true);
    
    tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener()
    {
      @Override
      public void onTimeChanged(TimePicker view,int hourOfDay,int minute)
      {
        mHour=hourOfDay;
        mMinute=minute;
        //updateDisplay();
      }
    });
  }
    
  private void updateDisplay()
  {
    tv.setText
    (
      new StringBuilder().append("\n").append(mYear).append("/")
                         .append(format(mMonth + 1)).append("/")
                         .append(format(mDay)).append("  ")
                         .append(format(mHour)).append(":")
                         .append(format(mMinute))
    );
  }
  
  private String format(int x)
  {
    String s=""+x;
    if(s.length()==1) s="0"+s;
    return s;
  }
}