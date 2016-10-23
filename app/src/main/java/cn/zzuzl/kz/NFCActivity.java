package cn.zzuzl.kz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NFCActivity extends AppCompatActivity {
    public static final String TAG = "NFCActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);

        setTitle("NFC");
    }

}
