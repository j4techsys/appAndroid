package br.com.j4techsys.passbuss;

import android.R;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;

public class PrincipalActivity extends ActionBarActivity {
	
	Button btCadastro;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
		
	}
	
	public void layoutCadastro(){
		setContentView(R.layout.cadastro);
		
		btCadastro = (Button) findViewById(R.id.btCadastro);
	}
	
}