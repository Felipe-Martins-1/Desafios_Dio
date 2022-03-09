package model;

/**
 *
 * @author Felipe
 */
public class Strategy1 implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }

}
