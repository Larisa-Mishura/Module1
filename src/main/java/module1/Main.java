package module1;

import module1.ArrayService;

public class Main {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] array = arrayService.createArray(-100, 100); //1-3
        arrayService.sortArray(array);                     //4-6
        arrayService.changeArray(array, 3, 3);//7-8

        Lock lock = new Lock(array);
        System.out.println("Locked array:");
        lock.printArray();
        lock.getArray()[0] = 10;
        lock.printArray();
    }
}
