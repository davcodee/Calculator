package com.example.deyvi.calculator.Interactor;

import com.example.deyvi.calculator.Presenter.MainActivityPresenter;
import com.example.deyvi.calculator.View.MainActivityInterface;

/**
 * Created by deyvi on 28/07/2017.
 * Clase que ejecuta la lógica de nuestro programa.
 */

public class MainActivityInteractor implements MainActivityInteractorInterface{

    /*Entidad Presenter*/
    MainActivityPresenter presenter;

    /**
     * Constructor que inicializa  nuestro presenter
     */
    public MainActivityInteractor(MainActivityPresenter presenter) {
        this.presenter = presenter;

    }

    /**
     * Método que suma @param number1 y @param number2
     */
    @Override
    public void sumar(String number1, String number2) {
        if(number1.isEmpty() && number2.isEmpty()){
            presenter.setError("Ingresa un numero valido");
        }else {

            Double result = Double.valueOf(number1) + Double.valueOf(number2);

            presenter.setResult(String.valueOf(result));
        }
    }
}
