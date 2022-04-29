package ExerciseOne;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        Tekst testTekst = new Tekst();
        testTekst.tilføj("Hej");
        testTekst.tilføj("Nej");
        testTekst.tilføj("JA");
        testTekst.tilføj("Ting");
        testTekst.tilføj("Mad");
        testTekst.tilføj("Pandekage");
        testTekst.tilføj("Træt");
        testTekst.tilføj("Hej");
        //testTekst.printArrayListTekst();
        System.out.println(testTekst.findAntalUnikke());


        /*ArrayList<String> testArraylist = new ArrayList<String>();
        testArraylist.add("hej");
        testArraylist.add("med");
        testArraylist.add("dig");
        testArraylist.add("hej");
        System.out.println(testArraylist.contains());*/
    }
}
