package principal;

import model.Libro;
import services.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    Scanner teclado = new Scanner(System.in);
    String URL = "https://gutendex.com/books/?search=";
    String nombreLibro;
    ConsumoAPI solicitar = new ConsumoAPI();

    public void muestraElMenu() {
        int opcion = -1;

        while(opcion != 0){
            String menu = """
                    1- Buscar libro por titulo
                    2- Listar libros registrados
                    3- Listar autores registrados
                    4- Listar autores vivos en un determiando año
                    5- Listar libros por idioma
                    Presione 0 para salir
                    """;

            System.out.println(menu);

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del libro que desea buscar");
                    nombreLibro = teclado.nextLine();
                    Libro libro = new Libro(solicitar.obtenerLibros(URL+nombreLibro.replace(" ","%20")));
                    System.out.println(libro.toString());
                    
                    break;
                case 2:
                    System.out.println("Pronto disponible");
                    break;
                case 3:
                    System.out.println("Pronto disponible");
                    break;
                case 4:
                    System.out.println("Pronto disponible");
                    break;
                case 5:
                    System.out.println("Pronto disponible");
                    break;
                default:
                    System.out.println("Opcion equivocada");

            }


        }

    }

}
