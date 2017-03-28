package com.example.palani.myaddition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t2;
    Button b1;
    EditText e1,e2;
    Integer nm1,nm2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2=(TextView)findViewById(R.id.textView3);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button2);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        nm1=Integer.parseInt(e1.getText().toString());
        nm2=Integer.parseInt(e2.getText().toString());
        sum=nm1+nm2;
        t2.setText(Integer.toString(sum));
    }
});
    }
}
