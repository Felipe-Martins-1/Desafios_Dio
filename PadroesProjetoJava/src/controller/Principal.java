package controller;

import model.Comportamento;
import model.Facade;
import model.Robo;
import model.Singleton;
import model.Strategy1;
import model.Strategy2;

/**
 *
 * @author Felipe
 */
public class Principal {

    public static void main(String[] args) {
        // Singleton
        Singleton eager = Singleton.getInstancia();
        System.out.println(eager);
        eager = Singleton.getInstancia();
        System.out.println(eager);

        // Strategy1
        Comportamento s1 = new Strategy1();
        Comportamento s2 = new Strategy2();
        Robo r = new Robo();
        r.setComportamento(s1);
        r.mover();
        r.setComportamento(s2);
        r.mover();

        // Facade
        Facade f = new Facade();
        f.migrarCliente("Venilton", "14801788");
    }
}
