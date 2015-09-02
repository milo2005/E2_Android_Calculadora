package creatic.movil.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, rest, multi, div;
    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.btn_add);
        rest = (Button) findViewById(R.id.btn_rest);
        multi = (Button) findViewById(R.id.btn_multi);
        div = (Button) findViewById(R.id.btn_div);

        num1 = (EditText) findViewById(R.id.edit_number1);
        num2 = (EditText) findViewById(R.id.edit_number2);

        add.setOnClickListener(this);
        rest.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        String n1 =  num1.getText().toString();
        String n2 =  num2.getText().toString();

        int i1 = Integer.parseInt(n1);
        int i2 = Integer.parseInt(n2);

        int result = 0;

        switch(view.getId()){
            case R.id.btn_add:
                result = i1+i2;
                break;
            case R.id.btn_rest:
                result = i1-i2;
                break;
            case R.id.btn_multi:
                result = i1 * i2;
                break;
            case R.id.btn_div:
                result = i1 /i2;
                break;
        }

        String resultado = getString(R.string.resultado);

        Toast.makeText(this, resultado+": "+result, Toast.LENGTH_SHORT).show();

    }
}
