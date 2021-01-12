/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP;

import java.util.Random;

/**
 *
 * @author Sebastian F
 */
public class MComputadora {
    
    public MMovimiento getMov() {
    MMovimiento[] moves = MMovimiento.values();
    Random random = new Random();
    int index = random.nextInt(moves.length);
    return moves[index];
}
}
