package com.locslender.englishgame.SliderPage;

import com.locslender.englishgame.R;
import com.locslender.englishgame.model.BaiHoc;
import com.locslender.englishgame.model.CardData;
import com.locslender.englishgame.model.Comment;
import com.locslender.englishgame.model.TuVung;
import com.ramotion.expandingcollection.ECCardData;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ExampleDataset {
    private List<ECCardData> dataset;


    public ExampleDataset() {

        dataset = new ArrayList<>(9);

        CardData item9 = new CardData();
        item9.setMainBackgroundResource(R.drawable.connguoi);
        item9.setHeadBackgroundResource(R.drawable.connguoi_header);
        item9.setHeadTitle("Con Người");
        item9.setPersonMessage("Cur adelphis studere 1?");
        item9.setPersonName("Wallace Sutton 1");
        item9.setPersonPictureResource(R.drawable.wallace_sutton);
        item9.setListItems(prepareCommentsArray(1));
        dataset.add(item9);

        CardData item8 = new CardData();
        item8.setMainBackgroundResource(R.drawable.dongvat);
        item8.setHeadBackgroundResource(R.drawable.dongvat_header);
        item8.setHeadTitle("Động Vật");
        item8.setPersonName("Tina Caldwell");
        item8.setPersonMessage("Nunquam perdere clabulare.");
        item8.setListItems(prepareCommentsArray(2));
        item8.setPersonPictureResource(R.drawable.tina_caldwell);
        dataset.add(item8);

        CardData item7 = new CardData();
        item7.setMainBackgroundResource(R.drawable.phuongtien);
        item7.setHeadBackgroundResource(R.drawable.phuongtien_header);
        item7.setHeadTitle("Phương Tiện");
        item7.setPersonMessage("Cur adelphis studere?");
        item7.setPersonName("Wallace Sutton");
        item7.setPersonPictureResource(R.drawable.wallace_sutton);
        item7.setListItems(prepareCommentsArray(3));
        dataset.add(item7);



        CardData item5 = new CardData();
        item5.setMainBackgroundResource(R.drawable.monan);
        item5.setHeadBackgroundResource(R.drawable.monan_header);
        item5.setHeadTitle("Món Ăn");
        item5.setPersonName("Tina Caldwell");
        item5.setPersonMessage("Nunquam perdere clabulare.");
        item5.setListItems(prepareCommentsArray(4));
        item5.setPersonPictureResource(R.drawable.tina_caldwell);
        dataset.add(item5);

        CardData item4 = new CardData();
        item4.setMainBackgroundResource(R.drawable.mausac);
        item4.setHeadBackgroundResource(R.drawable.mausac_header);
        item4.setHeadTitle("Màu Sắc");
        item4.setPersonMessage("Cur adelphis studere?");
        item4.setPersonName("Wallace Sutton");
        item4.setPersonPictureResource(R.drawable.wallace_sutton);
        item4.setListItems(prepareCommentsArray(5));
        dataset.add(item4);

        CardData item3 = new CardData();
        item3.setMainBackgroundResource(R.drawable.thoitiet);
        item3.setHeadBackgroundResource(R.drawable.thoitiet_header);
        item3.setHeadTitle("Thời Tiết");
        item3.setPersonMessage("Cur adelphis studere 1?");
        item3.setPersonName("Wallace Sutton 1");
        item3.setPersonPictureResource(R.drawable.wallace_sutton);
        item3.setListItems(prepareCommentsArray(6));
        dataset.add(item3);

        CardData item2 = new CardData();
        item2.setMainBackgroundResource(R.drawable.dovat);
        item2.setHeadBackgroundResource(R.drawable.dovat_header);
        item2.setHeadTitle("Đồ Vật");
        item2.setPersonName("Tina Caldwell");
        item2.setPersonMessage("Nunquam perdere clabulare.");
        item2.setListItems(prepareCommentsArray(7));
        item2.setPersonPictureResource(R.drawable.tina_caldwell);
        dataset.add(item2);

        CardData item1 = new CardData();
        item1.setMainBackgroundResource(R.drawable.sodem);
        item1.setHeadBackgroundResource(R.drawable.sodem_header);
        item1.setHeadTitle("Số Đếm");
        item1.setPersonMessage("Cur adelphis studere?");
        item1.setPersonName("Wallace Sutton");
        item1.setPersonPictureResource(R.drawable.wallace_sutton);
        item1.setListItems(prepareCommentsArray(8));
        dataset.add(item1);


    }

    public List<ECCardData> getDataset() {

        return dataset;
    }


    public List<BaiHoc> prepareCommentsArray(int idTopic){

        List<BaiHoc> baiHocs= new ArrayList<>();

        List<BaiHoc> baiHocsConnguoi= new ArrayList<>();
        baiHocsConnguoi.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",1,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",1,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",1,R.drawable.aaron_bradley)
        ));

        List<BaiHoc> baiHocsDongvat= new ArrayList<>();
        baiHocsDongvat.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",2,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",2,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",2,R.drawable.aaron_bradley)
        ));

        List<BaiHoc> baiHocsPhuongtien= new ArrayList<>();
        baiHocsPhuongtien.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",3,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",3,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",3,R.drawable.aaron_bradley)
        ));

        List<BaiHoc> baiHocsMonan= new ArrayList<>();
        baiHocsMonan.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",4,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",4,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",4,R.drawable.aaron_bradley)
        ));

        List<BaiHoc> baiHocsMausac= new ArrayList<>();
        baiHocsMausac.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",5,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",5,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",5,R.drawable.aaron_bradley)
        ));

        List<BaiHoc> baiHocsThoitiet= new ArrayList<>();
        baiHocsThoitiet.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",6,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",6,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",6,R.drawable.aaron_bradley)
        ));

        List<BaiHoc> baiHocsDovat= new ArrayList<>();
        baiHocsDovat.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",7,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",7,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",7,R.drawable.aaron_bradley)
        ));

        List<BaiHoc> baiHocsSodem= new ArrayList<>();
        baiHocsSodem.addAll(Arrays.asList(
                new BaiHoc("Bài Học Thứ Nhất",50,"9:00 AM",8,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Hai",30,"10:00 AM",8,R.drawable.aaron_bradley),
                new BaiHoc("Bài Học Thứ Ba",70,"5:00 PM",8,R.drawable.aaron_bradley)
        ));

        switch (idTopic){
            case 1:
                baiHocs=baiHocsConnguoi;
                break;
            case 2:
                baiHocs=baiHocsDongvat;
                break;
            case 3:
                baiHocs=baiHocsPhuongtien;
                break;
            case 4:
                baiHocs=baiHocsMonan;
                break;
            case 5:
                baiHocs=baiHocsMausac;
                break;
            case 6:
                baiHocs=baiHocsThoitiet;
                break;
            case 7:
                baiHocs=baiHocsDovat;
                break;
            case 8:
                baiHocs=baiHocsSodem;
                break;
        }

        return  baiHocs;

    }
}
