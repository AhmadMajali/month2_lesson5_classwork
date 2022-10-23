package com.example.month2_lesson5_classwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        findViews();
        textWatcher();
    }

    private void findViews(){
        ImageView x = findViewById(R.id.x);
        TextView textSign = findViewById(R.id.textSign);
        TextView textLogin = findViewById(R.id.textLogin);
        EditText email = findViewById(R.id.email);
        EditText name = findViewById(R.id.name);
        EditText password = findViewById(R.id.password);
        TextView info = findViewById(R.id.info);
        Button btnSign = findViewById(R.id.btnSign);
        TextView forgot = findViewById(R.id.forgot);
        Button blank = findViewById(R.id.blank);
        TextView show = findViewById(R.id.show);


    }
    private void textWatcher() {
        ImageView x = findViewById(R.id.x);
        TextView textSign = findViewById(R.id.textSign);
        TextView textLogin = findViewById(R.id.textLogin);
        EditText email = findViewById(R.id.email);
        EditText name = findViewById(R.id.name);
        EditText password = findViewById(R.id.password);
        TextView info = findViewById(R.id.info);
        Button btnSign = findViewById(R.id.btnSign);
        TextView forgot = findViewById(R.id.forgot);
        Button blank = findViewById(R.id.blank);
        TextView show = findViewById(R.id.show);
        TextWatcher watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                btnSign.setOnClickListener(view -> {
                            if (name.getText().toString().equals("Clown") && password.getText().toString().equals("password")) {
                                Toast.makeText(getApplicationContext(), "Вход выполнен", Toast.LENGTH_LONG).show();
                                x.setVisibility(View.INVISIBLE);
                                textSign.setVisibility(View.INVISIBLE);
                                textLogin.setVisibility(View.INVISIBLE);
                                email.setVisibility(View.INVISIBLE);
                                name.setVisibility(View.INVISIBLE);
                                password.setVisibility(View.INVISIBLE);
                                info.setVisibility(View.INVISIBLE);
                                forgot.setVisibility(View.INVISIBLE);
                                blank.setVisibility(View.INVISIBLE);
                                show.setVisibility(View.INVISIBLE);
                            }

                            else {
                                Toast.makeText(getApplicationContext(), "Неправильный пароль или логин", Toast.LENGTH_LONG).show();
                            }
                        }
                );

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        };
        name.addTextChangedListener(watcher);
        password.addTextChangedListener(watcher);
    }
    }



