package com.irving.calculadoracomplejos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class Matrices extends Activity {

	TableLayout layout;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrices);
        layout=(TableLayout)findViewById(R.id.layoutMatrices);
        iniciarMatriz();
    }
    
    private void iniciarMatriz(){
    	int numero=3;
    	
    	for(int i=0;i<numero;i++){
    		TableRow tr=new TableRow(this);
    		for(int j=0;j<numero;j++){
    			Button auxBoton=new Button(this);
    			auxBoton.setText("Boton " + i +" " + j);
    			tr.addView(auxBoton);
    			
    		}
    		layout.addView(tr);
    	}
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_matrices, menu);
        return true;
    }
}
