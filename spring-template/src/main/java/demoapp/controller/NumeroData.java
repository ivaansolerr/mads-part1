package demoapp.controller;

import javax.validation.constraints.NotNull;

public class NumeroData {

    @NotNull(message = "Debes introducir un número")
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}