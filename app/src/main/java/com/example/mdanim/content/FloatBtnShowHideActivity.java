package com.example.mdanim.content;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.mdanim.R;

/**
 * @author HalyangDreaml
 */
public class FloatBtnShowHideActivity extends AppCompatActivity {

    LinearLayoutCompat linearLayoutCompat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float_showhide);
        linearLayoutCompat = findViewById(R.id.content_view);
        addView();
    }

    private void addView() {
        for (int i = 0; i < 30; i++) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 96));
            appCompatTextView.setText("喜欢就给Star吧");
            appCompatTextView.setTextSize(18);
            appCompatTextView.setGravity(Gravity.CENTER);
            linearLayoutCompat.addView(appCompatTextView);
        }
    }
}
