package com.locslender.englishgame;

import android.provider.BaseColumns;

public final class DBContract {
    private  DBContract(){}

    public static class TOPIC implements BaseColumns {
        //Bảng Chủ đề
        public static final String TABLE_NAME = "chude";
        public static final String ID = "id";
        public static final String TEN_CHU_DE = "ten_chu_de";
        public static final String IMG_CHU_DE = "img_chu_de";
        public static final String MAX_DIEM_CHU_DE = "max_diem_chu_de";
    }

    public static class LESSON implements BaseColumns {
        //Bảng Chủ đề
        public static final String TABLE_NAME = "baihoc";
        public static final String ID = "id";
        public static final String TEN_BAI_HOC = "ten_bai_hoc";
        public static final String IMG_BAI_HOC = "img_bai_hoc";
        public static final String TIEN_DO_BAI_HOC = "tien_do_bai_hoc";
        public static final String ID_CHU_DE = "id_chu_de";
        public static final String MAX_DIEM_BAI_HOC = "max_diem_chu_de";
    }

    public static class VOCABULARY implements BaseColumns {
        //Bảng Chủ đề
        public static final String TABLE_NAME = "tuvung";
        public static final String ID = "id";
        public static final String TIENG_ANH = "tieng_anh";
        public static final String TIENG_VIET = "tieng_viet";
        public static final String IMG_TU_VUNG = "img_tu_vung";
        public static final String ID_BAI_HOC = "id_bai_hoc";
        public static final String TRANG_THAI_TU_VUNG = "trang_thai_tu_vung";
        public static final String TU_QUAN_TRONG = "tu_quan_trong";
    }

}
