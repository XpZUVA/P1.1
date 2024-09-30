import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        char cont = 's';
        ArrayList<Integer> lados = new ArrayList<>();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese los lados del triángulo: ");
            for(int i = 0; i < 3; i++) {
                System.out.print("Lado " + (i + 1) + ": ");
                lados.add(sc.nextInt());
            }
            if(comprobarTriangulo(lados.get(0), lados.get(1), lados.get(2))) {
                Triangulo t = new Triangulo(lados.get(0), lados.get(1), lados.get(2));
                lados.clear();
                t.calcularPerimetro();
                t.calcularArea();
                System.out.println("Perímetro: " + t.getPer());
                System.out.println("Área: " + t.getArea());
            }

            System.out.println("¿Desea ingresar otro triángulo? (s/n)");
            cont = sc.next().charAt(0);

        } while (cont == 's' || cont == 'S');

        System.out.println("Gracias por utilizar el programa.");
    }


    public static boolean comprobarTriangulo(int l1, int l2, int l3){
        if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            System.out.println("El triángulo es válido.");
            return true;
        } else {
            System.out.println("El triángulo no es válido.");
            //throw new IllegalArgumentException("Los lados ingresados no forman un triángulo."); caso con excepción
            return false;
        }

    }
}