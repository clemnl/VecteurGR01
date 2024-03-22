public class Liste {

    public int nbElements;
    private Noeud premier;


    public Liste() {
        premier = null;
        nbElements = 0;
    }


    public String toString() {
        String str = "[";
        for (Noeud courant = premier ; courant != null; courant = courant.prochain)
            str +=  courant.valeur + ", ";
        return str + "]";
    }

    public int getElementAt(int index) {
        for (Noeud courant = premier ; courant != null; courant = courant.prochain)
            if (index-- == 0)
                return courant.valeur;
        return -1;
        /*Alternative :
        Noeud courant = premier;
        * for (int i = 0 ; i <= index ; i++)
            if (courant != null)
        *       courant = courant.prochain;
            else
                return -1;
          return courant.valeur;*/
    }

    public int getNbElements() {
        return nbElements;
    }

    public boolean estVide() {
        return nbElements == 0;
    }

    public void ajouter(int element) {

        if (premier == null){
            premier = new Noeud();
            premier.valeur = element;
            premier.prochain = null;
        }

        Noeud dernier = premier;
        while (dernier != null)
            dernier = dernier.prochain;

        dernier = new Noeud();
        dernier.valeur = element;
        dernier.prochain = null;
    }

    public boolean ajouter(int element, int index) {

        if (premier == null){
            premier = new Noeud();
            premier.valeur = element;
            premier.prochain = null;
        }

        Noeud courant = premier;
        for (int i = 0 ; i <= index ; i++)
            if (courant != null)
                courant = courant.prochain;
            else
                return false;

        Noeud dernier = premier;
        while (dernier != null)
            dernier = dernier.prochain;




        return true;
    }
/*
    public void ajouter(Liste autre) {
        for (int i = 0 ; i < autre.getNbElements(); i++)
            this.ajouter(autre.getElementAt(i));
    }

    private void resize() {
        int[] nouveau = new int[RATIO_AGRANDISSEMENT * tableau.length];
        for (int i = 0 ; i < tableau.length; i++)
            nouveau[i] = tableau[i];
        tableau = nouveau;
    }

    public int trouver(int valeur) {
        for (int i = 0; i < nbElements; i++)
            if (tableau[i] == valeur)
                return i;
        return -1;
    }

    public boolean trouverTout(Liste autre) {
        for (int i = 0 ; i < autre.getNbElements(); i++)
            if (this.trouver(autre.getElementAt(i)) == -1)
                return false;
        return true;
    }

    public boolean effacerAt(int index) {
        if (index < 0 || index > nbElements)
            //throw new IndexOutOfBoundsException();
            return false;
        for (int i = index; i < nbElements; i++)
            tableau[i] = tableau[i + 1];
        nbElements--;
        return true;
    }

    public boolean effacerTout(Liste autre) {
        boolean result = false;
        for (int i = 0; i < autre.getNbElements(); i++) {
            int valeurAEffacer = autre.getElementAt(i);
            int indexAEffacer = trouver(valeurAEffacer);
            if (indexAEffacer != -1) {
                this.effacerAt(indexAEffacer);
                result = true;
            }
        }
        return result;
    }

    public void effacerTout() {
        tableau = new int[TAILLE_INITIALE];
        nbElements = 0;
    }*/
}
