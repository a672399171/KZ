package cn.zzuzl.kz;

import android.nfc.NdefMessage;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;

import java.util.Map;

/**
 * Created by Administrator on 2016/10/20.
 */
public class NfcProvisioningFragment extends Fragment implements
        NfcAdapter.CreateNdefMessageCallback,
        TextWatcherWrapper.OnTextChangedListener,
        LoaderManager.LoaderCallbacks<Map<String, String>> {
    @Override
    public NdefMessage createNdefMessage(NfcEvent event) {
        return null;
    }

    @Override
    public Loader<Map<String, String>> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Map<String, String>> loader, Map<String, String> data) {

    }

    @Override
    public void onLoaderReset(Loader<Map<String, String>> loader) {

    }

    @Override
    public void onTextChanged(int id, String s) {

    }
}
