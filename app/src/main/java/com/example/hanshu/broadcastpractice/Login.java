package com.example.hanshu.broadcastpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by HanShu on 2016/7/18.
 */
public class Login extends Activity {
    Button log,cancel;
    EditText name,password;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log=(Button)findViewById(R.id.login);
        cancel=(Button)findViewById(R.id.cancel);
        name=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=name.getText().toString();
                String psd=password.getText().toString();
                if("admin".equals(user)&&psd.equals("123456")){
                Intent intent=new Intent(Login.this,MainActivity.class);
                startActivity(intent);
                }else{
                    Toast.makeText(Login.this,"用户名错误或者密码错误",Toast.LENGTH_SHORT);
                }

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AllActivity.removeActivity(Login.this);
            }
        });

    }

}
