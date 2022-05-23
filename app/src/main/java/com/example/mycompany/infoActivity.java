package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class infoActivity extends AppCompatActivity implements View.OnClickListener {


    int imagno = 0;
    int imgs[] = {R.drawable.info1,R.drawable.info2,R.drawable.info3,R.drawable.info4,R.drawable.info5,};
    ImageView img_info;
    TextView txt_idfo;
    Button btn_info_back;
    String txts[]={"첫번째 관광지는 창덕궁과 창경궁 투어,","두번째관광지는 북촌 한옥마을","세번째 관광지는 홍대","네번째관광지는 한강다리","다섯번째관광지는 명동"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        img_info.findViewById(R.id.img_info);
        txt_idfo.findViewById(R.id.txt_idfo);
        btn_info_back.findViewById(R.id.btn_info_back);

        img_info.setOnClickListener(this);
        btn_info_back.setOnClickListener(this);
        txt_idfo.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_info:
                    Log.d("test","이미지 클릭"); imagno= ++imagno %5; img_info.setImageResource(imgs[imagno]);
                txt_idfo.setText(txts[imagno]); break;

            case R.id.btn_info_back:  Log.d("test","버튼 클릭"); finish(); break;

            case R.id.txt_idfo:  break;
        }
    }
}