package irdc.ex04_15;

/* import����class */
import java.util.Calendar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class EX04_15 extends Activity 
{ 
  /*�ŧi����ήɶ��ܼ�*/
  private int mYear;
  private int mMonth;
  private int mDay;
  private int mHour;
  private int mMinute;
  /*�ŧi�����ܼ�*/
  TextView tv;
  TimePicker tp;
  DatePicker dp;
  
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    /*���o�ثe����P�ɶ�*/
    Calendar c=Calendar.getInstance();
    mYear=c.get(Calendar.YEAR);
    mMonth=c.get(Calendar.MONTH);
    mDay=c.get(Calendar.DAY_OF_MONTH);
    mHour=c.get(Calendar.HOUR_OF_DAY);
    mMinute=c.get(Calendar.MINUTE);
    
    super.onCreate(savedInstanceState);
    /* ���Jmain.xml Layout */
    setContentView(R.layout.main);    
    
    /*���oTextView����A�éI�supdateDisplay()�ӳ]�w��ܪ���l����ɶ�*/
    tv= (TextView) findViewById(R.id.showTime);
    updateDisplay();
    
    /*���oDatePicker����A�Hinit()�]�w��l�ȻPonDateChangeListener() */
    dp=(DatePicker)findViewById(R.id.dPicker);
    dp.init(mYear, mMonth, mDay, new DatePicker.OnDateChangedListener()
    {
      @Override
      public void onDateChanged(DatePicker view,int year,int monthOfYear,
                                int dayOfMonth)
      {
        mYear=year;
        mMonth= monthOfYear;
        mDay=dayOfMonth;
        /*�I�supdateDisplay()�ӧ�����ܤ��*/
        updateDisplay();
      }
    });
    
    /*���oTimePicker����A�ó]�w��24�p�ɨ����*/
    tp=(TimePicker)findViewById(R.id.tPicker);
    tp.setIs24HourView(true);
    
    /*setOnTimeChangedListener�A���мgonTimeChanged event*/
    tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener()
    {
      @Override
      public void onTimeChanged(TimePicker view,int hourOfDay,int minute)
      {
        mHour=hourOfDay;
        mMinute=minute;
        /*�I�supdateDisplay()�ӧ�����ܮɶ�*/
        updateDisplay();
      }
    });
  }
    
  /*�]�w��ܤ���ɶ�����k*/
  private void updateDisplay()
  {
    tv.setText
    (
      new StringBuilder().append(mYear).append("/")
                         .append(format(mMonth + 1)).append("/")
                         .append(format(mDay)).append("�@")
                         .append(format(mHour)).append(":")
                         .append(format(mMinute))
    );
  }
  
  /*����ɶ���ܨ��ƪ���k*/
  private String format(int x)
  {
    String s=""+x;
    if(s.length()==1) s="0"+s;
    return s;
  }
}