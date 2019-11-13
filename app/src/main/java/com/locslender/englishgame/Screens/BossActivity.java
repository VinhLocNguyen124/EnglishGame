package com.locslender.englishgame.Screens;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.locslender.englishgame.R;

public class BossActivity extends AppCompatActivity {

    TextView textScreen, textQuestion, textBtn;
    ImageView bigboss;
    Button btnContinue;
    Animation smalltobig;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);

        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);


        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        btnContinue = findViewById(R.id.btnContinue);
        textBtn = (TextView) findViewById(R.id.textBtn);

        bigboss = (ImageView) findViewById(R.id.bigboss);
        bigboss.startAnimation(smalltobig);


        final Intent intent = new Intent(BossActivity.this, MiniGameActivity.class);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Typeface typeface = getResources().getFont(R.font.fredokaoneregular);
            textQuestion.setTypeface(typeface);
            textScreen.setTypeface(typeface);

            textBtn.setTypeface(typeface);
        }
    }
}
