package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {
    
    @Override
    public String criptografar(String texto) {
        if(texto==""){
            throw new IllegalArgumentException("Error");
        }
        // Inicio uma array com todos as letras do alfabeto
        String[] abcdario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        // ArrayList para receber o descriptografado
        List<String> decifText = new ArrayList<String>();
        // Inicio um for para ler letra por letra do texto criptografado
        for(int i = 0;i<texto.length(); i++){
            //Pego o char do texto criptografado e o transformo em string
            char letra = texto.charAt(i);
            String asString = String.valueOf(letra);
            // Transformo o abcdario em arraylist
            List<String> abc = Arrays.asList(abcdario);
            // Estrutura de condição para verificar se tem a letra na arraylist do abc
            if(abc.contains(asString.toLowerCase())){
                //Estrutura de repetição para pegar qual a posição da letra do texto no alfabeto para subtrair
                for(int j = 0; j < 26; j++){ 
                    //Se a letra do texto estiver no abcdario então ele continua
                    if(asString.equalsIgnoreCase(abcdario[j])){
                        // Pega a posição decifrada do elemento do texto (LetraAlf - NumCasa) 
                        int pos = j+3;
                        if(pos<0){
                            // Calcula a posição e adiciona no arrayList "decifText"
                            pos = 25 + (pos + 1);
                            decifText.add(abcdario[pos]);
                        }else{
                            // Calcula a posição e adiciona no arrayList "decifText"
                            decifText.add(abcdario[pos]);
                        }                   
                    }
                }
            // Se não conter o texto na arraylist então adiciona a String na arraylist "decifText" sem nenhuma modificação
            }else{
                decifText.add(asString);
            }
        }
        // Converte a arraylist em uma String
        String decod = "";
        StringBuilder str = new StringBuilder(decod);
        for(String s:decifText){
            str.append(s);
        } 
        String strs = str.toString();
        return strs;
    }

    @Override
    public String descriptografar(String texto) {
        // Inicio uma array com todos as letras do alfabeto
        if(texto==""){
            throw new IllegalArgumentException("Error");
        }
        String[] abcdario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        // ArrayList para receber o descriptografado
        List<String> decifText = new ArrayList<String>();
        // Inicio um for para ler letra por letra do texto criptografado
        for(int i = 0;i<texto.length(); i++){
            //Pego o char do texto criptografado e o transformo em string
            char letra = texto.charAt(i);
            String asString = String.valueOf(letra);
            // Transformo o abcdario em arraylist
            List<String> abc = Arrays.asList(abcdario);
            // Estrutura de condição para verificar se tem a letra na arraylist do abc
            if(abc.contains(asString.toLowerCase())){
                //Estrutura de repetição para pegar qual a posição da letra do texto no alfabeto para subtrair
                for(int j = 0; j < 26; j++){ 
                    //Se a letra do texto estiver no abcdario então ele continua
                    if(asString.equalsIgnoreCase(abcdario[j])){
                        // Pega a posição decifrada do elemento do texto (LetraAlf - NumCasa) 
                        int pos = j-3;
                        if(pos<0){
                            // Calcula a posição e adiciona no arrayList "decifText"
                            pos = 25 + (pos + 1);
                            decifText.add(abcdario[pos]);
                        }else{
                            // Calcula a posição e adiciona no arrayList "decifText"
                            decifText.add(abcdario[pos]);
                        }                   
                    }
                }
            // Se não conter o texto na arraylist então adiciona a String na arraylist "decifText" sem nenhuma modificação
            }else{
                decifText.add(asString);
            }
        }
        // Converte a arraylist em uma String
        String decod = "";
        StringBuilder str = new StringBuilder(decod);
        for(String s:decifText){
            str.append(s);
        } 
        String strs = str.toString();
        return strs;
    }
}
