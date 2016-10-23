package cn.zzuzl.kz;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2016/10/20.
 */
public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    private int space;
    private boolean vertical;

    public SpaceItemDecoration(int space, boolean vertical) {
        this.space = space;
        this.vertical = vertical;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        if (vertical) {
            // 设置上下间距
            outRect.set(0, space / 2, 0, space / 2);
        } else {
            // 设置左右间距
            outRect.set(space / 2, 0, space / 2, 0);
        }
    }
}
