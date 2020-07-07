package tdd;

public class RG {

    public boolean isValidaRG(String valor){
        if((valor == null) ||  (valor.isEmpty()) ) {
            return false;
        }
        return true;
    }
}
