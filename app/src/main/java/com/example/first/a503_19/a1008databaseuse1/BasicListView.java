package com.example.first.a503_19.a1008databaseuse1;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BasicListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_list_view);

        //출력할 데이터배열이나 List생성
        String [] player = {
                "조계현","최향남","이대진","권혁"
        };

        //위의 데이터를 가지고 Adapter생성
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,player);

        //ListView위의 Adapter 연결
        ListView listView = (ListView)findViewById(R.id.listView);
        //listView.setAdapter(adapter);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.players, android.R.layout.simple_list_item_1);

        listView.setAdapter(adapter1);

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setDivider(new ColorDrawable(Color.RED));
        listView.setDividerHeight(3);

        listView.setOnItemClickListener(new ListView.OnItemClickListener(){

            @Override
            //첫번째 매개변수는 이벤트가 발생한 객체
            //두번째 매개변수는 항목 뷰 - 선택한 항목의 뷰
            //세번째 매개변수는 클릭한 항목 뷰의 인덱스
            //네번째 매개변수는 항목 뷰의 아이디
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(BasicListView.this,position + "번째선택",Toast.LENGTH_LONG).show();
            }

        });

    }
}
