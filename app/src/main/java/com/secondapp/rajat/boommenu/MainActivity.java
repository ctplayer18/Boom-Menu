package com.secondapp.rajat.boommenu;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.Util;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BoomMenuButton bmb = (BoomMenuButton)findViewById(R.id.bmb);
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {

            if(i==0) {
                TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder()
                        .listener(new OnBMClickListener() {


                            @Override
                            public void onBoomButtonClick(int index) {

                                // When the boom-button corresponding this builder is clicked.
                                Toast.makeText(MainActivity.this, "Clicked " + index, Toast.LENGTH_SHORT).show();

                            }
                        })

                        .normalImageRes(R.drawable.ic_home_white_24dp)
                        .normalText("Home")
                        .textPadding(new Rect(0, 15, 0, 0))
                        .imagePadding(new Rect(10, 10, 10, 10));
                bmb.addBuilder(builder);
            }

           else if(i==1){


                TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder()
                        .listener(new OnBMClickListener() {


                            @Override
                            public void onBoomButtonClick(int index) {

                                // When the boom-button corresponding this builder is clicked.
                                Toast.makeText(MainActivity.this, "Clicked " + index, Toast.LENGTH_SHORT).show();

                            }
                        })

                        .normalImageRes(R.drawable.ic_feedback_white_24dp)
                        .normalText("Feedback")
                        .textPadding(new Rect(0, 15, 0, 0))
                        .imagePadding(new Rect(10, 10, 10, 10));

                bmb.addBuilder(builder);
            }

            else if(i==2){


                TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder()
                        .listener(new OnBMClickListener() {


                            @Override
                            public void onBoomButtonClick(int index) {

                                // When the boom-button corresponding this builder is clicked.
                                Toast.makeText(MainActivity.this, "Clicked " + index, Toast.LENGTH_SHORT).show();

                            }
                        })

                        .normalImageRes(R.drawable.ic_star_rate_white_18dp)
                        .normalText("Rate")
                        .textPadding(new Rect(0, 10, 0, 0))
                        .imagePadding(new Rect(10, 10, 10, 10))
                        .shadowEffect(true);

                bmb.addBuilder(builder);
            }

            else {


                TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder()
                        .listener(new OnBMClickListener() {


                            @Override
                            public void onBoomButtonClick(int index) {

                                // When the boom-button corresponding this builder is clicked.
                                Toast.makeText(MainActivity.this, "Clicked " + index, Toast.LENGTH_SHORT).show();

                            }
                        })

                        .normalImageRes(R.drawable.ic_settings_white_18dp)
                        .normalText("Settings")
                        .textPadding(new Rect(0, 15, 0, 0))
                        .imagePadding(new Rect(10, 10, 10, 10));

                bmb.addBuilder(builder);
            }
        }

    }
}
