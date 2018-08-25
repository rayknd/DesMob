package br.usjt.ads.desmob.meuprimeiroapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(MainActivity.TEXTO);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(mensagem);

        ViewGroup layout = findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
}
