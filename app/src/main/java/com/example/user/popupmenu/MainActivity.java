package com.example.user.popupmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

      Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup=new PopupMenu(MainActivity.this,bt);
                popup.getMenuInflater().inflate(R.menu.abc, (Menu) popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id=item.getItemId();
                        if(id==R.id.action_settings){
                            Toast.makeText(MainActivity.this,"action setting", Toast.LENGTH_SHORT).show();
                        }
                        else if(id==R.id.walpaper)
                        {
                            Toast.makeText(MainActivity.this,"Wallpaper",Toast.LENGTH_SHORT).show();
                        }
                        else if(id==R.id.theme){
                            Toast.makeText(MainActivity.this,"theme",Toast.LENGTH_SHORT).show();
                        }
                        return false;
                    }
                });popup.show();
            }
        });

    }
}
