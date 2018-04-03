package com.example.apurva.popupmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=findViewById(R.id.btn_click);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.widget.PopupMenu p1=new android.widget.PopupMenu(getApplicationContext(),click);

                p1.getMenuInflater().inflate(R.menu.popup_menu_options, p1.getMenu());
                p1.show();

                p1.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {


                        switch (item.getItemId()){
                            case R.id.item1:
                                click.setBackgroundColor(Color.RED);
                                break;
                            case R.id.item2:
                                click.setBackgroundColor(Color.BLUE);
                                break;
                            case R.id.item3:
                                click.setBackgroundColor(Color.GREEN);
                                break;
                            case R.id.item4:
                                click.setBackgroundColor(Color.BLACK);
                                break;
                        }
                        return false;
                    }
                });

//
            }
        });
    }
}
