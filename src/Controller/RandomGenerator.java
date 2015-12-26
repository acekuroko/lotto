/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Random;

/**
 *
 * @author Acekuroko
 */
public class RandomGenerator {
    
    public static int number(long seed){
        Random random = new Random(seed);
        return random.nextInt(35)+1;
    }
    
}
