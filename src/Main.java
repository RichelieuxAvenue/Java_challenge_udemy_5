public class Main {
    /*
    Convertisseur de Mégaoctets

Écrivez une méthode appelée printMegaBytesAndKiloBytes qui a 1 paramètre de type int avec le nom kiloBytes.

La méthode ne doit rien retourner (void) et elle doit calculer les mégaoctets et les kilooctets restants à partir du paramètre kiloBytes.

Ensuite, elle doit imprimer un message au format "XX KB = YY MB and ZZ KB".

	•	XX représente la valeur initiale de kiloBytes.
	•	YY représente les mégaoctets calculés.
	•	ZZ représente les kilooctets restants calculés.

Exemple :

	•	Lorsque le paramètre kiloBytes est 2500, la méthode doit imprimer "2500 KB = 2 MB and 452 KB".
	•	Si le paramètre kiloBytes est inférieur à 0, la méthode doit imprimer le texte "Invalid Value".

EXEMPLE D’ENTRÉE/SORTIE

	•	printMegaBytesAndKiloBytes(2500); → devrait imprimer le texte suivant : "2500 KB = 2 MB and 452 KB".
	•	printMegaBytesAndKiloBytes(-1024); → devrait imprimer le texte suivant : "Invalid Value" car le paramètre est inférieur à 0.
	•	printMegaBytesAndKiloBytes(5000); → devrait imprimer le texte suivant : "5000 KB = 4 MB and 904 KB".

CONSEIL : Faites très attention aux espaces dans le message imprimé.
CONSEIL : Utilisez l’opérateur modulo.
CONSEIL : 1 MB = 1024 KB.
NOTE : Ne définissez pas la valeur du paramètre kilobytes à l’intérieur de votre méthode.
NOTE : La solution ne sera pas acceptée s’il y a des espaces supplémentaires.
NOTE : La méthode printMegaBytesAndKiloBytes doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
NOTE : N’ajoutez pas de méthode main au code de la solution.
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = kiloBytes / 1024;
            int remainderKiloBytes = kiloBytes % 1024;
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainderKiloBytes);
        }
    }
    public static void main(String[]args){
        printMegaBytesAndKiloBytes(2500);
    }
}
