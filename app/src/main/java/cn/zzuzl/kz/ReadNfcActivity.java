package cn.zzuzl.kz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

import cn.zzuzl.kz.adapter.NfcListAdapter;
import cn.zzuzl.kz.adapter.PicTxtAdapter;
import cn.zzuzl.kz.vo.NfcItemVo;
import cn.zzuzl.kz.vo.PicTxtVO;

public class ReadNfcActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_nfc);

        setTitle("已读NFC");
        initRecyclerView();
    }

    // 初始化列表
    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleView);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        List<NfcItemVo> dataSet = new ArrayList<NfcItemVo>();
        dataSet.add(new NfcItemVo(R.drawable.ic_icon_0, "贾湖骨笛", "距今：8700-8200年", "藏于：河南省博物馆"));
        dataSet.add(new NfcItemVo(R.drawable.ic_icon_1, "三星堆遗址出土文物-面具", "距今：3600年", "藏于：河南省博物馆"));
        dataSet.add(new NfcItemVo(R.drawable.ic_icon_2, "景德镇瓷碗", "距今：600年", "藏于：河南省博物馆"));
        dataSet.add(new NfcItemVo(R.drawable.ic_icon_3, "辽代铜镜", "距今：1000年", "藏于：河南省博物馆"));
        dataSet.add(new NfcItemVo(R.drawable.ic_icon_4, "战国酒樽", "距今：2600年", "藏于：河南省博物馆"));
        mAdapter = new NfcListAdapter(dataSet);
        // 设置间隔
        mRecyclerView.addItemDecoration(new SpaceItemDecoration(50, false));
        mRecyclerView.setAdapter(mAdapter);
    }
}
