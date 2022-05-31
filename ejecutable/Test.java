package ejecutable;

import modelo.Empresa;

public class Test 
{
    public static void main(String[] args)
    {
        Empresa miEmpresa = new Empresa(0, 0, null, null);
        miEmpresa.hallarHoras();
        miEmpresa.calcularEdad();

        System.out.println("Su salario es de : $ " + miEmpresa.getSalario());
        System.out.println("Su edad es : " + miEmpresa.getNacimiento());
        //System.out.println("Precio venta: " + miModelo.getPrecioVenta());
    }
}
