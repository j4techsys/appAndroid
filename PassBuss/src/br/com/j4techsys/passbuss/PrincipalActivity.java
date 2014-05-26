package br.com.j4techsys.passbuss;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import br.com.j4techsys.passbuss.R;

public class PrincipalActivity extends ActionBarActivity {
	
	Button btCadastro;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_principal);
		
	}
	
	public void layoutCadastro(){
		setContentView(R.layout.layout_cadastro);
		
		btCadastro = (Button) findViewById(R.id.btCadastro);
	}
	
}