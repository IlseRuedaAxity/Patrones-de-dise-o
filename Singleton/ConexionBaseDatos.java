package Singleton;

public class ConexionBaseDatos {
    // 1. Variable estática y privada que guardará la única instancia.
    private static ConexionBaseDatos instancia;

    // 2. El constructor debe ser privado. 
    // Esto evita que alguien pueda usar "new ConexionBaseDatos()" desde otra clase.
    private ConexionBaseDatos() {
        System.out.println("Inicializando la conexión a la base de datos por única vez...");
    }

    // 3. Método estático público que actúa como punto de acceso global.
    public static ConexionBaseDatos obtenerInstancia() {
        //
        if (instancia == null) {
            instancia = new ConexionBaseDatos();
        }
        
        return instancia;
    }

    
    public void hacerConsulta(String query) {
        System.out.println("Ejecutando consulta: " + query);
    }
}