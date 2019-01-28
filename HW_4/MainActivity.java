package com.dtucker.mobileroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Random;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    static Random rand = new Random();
    ImageView img1 = findViewById(R.id.img1);
    ImageView img2 = findViewById(R.id.img2);
    ImageView img3 = findViewById(R.id.img3);
    ImageView img4 = findViewById(R.id.img4);
    ImageView img5 = findViewById(R.id.img5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
        } catch (Exception ex) {
            System.out.printf("%s error in onCreate\n", ex);
        }
        try {
            setContentView(R.layout.activity_main);
        } catch (Exception ex) {
            System.out.printf("%s error in setContentView\n", ex);
        }
        findViewById(R.id.roll_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //R.drawable.filename fetches an item from the drawable resource folder
                roll(img1);
                roll(img2);
                roll(img3);
                roll(img4);
                roll(img5);
            }
        });
    }

    public void roll(ImageView vw) {
        for (int i = 0; i < 50; i++) {//50 step loop will cycle the various dice faces before output
            int j = rand.nextInt(6) + 1; //gets an int from 1 to 6
            if (j == 1)
                vw.setImageResource(R.drawable.d6_1);
            else if (j == 2)
                vw.setImageResource(R.drawable.d6_2);
            else if (j == 3)
                vw.setImageResource(R.drawable.d6_3);
            else if (j == 4)
                vw.setImageResource(R.drawable.d6_4);
            else if (j == 5)
                vw.setImageResource(R.drawable.d6_5);
            else
                vw.setImageResource(R.drawable.d6_6);
        }
    }
}
