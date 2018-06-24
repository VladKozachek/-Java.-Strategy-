public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,4,8,3};
        StrategyClient strategyClient=new StrategyClient();
        strategyClient.setStrategy(new SortWayOne());
        strategyClient.exexureStrategu(arr );

        System.out.println();

        strategyClient.setStrategy(new SortWayTwo());
        strategyClient.exexureStrategu(arr);
    }
}
