package personajes.dittuu;

/**
 * / Escribe lo que representa esta clase
 */
public class Miawmbo implements PoderDittuu{

    @Override
    public int poderAtaque(){
        return 0;
    }

    @Override
    public double poderDefensa(){
        return 0.4;
    }

    @Override
    public String mensajeAtaque(){
        String msj = "";
        return msj;
    }

    @Override
    public String mensajeDefensa(){
        String msj = "";
        msj += "Dittuu se ha transformado en Miawmbo esquivando algunos ataques de sus contrincantes";
        msj += " mientras baila UNA GATITA QUE LE GUSTA EL MAMBO";
        msj += "Su defensa se ha aumentado 0.4";
        return msj;
    }
}