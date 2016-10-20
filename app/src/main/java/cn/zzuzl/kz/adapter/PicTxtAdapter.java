package cn.zzuzl.kz.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.zzuzl.kz.R;
import cn.zzuzl.kz.vo.PicTxtVO;

/**
 * Created by Administrator on 2016/10/20.
 */
public class PicTxtAdapter extends RecyclerView.Adapter<PicTxtAdapter.ViewHolder> {
    private List<PicTxtVO> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mTextView = (TextView) v.findViewById(R.id.text);
            mImageView = (ImageView) v.findViewById(R.id.image);
        }
    }

    public PicTxtAdapter(List<PicTxtVO> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public PicTxtAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pic_txt_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTextView.setText(mDataset.get(position).getTitle());
        holder.mImageView.setImageResource(mDataset.get(position).getSrc());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
