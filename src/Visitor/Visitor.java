package Visitor;

public interface Visitor {
    public double visit (TarjetaNormal normal);
    public double visit (TarjetaDescuento descuento);
}
