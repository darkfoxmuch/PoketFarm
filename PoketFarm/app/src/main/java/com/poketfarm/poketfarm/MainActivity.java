package com.poketfarm.poketfarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_finaceiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load();
    }

    public void load() {

        btn_finaceiro = (Button) findViewById(R.id.btn_finaceiro);
        btn_finaceiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_finaceiro.setText("Em Breve");
            }
        });

    }

    public void controledegado(View v) {
        Intent tela = new Intent(this, ControleDeGado.class);
        startActivity(tela);
    }

    public void controledesal(View v) {
        Intent tela = new Intent(this, ControleDeSal.class);
        startActivity(tela);
    }

    public void controledeganho(View v) {
        Intent tela = new Intent(this, ControleDeGanho.class);
        startActivity(tela);
    }
}
