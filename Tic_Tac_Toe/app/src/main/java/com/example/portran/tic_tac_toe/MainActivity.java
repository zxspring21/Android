package com.example.portran.tic_tac_toe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends Activity implements OnClickListener {
    private Button btn=null,button1,button2,button3,
            button4,button5,button6,button7,button8,button9;
    public TextView textView2;
    private int count=0;
    ArrayList list=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2=(TextView) findViewById(R.id.textView2);
        initOnClickListener();
    }
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }
    void initOnClickListener(){
        int ids[]={
                R.id.button1,R.id.button2,R.id.button3,R.id.button4,
                R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,};
        for(int k=0;k<ids.length;k++){
            if(   (btn=(Button)findViewById(ids[k])) !=null)
                btn.setOnClickListener(this);
        }
    };

    public void onClick(View v) {
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        Button input;
        int temp,number;
        switch (v.getId()) {
            case R.id.button1:
                    input = (Button) findViewById(v.getId());
                     if(list.contains("1")) {
                        number=0;
                     }
                     else {
                         list.add("1");
                         if (count++ % 2 == 1) {
                             input.setText(" o ");
                         } else {
                             input.setText(" X ");
                         }
                         if(list.size()==9){
                             break;
                         }
                         //AIMOVE();
                         if(!list.contains("5"))
                         {
                             list.add("5");
                             if (count++ % 2 == 1) {
                                 button5.setText(" o ");
                             } else {
                                 button5.setText(" X ");
                             }
                         }
                         else {
                             temp = (int) (Math.random() * 9 + 1);
                             while (list.contains(String.valueOf(temp))) {
                                 temp = (int) (Math.random() * 9 + 1);
                             }
                             list.add(String.valueOf(temp));

                             switch (String.valueOf(temp)) {
                                 case "1":
                                     if (count++ % 2 == 1) {
                                         button1.setText(" o ");
                                     } else {
                                         button1.setText(" X ");
                                     }
                                     break;
                                 case "2":
                                     if (count++ % 2 == 1) {
                                         button2.setText(" o ");
                                     } else {
                                         button2.setText(" X ");
                                     }
                                     break;
                                 case "3":
                                     if (count++ % 2 == 1) {
                                         button3.setText(" o ");
                                     } else {
                                         button3.setText(" X ");
                                     }
                                     break;
                                 case "4":
                                     if (count++ % 2 == 1) {
                                         button4.setText(" o ");
                                     } else {
                                         button4.setText(" X ");
                                     }
                                     break;
                                 case "5":
                                     if (count++ % 2 == 1) {
                                         button5.setText(" o ");
                                     } else {
                                         button5.setText(" X ");
                                     }
                                     break;
                                 case "6":
                                     if (count++ % 2 == 1) {
                                         button6.setText(" o ");
                                     } else {
                                         button6.setText(" X ");
                                     }
                                     break;
                                 case "7":
                                     if (count++ % 2 == 1) {
                                         button7.setText(" o ");
                                     } else {
                                         button7.setText(" X ");
                                     }
                                     break;
                                 case "8":
                                     if (count++ % 2 == 1) {
                                         button8.setText(" o ");
                                     } else {
                                         button8.setText(" X ");
                                     }
                                     break;
                                 case "9":
                                     if (count++ % 2 == 1) {
                                         button9.setText(" o ");
                                     } else {
                                         button9.setText(" X ");
                                     }
                                     break;


                             }//end switch
                         }//end else


                         String k = "";
                         for (Object e : list) {
                             //k = k + e;
                            // System.out.print(e + " ");

                         }
                         //input.setText(list.size() + "\n" + k);
                         if(winnercase()==1)
                             onStop();
                     }
                break;
            case R.id.button2:
                input = (Button) findViewById(v.getId());
                if(list.contains("2")) {
                    number=0;
                }
                else {
                    list.add("2");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {
                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else


                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                        //System.out.print(e + " ");

                    }
                    //input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();
                }
                break;
            case R.id.button3:
                input = (Button) findViewById(v.getId());
                if(list.contains("3")) {
                    number=0;
                }
                else {
                    list.add("3");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {
                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else


                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                        //System.out.print(e + " ");

                    }
                   // input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();
                }
                break;
            case R.id.button4:
                input = (Button) findViewById(v.getId());
                if(list.contains("4")) {
                    number=0;
                }
                else {
                    list.add("4");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {
                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else


                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                        //System.out.print(e + " ");

                    }
                    //input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();
                }
                break;
            case R.id.button5:
                input = (Button) findViewById(v.getId());
                if(list.contains("5")) {
                    number=0;
                }
                else {
                    list.add("5");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {
                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else


                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                      //  System.out.print(e + " ");

                    }
                   // input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();
                }
                break;
            case R.id.button6:
                input = (Button) findViewById(v.getId());
                if(list.contains("6")) {
                    number=0;
                }
                else {
                    list.add("6");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {
                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else


                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                        System.out.print(e + " ");

                    }
                    //input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();
                }
                break;
            case R.id.button7:
                input = (Button) findViewById(v.getId());
                if(list.contains("7")) {

                }
                else {
                    list.add("7");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {

                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else


                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                        System.out.print(e + " ");

                    }
                    //input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();
                }
                break;
            case R.id.button8:
                input = (Button) findViewById(v.getId());
                if(list.contains("8")) {
                    number=0;
                }
                else {
                    list.add("8");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {
                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else

                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                        System.out.print(e + " ");

                    }
                    //input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();
                }
                break;
            case R.id.button9:
                input = (Button) findViewById(v.getId());
                if(list.contains("9")) {
                    number=0;
                }
                else {
                    list.add("9");
                    if (count++ % 2 == 1) {
                        input.setText(" o ");
                    } else {
                        input.setText(" X ");
                    }
                    if(list.size()==9){
                        break;
                    }
                    //AIMOVE();
                    if(!list.contains("5"))
                    {
                        list.add("5");
                        if (count++ % 2 == 1) {
                            button5.setText(" o ");
                        } else {
                            button5.setText(" X ");
                        }
                    }
                    else {
                        temp = (int) (Math.random() * 9 + 1);
                        while (list.contains(String.valueOf(temp))) {
                            temp = (int) (Math.random() * 9 + 1);
                        }
                        list.add(String.valueOf(temp));

                        switch (String.valueOf(temp)) {
                            case "1":
                                if (count++ % 2 == 1) {
                                    button1.setText(" o ");
                                } else {
                                    button1.setText(" X ");
                                }
                                break;
                            case "2":
                                if (count++ % 2 == 1) {
                                    button2.setText(" o ");
                                } else {
                                    button2.setText(" X ");
                                }
                                break;
                            case "3":
                                if (count++ % 2 == 1) {
                                    button3.setText(" o ");
                                } else {
                                    button3.setText(" X ");
                                }
                                break;
                            case "4":
                                if (count++ % 2 == 1) {
                                    button4.setText(" o ");
                                } else {
                                    button4.setText(" X ");
                                }
                                break;
                            case "5":
                                if (count++ % 2 == 1) {
                                    button5.setText(" o ");
                                } else {
                                    button5.setText(" X ");
                                }
                                break;
                            case "6":
                                if (count++ % 2 == 1) {
                                    button6.setText(" o ");
                                } else {
                                    button6.setText(" X ");
                                }
                                break;
                            case "7":
                                if (count++ % 2 == 1) {
                                    button7.setText(" o ");
                                } else {
                                    button7.setText(" X ");
                                }
                                break;
                            case "8":
                                if (count++ % 2 == 1) {
                                    button8.setText(" o ");
                                } else {
                                    button8.setText(" X ");
                                }
                                break;
                            case "9":
                                if (count++ % 2 == 1) {
                                    button9.setText(" o ");
                                } else {
                                    button9.setText(" X ");
                                }
                                break;


                        }//end switch
                    }//end else


                    String k = "";
                    for (Object e : list) {
                        k = k + e;
                        System.out.print(e + " ");

                    }
                    //input.setText(list.size() + "\n" + k);
                    if(winnercase()==1)
                        onStop();

                }
                break;
        }
    };


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

    public int winnercase() {
        if ((button1.getText() == " X ") && (button2.getText() == " X ") && (button3.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button4.getText() == " X ") && (button5.getText() == " X ") && (button6.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button7.getText() == " X ") && (button8.getText() == " X ") && (button9.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button1.getText() == " X ") && (button4.getText() == " X ") && (button7.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button2.getText() == " X ") && (button5.getText() == " X ") && (button8.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button3.getText() == " X ") && (button6.getText() == " X ") && (button9.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button1.getText() == " X ") && (button5.getText() == " X ") && (button9.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button3.getText() == " X ") && (button5.getText() == " X ") && (button7.getText() == " X ")) {
            textView2.setText("You win!!!");
            return 1;
        } else if ((button1.getText() == " o ") && (button2.getText() == " o ") && (button3.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        } else if ((button4.getText() == " o ") && (button5.getText() == " o ") && (button6.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        } else if ((button7.getText() == " o ") && (button8.getText() == " o ") && (button9.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        } else if ((button1.getText() == " o ") && (button4.getText() == " o ") && (button7.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        } else if ((button2.getText() == " o ") && (button5.getText() == " o ") && (button8.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        } else if ((button3.getText() == " o ") && (button6.getText() == " o ") && (button9.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        } else if ((button1.getText() == " o ") && (button5.getText() == " o ") && (button9.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        } else if ((button3.getText() == " o ") && (button5.getText() == " o") && (button7.getText() == " o ")) {
            textView2.setText("computer win!!!\nyou lost!!!");
            return 1;
        }else {
            return 0;
        }
    }//end winnercase

}
