package com.poketfarm.poketfarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ControleDeSal extends AppCompatActivity {

    double a, b, c, d, e, f, g, h;
    private EditText valorSaco, pesoSaco, pesoPorAnimal, rebanho;
    private TextView custoPorCabeca, custoPorCabecaMes, custoPorRebanho, custoPorRebanhoMes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controle_de_sal);
        valorSaco = (EditText) findViewById(R.id.valorArroba);
        pesoSaco = (EditText) findViewById(R.id.ganhoDePeso);
        pesoPorAnimal = (EditText) findViewById(R.id.quantidadeDeMeses);
        rebanho = (EditText) findViewById(R.id.rebanho);
        custoPorCabeca = (TextView) findViewById(R.id.lucroPorCabecaMes);
        custoPorCabecaMes = (TextView) findViewById(R.id.LucroPorCabecaTotal);
        custoPorRebanho = (TextView) findViewById(R.id.lucroRebanhoMes);
        custoPorRebanhoMes = (TextView) findViewById(R.id.lucroPorRebanhoTotal);

    }

    public void Calcular(View view) {
        if (valorSaco.getText().toString().equals("") ||
                pesoSaco.getText().toString().equals("") ||
                pesoPorAnimal.getText().toString().equals("")) {
            Toast.makeText(this, "Algum campo vazio!", Toast.LENGTH_SHORT).show();
        } else {
            try {
                DecimalFormat df = new DecimalFormat("#.##");
                a = Double.parseDouble(valorSaco.getText().toString());
                b = Double.parseDouble(pesoSaco.getText().toString());
                c = Double.parseDouble(pesoPorAnimal.getText().toString());
                d = Double.parseDouble(rebanho.getText().toString());
                e = (a * c) / b;
                f = (e * 30);
                g = (d * e);
                h = (d * f);
                String resulte = df.format(e);
                String resultf = df.format(f);
                String resultg = df.format(g);
                String resulth = df.format(h);

                custoPorCabeca.setText("R$" + resulte);
                custoPorCabecaMes.setText("R$" + resultf);
                custoPorRebanho.setText("R$" + resultg);
                custoPorRebanhoMes.setText("R$" + resulth);

            } catch (java.lang.NullPointerException c) {
                Toast.makeText(this, "Algum campo vazio! " + c, Toast.LENGTH_LONG).show();
            } catch (java.lang.IllegalStateException c) {
                Toast.makeText(this, "Algum campo vazio! " + c, Toast.LENGTH_LONG).show();

            }
        }
    }
}
