package com.locslender.englishgame.Screens;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.locslender.englishgame.R;
import com.locslender.englishgame.adapters.TuvungArrayAdapter;
import com.locslender.englishgame.model.TuVung;

import java.util.ArrayList;

public class DanhSachTuVungActivity extends AppCompatActivity {
    ListView lvTuvung;
    ArrayList<TuVung> arrTuvung;
    TuvungArrayAdapter tuvungArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_danh_sach_tu_vung);
        addFakeData();
        mapped();
        setAdapterForListViewTuVung();
    }

    private void setAdapterForListViewTuVung() {
        tuvungArrayAdapter=new TuvungArrayAdapter(getApplicationContext(),R.layout.list_item_tuvung,arrTuvung);
        lvTuvung.setAdapter(tuvungArrayAdapter);
    }

    private void mapped() {
        lvTuvung=findViewById(R.id.lvDanhSachTuVung);
    }

    private void addFakeData() {
        arrTuvung=new ArrayList<>();
        arrTuvung.add(new TuVung("Hello","Xin Chào",R.drawable.jump,1));
        arrTuvung.add(new TuVung("Hello","Xin Chào",R.drawable.jump,2));
        arrTuvung.add(new TuVung("Hello","Xin Chào",R.drawable.jump,3));
        arrTuvung.add(new TuVung("Hello","Xin Chào",R.drawable.jump,4));
        arrTuvung.add(new TuVung("Hello","Xin Chào",R.drawable.jump,5));
        arrTuvung.add(new TuVung("Hello","Xin Chào",R.drawable.jump,6));
    }
}
