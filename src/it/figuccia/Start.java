package it.figuccia;

public class Start {
    public static void main(String[] args) {

        String[] array1 = {" I want "," to learn "," how to code! "};

        /*
        String[] array2 = array1.clone();
        array2[0].trim();
        array2[1].trim();
        array2[2].trim();
        */
        String[] array2 = new String[array1.length];
        for (int arg=0; arg < array1.length; arg++){
            array2[arg] = array1[arg].trim();
        }

        System.out.println(!(array2[0].compareTo("I want") > 0 && array2[1].compareToIgnoreCase("To learn") > 0));
    }
}
