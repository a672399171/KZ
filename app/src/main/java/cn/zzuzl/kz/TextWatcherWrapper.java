package cn.zzuzl.kz;

import android.text.Editable;

/**
 * Created by Administrator on 2016/10/20.
 */
public class TextWatcherWrapper {
    private final int mId;
    private final OnTextChangedListener mListener;

    public TextWatcherWrapper(int id, OnTextChangedListener listener) {
        mId = id;
        mListener = listener;
    }

    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        // Ignore
    }

    public void onTextChanged(CharSequence s, int start, int before, int count) {
        // Ignore
    }

    public void afterTextChanged(Editable s) {
        mListener.onTextChanged(mId, s.toString());
    }

    public interface OnTextChangedListener {
        void onTextChanged(int id, String s);
    }

}
