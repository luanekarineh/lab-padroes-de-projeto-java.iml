import ProjetoJava.facade.Facede;
import ProjetoJava.singleton.SingletonEager;
import ProjetoJava.singleton.SingletonLazy;
import ProjetoJava.singleton.SingletonLazyHolder;
import ProjetoJava.strategy.*;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        // Singleton:

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstance();
        System.out.println(Eager);
        Eager = SingletonEager.getInstance();
        System.out.println(Eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy:

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facede

        Facede facede = new Facede();
        facede.migrarCliente("Luane", "14801788");



    }
}