package com.example.robert.ex_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button upBtn = (Button) findViewById(R.id.upBtn);
        final Button downBtn = (Button) findViewById(R.id.downBtn);
        final Button leftBtn = (Button) findViewById(R.id.leftBtn);
        final Button rightBtn = (Button) findViewById(R.id.rightBtn);
        final ImageView imgVar = (ImageView) findViewById(R.id.image);
        final TextView txtVar = (TextView) findViewById(R.id.textView);



        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVar.setText("Up");
                imgVar.setImageResource(R.drawable.up_arrow);
                imgVar.setY(imgVar.getY() - 100);
                imgVar.setX(imgVar.getX());
            }
        });
        downBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVar.setText("Down");
                imgVar.setImageResource(R.drawable.down_arrow);
                imgVar.setY(imgVar.getY() + 100);
                imgVar.setX(imgVar.getX());
            }
        });
        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVar.setText("Left");
                imgVar.setImageResource(R.drawable.left_arrow);
                imgVar.setY(imgVar.getY());
                imgVar.setX(imgVar.getX() - 100);
            }
        });
        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtVar.setText("Right");
                imgVar.setImageResource(R.drawable.right_arrow);
                imgVar.setY(imgVar.getY());
                imgVar.setX(imgVar.getX() + 100);
            }
        });
    }
}
