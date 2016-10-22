package cn.zzuzl.kz.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import cn.zzuzl.kz.R;
import cn.zzuzl.kz.vo.NfcItemVo;

/**
 * Created by Administrator on 2016/10/21.
 */
public class NfcListAdapter extends RecyclerView.Adapter<NfcListAdapter.ViewHolder> {
    private List<NfcItemVo> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitleView;
        public TextView mTitleView1;
        public TextView mTitleView2;
        public ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mTitleView = (TextView) v.findViewById(R.id.title);
            mTitleView1 = (TextView) v.findViewById(R.id.title1);
            mTitleView2 = (TextView) v.findViewById(R.id.title2);
            mImageView = (ImageView) v.findViewById(R.id.image);
        }
    }

    public NfcListAdapter(List<NfcItemVo> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public NfcListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.read_nfc_list, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTitleView.setText(mDataset.get(position).getTitle());
        holder.mTitleView1.setText(mDataset.get(position).getTitle1());
        holder.mTitleView2.setText(mDataset.get(position).getTitle2());
        holder.mImageView.setImageResource(mDataset.get(position).getSrc());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
