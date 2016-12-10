package credithc.com.marqueeverticaltextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MarqueeView marqueeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        marqueeView = (MarqueeView) findViewById(R.id.marqueeView);

        List<String> info = new ArrayList<>();
        info.add("1. 大家好，我是陈秀辉。");
        info.add("2. 欢迎大家关注我哦！");
        info.add("3. 我们都一样");
        info.add("4. 哈哈哈哈哈哈哈哈");
        info.add("5. 走过岁月我才发现");
        info.add("6. 好的好好好的");
        info.add("7. test git branch");
        info.add("8. test git branch222");
        marqueeView.startWithList(info);
    }
}
