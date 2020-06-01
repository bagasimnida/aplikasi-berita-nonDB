package com.beritaku.rizkianto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Berita> dataBerita;
    private SimpleDateFormat sdFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    private int idBerita;
    private BeritaAdapter beritaAdapter;
    private RecyclerView rvTampilBerita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTampilBerita = findViewById(R.id.rv_tampil_berita);

        isiDataBerita();
        tampilBerita();
    }

    private void isiDataBerita(){
        dataBerita = new ArrayList<>();
        idBerita = 0;

        //Membentuk obyek data berita 1
        Date tempDate = new Date();
        try {
            tempDate = sdFormat.parse("13/03/2020 06:22");
        }catch (ParseException er){
            er.printStackTrace();
        }

        Berita berita1 = new Berita(
                idBerita,
                "Terhantam Corona, 3 Wilayah Ini Bakal Duluan Uji Coba Kartu Pra Kerja",
                tempDate,
                "berita1",
                "Ilustrasi pekerja. (shutterstock)",
                "Mutia Fauzia",
                "JAKARTA, KOMPAS.com - Untuk meredam dampak negatif wabah virus corona terhadap perekonomian, pemerintah bakal mempercepat pelaksanaan program Kartu Pra Kerja.\n" +
                        "\n" +
                        "Deputi Bidang Koordinasi Ekonomi Kreatif, Kewirausahaan, dan Daya Saing Koperasi dan UKM Mohammad Rudy Salahuddin mengatakan akan ada tiga wilayah yang bakal diuji coba untuk pelaksanaan tahap awal program ini, yaitu Batam, Manado dan Bali.\n" +
                        "\n" +
                        "Ketiganya merupakan wilayah yang secara ekonomi paling terdampak oleh wabah virus corona.\n" +
                        "\n" +
                        "\"Ini janji Presiden yang harus segera diimplementasikan. Oleh karena itu kita segera launching di akhir bulan atau awal April dengan tiga daerah yang terdampak COVID-19,\" jelas Rudy di Jakarta, Kamis (12/3/2020).\n" +
                        "\n" +
                        "\"Ketiganya itu Kepulauan Riau (Batam), Sulawesi Utara (Manado) dan Bali,\" jelas dia.\n" +
                        "\n" +
                        "Sebelumnya, pemerintah berencana menjadikan Jakarta, Bandung dan Surabaya sebagai lokasi uji coba awal program Kartu Pra Kerja.\n" +
                        "\n" +
                        "Namun demikian, karena kasus virus corona yang mulai mendisrupsi industri pariwisata, lokasi tersebut dipindahkan ke tiga wilayah yang telah disebutkan sebelumnya.\n" +
                        "\n" +
                        "Rudi pun mengatakan, pihaknya tidak menutup kemungkinan provinsi lain bakal ditambahkan jika sudah memiliki infrastruktur seperti lembaga pelatihan yang sudah siap untuk difungsikan.\n" +
                        "\n" +
                        "\"Mungkin akan ditambah provinsi lain yang siap, baik jumlah lembaga pelatihan maupun dari sisi jumlah orang yang terdampak PHK atau pengangguran,\" jelas dia.\n" +
                        "\n" +
                        "Pemerintah berencana bekerja sama dengan beberapa platform digital seperti Bukalapak, Tokopedia, Gojek, Maubelajarapa.com, hingga Ruangguru untuk membentuk sistem dan program pelatihan dalam Kartu Pra Kerja.\n" +
                        "\n" +
                        "Nantinya, Lembaga Pelatihan yang bisa masuk dalam program kartu pra kerja bakal dikurasi oleh platform digital yang bersangkutan.\n" +
                        "\n" +
                        "\"Ibaratnya seperti pesan Go-Food, makanan-makanan yang menjadi menu nanti pelatihan-pelatihan. Tiap orang bisa memilih pelatihan setelah melakukan pendaftaran dan assesment,\" jelas Rudi.\n" +
                        "\n" +
                        "\"Assesment hanya untuk menjuruskan mana yang lebih cocok keterampilannya.\n" +
                        "\n" +
                        "Assesment ini akan dilakukan online, setelah lulus mereka akan mendapatkan kode untuk memilih pelatihannya,\" jelas dia.\n",
                "https://money.kompas.com/read/2020/03/13/062200526/terhantam-corona-3-wilayah-ini-bakal-duluan-uji-coba-kartu-pra-kerja"
        );

        dataBerita.add(berita1);
        idBerita++;

        //Membentuk obyek data berita 2
        tempDate = new Date();
        try {
            tempDate = sdFormat.parse("13/03/2020 06:15");
        }catch (ParseException er){
            er.printStackTrace();
        }

        Berita berita2 = new Berita(
                idBerita,
                "Prajurit TNI Penjual Senjata dan Amunisi ke KKB Divonis Penjara Seumur Hidup",
                tempDate,
                "berita2",
                "Pratu Demisia Arista Tefbana (28 th) dijatuhi hukuman penjara seumur hidup oleh Mahmil III-19 Jayapura, Kamis malam karena terbukti menjual amunisi dan senpi ke KKB. ((ANTARA/Evarukdijati))",
                "David Oliver Purba",
                "KOMPAS.com - Pengadilan Militer III-19 Mahmil Jayapura menjatuhkan hukuman penjara seumur hidup kepada Pratu Demisla Arista Tefbana (28), anggota Kodim Mimika.\n" +
                        "\n" +
                        "Demisla terbukti menjual amunisi dan senjata api ke Kelompok Kriminal Bersenjata (KKB).\n" +
                        "\n" +
                        "Sidang yang berlangsung terbuka di kawasan Dok V, Kamis (12/3/2020), dipimpin Hakim Ketua Letkol Chk Agus P Wijoyo, dengan anggota Mayor Chk Dendy Suryo Saputro dan Mayor Laut Muhammad Zainal Abidin.\n" +
                        "\n" +
                        " ”Memutuskan untuk menjatuhkan vonis penjara seumur hidup bagi Pratu Demisla. Terdakwa juga diberhentikan dari dinas militer TNI Angkatan Darat,” kata Hakim Ketua Letnan Kolonel Chk Agus P Wijoyo, mengutip Kompas.id, Kamis (12/3/2020).\n" +
                        "\n" +
                        "Mengutip dari Antara, Pratu Demisla sebelumnya didakwa dengan Pasal 1 ayat 1 UU Darurat nomor 12 tahun 1951 dan dijatuhi hukuman tambahan yakni dipecat dari dinas militer serta membayar biaya perkara sebesar Rp 10.000.\n" +
                        "\n" +
                        "Usai mendengar putusan majelis hakim, terdakwa melalui penasihat hukumnya, Mayor Chk Alvie Syahri dari Kumdam XVII/Cenderawasih dan Lettu Chk Doni Webyantoro dari Korem 174/ATW Merauke menyatakan banding.\n" +
                        "\n" +
                        "Hakim anggota Mayor Chk Dendy seusai sidang kepada wartawan mengatakan, Pratu Demisla dalam persidangan mengaku memasok amunisi dan senjata api untuk KKB melalui Moses Gwijangge.\n" +
                        "\n" +
                        "Demisla mengenal Moses saat bergabung dalam pasukan pengamanan daerah rawan di Jita, Kabupaten Mimika.\n" +
                        "\n" +
                        "Moses yang kabur membawa lari satu pucuk senjata api itu menerima 1.300 butir amunisi.\n" +
                        "\n" +
                        "Amunisi itu dibeli seharga Rp 100.000 per butir, sedangkan senpi dibeli Rp 50 juta.\n" +
                        "\n" +
                        "Ribuan amunisi dan sepucuk senpi itu diperoleh Demisla dari rekannya dengan alasan untuk berburu. Hasil penjualan amunisi dan senjata digunakan untuk foya-foya.\n" +
                        "\n" +
                        "Meski Diserang KKB Sebelumnya, Mahmil III-19 sudah menjatuhkan hukuman kepada tiga mantan anggota TNI-AD yang terbukti menjual 13.431 butir amunisi ke KKB dengan hukuman berbeda, Selasa (11/2/2020).\n" +
                        "\n" +
                        "Sersan Dua Wahyu Insyafiadi dijatuhi hukuman penjara seumur hidup, Prajurit Satu Okto Maure dihukum 15 tahun penjara, dan Prajurit Satu Elias K Waromi dijatuhi hukuman 2,5 tahun penjara dipotong masa tahanan.\n",
                "https://regional.kompas.com/read/2020/03/13/06150071/prajurit-tni-penjual-senjata-dan-amunisi-ke-kkb-divonis-penjara-seumur-hidup"
        );

        dataBerita.add(berita2);
        idBerita++;

        //Membentuk obyek data berita 3
        tempDate = new Date();
        try {
            tempDate = sdFormat.parse("12/03/2020 22:46");
        }catch (ParseException er){
            er.printStackTrace();
        }

        Berita berita3 = new Berita(
                idBerita,
                "Prajurit TNI Penjual Senjata dan Amunisi ke KKB Divonis Penjara Seumur Hidup",
                tempDate,
                "berita3",
                "Presiden Filipina Rodrigo Duterte.(AFP PHOTO)",
                "Ardi Priyatno Utomo",
                "MANILA, KOMPAS.com - Presiden Filipina Rodrigo Duterte mengumumkan rencana untuk melakukan lockdown terhadap ibu kota Manila, di tengah penyebaran virus corona.\n" +
                        "\n" +
                        "Dalam penguman yang disampaikannya via televisi, presiden 74 tahun itu akan menangguhkan segala transportasi dari dan ke Manila, dan memberlakukan karantina.\n" +
                        "\n" +
                        "Selain itu, Duterte mengatakan dia menyetujui penutupan sekolah selama sebulan serta melarang adanya kegiatan di tempat publik.\n" +
                        "\n" +
                        "Selain itu sebagaimana diwartakan AFP Kamis (12/3/2020), dia menyatakan akan menghentikan arus kedatangan turis asing dari negara yang menjadi sumber penyebaran virus corona.\n" +
                        "\n" +
                        "Presiden dengan julukan The Punisher itu menerangkan, blokade sementara di darat, laut, dan udara ibu kota Filipina itu bakal dimulai Minggu (15/3/2020).\n" +
                        "\n" +
                        "\"Ini namanya lockdown,\" ujarnya. Filipina masih melaporkan kasus dari virus dengan nama resmi SARS-Cov-2 yang relatif kecil.\n" +
                        "\n" +
                        "Meski begitu, jumlahnya mengalami peningkatan dari semula 24 menjadi 52 kasus penularan pada Senin pekan ini (9/3/2020).\n" +
                        "\n" +
                        "Otoritas lokal melaporkan adanya lima kematian, dengan satu di antaranya adalah turis yang berasal dari Wuhan, kota yang menjadi asal muasal penyebaran SARS-Cov-2.\n" +
                        "\n" +
                        "Duterte menghadapi tekanan publik untuk menghadapi wabah tersebut, seiring laporan rapuhnya sistem kesehatan negara di Asia Tenggara.\n" +
                        "\n" +
                        "Sebabnya, jutaan orang miskin tinggal di daerah kumuh yang berpenduduk padat, dengan lingkungannya yang terbilang kurang bersih.\n" +
                        "\n" +
                        "Sejumlah kebijakan baru pun diterapkan untuk mencegah virus yang menyebabkan penyakit Covid-19 itu.\n" +
                        "\n" +
                        "Misalnya terkait interaaksi dengan publik. Pasukan Pengamanan Presiden Filipina (PSG) memutuskannya karena usia Sang Presiden yang sudah 74 tahun, membuatnya berada di kelompok rentan.\n" +
                        "\n" +
                        "\"PSG akan menerapkan kebijakan tak ada sentuhan antara Presiden Duterte dengan publik,\" demikian keterangan komandan mereka, Jesus Durante.\n" +
                        "\n" +
                        "Durante menjelaskan, setiap orang yang hendak melakukan kontak dengan mantan Wali Kota Davao tersebut bakal menjalani pemeriksaan kesehatan.\n" +
                        "\n" +
                        "Selain itu, Duterte juga mengumumkan dia bersama sekutunya, Senator Christopher \"Bong\" Go, melakukan pemeriksaan Covid-19, dengan hasilnya bakal diketahui 48 jam kemudian.\n" +
                        "\n" +
                        "\"Adalah bijaksana bagi kami untuk mengambil tindakan pencegahan sesuai dengan saran dari dinas kesehatan,\" jelas Duterte dan Bong.\n",
                "https://www.kompas.com/global/read/2020/03/12/224607170/virus-corona-duterte-umumkan-rencana-lockdown-ibu-kota-filipina"
        );

        dataBerita.add(berita3);
        idBerita++;

        //Membentuk obyek data berita 4
        tempDate = new Date();
        try {
            tempDate = sdFormat.parse("13/03/2020 05:58");
        }catch (ParseException er){
            er.printStackTrace();
        }

        Berita berita4 = new Berita(
                idBerita,
                "3 Pasien Sembuh dari Covid-19, Harapan Indonesia di Tengah Pandemi Global",
                tempDate,
                "berita4",
                "Tim PKRS (Promosi Kesehatan Rumah Sakit) memberikan sosialisasi enam langkah tata cara cuci tangan yang benar menggunakan cairan antiseptic di ruang tunggu pasien rawat jalan, RSUD dr Iskak, Tulungagung, Jawa Timur, Rabu (4/3/2020). Edukasi cuci tangan untuk meningkatkan kesadaran masyarakat tentang pentingnya hidup bersih dan higienis demi mencegah penularan penyakit melalui tangan, khususnya berkaitan dengan pencegahan dini terhadap virus Corona (COVID-19).(ANTARA FOTO/DESTYAN SUJARWOKO)",
                "Rakhmat Nur Hakim",
                "JAKARTA, KOMPAS.com - Tiga pasien Covid-19 di Indonesia dinyatakan sembuh di tengah penetapan virus corona sebagai pandemi global oleh World Health Organization (WHO).\n" +
                        "\n" +
                        "Ketiga pasien itu, pasien 06, 14, dan 19, sebelumnya dirawat di RSUP Persahabatan.\n" +
                        "\n" +
                        "Pasien 06 dan 14 merupakan kelompok pasien pertama yang sembuh. Disusul pasien 19.\n" +
                        "\n" +
                        "\"Ada tiga pasien yang secara teknis sudah membaik, tidak ada keluhan sama sekali.\n" +
                        "\n" +
                        "Secara laboratorium, dua kali kita melakukan pemeriksaan, hasilnya negatif.\n" +
                        "\n" +
                        "Maka, diputuskan bahwa ketiga pasien ini dinyatakan sembuh dan tidak membutuhkan lagi perawatan,\" kata Juru bicara pemerintah untuk penanganan virus corona, Achmad Yurianto di RSUP Persahabatan, Jakarta, Kamis (12/3/2020).\n" +
                        "\n" +
                        "Adapun ketiga pasien ini, yakni kasus 06 berjenis kelamin laki-laki usia 39 tahun, kasus 14 berjenis kelamin laki-laki usia 50 tahun, dan kasus 19 berjenis kelamin laki-laki usia 49 tahun.\n" +
                        "\n" +
                        "Yuri pun optimistis beberapa pasien lainnya juga akan segera sembuh seperti pasien 06, 14, dan 19.\n" +
                        "\n" +
                        "Setelah diperbolehkan pulang, menurut Yuri, para pasien itu kemudian diedukasi. Salah satu hal yang perlu dipastikan adalah agar mereka memantau kondisi diri sendiri.\n" +
                        "\n" +
                        "\"Saat pulang yang bersangkutan masih harus menjalani self monitoring. Dia harus memantau dirinya sendiri,\" kata Yuri.\n" +
                        "\n" +
                        "Selain itu, yang perlu dilakukan tiga orang yang kini dibolehkan pulang adalah mereka harus menggunakan masker saat berada di rumah.\n" +
                        "\n" +
                        "\"Hindari kontak dekat dengan keluarga tanpa menggunakan masker,\" ujar Yuri, \"Tidak berbagi alat minum dan makan dengan yang lain, beristirahat di rumah, dan mencukupi asupan gizi dengan baik,\" ujar Yuri.\n" +
                        "\n" +
                        "Selain itu, tiga orang ini akan mendapatkan rujuk balik dari puskesmas terdekat.\n" +
                        "\n" +
                        "Nantinya, surat rujuk balik itu akan meminta puskesmas untuk melakukan pemantauan terhadap mereka.\n" +
                        "\n" +
                        "\"Dimohon agar puskesmas lakukan monitoring,\" ujar Yuri.\n" +
                        "\n" +
                        "Hingga Kamis sore, pemerintah menyatakan ada 34 kasus virus corona atau Covid-19 di Indonesia.\n" +
                        "\n" +
                        "Namun, ada satu pasien Covid-19 yang meninggal dunia, yaitu kasus 25. Dia meninggal dunia pada Selasa (10/3/2020) dini hari, sekitar pukul 02.00.\n",
                "https://nasional.kompas.com/read/2020/03/13/05584191/3-pasien-sembuh-dari-covid-19-harapan-indonesia-di-tengah-pandemi-global"
        );

        dataBerita.add(berita4);
        idBerita++;
    }

    private void tampilBerita(){
        beritaAdapter = new BeritaAdapter(dataBerita, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        rvTampilBerita.setLayoutManager(layoutManager);
        rvTampilBerita.setAdapter(beritaAdapter);
    }
}
