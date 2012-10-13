package com.irving.calculadoracomplejos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Matrices extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrices);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_matrices, menu);
        return true;
    }
}
