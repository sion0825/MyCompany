package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText userid,passwd ;
    Button btn_id, btn_info,btn_guide,btn_call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userid  = findViewById(R.id.userid);
        passwd  = findViewById(R.id.passwd);
        btn_id  = findViewById(R.id.btn_id);
        btn_info  = findViewById(R.id.btn_info);
        btn_guide  = findViewById(R.id.btn_guide);
        btn_call  = findViewById(R.id.btn_call);
        //findViewById


        btn_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "로그인 버튼 클릭", Toast.LENGTH_SHORT).show();
                String id = userid.getText().toString();
                String pw = passwd.getText().toString();
                if(id.length() <6 || pw.length()<6){
                    Toast.makeText(MainActivity.this,"아이디 또는 패스워드는 6자 이상입니다.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "ID:"+id +"PW:"+pw , Toast.LENGTH_SHORT).show();
                }
                if(id.equals("robot1") && pw.equals("123456")){
                    Log.d("test",id);
                    Log.d("test",pw);
                    Toast.makeText(MainActivity.this, "환영합니다", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"아이디 와 패스워드는 확인하세요.",Toast.LENGTH_SHORT).show();

                }
            }
        });
        btn_info.setOnClickListener(this);
        btn_guide.setOnClickListener(this);
        btn_call.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
     switch (view.getId()){
         case R.id.btn_info: Log.d("test","info"); intent= new Intent(MainActivity.this,infoActivity.class); break;
         case R.id.btn_guide: Log.d("test","guide"); intent= new Intent(MainActivity.this,GuidActivity.class); break;
         case R.id.btn_call: Log.d("test","call"); intent= new Intent(MainActivity.this,CallActivity.class); break;
     }
     startActivity(intent);
    }
}