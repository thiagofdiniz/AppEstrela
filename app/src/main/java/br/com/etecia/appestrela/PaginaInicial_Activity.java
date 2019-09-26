package br.com.etecia.appestrela;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class PaginaInicial_Activity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_inicial_layout);

        toolbar = findViewById(R.id.idToolBar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_android_black);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(), "Cliqiei no cadastrar",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(), "Cliquei no alterar",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(), "Cliquei no excluir",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(), "Cliquei no buscar",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}