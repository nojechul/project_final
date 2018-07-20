package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView menu;
    Toolbar bg1;
    LinearLayout bg2;
    TextView db_show;
    String tmp;

    int db_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db_in = 0;

        //to remove "information bar" above the action bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to remove the action bar (title bar)
        getSupportActionBar().hide();

        menu = findViewById(R.id.menu);
        bg1 = findViewById(R.id.action_bar);
        bg2 = findViewById(R.id.my_noise);
        db_show = findViewById(R.id.db);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        db_in = 15;

        tmp = Integer.toString(db_in);
        db_show.setText(tmp + "dB");




        if (db_in >= 30) {
            bg1.setBackgroundColor(Color.rgb(227, 88, 93));
            bg2.setBackgroundColor(Color.rgb(227, 88, 93));
        }
        else {
            bg1.setBackgroundColor(Color.rgb(78,102,237));
            bg2.setBackgroundColor(Color.rgb(78,102,237));
        }



    }
}