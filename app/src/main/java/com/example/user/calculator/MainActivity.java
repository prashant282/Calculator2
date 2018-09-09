package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    TextView et,tv;

    public void B1(View view){
         et=findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
         }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "1");
        }
    }
    public void B2(View view){
         et= findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "2");
        }
    }
    public void B3(View view){
         et= findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "3");
        }
    }
    public void B4(View view){
         et= findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "4");
        }
    }
    public void B5(View view){
         et= findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "5");
        }
    }
    public void B6(View view){
        TextView et= findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "6");
        }
    }
    public void B7(View view){
        et= findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "7");
        }
    }
    public void B8(View view){
        TextView et=findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "8");
        }
    }
    public void B9(View view){
        et=findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "9");
        }
    }
    public void B0(View view){
         et=findViewById(R.id.et);
        String str=et.getText().toString();
        if(et.getText().toString().length()>=10) {
            Toast.makeText(getApplicationContext(),"Maximum Limit Reached",Toast.LENGTH_SHORT).show();
        }
        else {
            if (str.equals("0"))
                str = "";
            et.setText(str + "0");
        }
    }
    /*public void B(View view){
        et=findViewById(R.id.et);
        String str=et.getText().toString();
        if(str.indexOf(".")==-1)
            str=str+".";
        if(str.equals("."))
            et.setText("0"+str);
        else
            et.setText(str);
    }*/
    public void B(View view) {
        try {
            et = findViewById(R.id.et);
            int n = -(Integer.parseInt(et.getText().toString()));
            et.setText(String.valueOf(n));
        }catch (Exception e){

            Toast.makeText(getApplicationContext(),"Enter At Least 1 digit",Toast.LENGTH_SHORT).show();
        }

    }
    public void Bcl(View view){
        et= findViewById(R.id.et);
        tv.findViewById(R.id.tv);
        et.setText("");
        tv.setText("");
    }
    public void clear(View view){
        et= findViewById(R.id.et);
        String str=et.getText().toString();
        et.setText(str.substring(0,str.length()-1));
    }
    String c;
    public void sum(View view){
        et=findViewById(R.id.et);
        String str=et.getText().toString();
        c="+";
        tv=findViewById(R.id.tv);
        tv.setText(str);
        et.setText("");

    }
    public void sub(View view){
        et=findViewById(R.id.et);
        String str=et.getText().toString();
        c="-";
        tv=findViewById(R.id.tv);
        tv.setText(str);
        et.setText("");
    }
    public void mul(View view){
        et=findViewById(R.id.et);
        String str=et.getText().toString();
        c="*";
        tv=findViewById(R.id.tv);
        tv.setText(str);
        et.setText("");
    }
    public void div(View view){
        et=findViewById(R.id.et);
        String str=et.getText().toString();
        c="/";
        tv=findViewById(R.id.tv);
        tv.setText(str);
        et.setText("");
    }
    public void equal(View view) {
        try{
        et = findViewById(R.id.et);
        tv = findViewById(R.id.tv);
        int n1 = 0, n2 = 0;
        String s1 = tv.getText().toString();
        String s2 = et.getText().toString();
        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        int n = 0;
        double m = 0.0;
        switch (c) {
                case "+":
                    n = n1 + n2;
                    et.setText(String.valueOf(n));
                    tv.setText("");
                    c = "";
                    break;
                case "-":
                    n = (n1 - n2);
                    et.setText(String.valueOf(n));
                    tv.setText("");
                    c = "";
                    break;
                case "*":
                    n = (n1 * n2);
                    et.setText(String.valueOf(n));
                    tv.setText("");
                    c = "";
                    break;
                case "/":
                    m = (n1 / n2);
                    et.setText(String.valueOf(m));
                    tv.setText("");
                    c = "";
                    break;
                default:
                    et.setText(s1);
                    tv.setText(s2);
            }
            tv.setText("");
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Select atleast 1 operator",Toast.LENGTH_SHORT).show();

        }
    }
}
