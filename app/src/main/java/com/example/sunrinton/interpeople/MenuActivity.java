package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    LinearLayout button1, button2, button3, button4;
    ImageView image1, image2, image3, image4;
    TextView text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                image1.setImageResource(R.drawable.icononepurple);
                text1.setTextColor(Color.rgb(78,102,237));
                image2.setImageResource(R.drawable.icontwogrey);
                text2.setTextColor(Color.rgb(169,169,169));
                image3.setImageResource(R.drawable.iconthreegrey);
                text3.setTextColor(Color.rgb(169,169,169));
                image4.setImageResource(R.drawable.iconfourgrey);
                text4.setTextColor(Color.rgb(169,169,169));
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setImageResource(R.drawable.icononegrey);
                text1.setTextColor(Color.rgb(169,169,169));
                image2.setImageResource(R.drawable.icontwopurple);
                text2.setTextColor(Color.rgb(78,102,237));
                image3.setImageResource(R.drawable.iconthreegrey);
                text3.setTextColor(Color.rgb(169,169,169));
                image4.setImageResource(R.drawable.iconfourgrey);
                text4.setTextColor(Color.rgb(169,169,169));
                Intent intent = new Intent(MenuActivity.this, RequestActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setImageResource(R.drawable.icononegrey);
                text1.setTextColor(Color.rgb(169,169,169));
                image2.setImageResource(R.drawable.icontwogrey);
                text2.setTextColor(Color.rgb(169,169,169));
                image3.setImageResource(R.drawable.iconthreepurple);
                text3.setTextColor(Color.rgb(78,102,237));
                image4.setImageResource(R.drawable.iconfourgrey);
                text4.setTextColor(Color.rgb(169,169,169));
                Intent intent = new Intent(MenuActivity.this, CalendarListActivity.class);
                startActivity(intent);
                finish();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1.setImageResource(R.drawable.icononegrey);
                text1.setTextColor(Color.rgb(169, 169, 169));
                image2.setImageResource(R.drawable.icontwogrey);
                text2.setTextColor(Color.rgb(169,169,169));
                image3.setImageResource(R.drawable.iconthreegrey);
                text3.setTextColor(Color.rgb(169,169,169));
                image4.setImageResource(R.drawable.iconfourpurple);
                text4.setTextColor(Color.rgb(78, 102, 237));
                Intent intent = new Intent(MenuActivity.this, ComplainedListActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}