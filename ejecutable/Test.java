package ejecutable;

import modelo.Empresa;

public class Test 
{
    public static void main(String[] args)
    {
        Empresa ahora = new hallarFNacimineto();

         //1. Crear un carro rojo ubicado en la posicion (0 ,0).
        Empresa miCarro = new Empresa("Rojo", 0, 0);
        

         //2. Mostrar la informacion del carro creado.
        System.out.println("Informacion del carro: \n " + miCarro.getColor()+ " y la posicion en x es: " + miCarro.getPosX() + " y la posicion en y es: " + miCarro.getPosY());
        
        //3. Cambiar el color del carro.
        miCarro.setColor("Azul");

         //4. Acelerar el carro.
        miCarro.acelerar();

         //5. Volver a acelerar el carro.
         miCarro.acelerar();

         //6. Cambiar la posicion del carro.
         miCarro.mover(200, 300);

         //7. Crear un carro verde en la posicion (200, 300).
        Empresa miCarro2 = new Empresa("Verde", 200, 300);

         //8. Crear un carro negro en la posicion (1000,1000).
        Empresa miCarro3 = new Empresa("Negro", 1000, 1000);

         //9. Crear un vector con los carros creados.
        Empresa[] carros = new Empresa[3];
        carros[0] = miCarro;
        carros[1] = miCarro2;
        carros[2] = miCarro3;

         //10. Agregar el metodo toString a la clase carro y finalmente mostrar la informacion
         // del vector de carros que se creo.
        System.out.println("Informacion del carro " + miCarro);

        


    }
}
