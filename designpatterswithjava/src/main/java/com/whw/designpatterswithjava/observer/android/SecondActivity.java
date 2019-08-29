package com.whw.designpatterswithjava.observer.android;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.whw.designpatterswithjava.R;

public class SecondActivity extends AppCompatActivity implements Observer {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SecondActivity.this,ThridActivity.class);
                startActivity(intent);
            }
        });
        //注册
        ObservableManger.getIntanse().add(this);
    }

    @Override
    public void update(String message) {
        textView.setText(message);
    }
}
