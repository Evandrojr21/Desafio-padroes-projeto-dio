
package one.digitalinnovation.gof.strategy;

public class robo {
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }
    
    public void mover(){
        strategy.mover();
    }
}
