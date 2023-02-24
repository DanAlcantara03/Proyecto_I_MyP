package personajes.meganman;

import personajes.Personaje;

public class MeganMan extends Personaje{
    
    PoderMeganMan poder;

    /**
     * Constructor unico y por defecto del personaje Dittuu.
     */
    public MeganMan(){
        super(200,30,.3);
    }

    @Override
    public String verPersonaje(){
        String p = "";
        // Aqui ve agregando o el dibujito del personaje o sus atributos
        //dependiendo del tiempo que te de
        return p;
    }

    @Override
    protected int ataque(){
        return  ataque + poder.poderAtaque();
    }

    @Override
    protected double defensa(){
        return defensa + poder.poderDefensa();
    }
}
