/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.LottoCalendar;
import Controller.RandomGenerator;

/**
 *
 * @author jlopez
 */
public class LottoTicket {

    private int[] lotto = new int[5];

    public LottoTicket() {
    }

    public int[] getLotto() {
        return lotto;
    }

    public void setLotto(LottoCalendar cal) {
        int newNumb = 0;
        for (int i = 0; i < 5;) {
            newNumb = RandomGenerator.number(cal.getNuevaFechaSorteo());
            if (i == 0) {
                this.lotto[i] = newNumb;
                i++;
            } else {
                for (int j = 0; j < i; j++){
                    if(areDiff(newNumb, this.lotto[i])){
                        System.out.println("Diferenetes");
                    } else {
                        System.out.println("Iguales");
                        break;
                    }
                    
                }
            }
        }
    }
    
    private boolean areDiff (int primer, int segundo){
        return (primer != segundo);
    }

}
