package lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    private List<String> palabrasList;

    public Lists() {}

    /** METHODS AND FUNCTION LISTS VERBS STRINGS */

    public List<String> getPalabrasList(){
        if (palabrasList == null){
            palabrasList = new ArrayList<>();
        }
        return palabrasList;
    }
    public void addPalabrasList(String texto){
        if (palabrasList == null){
            palabrasList = new ArrayList<>();
        }
        palabrasList.add(texto);
    }
    public int palabrasListSize(){
        if (palabrasList == null){
            palabrasList = new ArrayList<>();
        }
        return palabrasList.size();
    }
    public String searchPalabras(int index){
        if (index < 0 || index >= palabrasListSize()){
            return null;
        }
        return palabrasList.get(index);
    }
    public boolean removePalabras(int index){
        if (index < 0 || index >= palabrasListSize()){
            return false;
        }
        palabrasList.remove(index);
        return true;
    }

}
