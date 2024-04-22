import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Evidence {
    public ArrayList<Pes>psi = new ArrayList<>();

    public String getAllPes() {
        String[] jmena = new String[psi.size()];
        int i = 0;
        for (Pes pes : psi) {
            jmena[i++] = pes.getJmeno();
        }
        return Arrays.toString(jmena);
    }
public String nejstarsiPes(){
    Pes nejstarsi = null;
    for (Pes pes :  psi) {
        if(nejstarsi == null){
            nejstarsi = pes;
        }else if(nejstarsi.getRok() > pes.getRok()){
            nejstarsi = pes;

        }else if(nejstarsi.getRok() == pes.getRok()){
            if(nejstarsi.getMesic() > pes.getMesic()){
                nejstarsi = pes;
            }

        }else if(nejstarsi.getRok() == pes.getRok()){
            if(nejstarsi.getMesic() == pes.getMesic()){
                if(nejstarsi.getDen() > pes.getDen()){
                    nejstarsi = pes;
                }
            }
        }
    }
    return nejstarsi.getJmeno();
}
    /*public void serialize(Pes p){
        try {
            FileOutputStream fileOut = new FileOutputStream("Pes.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(p);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

    }*/
    public String findByChovatel(Chovatel ch){
        ArrayList<String> jmena = new ArrayList<>();
        for (Pes pes : psi) {
            if(pes.getChovatel() == ch){
                jmena.add(pes.getJmeno());
            }
        }return jmena.toString();
    }
    public String barvaPsa(Barva barva){
        ArrayList<String> jmena = new ArrayList<>();
        for(Pes pes : psi){
            if(pes.getBarva() == barva){
                jmena.add(pes.getJmeno());
            }
        }return jmena.toString();
    }
    public void addPes(Pes p) {
        psi.add(p);
    }

}
