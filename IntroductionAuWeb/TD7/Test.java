import java.io.*;
import java.util.*;
import java.net.*;

public class Test{
  //main qui levera les erreurs (exception)
  public static void main(Strings [] args) throws IOException {
    //variable sh de type Serveur http qui est vide
    ServerHttp sh =null;
    //try: nous essayons d'executer les commandes qui suivent
    try {
      //soit sh un nouveau serveur http de port 1234 qui est valide "boléen"
      sh = new ServerHttp(1234,true);
      //catch: si ça ne marche pas, ça affichera et localisera les erreurs
    }catch(IOException e){
      //il affichera le message d'erreur suivant
      System.out.println("Problème de création du serveur");
      //ferme la connexion
      System.exit(-1);
    }
    try{
      //tant que le serveur est toujours valide
      while(true){
        //dialoguer avec le serveur sh
        sh.dialogue;
      }
      //sinon afficher un message d'erreur
    }catch(IOException e){
      System.out.println("Problème de discussion avec le client");
      //Finalement affiche un message de stop et ferme le serveur
    }finally{
      System.out.println("Mort du serveur");
      sh.close();
    }
  }
}
