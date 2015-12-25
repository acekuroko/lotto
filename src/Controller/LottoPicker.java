/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.LottoPickerUI;

/**
 *
 * @author jlopez
 */
public class LottoPicker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       LottoPickerUI lottoUI = new LottoPickerUI();
       lottoUI.pack();
       lottoUI.setVisible(true);
    }
    
}
