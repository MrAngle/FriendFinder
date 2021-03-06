package com.mrangle.hogomogo.Activity.StareDoNaukiAlboSprawdzania;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Placeholder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

import com.mrangle.hogomogo.Activity.StareDoNaukiAlboSprawdzania.MojActivity;
import com.mrangle.hogomogo.R;

public class SearchActivity extends AppCompatActivity {

    private Placeholder placek;
    private ConstraintLayout lay;
    private int current;
    //private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lay = findViewById(R.id.lay);
        placek = findViewById(R.id.Dplacek);
        //but = findViewById(R.id.button);

    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void swapViews(View v) {
        TransitionManager.beginDelayedTransition(lay);
        try {
            placek.getContent().setOnClickListener(this::swapViews);
        }
        catch(Exception ignored)
        {

        }

        placek.setContentId(v.getId());
        v.setOnClickListener(this::NewActivity);
    }

    public void NewActivity(View v) {
        Intent intent = new Intent(this, MojActivity.class);
        startActivity(intent);
    }


}
