package com.irving.calculadoracomplejos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity implements OnClickListener{

	private Button botonMatriz;
	private Button botonEntrada;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        botonMatriz=(Button)findViewById(R.id.matrices);
        botonMatriz.setText("Matrices");
        botonMatriz.setOnClickListener(this);
        
        botonEntrada=(Button)findViewById(R.id.entrada);
        botonEntrada.setOnClickListener(this);
        botonEntrada.setText("Entrada");
    }

    //onCreate para los Menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
	public void onClick(View v) {
		if(v==botonMatriz){
		Intent intentMatrices=new Intent(this,Matrices.class);
		this.startActivity(intentMatrices);
		}
		else{
			Intent intentEntrada=new Intent(this,IntroducirDatos.class);
			this.startActivity(intentEntrada);
		}
		
	}
}
