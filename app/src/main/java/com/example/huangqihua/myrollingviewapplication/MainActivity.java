package com.example.huangqihua.myrollingviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.example.huangqihua.myrollingviewapplication.view.HQHRollingView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mInfo;

    private HQHRollingView rollingView;
    private HQHRollingView rollingViewOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInfo = getInfo();

        rollingView = (HQHRollingView) findViewById(R.id.rolling_view);
        rollingView.startWithList(mInfo);
        rollingView.setOnItemClickListener(new HQHRollingView.OnItemClickListener() {
            @Override
            public void onItemClick(int position, TextView textView) {
                Toast.makeText(MainActivity.this, textView.getText() + "", Toast.LENGTH_SHORT).show();
            }
        });

        rollingViewOne = (HQHRollingView) findViewById(R.id.rolling_view_one);
        rollingViewOne.startWithText("nihao");

    }

    public List<String> getInfo() {
        mInfo = new ArrayList<>();
        mInfo.add("1. 大家好,很高兴见到大家");
        mInfo.add("2. 欢迎大家关注我哦！");
        mInfo.add("3. thank you very much");
        mInfo.add("4. 新浪微博：微博");
        mInfo.add("5. 个人博客：www.you speak.com");
        mInfo.add("6. 微信公众号：xxxx");
        return mInfo;
    }
}
