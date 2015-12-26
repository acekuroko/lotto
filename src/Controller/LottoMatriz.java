/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LottoTicket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acekuroko
 */
public class LottoMatriz {
    private List<LottoTicket> LottoMatriz = new ArrayList<>();
    
    public void addLotto (LottoTicket lotto){
        this.LottoMatriz.add(lotto);
    }
    
    public String toString(){
        String stringMatriz = "<html>";
        int[] lotto = new int[5];
        for (int i = 0; i < 5; i++){
            lotto = LottoMatriz.get(i).getLotto();
            for(int j = 0; j < 5; j++){
                
                if (j < 4){
                    if (lotto[j] <= 9) {
                        stringMatriz += "0" + lotto[j] + " - ";
                    } else {
                        stringMatriz += lotto[j] + " - ";
                    }     
                } else if(i < 4){
                    if (lotto[j] <= 9) {
                        stringMatriz += "0" + lotto[j] + "<br>";
                    } else {
                        stringMatriz += lotto[j] + "<br>";
                    }
                } else {
                    if (lotto[j] <= 9) {
                        stringMatriz += "0" + lotto[j] + "</html>";
                    } else {
                        stringMatriz += lotto[j] + "</html>";
                    }
                }
            }
        }
        
        
        return stringMatriz;
    }
}
