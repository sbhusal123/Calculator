package com.android.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView display;
    int pointstat=0,buttonStat=0,len;
    String di;
    Button ac,c,abt,plus,minus,add,div,point,plmin,equals,mul;
    Button zero,one,two,three,four,five,six;
    float num1=0,num2=0;
    Button seven,eight,nine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac=(Button)findViewById(R.id.ac);
        c=(Button)findViewById(R.id.c);
        display=(TextView) findViewById(R.id.display);
        plus=(Button)findViewById(R.id.plus);
        abt=(Button)findViewById(R.id.abt);
        minus=(Button)findViewById(R.id.minus);
        mul=(Button)findViewById(R.id.mul);
        equals=(Button) findViewById(R.id.equals);
        add=(Button)findViewById(R.id.add);
        div=(Button)findViewById(R.id.div);
        point=(Button)findViewById(R.id.point);
        plmin=(Button)findViewById(R.id.plmi);
        zero=(Button)findViewById(R.id.zero);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eigth);
        nine=(Button)findViewById(R.id.nine);

        display.setSelected(true);

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("0");
                buttonStat=0;
                num1=0;
                num2=0;
                pointstat=0;
            }
        });



        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"1");
            }
        });



        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pointstat!=1) {
                    display.setText(display.getText() + ".");
                    pointstat++;
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Can't use two points",Toast.LENGTH_LONG).show();
                }
            }
        });




        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display.getText().toString().length()!=1) {
                    di = display.getText().toString();
                    len = di.length();
                    di = di.substring(0, len - 1);
                    display.setText(di);
                }
            }
        });








        plmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num=display.getText().toString();
                if(num.startsWith("+"))
                {
                    num=num.replace("+","-");
                    display.setText(num);
                }

                else if(display.getText().toString().startsWith("-"))
                {
                    num=num.replace("-","");
                    display.setText(num);
                }
                else if(!num.startsWith("+") || !num.startsWith("-"))
                {
                    display.setText("-"+num);
                }

            }
        });




        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"2");
            }
        });






        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"3");
            }
        });




        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"4");
            }
        });



        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"5");
            }
        });




        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"6");
            }
        });



        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"7");
            }
        });



        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"9");
                pointstat=0;
            }
        });


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"0");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStat=2;
                num1=Float.parseFloat(display.getText().toString());
                display.setText("0");
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStat=1;
                num1=Float.parseFloat(display.getText().toString());
                display.setText("0");
                pointstat=0;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStat=4;
                num1=Float.parseFloat(display.getText().toString());
                display.setText("0");
                pointstat=0;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonStat=3;
                num1=Float.parseFloat(display.getText().toString());
                display.setText("0");
                pointstat=0;
            }
        });


        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonStat==1) {
                    num2 = Float.parseFloat(display.getText().toString());
                    display.setText(Float.toString(num1 + num2));
                }

                if(buttonStat==2) {
                    num2 = Float.parseFloat(display.getText().toString());
                    display.setText(Float.toString(num1 - num2));
                }
                if(buttonStat==3) {
                    num2 = Float.parseFloat(display.getText().toString());
                    display.setText(Float.toString(num1 / num2));
                }
                if(buttonStat==4) {
                    num2 = Float.parseFloat(display.getText().toString());
                    display.setText(Float.toString(num1 * num2));
                }
            }
        });

        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Developed By:Surya Bhusal\nConnect to me on github: sbhusal123\nGmail:suryabhusal11@gmail.com",Toast.LENGTH_LONG).show();
            }
        });

    }
}
