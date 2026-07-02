public class ComputadoraFacade {
    private CPU cpu = new CPU();
    private Memoria memoria = new Memoria();
    private DiscoDuro disco = new DiscoDuro();

    public void presionarBotonEncendido() {
        System.out.println("--- Encendiendo la PC ---");
        cpu.arrancar();
        memoria.cargar();
        disco.leer();
        System.out.println("--- PC lista ---");
    }
}