package com.locslender.englishgame.Screens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.locslender.englishgame.R;
import com.locslender.englishgame.SliderPage.ExampleDataset;
import com.locslender.englishgame.adapters.BaiHocArrayAdapter;
import com.locslender.englishgame.model.CardData;
import com.ramotion.expandingcollection.ECBackgroundSwitcherView;
import com.ramotion.expandingcollection.ECCardData;
import com.ramotion.expandingcollection.ECPagerView;
import com.ramotion.expandingcollection.ECPagerViewAdapter;

public class TopicActivity extends AppCompatActivity {

    private ECPagerView ecPagerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_topic);

        // Create adapter for pager
        ECPagerViewAdapter adapter = new ECPagerViewAdapter(this, new ExampleDataset().getDataset()) {
            @SuppressLint("ResourceType")
            @Override
            public void instantiateCard(LayoutInflater inflaterService, ViewGroup head, ListView list, final ECCardData data) {
                final CardData cardData = (CardData) data;

                // Create adapter for list inside a card and set adapter to card content
                BaiHocArrayAdapter baiHocArrayAdapter = new BaiHocArrayAdapter(getApplicationContext(), cardData.getListItems());
                list.setAdapter(baiHocArrayAdapter);
//                list.setDivider(getResources().getDrawable(R.drawable.list_divider));
                list.setDividerHeight((int) pxFromDp(getApplicationContext(), 0.5f));
                list.setSelector(R.color.transparent);
                list.setBackgroundColor(Color.WHITE);
                String title = cardData.getHeadTitle();
                if (title == "Con Người") {
//                    list.setBackgroundResource(R.mipmap.bgtv_connguoi);
                } else {
                    if (title == "Động Vật") {
//                        list.setBackgroundResource(2131492865);
                    } else {
                        if (title == "Phương Tiện") {
                            //TODO
                        } else {
                            if (title == "Món Ăn") {
                                //TODO
                            } else {
                                if (title == "Màu Sắc") {
                                    //TODO
                                } else {
                                    if (title == "Thời Tiết") {
                                        //TODO
                                    } else {
                                        if (title == "Đồ Vật") {
                                            //TODO
                                        } else {
                                            //TODO for số đếm
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

                list.setCacheColorHint(Color.TRANSPARENT);
             

                // Add gradient to root header view
                View gradient = new View(getApplicationContext());
                gradient.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, AbsListView.LayoutParams.MATCH_PARENT));
                gradient.setBackgroundDrawable(getResources().getDrawable(R.drawable.card_head_gradient));
                head.addView(gradient);

                // Inflate main header layout and attach it to header root view
                inflaterService.inflate(R.layout.simple_head, head);

                // Set header data from data object
                TextView title1 = (TextView) head.findViewById(R.id.title);
                Typeface typeface = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    typeface = getResources().getFont(R.font.svn_gretoon);
                }
                title1.setTypeface(typeface);
                title1.setText(cardData.getHeadTitle());


                // Add onclick listener to card header for toggle card state
                head.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(final View v) {
                        ecPagerView.toggle();
                    }
                });


            }
        };

        ecPagerView = (ECPagerView) findViewById(R.id.ec_pager_element);

        ecPagerView.setPagerViewAdapter(adapter);
        ecPagerView.setBackgroundSwitcherView((ECBackgroundSwitcherView) findViewById(R.id.ec_bg_switcher_element));

    }

    @Override
    public void onBackPressed() {
        if (!ecPagerView.collapse())
            super.onBackPressed();
    }

    public static float dpFromPx(final Context context, final float px) {
        return px / context.getResources().getDisplayMetrics().density;
    }

    public static float pxFromDp(final Context context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }
}
