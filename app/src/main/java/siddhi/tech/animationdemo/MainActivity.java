package siddhi.tech.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private  Button btnDown;
    private Button btnUp;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDown = (Button)findViewById(R.id.btnSlideDown);
        btnUp = (Button)findViewById(R.id.btnSlideUp);
        img = (ImageView)findViewById(R.id.imgvw);
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anislidedown = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
                img.startAnimation(anislidedown);

            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
       Animation animSlidUp =        AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
            img.startAnimation(animSlidUp);
            }
        });
    }
}