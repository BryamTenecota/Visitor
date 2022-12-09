package Visitor;

public class TarjetaDescuento implements Visitable{
    private double precio;
    
    public double aceptar(Visitor visitor){
        return visitor.visit(this);
    }
    public double getPrecios(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
}
