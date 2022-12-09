package Visitor;

public class Descuento implements Visitor{
    private final double sinDescuento = 0.83333333333333333;
    private final double conDescuento = 0.3333333333333333;
    
    public double visit(TarjetaNormal normal){
        return normal.getPrecios() * sinDescuento;
    }
    
    public double visit(TarjetaDescuento descuento){
        return descuento.getPrecios() * conDescuento;
    }
    
}
