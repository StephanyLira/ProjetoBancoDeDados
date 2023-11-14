/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author steph
 */
public class LimitaCaracteres extends PlainDocument{
    public enum TipoEntrada{
        NUMEROINTEIRO, NOME, EMAIL;
    };
    
    private int qtdCaracteres;
    private TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(str == null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + str.length();
        //filtro de caracteres
        String regex = "";
        switch(tpEntrada){
            case NUMEROINTEIRO: regex = "[^0-9]"; break;
            case NOME:          regex = "[^\\p{IsLatin} ]"; break;
            case EMAIL:         regex = "[^\\p{IsLatin}@.\\-_][^0-9}]"; break;
        }
        //fazendo a substituição
        str = str.replaceAll(regex, "");
        
        if(totalCarac <= qtdCaracteres){
            super.insertString(offs, str, a); //To change body of generated methods, choose Tools | Templates.
        }else{
            String nova = str.substring(0, qtdCaracteres);
                        super.insertString(offs, nova, a); //To change body of generated methods, choose Tools | Templates.

        }
    }
    
    
}
