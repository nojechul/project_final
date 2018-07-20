package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RequestActivity extends AppCompatActivity {

    ListView LV_RQ;
    ArrayList<RequestData> items = new ArrayList<>();
    TextView dong, ho, reason;
    String str1[], str2[], str3[];
    int i;

    ImageView menu;

    TextView list_title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        //to remove "information bar" above the action bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to remove the action bar (title bar)
        getSupportActionBar().hide();

        LV_RQ = findViewById(R.id.LV_RQ);
        final RequestAdapter mAdapter = new RequestAdapter(items, this);
        LV_RQ.setAdapter(mAdapter);
        dong = findViewById(R.id.dongTV);
        ho = findViewById(R.id.hoTV);
        reason = findViewById(R.id.reason);
        str1 = new String[]{"101동", "102동", "103동", "104동", "105동", "106동", "107동", "108동"};
        str2 = new String[]{"101호", "102호", "103호", "201호", "202호", "203호", "303호", "401호", "402호", "403호"};
        str3 = new String[]{"아이소리", "망치질", "가전제품", "가구", "악기", "대화", "진동", "문 개폐", "급배수", "운동기구", "동물소리", "부엌조리", "기타"};

        menu = findViewById(R.id.menu);
        list_title = findViewById(R.id.list_title);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        for (String item : str1) {
            items.add(new RequestData(item));
        }
        i = 1;

        dong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list_title.setText("동 선택");
                items.clear();
                for (String item : str1) {
                    items.add(new RequestData(item));
                }
                mAdapter.notifyDataSetChanged();
                i = 1;
            }
        });
        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list_title.setText("호 선택");
                items.clear();
                for (String item : str2) {
                    items.add(new RequestData(item));
                }
                mAdapter.notifyDataSetChanged();
                i = 2;
            }
        });
        reason.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list_title.setText("소음 유형 선택");
                items.clear();
                for (String item : str3) {
                    items.add(new RequestData(item));
                }
                mAdapter.notifyDataSetChanged();
                i = 3;
            }
        });
        LV_RQ.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str1 = items.get(position).getContent();
                switch (i) {
                    case 1:
                        dong.setText(str1);
                        break;
                    case 2:
                        ho.setText(str1);
                        break;

                    case 3:
                        reason.setText(str1);
                        break;
                    default:
                        break;
                }
            }
        });
        Button start = findViewById(R.id.BT_Request);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RequestActivity.this, "전달하였습니다.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}