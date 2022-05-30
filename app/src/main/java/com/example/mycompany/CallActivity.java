package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {

    EditText edit_name,edit_phone,edit_mail;
    CheckBox chk_agree;
    Button btn_mail,btn_callcentor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        edit_name =findViewById(R.id.edit_name);
        edit_phone =findViewById(R.id.edit_phone);
        edit_mail =findViewById(R.id.edit_mail);
        chk_agree =findViewById(R.id.chk_agree);
        btn_mail =findViewById(R.id.btn_mail);
        btn_callcentor =findViewById(R.id.btn_callcentor);



        btn_callcentor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:010-6428-5493"));
                startActivity(intent);
            }
        });


        //이름 전화번호 상담내용개인정보 동의에 대해서
        //입력 여부를 확인한다

        btn_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_name.length()<1){
                    Toast.makeText(CallActivity.this, "이름을 입력하세요", Toast.LENGTH_SHORT).show();
                    edit_name.requestFocus();
                }else if(edit_phone.length()<1){
                    Toast.makeText(CallActivity.this, "전화번호를 입력하세요", Toast.LENGTH_SHORT).show();
                    edit_phone.requestFocus();

                }
                else if(edit_mail.length()<1){
                    Toast.makeText(CallActivity.this, "상담 내용을 입력하세요", Toast.LENGTH_SHORT).show();
                    edit_phone.requestFocus();

                }

            }
        });

    }


}