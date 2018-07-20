package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ComplainedListActivity extends AppCompatActivity {

    ListView list;
    ImageView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complained_list);

        //to remove "information bar" above the action bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to remove the action bar (title bar)
        getSupportActionBar().hide();

        list = findViewById(R.id.complained_list);
        menu = findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ComplainedListActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ArrayList data = new ArrayList<ComplainedData>();

        data.add(new ComplainedData("02일 | 101동 302호", "애완동물 소리로 인하여 피해를 받고 있습니다. 조치 부탁드려요!"));
        data.add(new ComplainedData("06일 | 101동 303호", "악기 소리로 인하여 피해를 받고 있습니다. 조치 부탁드려요!"));
        data.add(new ComplainedData("21일 | 101동 201호", "아기 울음소리로 인하여 피해를 받고 있습니다. 조치 부탁드려요!"));

        ComplainedCustomAdapter adapter = new ComplainedCustomAdapter(data, this);
        list.setAdapter(adapter);
    }

}
