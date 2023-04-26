package fr.eni.ecole.ArcEnCiel;

public enum EnumColors {

    ROUGE("rouge"),
    ORANGE("orange"),
    JAUNE("jaune"),
    VERT("vert"),
    BLEU("bleu"),
    INDIGO("indigo"),
    VIOLET("violet");

    private String couleur;

    EnumColors(String couleur) {
    }

    // en cas de couleur inexistante dans le Enum le retour fait à l'utilisatur est la couleur orange
    public void defaultAnswer(String couleurCheck){
        int count = 0;
        String message =" ";

        for (EnumColors e : EnumColors.values()){
            if(couleurCheck.equalsIgnoreCase(e.name())){
                count++;

            }
        }

        System.out.println("--------------------------------");
        System.out.println("Affichage d'une couleur par défaut");
        System.out.println("--------------------------------");
        if (count == 0){
            message= "Sélection d'une valeur nulle implique la récupération de la couleur orange"+ "\n"+
                    "L'instance de l'énumération est orange";
        }

        System.out.println(message);

    }

    // affiche la valeur suivante à celle saisie par l'utilisateur (exemple violet donne rouge
    public void displayNextValue(String couleurCheck){
        int indexValue = 0;
        int indexValueOut= 0;
        for(EnumColors e : EnumColors.values()){
            if(couleurCheck.equalsIgnoreCase(e.name())){
                indexValue = e.ordinal();
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Récupération de la valeur suivante");
        System.out.println("--------------------------------");

        if (indexValue+1 >= EnumColors.values().length){
            indexValueOut = 1;
            System.out.println("Sélection de la couleur " + EnumColors.values()[indexValueOut]+ "implique la récupération de la couleur " + EnumColors.values()[indexValue+1] +
                    "\n" +" L'instance de l'énumération est " + EnumColors.values()[indexValue+1] );

        }else {
            System.out.println("Sélection de la couleur " + EnumColors.values()[indexValueOut] + " implique la récupération de la couleur " +EnumColors.values()[indexValueOut+1] +
                    "\n"+" L'instance de l'énumération est " +EnumColors.values()[indexValueOut+1]);

        }

    }

    // Afficher toutes les valeurs  définies dans l'énumération

    public void displayAll(){
        System.out.println("--------------------------------");
        System.out.println("Affichage de toutes les valeurs");
        System.out.println("--------------------------------");

        for (EnumColors e : EnumColors.values()){
            System.out.println(e);
        }
    }
}
