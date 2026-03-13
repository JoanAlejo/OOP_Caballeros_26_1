
public class Main {
    public static void main(String[] args) {

  /*      Caballero c1 = new Caballero();
        c1.id=1;
        c1.nombre="Mu";
        c1.constelacion="Aries";
        c1.material=Material.ORO;
        c1.dios=Dios.ATENEA;
        Caballero c2 = new Caballero("Aldebaran",Material.ORO,"Tauro",Dios.ATENEA);
        System.out.println(c2.material+" "+c2.nombre);

        System.out.println(c2);
        System.out.println(c1);
       System.out.println(c1.getVida());
       System.out.println(c2.getVida());

       c2.setVida(500);
        System.out.println(c2.getVida());
        System.out.println(c2);
*/
    Caballero[] caballeros = new Caballero[12];
        caballeros[0]=new Caballero(1,"Mu","Aries",10);
        caballeros[1] = new Caballero(2, "Aldebaran", "Tauro", 150);
        caballeros[2] = new Caballero(3, "Saga", "Geminis", 108);
        caballeros[3] = new Caballero(4, "Mascara de Muerte", "Cancer", 240);
        caballeros[4] = new Caballero(5, "Aioria", "Leo", 650);
        caballeros[5] = new Caballero(6, "Shaka", "Virgo", 700);
        caballeros[6] = new Caballero(7, "Dohko", "Libra", 5);
        caballeros[7] = new Caballero(8, "Milo", "Escorpio", 950);
        caballeros[8] = new Caballero(9, "Aiolos", "Sagitario", 120);
        caballeros[9] = new Caballero(10, "Shura", "Capricornio", 100);
        caballeros[10] = new Caballero(11, "Camus", "Acuario", 6150);
        caballeros[11] = new Caballero(12, "Afrodita", "Piscis", 100);
        for (int i = 0; i < caballeros.length; i++) {
            System.out.println(caballeros[i]);
        }
    }
}