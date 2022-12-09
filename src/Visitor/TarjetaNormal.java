package Visitor;

public class TarjetaNormal implements Visitable{
    private double precio;
    
    public double aceptar(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrecios() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
