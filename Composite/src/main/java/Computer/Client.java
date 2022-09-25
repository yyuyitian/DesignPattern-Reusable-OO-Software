package Computer;

public class Client {

    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet();
        Chassis chassis = new Chassis();
        cabinet.add(chassis);
        Chassis chassis1 = new Chassis();
        cabinet.add(chassis1);
        System.out.println(cabinet.netPrice());
    }
}
