package cn.zzuzl.kz.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.LoopPagerAdapter;

import cn.zzuzl.kz.R;

/**
 * Created by Administrator on 2016/10/21.
 */
public class PicLoopAdapter extends LoopPagerAdapter {
    private int[] imgs = {
            R.drawable.ic_test_0,
            R.drawable.ic_test_1,
            R.drawable.ic_test_2,
            R.drawable.ic_test_3,
    };

    public PicLoopAdapter(RollPagerView viewPager) {
        super(viewPager);
    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(container.getContext());
        view.setImageResource(imgs[position]);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getRealCount() {
        return imgs.length;
    }
}
