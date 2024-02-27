package com.liceolapaz.des.nap;

public class Rectangulo implements FiguraGeometrica {
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return base + base + altura + altura;
    }
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

}
