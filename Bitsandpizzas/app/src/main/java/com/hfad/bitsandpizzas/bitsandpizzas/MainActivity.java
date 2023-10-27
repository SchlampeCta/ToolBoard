package com.hfad.bitsandpizzas.bitsandpizzas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.view.Menu;
import android.os.Bundle;
import android.view.MenuItem;

import com.hfad.bitsandpizzas5.R;

public class MainActivity extends AppCompatActivity {
private ShareActionProvider ShareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Menu principal");
    }
    public boolean onCreateOptionsMenu(Menu menu){
        //adiciona items al app bar
        getMenuInflater().inflate(R.menu.menu_main,menu);
        MenuItem menuItem=menu.findItem(R.id.accion_compartir);
        ShareActionProvider= (ShareActionProvider)MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Deseas compartir tu reserva?");

        return super.onCreateOptionsMenu(menu);

    }

    private void setShareActionIntent(String texto) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,texto);
        ShareActionProvider.setShareIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.accion_crear_reserva) {
            Intent intent = new Intent(this, OrderActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}