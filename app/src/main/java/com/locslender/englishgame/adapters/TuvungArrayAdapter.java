package com.locslender.englishgame.adapters;

import android.content.Context;
import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.locslender.englishgame.R;
import com.locslender.englishgame.Screens.TuvungActivity;
import com.locslender.englishgame.model.TuVung;
import com.ramotion.expandingcollection.ECCardContentListItemAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TuvungArrayAdapter extends ArrayAdapter<TuVung> {

    Context context;
    int resource;
    ArrayList<TuVung> arrTuvung;
    TextToSpeech tts;
    private static final String TAG = "TuvungArrayAdapter";

    public TuvungArrayAdapter( Context context1, int resource1, ArrayList<TuVung> arrTuvung) {
        super(context1, resource1, arrTuvung);
        this.context = context1;
        this.resource = resource1;
        this.arrTuvung = arrTuvung;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final ViewHolder viewHolder;
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            rowView = inflater.inflate(R.layout.list_item_tuvung, null);
            // configure view holder
            viewHolder = new ViewHolder();
            viewHolder.tvTuTiengAnh = (TextView) rowView.findViewById(R.id.tvTiengAnhLITV);
            viewHolder.tvTuTiengViet = (TextView) rowView.findViewById(R.id.tvTiengVietLITV);
            viewHolder.layoutCatchEvent = rowView.findViewById(R.id.layoutCatchEvent);
            viewHolder.moveView = rowView.findViewById(R.id.layoutMove);
            viewHolder.layoutRoot = rowView.findViewById(R.id.layoutRoot);
            viewHolder.imgSound = rowView.findViewById(R.id.imgSoundLITV);
            viewHolder.imgTuQuanTrong=rowView.findViewById(R.id.imgTuQuanTrongLITV);
            viewHolder.imgActive=rowView.findViewById(R.id.imgActiveLITV);
            viewHolder.imgHinh = (ImageView) rowView.findViewById(R.id.imgLITV);
            rowView.setTag(viewHolder);

            viewHolder.animMovetoRight = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.move_to_right);
            viewHolder.animMovetoLeft = AnimationUtils.loadAnimation(context.getApplicationContext(), R.anim.move_to_left);

            viewHolder.layoutCatchEvent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (viewHolder.check == 1) {
                        viewHolder.moveView.setBackgroundResource(R.drawable.bg_green_child_layout);
                        viewHolder.layoutRoot.setBackgroundResource(R.drawable.bg_green_parent_layout);
                        viewHolder.moveView.startAnimation(viewHolder.animMovetoRight);
                        viewHolder.check = 0;
                    } else {
                        viewHolder.moveView.setBackgroundResource(R.drawable.bg_red_child_layout);
                        viewHolder.layoutRoot.setBackgroundResource(R.drawable.bg_red_parent_layout);
                        viewHolder.moveView.startAnimation(viewHolder.animMovetoLeft);
                        viewHolder.check = 1;
                    }
                }
            });

            viewHolder.imgSound.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    tts = new TextToSpeech(context.getApplicationContext(), new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            if (status == TextToSpeech.SUCCESS) {
                                if (viewHolder.check == 1) {
                                    int result = tts.setLanguage(Locale.getDefault());
                                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                        Log.d(TAG, "onInit: This Language is not supported");
                                    } else {
                                        tts.speak(viewHolder.tvTuTiengViet.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                                    }
                                } else {
                                    int result = tts.setLanguage(Locale.US);
                                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                                        Log.d(TAG, "onInit: This Language is not supported");
                                    } else {
                                        tts.speak(viewHolder.tvTuTiengAnh.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
                                    }
                                }

                            }
                        }
                    });
                }
            });

            viewHolder.imgTuQuanTrong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context.getApplicationContext(), "Chức năng nhắc từ quan trọng chưa xử lý", Toast.LENGTH_SHORT).show();
                }
            });

            viewHolder.imgActive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context.getApplicationContext(), "Chức năng từ đã học chưa hoàn thành", Toast.LENGTH_SHORT).show();
                }
            });

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context.getApplicationContext(), TuvungActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.getApplicationContext().startActivity(intent);
                    String s = String.valueOf(R.mipmap.bgtv_dongvat);
                    Toast.makeText(context.getApplicationContext(), s, Toast.LENGTH_LONG).show();
                }
            });

        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        final TuVung tuVung = getItem(position);
        if (tuVung != null) {
            viewHolder.tvTuTiengAnh.setText(tuVung.getTuTiengAnh());
            viewHolder.tvTuTiengViet.setText(tuVung.getTuTiengViet());
            viewHolder.imgHinh.setImageResource(tuVung.getImgTuvung());
        }


        return rowView;
    }

    static class ViewHolder {

        int check = 1;
        Animation animMovetoRight, animMovetoLeft;

        TextView tvTuTiengAnh;
        TextView tvTuTiengViet;
        RelativeLayout layoutCatchEvent;
        RelativeLayout moveView;
        RelativeLayout layoutRoot;
        ImageView imgHinh;
        ImageView imgSound;
        ImageView imgTuQuanTrong;
        ImageView imgActive;
    }
}
