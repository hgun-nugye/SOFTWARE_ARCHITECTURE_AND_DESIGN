package behavioral.command.order;

public class Chef {
    String name;

    public Chef(String name) {
        this.name = name;
    }

    void cook(String foodName) {
        System.out.println("Chef " + name + " is cooking " + foodName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chef " + name + " has finished cooking " + foodName);
    }
}
