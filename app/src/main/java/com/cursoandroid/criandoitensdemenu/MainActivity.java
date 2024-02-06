package com.cursoandroid.criandoitensdemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);// passso 2 : retorna um objeto que permite inflar os menus
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch ( item.getItemId()){
            case R.id.ItemSalvar:
                Toast.makeText(MainActivity.this,
                        "Item Salvar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.ItemEditar:
                Toast.makeText(MainActivity.this,
                        "Item Editar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.ItemConfiguracoes:
                Toast.makeText(MainActivity.this,
                        "Item Configuraçoes",
                        Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
