
package desafio.projeto.dio;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNoormal;
import one.digitalinnovation.gof.strategy.robo;


public class DesafioProjetoDio {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder lazyholder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        
        Comportamento defensivo = new ComportamentoDefensivo();
	Comportamento normal = new ComportamentoNoormal();
	Comportamento agressivo = new ComportamentoAgressivo();
	
        robo robo = new robo();
	robo.setStrategy(normal);
	robo.mover();
	robo.mover();
	robo.setStrategy(defensivo);
	robo.mover();
	robo.setStrategy(agressivo);
	robo.mover();
	robo.mover();
	robo.mover();
        
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");
    }
    
}
