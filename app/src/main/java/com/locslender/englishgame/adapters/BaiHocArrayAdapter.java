package com.locslender.englishgame.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.locslender.englishgame.R;
import com.locslender.englishgame.Screens.DanhSachTuVungActivity;
import com.locslender.englishgame.model.BaiHoc;
import com.ramotion.expandingcollection.ECCardContentListItemAdapter;

import java.util.List;

public class BaiHocArrayAdapter extends ECCardContentListItemAdapter<BaiHoc> {
    Context context;

    public BaiHocArrayAdapter(@NonNull Context context, @NonNull List<BaiHoc> objects) {
        super(context, R.layout.list_item_baihoc, objects);
        this.context =context  ;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final ViewHolder viewHolder;
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());

            rowView = inflater.inflate(R.layout.list_item_baihoc, null);
            //Config ViewHolder
            viewHolder = new ViewHolder();
            viewHolder.tvTitleBaiHoc = rowView.findViewById(R.id.tvTitleBaihocITLVBH);
            viewHolder.tvTienDoBaiHoc = rowView.findViewById(R.id.tvTiendoBaihocITLVBH);
            viewHolder.tvGioBaiHoc = rowView.findViewById(R.id.tvGioBaiHocITLVBH);
            viewHolder.progressBarTiendo = rowView.findViewById(R.id.progressBarTiendoBaiHocITLVBH);
            viewHolder.main = rowView.findViewById(R.id.main);
            rowView.setTag(viewHolder);

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context.getApplicationContext(), DanhSachTuVungActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.getApplicationContext().startActivity(intent);

                }
            });

        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        final BaiHoc baiHoc = getItem(position);
        if (baiHoc != null) {
            viewHolder.tvTitleBaiHoc.setText(baiHoc.getTitleBaiHoc());
            viewHolder.tvTienDoBaiHoc.setText(String.valueOf((int) baiHoc.getTiendoBaiHoc()));
            viewHolder.tvGioBaiHoc.setText(baiHoc.getGioBaiHoc());
            viewHolder.progressBarTiendo.setProgress((float) baiHoc.getTiendoBaiHoc());
            int id=baiHoc.getIdTopic();
            if (id==1){
                viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_connguoi);
            }else {
                if (id==2){
                    viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_dongvat);
                }else {
                    if (id==3){
                        viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_phuongtien);
                    }else {
                        if (id==4){
                            viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_monan);
                        }else {
                            if (id==5){
                                viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_mausac);
                            }else {
                                if (id==6){
                                    viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_thoitiet);
                                }else {
                                    if (id==7){
                                        viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_dovat);
                                    }else {
                                        if (id==8){
                                            viewHolder.main.setBackgroundResource(R.drawable.bg_item_list_baihoc_sodem);
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }



        return rowView;
    }

    static class ViewHolder {
        private TextView tvTitleBaiHoc;
        private RoundCornerProgressBar progressBarTiendo;
        private TextView tvTienDoBaiHoc;
        private TextView tvGioBaiHoc;
        private RelativeLayout main;

    }
}
