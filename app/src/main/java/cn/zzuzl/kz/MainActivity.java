package cn.zzuzl.kz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.jude.rollviewpager.OnItemClickListener;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.hintview.IconHintView;

import java.util.ArrayList;
import java.util.List;

import cn.zzuzl.kz.adapter.PicLoopAdapter;
import cn.zzuzl.kz.adapter.PicTxtAdapter;
import cn.zzuzl.kz.vo.PicTxtVO;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static final String TAG = "MainActivity";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("发现");

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initConvenientBanner();

        initNearbyRecyclerView();

        initRecomRecyclerView();
    }

    // 初始化图片轮播
    private void initConvenientBanner() {
        RollPagerView mRollViewPager = (RollPagerView) findViewById(R.id.convenientBanner);
        mRollViewPager.setHintView(new IconHintView(this, R.drawable.ic_page_indicator_focused, R.drawable.ic_page_indicator));
        mRollViewPager.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Toast.makeText(MainActivity.this, "Item " + position + " clicked", Toast.LENGTH_SHORT).show();
                // 切换到detail activity
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        mRollViewPager.setAdapter(new PicLoopAdapter(mRollViewPager));
    }

    // 初始化附近列表
    private void initNearbyRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.nearbyRecyclerView);
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

    // 初始化展品推荐列表
    private void initRecomRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recomRecyclerView);
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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            // 切换到nfc activity
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ReadNfcActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
