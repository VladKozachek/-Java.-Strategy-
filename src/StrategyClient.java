public class StrategyClient {
    Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }
    void exexureStrategu(int [] arr){
        strategy.sort(arr);
    }
}
