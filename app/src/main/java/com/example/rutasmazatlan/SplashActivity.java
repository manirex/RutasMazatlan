package com.example.rutasmazatlan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView TextoRuta;
    private TextView TextoMzt;

    private Typeface RedRockRuta;
    private Typeface RedRockMzt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

/////////////////////////////////////LINEA FUENTES ////////////////////////////////////////////////////////////
        String fuente1 = "fonts/RedRock.ttf";
        this.RedRockRuta = Typeface.createFromAsset(getAssets(), fuente1);

        String fuente2 = "fonts/RedRock.ttf";
        this.RedRockMzt = Typeface.createFromAsset(getAssets(), fuente2);

        TextoRuta = (TextView) findViewById(R.id.txtRuta);
        TextoRuta.setTypeface(RedRockRuta);
        TextoMzt= (TextView) findViewById(R.id.txtMzt);
        TextoMzt.setTypeface(RedRockMzt);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
