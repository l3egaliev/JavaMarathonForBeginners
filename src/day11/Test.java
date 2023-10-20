package day11;

public class Test {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker = new Picker();
        Courier courier = new Courier();

        Warehouse warehouse2 = new Warehouse();
        Courier courier2 = new Courier();
        Picker picker2 = new Picker();


        for (int i = 0; i<1500;i++){
            courier.doWork(warehouse1);
            picker.doWork(warehouse1);
        }

        courier.bonus(warehouse1);
        picker.bonus(warehouse1);

        System.out.println(warehouse1);


        picker2.doWork(warehouse2);
        courier2.doWork(warehouse2);

        System.out.println(warehouse2);
    }
}
