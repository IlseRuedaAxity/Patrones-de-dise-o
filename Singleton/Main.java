package Singleton;

public class Main {
    public static void main(String[] args) {
        
        // No usamos "new ConexionBaseDatos()", usamos el método obtenerInstancia()
        
        // Simulamos que pide una conexión
        ConexionBaseDatos conexion1 = ConexionBaseDatos.obtenerInstancia();
        conexion1.hacerConsulta("SELECT * FROM usuarios");

        // Simulamos que otra parte del programa pide una conexión
        ConexionBaseDatos conexion2 = ConexionBaseDatos.obtenerInstancia();
        conexion2.hacerConsulta("SELECT * FROM productos");

        // Comprobación final: ¿Son la misma instancia en la memoria?
        System.out.println("¿conexion1 y conexion2 son el mismo objeto?: " + (conexion1 == conexion2));
    }
}