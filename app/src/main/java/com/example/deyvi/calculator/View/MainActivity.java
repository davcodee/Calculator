package com.example.deyvi.calculator.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.deyvi.calculator.Interactor.MainActivityInteractor;
import com.example.deyvi.calculator.Presenter.MainActivityPresenter;
import com.example.deyvi.calculator.Presenter.MainActivityPresenterInterface;
import com.example.deyvi.calculator.R;

public class MainActivity extends AppCompatActivity implements MainActivityInterface{
    /*Entidad presenter*/
    private MainActivityPresenter presenter;
    /*Primer número a sumar*/
    private EditText numberOne;
    /*Segundo número a sumar*/
    private EditText numberTwo;
    /*Resultado a ser mostrado*/
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hay que llamar al presenter  para que pueda ejecutar estos métodos
        presenter = new MainActivityPresenter(this);

        numberOne = (EditText) findViewById(R.id.numberOne);
        numberTwo = (EditText) findViewById(R.id.numberTwo);
        resultado = (TextView) findViewById(R.id.resultado);

    }

    public void sumar(View view) {

        String number1 = numberOne.getText().toString().trim();
        String number2 = numberTwo.getText().toString().trim();

        presenter.Sumar(number1, number2);

    }

    @Override
    public void setResult(String result) {
        resultado.setText(result);
    }

    @Override
    public void setError(String error) {
        resultado.setText(error);
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
