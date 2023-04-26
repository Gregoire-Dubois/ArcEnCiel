package fr.eni.ecole.ArcEnCiel;

public class Main {
    public static void main(String[] args) {

        EnumColors ec = EnumColors.BLEU;

        ec.defaultAnswer("green");

        ec.displayNextValue("bleu");

        ec.displayAll();
    }

}