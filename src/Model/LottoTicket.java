/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.LottoCalendar;
import Controller.RandomGenerator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jlopez
 */
public class LottoTicket {

    private int[] lotto = new int[5];

    public LottoTicket() {
        for(int i = 0; i < 5; i++){
            this.lotto[i] = 0;
        }
    }

    public int[] getLotto() {
        return lotto;
    }

    public void setLotto(LottoCalendar cal) {
        int newNumb = 0;
        for (int i = 0; i < 5;) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(LottoTicket.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println(cal.getNuevaFechaSorteo());// delete
            newNumb = RandomGenerator.number(cal.getNuevaFechaSorteo());
            if (i == 0) {
                this.lotto[i] = newNumb;
                i++;
            } else {
                if(!itContains(newNumb)){
                    this.lotto[i] = newNumb;
                    i++;
                }
            }
        }
    }
    
    private boolean itContains (int nuevoNum){
        boolean itContains = false;
        for (int i = 0; i < 4; i++){
            if(this.lotto[i] != 0){
                if(this.lotto[i] == nuevoNum){
                    itContains = true;
                    break;
                }
            } else {
                break;
            }
            
        }
        
        return itContains;
    }

}
