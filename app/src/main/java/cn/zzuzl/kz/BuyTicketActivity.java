package cn.zzuzl.kz;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BuyTicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_ticket);

        setTitle("购票");

        TextView textView = (TextView) findViewById(R.id.textView21);
        textView.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 切换到out ticket activity
                Intent intent = new Intent();
                intent.setClass(BuyTicketActivity.this, OutTicketActivity.class);
                startActivity(intent);
            }
        });
    }
}
