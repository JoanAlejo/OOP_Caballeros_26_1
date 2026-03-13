public class Caballero {
    int id;
    String nombre;
    private int vida;
    Material material;
    String constelacion;
    Dios dios;

    //Constructor por defecto
    public Caballero() {
        this.vida=100;
    }

    //Constructor con parametros
    public Caballero(
            String nombre, Material material, String constelacion, Dios dios
    ){
        this.nombre=nombre;
        this.material=material;
        this.constelacion=constelacion;
        this.dios=dios;
    }
    //Sobrescritura de metodos


    @Override
    public String toString() {
        return "Caballero{" + "id=" + id + ", nombre=" + nombre+", constelación= "+constelacion+", vida= "+this.vida+", material= "+material+", dios= "+dios + '}';
    }

    //metodo de getvida, para encapsular el atributo vida
    public int getVida() {
        return vida;
    }

    //metodo setvida para encapsular el atributo vida
    public void setVida(int vida) {
        this.vida = vida;
    }


}
