package id.sch.smktelkom_mlg.project.xirpl203122130.kantin_moklet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonUs;
    Button buttonMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonUs = (Button) findViewById(R.id.buttonUs);
        buttonMulai = (Button) findViewById(R.id.buttonMulai);

        findViewById(R.id.buttonUs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, about_us.class));
            }
        });

        findViewById(R.id.buttonMulai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, mulai.class));
            }
        });

    }
}
