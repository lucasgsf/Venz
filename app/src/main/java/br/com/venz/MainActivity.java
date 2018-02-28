package br.com.venz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private Toolbar mToolbarBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.tb_main);
        mToolbar.setTitle("Venz");
        //mToolbar.setLogo(R.drawable.ic_launcher_foreground);
        //mToolbar.setSubtitle("Subtítulo");
        setSupportActionBar(mToolbar);
    }
}
