package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class CalendarListActivity extends AppCompatActivity {

    ListView list;
    ImageView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_list);

        //to remove "information bar" above the action bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to remove the action bar (title bar)
        getSupportActionBar().hide();

        list = findViewById(R.id.calender_list);
        menu = findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CalendarListActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ArrayList data = new ArrayList<CalendarData>();

        data.add(new CalendarData("2018년 07월 02일", "13:00 ~ 16:00 102동 엘리베이터 점검"));
        data.add(new CalendarData("2018년 07월 03일", "13:00 ~ 16:00 103동 엘리베이터 점검"));
        data.add(new CalendarData("2018년 07월 21일", "17:00 방역 / 창문을 닫아주세요"));

        CalendarCustomAdapter adapter = new CalendarCustomAdapter(data, this);
        list.setAdapter(adapter);
    }
}