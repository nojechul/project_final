package com.example.sunrinton.interpeople;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LoginActivity extends AppCompatActivity {

    EditText apartment, dong, ho;
    LoginData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        apartment = findViewById(R.id.apartmentedit);
        dong = findViewById(R.id.dongedit);
        ho = findViewById(R.id.hoedit);
        Button start = findViewById(R.id.start);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apartstr = apartment.getText().toString();
                String dongstr = dong.getText().toString();
                String hostr = ho.getText().toString();
                data = new LoginData(apartstr, dongstr, hostr);
                saveData();
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void loadData(){
        Gson gson = new Gson();
        SharedPreferences mprefs = getSharedPreferences("LoginData", MODE_PRIVATE);
        String json = mprefs.getString("LoginData", "");
        LoginData data;
        data = gson.fromJson(json, new TypeToken<LoginData>() {
        }.getType());
        this.data = data;
    }
    public void saveData(){
        SharedPreferences mprefs = getSharedPreferences("LoginData",MODE_PRIVATE);
        SharedPreferences.Editor mEditor = mprefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(data);
        mEditor.putString("LoginData",json);
        mEditor.apply();
    }
}