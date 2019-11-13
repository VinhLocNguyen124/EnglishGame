package com.locslender.englishgame.Screens;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.locslender.englishgame.CreateDB;
import com.locslender.englishgame.R;
import static com.locslender.englishgame.DBContract.TOPIC;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";
    Button btnTuvung, btnTrochoi;
    Animation animBtnClick, animMonkeyImg;
    ImageView imgMonkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_home);
        final CreateDB createDB = new CreateDB(this);
        mapped();
        setAnimationButton();

        CreateDB dbHelper = new CreateDB(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

// Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();
        values.put(TOPIC.IMG_CHU_DE, "12545454");
        values.put(TOPIC.TEN_CHU_DE, "Con người");
        values.put(TOPIC.MAX_DIEM_CHU_DE,"10");

// Insert the new row, returning the primary key value of the new row
        long newRowId = db.insert(TOPIC.TABLE_NAME, null, values);

        if (newRowId==-1){
            Toast.makeText(this, "Insert failed", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Insert Successful", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            connected = true;

            Log.d(TAG, "onResume: Connect is available to use");
        } else {
            connected = false;

            Log.d(TAG, "onResume:Connect is not available to use");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        setAnimationMonkey();
    }

    private void setAnimationMonkey() {
        animMonkeyImg = AnimationUtils.loadAnimation(this, R.anim.img_monkey_home_act);
        imgMonkey.startAnimation(animMonkeyImg);
    }

    private void setAnimationButton() {
        animBtnClick = AnimationUtils.loadAnimation(this, R.anim.btn_click);
        final Intent intentTuvung = new Intent(HomeActivity.this, TopicActivity.class);
        final Intent intentTrochoi = new Intent(HomeActivity.this, MiniGameActivity.class);
        btnTuvung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animBtnClick);
                startActivity(intentTuvung);
            }
        });
        btnTrochoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animBtnClick);
                startActivity(intentTrochoi);
            }
        });

    }

    private void mapped() {
        imgMonkey = findViewById(R.id.imgMonkey);
        btnTrochoi = findViewById(R.id.btnTrochoi);
        btnTuvung = findViewById(R.id.btnTuvung);
    }
}
