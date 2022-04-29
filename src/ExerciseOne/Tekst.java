package ExerciseOne;

import java.util.ArrayList;

public class Tekst
{
    //Reference til objektet med navn på venstre side : Oprettelse af objektet på højre side.
    private ArrayList<String> tekstLinjer = new ArrayList<String>();

    //Hele første linje af metoden kaldes metodens signatur
    public void tilføj(String tekstViTilføjer){
    tekstLinjer.add(tekstViTilføjer);
    }

    public void printArrayListTekst(){
        System.out.println(tekstLinjer);
    }

    /*public int findAntalUnikke(){
        for (int i = 0; i <tekstLinjer.size(); i++) {
            System.out.println(tekstLinjer.get(i));
        }
        return 0;
    }*/

    public int findAntalUnikke(){
        int antalUikke = 0;
        for(int i = 0; i < tekstLinjer.size(); i++){
            for (int j = 1; j <tekstLinjer.size(); j++) {
                if(tekstLinjer.get(i).equals(tekstLinjer.get(j))){
                    continue;

                }
            }
            antalUikke++;

//tekstLinjer.contains(tekstLinjer.get(i)
        }
        return antalUikke;
    }

}
