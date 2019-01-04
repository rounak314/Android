package com.example.rony.showpassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView PassWord;
    private Button Btn_Show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
    }
    public void addListnerOnButton(){
        PassWord = (EditText)findViewById(R.id.password);
        Btn_Show = (Button)findViewById(R.id.button);

        Btn_Show.setOnClickListener(
                new View.OnClickListener(){
                   public void onClick(View v){
                       Toast.makeText(
                               MainActivity.this,PassWord.getText(),Toast.LENGTH_SHORT
                       ).show();
                   }
                }
        );
    }
}
