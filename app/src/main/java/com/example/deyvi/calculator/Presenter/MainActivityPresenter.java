package com.example.deyvi.calculator.Presenter;

import com.example.deyvi.calculator.Interactor.MainActivityInteractor;
import com.example.deyvi.calculator.View.MainActivity;

/**
 * Created by deyvi on 28/07/2017.
 * Clase intermediaria para la vista y el interactor
 */
public class MainActivityPresenter implements MainActivityPresenterInterface  {

    /*Entidad vista */
    private MainActivity activityView;
    /*Entidad interactor */
    private MainActivityInteractor interactor;

    /**
     * Constructor  que inicializa  nuestro
     * @param activityView
     */
    public MainActivityPresenter(MainActivity activityView) {
        this.activityView = activityView;
        //le pasamos la referencia con this
        interactor = new MainActivityInteractor(this);
    }


    /**
     * Método que llama al método sumar de nuestro interactor.
     * */
    @Override
    public void Sumar(String number1, String number2) {
        interactor.sumar(number1, number2);
    }


    /**
     * Método que recibe @param result de interactor y lo muestra en la vista
     */
    @Override
    public void setResult(String result) {
        activityView.setResult(result);
    }


    /**
     * Método que recibe @param error del interactor y lo muestra en la vista
     */
    @Override
    public void setError(String error) {
        activityView.setError(error);
    }

}
