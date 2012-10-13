package com.irving.calculadoracomplejos;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public class IntroducirDatos extends Activity implements OnKeyListener{

	EditText real;
	EditText imaginario;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducir_datos);
        
        real=(EditText)findViewById(R.id.editText1);
        imaginario=(EditText)findViewById(R.id.editText2);
        
        real.setOnKeyListener(this);
        imaginario.setOnKeyListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_introducir_datos, menu);
        return true;
    }
   

	public boolean onKey(View v, int keyCode, KeyEvent event) {
		
		Log.i("MIO", "Click!Solo1");
		
		if(event.getAction()==KeyEvent.ACTION_DOWN)
			Log.i("MIO", "Click! Down " + keyCode);
		else if(event.getAction()==KeyEvent.ACTION_UP)
			Log.i("MIO", "Click! Up" + keyCode);
		else 
			Log.i("MIO", "Click!Solo");
		return false;
	
	}
    

}
