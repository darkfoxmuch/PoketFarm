package com.poketfarm.poketfarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ControleDeGanho extends AppCompatActivity {

    double a, b, c, d, e, f, g, h;
    private EditText valorArroba, ganhoDePeso, quantidaDeMeses, rebanho;
    private TextView lucroPorCabecaMes, LucroPorCabecaTotal, lucroRebanhoMes, lucroPorRebanhoTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_de_ganho);
        valorArroba = (EditText) findViewById(R.id.valorArroba);
        ganhoDePeso = (EditText) findViewById(R.id.ganhoDePeso);
        quantidaDeMeses = (EditText) findViewById(R.id.quantidadeDeMeses);
        rebanho = (EditText) findViewById(R.id.rebanho);
        lucroPorCabecaMes = (TextView) findViewById(R.id.lucroPorCabecaMes);
        LucroPorCabecaTotal = (TextView) findViewById(R.id.LucroPorCabecaTotal);
        lucroRebanhoMes = (TextView) findViewById(R.id.lucroRebanhoMes);
        lucroPorRebanhoTotal = (TextView) findViewById(R.id.lucroPorRebanhoTotal);

    }

    public void Calcular(View view) {
        if (valorArroba.getText().toString().equals("") ||
                ganhoDePeso.getText().toString().equals("") ||
                quantidaDeMeses.getText().toString().equals("")) {
            Toast.makeText(this, "Algum campo vazio!", Toast.LENGTH_SHORT).show();
        } else {
            try {
                DecimalFormat df = new DecimalFormat("#.##");
                a = Double.parseDouble(valorArroba.getText().toString());
                b = Double.parseDouble(ganhoDePeso.getText().toString());
                c = Double.parseDouble(quantidaDeMeses.getText().toString());
                d = Double.parseDouble(rebanho.getText().toString());
                e = (((b * 30) / 2) / 15) * a;
                f = (c * e);
                g = (d * e);
                h = (d * f);
                String resulte = df.format(e);
                String resultf = df.format(f);
                String resultg = df.format(g);
                String resulth = df.format(h);

                lucroPorCabecaMes.setText("R$" + resulte);
                LucroPorCabecaTotal.setText("R$" + resultf);
                lucroRebanhoMes.setText("R$" + resultg);
                lucroPorRebanhoTotal.setText("R$" + resulth);

            } catch (NullPointerException c) {
                Toast.makeText(this, "Algum campo vazio! " + c, Toast.LENGTH_LONG).show();
            } catch (IllegalStateException c) {
                Toast.makeText(this, "Algum campo vazio! " + c, Toast.LENGTH_LONG).show();

            }
        }
    }
}