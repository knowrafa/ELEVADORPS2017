/**
 *
 * @author Arnold Lima, Rafael Alessandro, Rafael Falcão
 */

package problemaelevador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Credencial {
    private ArrayList<ArrayList<String>> credenciaisValidas;
    private int numeroDePisos;
    
    public Credencial(int numeroDePisos){
        this.numeroDePisos = numeroDePisos;
        credenciaisValidas = new ArrayList();
        for(int i=0; i <=  numeroDePisos; i++){
            credenciaisValidas.add(new ArrayList<String>());
        
        }
        //IMPORTANTE !v!
        //credenciaisValidas.get(numeroDePisos).get(i);
    }

    public boolean needCredential(int piso){
        if(credenciaisValidas.get(piso).isEmpty()) return false;
        return true;        
    }
    
    public String readCredential(){
        Scanner read = new Scanner(System.in);
        String credential = read.nextLine();
        return credential;
    }
    
    
    public boolean isValid(int piso, String credencial){
        
        if(piso > this.numeroDePisos || piso < 0)
            System.out.println("Piso Inválido");
        
        Iterator it = credenciaisValidas.get(piso).iterator();
        while(it.hasNext()){
            System.out.println("aqui?");
            String a =  (String)it.next();
            System.out.println(a+ "  :  " + credencial);
            if(a.equals(credencial)) return true;
        }
        if(credenciaisValidas.get(piso).isEmpty()) return true;
        
        return false;
    }
    
    public boolean novaCredencial(int piso, String credencial) {
        try {
            credenciaisValidas.get(piso).add(credencial);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
