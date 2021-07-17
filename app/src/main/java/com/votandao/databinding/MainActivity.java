package com.votandao.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;

import android.os.Bundle;

import com.votandao.databinding.databinding.ActivityMainBinding;
import com.votandao.databinding.model.Film;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        //thay thế đối số truyền vào cho setContentView bằng binding.getRoot()
        setContentView(activityMainBinding.getRoot());

        UserRecyclerAdapter userRecyclerAdapter = new UserRecyclerAdapter(getFilmList());
        activityMainBinding.recyclerView.setAdapter(userRecyclerAdapter);
        activityMainBinding.recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private List<Film> getFilmList() {
        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("Bố Già", "Trấn Thành", true, "https://photo-cms-plo.zadn.vn/w800/Uploaded/2021/wopsvun/2020_12_03/image001_urah.jpg", 1));
        filmList.add(new Film("Cô Ba Sài Gòn", "Ngô Thanh Vân", true, "https://vntoplist.com/wp-content/uploads/2020/09/co-ba-sai-gon-186945.jpg", 2));
        filmList.add(new Film("Ai Chết Giơ Tay", "Huỳnh Lập", true, "https://sandien24h.vn/uploads/images/ai-chet-trailer%20(2).jpg", 2));
        filmList.add(new Film("Mắt Biết", "Victor Vũ", false, "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2020/10/phim-viet-chieu-rap-2020-6-696x994.jpg?fit=700%2C20000&quality=95&ssl=1", 3));
        filmList.add(new Film("30 Chưa Phải Là Tết","Quang Huy", true, "https://i.bloganchoi.com/bloganchoi.com/wp-content/uploads/2020/10/phim-viet-chieu-rap-2020-13-696x994.jpg?fit=700%2C20000&quality=95&ssl=1", 1));
        filmList.add(new Film("Sky Tour Movie", "Sơn Tùng MTP", true, "https://www.gocdienanh.com/wp-content/uploads/2020/06/sky-tour-movie-7.jpg", 5));
        filmList.add(new Film("Hai Phượng ", "Ngô Thanh Vân", true, "https://thegioidienanh.vn/stores/news_dataimages/hath/122018/08/10/4739_Hai_Phuong_-_Poster.jpg", 3));
        filmList.add(new Film("Tiệc Trăng Máu", "Nguyễn Quang Dũng", false, "https://cdn.tgdd.vn/Files/2020/10/16/1299451/5606_ttm_characterposters_ttth_800x1124.jpg", 1));
        filmList.add(new Film("Ròm", "Trần Thanh Huy", true, "https://d1j8r0kxyu9tj8.cloudfront.net/files/1618301042CTBAF7i4v3cXFfn.jpg", 2));
        filmList.add(new Film("Trạng Tí Phiêu Lưu Kí", "Phan Gia Nhật Linh", true, "https://upload.wikimedia.org/wikipedia/vi/thumb/c/cc/Tr%E1%BA%A1ng_T%C3%AD_2020.jpg/220px-Tr%E1%BA%A1ng_T%C3%AD_2020.jpg", 4));
        filmList.add(new Film("Bí Mật Đảo Linh Xà", "Nguyễn Duy Võ Ngọc", true, "https://koicine.com/wp-content/uploads/2020/11/BiMatDaoLinhXa1-731x1024.jpg", 5));
        filmList.add(new Film("Nắng 3: Lời Hứa Của Cha", "Đồng Đăng Giao", false, "https://www.venuscinema.vn/temp/-uploaded-phim_nang3%20poster_cr_500x700.jpg", 1));
        filmList.add(new Film("Chị Mười Ba: 3 Ngày Sinh Tử ", "Võ Thanh Hoà", true, "https://ss-images.saostar.vn/wp700/2020/01/18/6847649/teaser-poster.png", 2));
        filmList.add(new Film("Trạng Tí Phiêu Lưu Kí", "Phan Gia Nhật Linh", true, "https://upload.wikimedia.org/wikipedia/vi/thumb/c/cc/Tr%E1%BA%A1ng_T%C3%AD_2020.jpg/220px-Tr%E1%BA%A1ng_T%C3%AD_2020.jpg", 4));
        return filmList;
    }
}