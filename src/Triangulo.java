public class Triangulo {


    private int l1, l2, l3;
    private int per, area;


    public Triangulo(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public void calcularPerimetro() {
        per = l1 + l2 + l3;
    }

    public void calcularArea() {
        int s = per / 2;
        area = (int) Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
    }

    public void tipoTriangulo(){
        if(l1 == l2 && l2 == l3){
            System.out.println("El triángulo es equilátero.");
        } else if(l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }


    //GETTERS Y SETTERS

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }

    public int getL3() {
        return l3;
    }

    public int getPer() {
        return per;
    }

    public int getArea() {
        return area;
    }
}
