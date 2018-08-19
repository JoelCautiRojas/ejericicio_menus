package example.com.ejerciciomenus_ago2018;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView menu_inferior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu_inferior = findViewById(R.id.menu2);
        menu_inferior.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Context co = getApplicationContext();
                switch (item.getItemId()){
                    case R.id.i1:
                        Toast.makeText(co,"Cumpleaños",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.i2:
                        Toast.makeText(co,"Nos vamos de viaje",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.i3:
                        Toast.makeText(co,"Es hora de estudio",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Context co = getApplicationContext();
        switch (item.getItemId()){
            case R.id.o1:
                Toast.makeText(co,"has marcado 1",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                return true;
            case R.id.o2:
                Toast.makeText(co,"has marcado 2",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.o3:
                Toast.makeText(co,"has marcado 3",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
