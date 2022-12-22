package com.rahim.kalimaliev_rahim_hm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
   private RecyclerView recyclerView;
   private ArrayList<filmModel> filmList = new ArrayList<>();
   private filmAdapter adapter = new filmAdapter(filmList, this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.films_recycle);
        loadData();
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
     filmList.add(new filmModel(R.drawable.image2, "Fast & Furious Presents: Hobbs & Shaw","Movie","Главный герой — полицейский под прикрытием Брайан О'Коннер (Пол Уокер). Его цель — быть принятым в автобанду легендарного уличного гонщика Доминика Торетто (Вин Дизель), которого подозревают в налётах на грузовики с бытовой техникой."));
     filmList.add(new filmModel(R.drawable.images, "Once Upon a Time in Hollywood","Movie","Фильм повествует о череде событий, произошедших в Голливуде в 1969 году, на закате его «золотого века». По сюжету, известный ТВ актер Рик Далтон и его дублер Клифф Бут пытаются найти свое место в стремительно меняющемся мире киноиндустрии."));
     filmList.add(new filmModel(R.drawable.image3, "Angel has Fallen","Movie","Третья часть «анти-террористической» экшн-франшизы о высококлассном агенте Секретной службы США Майке Бэннинге, который спасает от смертельного заговора первых лиц мировой политики. Но на сей раз целью террористов становится сам Бэннинг. Впрочем, неизбежные побочные жертвы им будут только на руку – и чем больше, тем лучше."));
     filmList.add(new filmModel(R.drawable.image4, "BaJack Horseman: Season 6","TV series","Конь Боджек – звезда ситкома 90-х, который имеет проблемы с алкоголем, наркотиками и беспорядочными половыми связами. Но при этом он очень одинок, его терзают проблемы с родителями, которые он проносит через всю свою жизнь, он страдает депрессией и пытается исправить ошибки прошлого, делая иногда только хуже."));
     filmList.add(new filmModel(R.drawable.image6, "Official secrets","Movie","В 2003 году британская разведчица Кэтрин Тереза Ган начала делиться с прессой секретами о нелегальной деятельности американских спецслужб, пытающихся оправдать вторжение в Ирак перед ООН. В итоге Ган арестовали за передачу государственных секретов репортеру The London Observer Мартину Брайту."));
     filmList.add(new filmModel(R.drawable.image7, "Catherine in Great","TV series","Запертая в ловушке брака по договоренности с незрелым будущим императором Павлом III, молодая немецкая принцесса показывает себя искусным политическим бойцом и возвышается, чтобы стать Екатериной Великой. Продолжительность: 100 мин."));

    }

    @Override
    public void onItemClick(filmModel filmModel) {
        Intent intent = new Intent(MainActivity.this,descriptionActivity.class);
        intent.putExtra("desc", filmModel.filmStory );
        intent.putExtra("image",filmModel.image);

        startActivity(intent);
    }
}