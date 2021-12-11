package com.example.final_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class login_activity extends AppCompatActivity {
    EditText userid;
    EditText userpw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userid = findViewById(R.id.userid);
        userpw = findViewById(R.id.userpw);
        Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginProcess(view);
            }
        });

        Button gdBtn = (Button) findViewById(R.id.gdBtn);
        gdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(),join_activity.class);
                startActivity(intent);
            }
        });

    }
    public void loginProcess(View v){
        String uid = userid.getText().toString();
        String upw = userpw.getText().toString();
        if (uid.equals("20273019") && upw.equals(("20273019"))) {
            Toast.makeText(this," "+ uid, Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"다시 입력해주세요.", Toast.LENGTH_LONG).show();
            userpw.setText("");
        }
    }


}
