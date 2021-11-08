package com.example.tp1_sayhi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtDisplay=findViewById(R.id.textViewDisplay);
        EditText edtName=findViewById(R.id.editTextTextName);
        Button btnHi=findViewById(R.id.buttonSayHi);

        btnHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =edtName.getText().toString();
                if(!(name.isEmpty()))
                    txtDisplay.setText("Hello "+name);
                else
                    txtDisplay.setText("Please enter a name!");
                edtName.setText("");

            }
        });
    }
}