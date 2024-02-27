//Ejercicio java Figuras geometricas
//Programación 1º de desarrollo de aplicaciones
//2024 Liceo la Paz
package com.liceolapaz.des.nap;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        FiguraGeometrica figura = null;
        while(true) {
            switch(pedirTexto("""
                    FIGURAS GEOMÉTRICAS
                    1. Triángulo
                    2. Rectángulo
                    3. Cuadrado
                    4. Pentágono
                    0. Salir
                    """)) {
                case 1: { // Triángulo
                    double lado1 = pedirDato("Escribe el lado 1");
                    double lado2 = pedirDato("Escribe el lado 2");
                    double lado3 = pedirDato("Escribe el lado 3");
                    double altura = pedirDato("Escribe la altura");
                    figura = new Triangulo(lado1, lado2, lado3, altura);
                    mostrarResultado(figura);
                    break;}
                case 2: { // Rectángulo
                    double base = pedirDato("Escribe la base");
                    double altura = pedirDato("Escribe la altura");
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    mostrarResultado(rectangulo);
                }
                case 3: { // Cuadrado
                    double lado = pedirDato("Escribe el lado");
                    Cuadrado cuadrado = new Cuadrado(lado);
                    mostrarResultado(cuadrado);
                    break;
                }
                case 4: { //Pentagono
                    double lado = pedirDato("Escribe el lado");
                    double apotema = pedirDato("Escribe el apotema");
                    Pentagono pentagono = new Pentagono(lado, apotema);
                    mostrarResultado(pentagono);
                    break;
                     }
                case 0: {
                    System.out.println("Saliendooo...");
                    System.exit(0);
                }
                default: {
                    System.out.println("Error opción incorrecta");

                }

            }
        }

    }

    private static int pedirTexto(String texto) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(texto);
        return scanner.nextInt();
    }
    private static double pedirDato(String texto) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(texto);
        return scanner.nextDouble();
    }
    private static void mostrarResultado(FiguraGeometrica objecto) {
        System.out.println("El area es " + objecto.calcularArea() + " y el perimetro es " + objecto.calcularPerimetro());
    }
}
