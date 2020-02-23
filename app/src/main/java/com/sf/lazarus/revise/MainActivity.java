package com.sf.lazarus.revise;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button yes,no;
    private LinearLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes=findViewById(R.id.yesButton);
        no=findViewById(R.id.noButton);
        main=findViewById(R.id.mainLinear);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(Color.GREEN);

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.setBackgroundColor(Color.RED);
            }
        });
    }
}
