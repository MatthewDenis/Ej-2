package ejercicio.pkg2;

/**
 *
 * @author mateo
 * los findvar() sera metodos para hallar la variable en una lista o en un archivo
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Socios s;
        Libros l;
        s = new Socios();
        l = new Libros();
        int menu;
        boolean Sistema;
        Sistema = true;
        while(Sistema == true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Escoger que accion quiere realizar. ");
            System.out.print("1. Nuevo Socio        ");
            System.out.print("2. Prestar Libro      ");
            System.out.print("3. Devolucion De Libro        ");
            System.out.print("4. Salir del Sistema.");
            System.out.print("5. Agregar nuevo libro. - ");
            menu = sc.nextInt();
            while ((menu<1)||(menu>5)){
                System.out.println("Opcion NO valida");
                System.out.println("Escoger que accion quiere realizar. ");
                System.out.print("1. Nuevo Socio        ");
                System.out.print("2. Prestar Libro      ");
                System.out.print("3. Devolucion De Libro        ");
                System.out.print("4. Salir del Sistema   ");
                System.out.print("5. Agregar nuevo libro. - ");
                menu = sc.nextInt();
            }
            switch(menu){
                case 4:
                    /*
                    Sale del sistema
                    */
                    Sistema = false;
                    break;/*
                    Preguntar cual sentencia hace que el codigo Exit() == python
                    */
                case 1:
                    /* 
                    Nuevo Socio solo puede salir del menu antes de ingresar un nuevo codigo
                    */
                    
                    System.out.print("Nuevo codigo. - ");
                    String c; 
                    sc.nextLine();
                    c = sc.nextLine();
                    s.setCodigo(c);
                    
                    
                    System.out.print("Ingrese el nombre del nuevo socio. - ");
                    
                    String N = sc.nextLine();
                    s.setNombre(N);
                    
                    s.setNroLibros(0);
                    System.out.println("El socio " + s.getNombre() + " ha sido ingresado al sistema. ");
                    break;
                case 2:
                    /*
                    Prestar libro
                    */
                    System.out.print("Ingresar el codigo del socio. - ");
                    sc.nextLine();
                    String cod = sc.nextLine();
                    s.setCodigo(cod);
                    if (s.SeguirSacando() == false){
                        System.out.println("No puede seguir sacando libros. ");
                        break;
                    }
                    /*
                        suponiendo que la persona ya es socio del local 
                    */
                    System.out.print("Ingrese el Codigo del libro. ");
                    
                    String Codigolibro = sc.next();
                    l.setEstado(0);
                    System.out.println("El libro, " + l.findTitulo() +  " ha sido sacado de la biblioteca por el socio " + s.findNombre()+ " .");
                    s.SumarNroLibros();
                    l.setPrestador(s.getCodigo());
                    break;
                case 3:
                    /* Devolucion de un libro*/
                    System.out.print("Ingresar el codigo del Libro. - ");
                    String libroC = sc.next();
                    
                    /*
                        suponiendo que la persona ya es socio del local 
                    */
                    System.out.print("Ingrese el Codigo del socio. - ");
                    String Codigosocio = sc.next();
                    l.setEstado(1);
                    System.out.println("El libro, " + l.findTitulo() +  " ha sido devuelto a la  biblioteca por el socio " + s.findNombre()+ " .");
                    s.RestarNroLibros();
                    l.setPrestador(s.getCodigo());
                    break;
                case 5:
                    /* Agregar libros al sistema*/
                    System.out.print("Ingrese el codigo del nuevo libro. - ");
                    sc.nextLine();
                    String co = sc.nextLine();
                    l.setCodigo(co);
                    System.out.print("Ingrese el titulo del nuevo libro. - ");
                    String Nt = sc.nextLine();
                    l.setTitulo(Nt);
                    System.out.print("Ingrese el autor del nuevo libro. - ");
                   
                    String Na = sc.nextLine();
                    l.setAutor(Na);
                    l.setEstado(1);
                    System.out.println("El libro "+l.getTitulo()+", por el autor "+l.getAutor()+" ha sido registrado");
                    break;
            }
        }    
    }
      
}