package com.example.deyvi.calculator.Presenter;

/**
 * Created by deyvi on 28/07/2017.
 */

public interface MainActivityPresenterInterface {

    //Método exclusivo del presentador
    void Sumar(String number1, String number2);
    void setResult(String result);
    void setError(String error);
}
