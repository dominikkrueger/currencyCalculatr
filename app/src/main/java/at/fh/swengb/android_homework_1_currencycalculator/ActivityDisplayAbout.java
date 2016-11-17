package at.fh.swengb.android_homework_1_currencycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDisplayAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);

        Intent intent = getIntent();
        String message = intent.getStringExtra("data");
        TextView view = (TextView)findViewById(R.id.resultOutput);

        view.setText(message);
    }
}
