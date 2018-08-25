package br.usjt.ads.desmob.meuprimeiroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText texto;
    public static final String TEXTO = "br.usjt.ads.desmob.meuprimeiroapp.texto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.edit_message);
    }

    public void sendMessage(View view) {
        String mensagem = texto.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(TEXTO, mensagem);
        startActivity(intent);

    }
}
