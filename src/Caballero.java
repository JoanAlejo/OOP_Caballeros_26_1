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
    //se agrego al constructor el atributo vida
    public Caballero(
            int id, String nombre, String constelacion, int vida
    ){
        this.id=id;
        this.nombre=nombre;
        material=Material.ORO; //lo dejo definido porque todos son caballeros de oro
        this.constelacion=constelacion;
        dios=Dios.ATENEA;//lo dejo definido porque todos sirven a atenea
        this.vida=vida;
    }
    //Sobrescritura de metodos


    @Override
    public String toString() {
        return "Caballero " + id + ", llamado " + nombre+" de "+constelacion+", con una vida de "+vida+" y una armadura de "+material+" que le sirve a "+dios + '}';
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
