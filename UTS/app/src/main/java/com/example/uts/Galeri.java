package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Galeri extends AppCompatActivity implements GaleriAdapter.OnAdapterClickListener {
    GaleriClass galeri;
    RecyclerView recyclerView;
    private List<GaleriClass> galeris = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeri);

        recyclerView = findViewById(R.id.rv_galeri);
        galeris = new ArrayList<GaleriClass>();
        galeris = initData();
        GaleriAdapter adapter = new GaleriAdapter(galeris,this);
        adapter.setListener(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);

    }

    public ArrayList<GaleriClass> initData(){
        ArrayList<GaleriClass> list = new ArrayList<>();
        list.add(new GaleriClass(1,"Surah An-Nas","",
                "قُلْ أَعُوْذُ بِرَبِّ النَّاسِ ﴿الناس:١\n" +
                        "qul a-‘uudzu bi rabbin naas\n" +
                        "1. Katakanlah: “Aku berlindung kepada Tuhannya manusia.\n" +
                        "\n" +
                        "مَلِكِ النَّاسِ ﴿الناس:٢\n" +
                        "malikin naas\n" +
                        "2. Raja manusia.\n" +
                        "\n" +
                        "إِلٰهِ النَّاسِ ﴿الناس:٣\n" +
                        "ilaahin naas\n" +
                        "3. Sembahan manusia.\n" +
                        "\n" +
                        "مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ ﴿الناس:٤\n" +
                        "min syarril waswaasil khon naas\n" +
                        "4. dari kejahatan (bisikan) setan yang bersembunyi,\n" +
                        "\n" +
                        "الَّذِى يُوَسْوِسُ فِى صُدُوْرِ النَّاسِ ﴿الناس:٥\n" +
                        "alladzii yuwaswisu fii shuduurin naas\n" +
                        "5. yang membisikkan (kejahatan) ke dalam dada manusia,\n" +
                        "\n" +
                        "مِنَ الْجِنَّةِ وَالنَّاسِ ﴿الناس:٦\n" +
                        "minal jinnati wan naas\n" +
                        "6. dari (golongan) jin dan manusia."));
        list.add(new GaleriClass(2,"Al-Falaq","",
                "قُلْ أَعُوْذُ بِرَبِّ الْفَلَقِ ﴿الفلق:١\n" +
                "qul a-‘uudzu birobbil falaq\n" +
                "1. Katakanlah: “Aku berlindung kepada Tuhan Yang Menguasai subuh (fajar),\n" +
                "\n" +
                "مِنْ شَرِّ مَا خَلَقَ ﴿الفلق:٢\n" +
                "min syarri maa kholaq\n" +
                "2. dari kejahatan (makhluk yang) Dia ciptakan,\n" +
                "\n" +
                "وَمِنْ شَرِّ غَاسِقٍ إِذَا وَقَبَ ﴿الفلق:٣\n" +
                "wamin syarri ghoosiqin idzaa waqob\n" +
                "3. dan dari kejahatan malam apabila telah gelap gulita,\n" +
                "\n" +
                "وَمِنْ شَرِّ النَّفّٰثٰتِ فِى الْعُقَدِ ﴿الفلق:٤\n" +
                "wamin syarrin naffatsaati fil ‘uqod\n" +
                "4. dan dari kejahatan (perempuan-perempuan) penyihir yang meniup pada buhul-buhul (talinya),\n" +
                "\n" +
                "وَمِنْ شَرِّ حَاسِدٍ إِذَا حَسَدَ ﴿الفلق:٥\n" +
                "wamin syarri haasidin idzaa hasad\n" +
                "5. dan dari kejahatan orang yang dengki apabila ia dengki”."));
        list.add(new GaleriClass(3,"Al-Ikhlas","",
                "قُلْ هُوَ اللهُ أَحَدٌ ﴿الإخلاص:١\n" +
                "qul huwallaahu ahad\n" +
                "1. Katakanlah (Muhammad):, “Dialah Allah, Yang Maha Esa,\n" +
                "\n" +
                "اَللهُ الصَّمَدُ ﴿الإخلاص:٢\n" +
                "allaahus shomad\n" +
                "2. Allah tempat meminta segala sesuatu,\n" +
                "\n" +
                "لَمْ يَلِدْ وَلَمْ يُوْلَدْ ﴿الإخلاص:٣\n" +
                "lam yalid walam yuulad\n" +
                "3. (Allah) tidak beranak dan tidak pula diperanakkan,\n" +
                "\n" +
                "وَلَمْ يَكُنْ لَّهٗ كُفُوًا أَحَدٌۢ ﴿الإخلاص:٤\n" +
                "walam yakun lahuu kufuwan ahad\n" +
                "4. Dan tidak ada sesuatu yang setara dengan Dia.”"));
        list.add(new GaleriClass(4,"Surah Al-Lahab","",
                "تَبَّتْ يَدَآ أَبِىْ لَهَبٍ وَتَبَّ ﴿اللهب:١\n" +
                "tabbat yadaa abii lahabiw watab\n" +
                "1. Binasalah kedua tangan Abu Lahab dan benar-benar binasa dia!\n" +
                "\n" +
                "مَآ أَغْنَىٰ عَنْهُ مَالُهٗ وَمَا كَسَبَ ﴿اللهب:٢\n" +
                "maa aghnaa ‘anhumaa luhuu wamaa kasab\n" +
                "2. Tidaklah berguna baginya hartanya dan apa yang ia usahakan.\n" +
                "\n" +
                "سَيَصْلَىٰ نَارًا ذَاتَ لَهَبٍ ﴿اللهب:٣\n" +
                "sayashlaa naaron dzaata lahab\n" +
                "3. Kelak dia akan masuk ke dalam api yang bergejolak (neraka).\n" +
                "\n" +
                "وَامْرَأَتُهٗ حَمَّالَةَ الْحَطَبِ ﴿اللهب:٤\n" +
                "wamroatuhuu hammaa latal hatob\n" +
                "4. Dan (begitu pula) istrinya, pembawa kayu bakar (penyebar fitnah).\n" +
                "\n" +
                "فِى جِيْدِهَا حَبْلٌ مِّن مَّسَدٍ ﴿اللهب:٥\n" +
                "fii jiidihaa hablum mimmasad\n" +
                "5. Di lehernya ada tali dari sabut yang dipintal."));
        list.add(new GaleriClass(5,"Surah An-Nasr","",
                "إِذَا جَآءَ نَصْرُ اللهِ وَالْفَتْحُ ﴿النصر:١\n" +
                "idzaa jaa-a nashrullaahi wal fath\n" +
                "1. Apabila telah datang pertolongan Allah dan kemenangan,\n" +
                "\n" +
                "وَرَأَيْتَ النَّاسَ يَدْخُلُوْنَ فِى دِيْنِ اللهِ أَفْوَاجًا ﴿النصر:٢\n" +
                "waro-aitan naasa yadkhuluuna fii diinillaahi afwaajaa\n" +
                "2. dan engkau melihat manusia berbondong-bondong masuk agama Allah,\n" +
                "\n" +
                "فَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ ۚ إِنَّهٗ كَانَ تَوَّابًا ﴿النصر:٣\n" +
                "fasabbih bihamdi robbika wastaghfirhu innahuu kaana tawwabaa\n" +
                "3. Maka bertasbihlah dengan memuji Tuhanmu dan mohonlah ampunan kepada-Nya. Sungguh, Dia Maha Penerima taubat."));
        list.add(new GaleriClass(6,"Al-kafirun","",
                "قُلْ يٰٓأَيُّهَا الْكٰفِرُوْنَ ﴿الكافرون:١\n" +
                "qul yaa ayyuhal kaafiruun\n" +
                "1. Katakanlah (Muhammad, “Wahai orang-orang kafir!\n" +
                "\n" +
                "لَآ أَعْبُدُ مَا تَعْبُدُوْنَ ﴿الكافرون:٢\n" +
                "laa a’budu maa ta’buduun\n" +
                "2. Aku tidak akan menyembah apa yang kamu sembah.\n" +
                "\n" +
                "وَلَآ أَنْتُمْ عٰبِدُوْنَ مَآ أَعْبُدُ ﴿الكافرون:٣\n" +
                "walaa antum ‘aabiduuna maa a’bud\n" +
                "3. dan kamu bukan penyembah apa yang aku sembah.\n" +
                "\n" +
                "وَلَآ أَنَا۠ عَابِدٌ مَّا عَبَدْتُّمْ ﴿الكافرون:٤\n" +
                "walaa ana ‘aabidum maa ‘abat tum\n" +
                "4. dan aku tidak pernah menjadi penyembah apa yang kamu sembah,\n" +
                "\n" +
                "وَلَآ أَنْتُمْ عٰبِدُوْنَ مَآ أَعْبُدُ ﴿الكافرون:٥\n" +
                "walaa antum ‘aabiduuna maa a’bud\n" +
                "5. dan kamu tidak pernah (pula) menjadi penyembah apa yang aku sembah.\n" +
                "\n" +
                "لَكُمْ دِيْنُكُمْ وَلِىَ دِيْنِ ﴿الكافرون:٦\n" +
                "lakum diinukum waliyadiin\n" +
                "6. Untukmu agamamu, dan untukkulah, agamaku”."));
        list.add(new GaleriClass(7,"Surah Al-Kautsar","",
                "إِنَّآ أَعْطَيْنٰكَ الْكَوْثَرَ ﴿الكوثر:١\n" +
                "innaa a’thoinaakal kautsar\n" +
                "1. Sungguh, Kami telah memberimu (Muhammad) nikmat yang banyak.\n" +
                "\n" +
                "فَصَلِّ لِرَبِّكَ وَانْحَرْ ﴿الكوثر:٢\n" +
                "fasolli lirobbika wanhar\n" +
                "2. Maka laksanakanlah shalat karena Tuhanmu; dan berkurbanlah (sebagai ibadah dan mendekatkan diri kepada Allah).\n" +
                "\n" +
                "إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ ﴿الكوثر:٣\n" +
                "inna syaani-aka huwal abtar\n" +
                "3. Sungguh, orang-orang yang membencimu dialah yang terputus (dari rahmat Allah)."));
        list.add(new GaleriClass(8,"Surah Al-Ma'un","",
                "أَرَءَيْتَ الَّذِى يُكَذِّبُ بِالدِّيْنِ ﴿الماعون:١\n" +
                "aro-aital ladzii yukaddzibu biddiin\n" +
                "1. Tahukah kamu (orang) yang mendustakan agama?\n" +
                "\n" +
                "فَذٰلِكَ الَّذِى يَدُعُّ الْيَتِيْمَ ﴿الماعون:٢\n" +
                "fadzaalikal ladzii yadu”ulyatiim\n" +
                "2. Maka itulah orang yang menghardik anak yatim,\n" +
                "\n" +
                "وَلَا يَحُضُّ عَلَىٰ طَعَامِ الْمِسْكِيْنِ ﴿الماعون:٣\n" +
                "walaa yahuddhu ‘alaa tho’aamil miskiin\n" +
                "3. dan tidak mendorong memberi makan orang miskin.\n" +
                "\n" +
                "فَوَيْلٌ لِّلْمُصَلِّيْنَ ﴿الماعون:٤\n" +
                "fawailul lil musholliin\n" +
                "4. Maka celakalah orang yang shalat,\n" +
                "\n" +
                "الَّذِيْنَ هُمْ عَنْ صَلَاتِهِمْ سَاهُوْنَ ﴿الماعون:٥\n" +
                "alladziina hum ‘an sholaatihim saahuun\n" +
                "5. (yaitu) orang-orang yang lalai terhadap shalatnya,\n" +
                "\n" +
                "الَّذِيْنَ هُمْ يُرَآءُوْنَ ﴿الماعون:٦\n" +
                "alladziina hum yuroo-uun\n" +
                "6. yang berbuat riya, [1]\n" +
                "\n" +
                "وَيَمْنَعُوْنَ الْمَاعُوْنَ ﴿الماعون:٧\n" +
                "wayamna’uunal ma’uun\n" +
                "7. dan enggan (memberikan) bantuan. [2]"));
        list.add(new GaleriClass(9,"Surah Quraisy","",
                "لِإِيْلٰفِ قُرَيْشٍ ﴿قريش:١\n" +
                "li iilaafi quraiisy\n" +
                "1. Karena kebiasaan orang-orang Quraisy,\n" +
                "\n" +
                "إِۦلٰفِهِمْ رِحْلَةَ الشِّتَآءِ وَالصَّيْفِ ﴿قريش:٢\n" +
                "iilaafihim rihlatasy syitaa-i wash shoiif\n" +
                "2. (yaitu) kebiasaan mereka bepergian pada musim dingin dan musim panas. (1)\n" +
                "\n" +
                "فَلْيَعْبُدُوا۟ رَبَّ هٰذَا الْبَيْتِ ﴿قريش:٣\n" +
                "falya’buduu robba haadzal baiit\n" +
                "3. Maka hendaklah mereka menyembah Tuhan (pemilik) rumah ini (Ka’bah).\n" +
                "\n" +
                "الَّذِىٓ أَطْعَمَهُمْ مِّنْ جُوْعٍ وَءَامَنَهُمْ مِّنْ خَوْفٍۭ ﴿قريش:٤\n" +
                "alladzii ath’amahum minjuu’iw wa-aamanahum min khouf\n" +
                "4. Yang telah memberi makanan kepada mereka untuk menghilangkan lapar dan mengamankan mereka dari rasa ketakutan."));
        list.add(new GaleriClass(10,"Surah Al-Fiil","",
                "أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحٰبِ الْفِيْلِ ﴿الفيل:١\n" +
                "alam taro kaifa fa’ala robbuka bi-ashhaabil fiil\n" +
                "1. Tidakkah engkau (Muhammad) perhatikan bagaimana Tuhanmu telah bertindak terhadap pasukan bergajah? (1)\n" +
                "\n" +
                "أَلَمْ يَجْعَلْ كَيْدَهُمْ فِى تَضْلِيْلٍ ﴿الفيل:٢\n" +
                "alam yaj’al kaidahum fii tadhliil\n" +
                "2. Bukankah Dia telah menjadikan tipu daya mereka itu sia-sia?\n" +
                "\n" +
                "وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيْلَ ﴿الفيل:٣\n" +
                "wa arsala ‘alaihim thoiron abaabiil\n" +
                "3. Dan Dia mengirimkan kapada mereka burung yang berbondong-bondong,\n" +
                "\n" +
                "تَرْمِيْهِمْ بِحِجَارَةٍ مِّنْ سِجِّيْلٍ ﴿الفيل:٤\n" +
                "tarmiihim bihijaarotim min sijjiil\n" +
                "4. yang melempari mereka dengan batu dari tanah liat yang dibakar,\n" +
                "\n" +
                "فَجَعَلَهُمْ كَعَصْفٍ مَّأْكُوْلٍۭ ﴿الفيل:٥\n" +
                "faja’alahum ka’ashfim ma’kuul\n" +
                "5. sehingga mereka dijadikan-Nya seperti daun-daun yang dimakan (ulat)."));
        list.add(new GaleriClass(7,"test2","","user"));
        return list;
    }

    @Override
    public void DetailonClick(GaleriClass galeriClass) {
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("id",galeriClass.getId());
        intent.putExtra("nama",galeriClass.getName());
        intent.putExtra("photo",galeriClass.getPhoto());
        intent.putExtra("isi",galeriClass.getIsi());

        startActivity(intent);
    }
}
