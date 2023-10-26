
public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.add(new Employee("Jane", "Jones", 123));
        queue.add(new Employee("John", "Doe", 4567));
        queue.add(new Employee("Mary", "Smith", 22));
        queue.add(new Employee("Mike", "Wilson", 3245));
        queue.add(new Employee("Bill", "End", 78));

        queue.printQueue();

        System.out.println("");
        queue.remove();
        queue.printQueue();

        System.out.println("");
        queue.remove();
        queue.printQueue();

        System.out.println("");
        queue.remove();
        queue.printQueue();


        System.out.println("");
        queue.remove();
        queue.printQueue();


        System.out.println("");
        queue.remove();
        queue.printQueue();

//        System.out.println("");
//        queue.remove();
//        queue.printQueue();

        queue.add(new Employee("Jane", "Jones", 123));
        queue.printQueue();
    }
}