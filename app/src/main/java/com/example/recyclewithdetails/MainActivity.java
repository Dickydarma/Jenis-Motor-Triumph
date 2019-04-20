package com.example.recyclewithdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mImageDescriptionImage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        mImageUrls.add("https://ik.imagekit.io/hj8sm3kk7/large/gallery/exterior/93/1723/triumph-bonneville-slant-front-view-full-image-212819.jpg");
        mNames.add("Triumph Bonneville T120");
        mDesc.add("Kapasitas Mesin 1200CC");
        mImageDescriptionImage.add("Triumph Bonneville T120 lahir untuk bersaing dengan motor legendaris lain seperti Harley-Davidson Sportster, BMW Motorrad R nineT dan Moto Guzzi V7. Tapi sosoknya justru jadi andalan builder motor custom. Seperti sebuah bengkel custom berjuluk BAAK Motorcycle yang didirikan di Lyon, Perancis yang memodifikasi motor Bonneville ini. bengkel ini memiliki reputasi yang bagus baik dalam mendevelop sebuah motor maupun spare part untuk Royal Enfield, Moto Guzzi dan Triumph.");

        mImageUrls.add("https://dennypedia.com/wp-content/uploads/2017/08/TriumphStreetScrambler.jpg");
        mNames.add("Triumph Street Scrambler");
        mDesc.add("Kapasitas Mesin 1200CC");
        mImageDescriptionImage.add("Karakter mesin Triumph Street Scrambler ialah overstroke dengan perbandingkan bore sama stroke nya lebih besar yang stroke yakni 84,6 mm & 88 mm. Maksimum power motor ini di atas kertas cukup besar yakni 55 HP ( 40.5 kW ) / 6000 rpm dengan torsi 59 FT-lbs ( 80 Nm ) / 2850 rpm. Top speed triumph street scrambler juga termasuk kencang. Ada dua model baru yang luar biasa, XC yang sangat lengkap dan XE kelas atas dan keduanya dirancang untuk gaya dan kemampuan tiada banding; untuk jalan, untuk petualangan asli dan untuk perebutan penuh. Scrambler 1200 XC serba guna yang baru dan baru, memberikan kemampuan jalan dan off-jalan berkinerja tinggi yang luar biasa dan spesifikasi yang lebih tinggi Scrambler 1200 XE dibangun untuk memenuhi tantangan off-road yang lebih ekstrim. Sebuah kemajuan sejati dalam sepeda motor, ini adalah kelahiran generasi pengacak yang sama sekali baru.");

        mImageUrls.add("https://ik.imagekit.io/hj8sm3kk7/large/gallery/exterior/93/1930/triumph-bonneville-t100-slant-front-view-full-image-174873.jpg");
        mNames.add("Triumph Bonneville T100");
        mDesc.add("Kapasitas Mesin 900CC");
        mImageDescriptionImage.add("Triumph Bonneville T100 ini akan hadir dengan gaya model motor ala tahun 60-an yang merupakan gaya asli dari motor Triumph Bonneville tersebut. Hal tersebut tampak pada sisi depannya yang terpasang sebuah headlamp dengan bentuk bulat menjadikan kesan klasik dari motor ini makin terlihat begitu kental terasa. Selain itu, pada samping sisi kanan dan kiri dari headlamp Triumph Bonneville T100 ini, tampak juga terpasang manis sepasang lampu sein yang didesain bergaya motor ala 60an. Terinspirasi oleh ikon '59 Bonneville, sepeda motor T100 adalah klasik modern dengan karakter khas yang menggabungkan lebih banyak DNA Bonneville asli, bersama dengan banyak hasil akhir yang menakjubkan, fitur, dan detail dari Bonneville T120 dan T120 Black yang lebih besar. T100s menawarkan kinerja mendebarkan dari mesin Bonneville torsi tinggi 900cc, menghasilkan torsi yang lebih besar, penghematan bahan bakar yang lebih baik, dan nada knalpot yang dalam dan kaya. ");

        mImageUrls.add("https://ik.imagekit.io/hj8sm3kk7/large/gallery/exterior/93/1911/triumph-bonneville-bobber-slant-rear-view-full-image-950527.jpg");
        mNames.add("Triumph Bonneville Bobber");
        mDesc.add(" Kapasitas Mesin 1200CC");
        mImageDescriptionImage.add("Bonneville Bobber ini mengusung mesin berkapasitas 1200cc yang diambil dari model T120. Mesin berteknologi parallel-twin dan berpendingin cairan tersebut diklaim mampu menyemburkan tenaga sampai 76bhp pada putaran mesin 6100rpm dan untuk torsi maksimumnya bisa mencapai 78Nm di 4000rpm. Bonneville Bobber dan Bobber Black, yang cerdas klasik, menggabungkan teknik yang elegan dan teknologi terdepan dalam kategori dan kemampuan dengan warisan yang tak tertandingi serta perjalanan dan suara hot rod yang mengasyikkan. Di jantung kedua sepeda motor, Anda akan menemukan mesin torsi tinggi Bonneville 1200cc yang mendebarkan, dengan ‘Bobber tune’ yang didedikasi untuk torsi dan daya lebih rendah daripada bahkan Bonneville T120.");

        mImageUrls.add("https://ik.imagekit.io/hj8sm3kk7/medium/gallery/exterior/93/1724/triumph-thruxton-slant-rear-view-full-image-822924.jpg");
        mNames.add("Triumph Thruxton");
        mDesc.add(" Kapasitas Mesin 856CC");
        mImageDescriptionImage.add("Triumph Thruxton merupakan motor café racer klasik dari merek ini. Motor tersebut mendapatkan tampilan klasik 1960an, yang ditawarkan dengan mesin halus bertenaga tinggi. Pabrikan menggandengkan motor dengan mesin 865 cc yang menghasilkan tenaga 59 hp dan torsi maksimum 61,1 Nm. Motor garis keras murni ini terlihat mengagumkan karena styling café racer asli dan penambahan fitur teknologi terbaru oleh merek sehingga menjadikan mesin ini sebuah motor café racer high-end.");

        mImageUrls.add("https://blue.kumparan.com/kumpar/image/upload/fl_progressive,fl_lossy,c_fill,q_auto:best,w_640/v1544260538/vv01qwaiz0et31judvxt.jpg");
        mNames.add("Triumph Speed Twin");
        mDesc.add("Kapasitas Mesin 1200CC");
        mImageDescriptionImage.add("Triumph Speed Twin yang masuk dalam jajaran klasik modern tersebut dibangun dari DNA Triumph Bonneville, demikian seperti mengutip The Drive. Desain dari Triumph Speed Twin punya wujud yang hampir mirip dengan Bonneville, hanya saja tampilannya dipadukan gaya Scrambler sehingga membuatnya tampak lebih modern dan jangkung. 1200cc Speed Twin memperkenalkan kembali nama terkenal untuk jajaran klasik modern kami, dengan sepeda motor serba baru yang menarik yang menghadirkan kemampuan kustom modern generasi baru dan DNA Triumph yang abadi bersama dengan teknologi pengendara canggih dan kinerja serta rasa roadster yang canggih. Dirancang untuk menghadirkan standar baru sepenuhnya dalam kemampuan berkendara dinamis, Speed Twin, dengan pengaturan sasis yang disempurnakan, posisi pengendara yang dapat diakses, kemampuan pengereman yang canggih, suspensi spesifikasi tinggi, dan pengiriman daya yang mendebarkan, benar-benar membenarkan posisinya sebagai ikon kinerja baru Triumph.");

        mImageUrls.add("https://images.carbay.co.id/triumph/tiger-800/exterior/500x208/t/triumph-tiger-800-slant-rear-view-(full-image).jpg");
        mNames.add("Triumph Tiger");
        mDesc.add("Kapasitas Mesin 1215CC");
        mImageDescriptionImage.add("Dalam kelas motor adventure dari Triumph, rata-rata memiliki desain yang hampir mirip antara satu dengan lainnya, salah satu diantaranya yang begitu jelas terlihat ada pada knalpot Triump Tiger yang berukuran besar di samping kanan, yang dibalut material stainless steel. Kemudian pada bagian depan, sobat bakal temui dua headlamp yang dijadikan menjadi satu bagian, lengkap bersama visor berukuran besar, yang selain menambah kesan elegan, juga dijadikannya sebagai pelindung speedometer dan pengendara ketika berada pada kecepatan tinggi.");

        mImageUrls.add("https://images.carbay.co.id/triumph/thunderbird-storm/exterior/500x208/t/triumph-thunderbird-storm-slant-rear-view-(full-image).jpg");
        mNames.add("Triumph Thunderbird Storm");
        mDesc.add("Kapasitas Mesin 1699CC");
        mImageDescriptionImage.add("Triumph Thunderbird Storm kehadirannya menantang para rider moge untuk menjajal performa terbaiknya. Mudah sekali motor ini dikenali nampak dari depan yang mempunyai karakter sendiri dengan dua buah headlamp yang terpisah dan terkesan begitu nyentrik ketimbang motor seri lainnya. Jok motor yang dibuat lebih rendah sangat begitu berkesan dan memanjakan para pengendaranya untuk tingkat kenayamanan yang eksklusif. ");

        mImageUrls.add("https://images.carbay.co.id/triumph/rocket-iii-roadster/exterior/500x208/t/triumph-rocket-iii-roadster-slant-rear-view-(full-image).jpg");
        mNames.add("Triumph Rocket");
        mDesc.add("Kapasitas Mesin 2249CC");
        mImageDescriptionImage.add("Sebagai salah satu varian terbaru, spesifikasi Triumph Rocket di sektor eksteriornya pun tampak lebih modern dan gagah dengan dominasi warna hitam yang dikonsep dengan begitu seimbang. Di mana, karakter konsep pada desainnya dibuat begitu elegan namun tetap memancarkan kesan dinamis yang tinggi. Selain itu, jika ditelisik secara lebih detail, tampilan dari Triumph Rocket ini memang cukup menarik.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mDesc, mImageDescriptionImage);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, mImageUrls, mDesc, mImageDescriptionImage);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mNames, mImageUrls, mDesc, mImageDescriptionImage);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}