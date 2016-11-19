package id.sch.smktelkom_mlg.project.xirpl203122130.kantin_moklet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class mulai extends AppCompatActivity {
    ImageView ivFoto;
    TextView tvJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Kantin Moklet");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
