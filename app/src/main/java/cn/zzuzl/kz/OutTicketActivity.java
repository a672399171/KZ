package cn.zzuzl.kz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OutTicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_ticket);

        setTitle("出票");

        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // jump to main activity
                Intent intent = new Intent();
                intent.setClass(OutTicketActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
