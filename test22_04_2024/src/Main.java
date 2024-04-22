public class Main {
    public static void main(String[] args)throws Exception {


        Evidence e = new Evidence();

        Chovatel ch1 = new Chovatel("Jiří", "Novák","Novakovych 19" );
        Chovatel ch2 = new Chovatel("Pavel", "Novtný","Jecna 22" );
        Chovatel ch3 = new Chovatel("James", "Rocker", "Retezokovaru 96");

        Pes p1 = new Pes("Azor","19/05/2007","CMKU/ABCD/1111/2007",Barva.CERNA,ch1);
        Pes p2 = new Pes("Max","10/08/2008","CMKU/ASDF/2222/2008",Barva.ZLATA,ch2);
        Pes p3 = new Pes("Princess","08/10/2008","CMKU/BLOB/3333/2008",Barva.BILA,ch3);

        e.addPes(p1);
        e.addPes(p2);
        e.addPes(p3);


      //  e.serialize(p1);
        System.out.println("Psi podle barvy: " + e.barvaPsa(Barva.CERNA));
        System.out.println("nejstarsi pes: " + e.nejstarsiPes());
        System.out.println("Vsichni psi " + e.getAllPes());
        System.out.println("Vsichni psi daneho chovatele: " + e.findByChovatel(ch2));

        System.out.println("Pes 1:"+ p1);
        System.out.println("Pes 2:"+ p2);
        System.out.println("Pes 3:"+ p3);
    }
}