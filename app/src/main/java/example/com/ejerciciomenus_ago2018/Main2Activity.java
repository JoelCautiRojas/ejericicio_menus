package example.com.ejerciciomenus_ago2018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
                startActivity(new Intent(Main2Activity.this,MainActivity.class));
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
