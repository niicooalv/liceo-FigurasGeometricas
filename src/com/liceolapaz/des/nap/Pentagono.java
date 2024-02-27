package com.liceolapaz.des.nap;

public class Pentagono implements FiguraGeometrica{
    private double lado;
    private double apotema;


    @Override
    public double calcularArea() {
        return calcularPerimetro() * apotema / 2;
    }

    @Override
    public double calcularPerimetro() {

        return lado * 5;
    }

    public Pentagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
}
