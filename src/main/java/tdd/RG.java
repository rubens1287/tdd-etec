package tdd;

public class RG {

    public boolean isValidaRG(String valor){
        if((valor == null) ||  (valor.isEmpty()) || (valor.charAt(8) != '-')) {
            return false;
        }
        return true;
    }
}
