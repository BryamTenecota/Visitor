package Visitor;

public class Visitante {
    
    public static void main(String[] args) {
        TarjetaDescuento tarj1 = new TarjetaDescuento();
        tarj1.setPrecio(1800);
        TarjetaNormal tarj2 = new TarjetaNormal();
        tarj2.setPrecio(1800);
        
        Descuento descuento = new Descuento();
        double resultado1 = tarj1.aceptar(descuento);
        double resultado2 = tarj2.aceptar(descuento);
        
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
