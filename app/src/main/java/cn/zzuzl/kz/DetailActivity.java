package cn.zzuzl.kz;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import java.util.ArrayList;
import java.util.List;

import cn.zzuzl.kz.adapter.PicTxtAdapter;
import cn.zzuzl.kz.vo.PicTxtVO;

public class DetailActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setTitle("故宫博物院");

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        ExpandableTextView expandable_text = (ExpandableTextView) findViewById(R.id.expand_text_view);
        expandable_text.setText("    北京故宫是中国明清两代的皇家宫殿，旧称为紫禁城，位于北京中轴线的中心，是中国古代宫廷建筑之精华。" +
                "北京故宫以三大殿为中心，占地72万平方米，建筑面积约16万平方米，有大小宫殿70多座，房屋九千余间。" +
                "是世界上现存规模最大、保存最为完整的木质结构古建筑之一。\n" +
                "    北京故宫于明成祖永乐四年（1406年）开始建设，以南京故宫为蓝本建设，到永乐十八年建成。" +
                "它是一座长方形城池，南北长961米，东西宽753米。。。");

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 切换到buy ticket activity
                Intent intent = new Intent();
                intent.setClass(DetailActivity.this, BuyTicketActivity.class);
                startActivity(intent);
            }
        });

        initRecyclerView();
    }

    // 初始化展品推荐列表
    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        List<PicTxtVO> dataSet = new ArrayList<PicTxtVO>();
        dataSet.add(new PicTxtVO("积木小屋", R.drawable.ic_icon_0));
        dataSet.add(new PicTxtVO("白色惊艳", R.drawable.ic_icon_1));
        dataSet.add(new PicTxtVO("他的时代", R.drawable.ic_icon_2));
        dataSet.add(new PicTxtVO("敦煌艺术", R.drawable.ic_icon_3));
        dataSet.add(new PicTxtVO("敦煌艺术", R.drawable.ic_icon_4));
        dataSet.add(new PicTxtVO("敦煌艺术", R.drawable.ic_icon_5));
        mAdapter = new PicTxtAdapter(dataSet);
        // 设置间隔
        mRecyclerView.addItemDecoration(new SpaceItemDecoration(100, true));
        mRecyclerView.setAdapter(mAdapter);
    }
}
