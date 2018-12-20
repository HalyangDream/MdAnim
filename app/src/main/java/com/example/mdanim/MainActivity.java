package com.example.mdanim;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.mdanim.content.DependOnTopActivity;

/**
 * @author HalyangDream
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Toolbar toolbar;
    private AppCompatTextView itemView1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        itemView1 = findViewById(R.id.item_1);

        itemView1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.item_1:
                Intent intent = new Intent(this, DependOnTopActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


}
