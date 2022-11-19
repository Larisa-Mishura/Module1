package module1;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    private Helper helper = new Helper();
    private Random random = new Random();

    public int inputSizeOfArray(){
        int size = helper.inputNumber("Введіть розмір масиву");
        if(size < 10){
            System.out.println("Розмір масиву повинен бути не менше 10.");
            size = inputSizeOfArray();
        }
        return size;
    }

    public int[] createArray(int min, int max){
        int size = inputSizeOfArray();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max - min +1) + min;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public void sortArray(int[] array) {
        int option = helper.selectOption("Оберіть сортування масиву.", "за зростанням", "за спаданням");
        switch (option) {
            case 1:
                sortAscending(array);
                break;
            case 2:
                sortDescending(array);
                break;
            default: sortArray(array);
        }
    }

    private void sortAscending(int[] array){
        for (int j = 0; j < array.length-1; j++) {
            boolean isChanged = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    if (!isChanged){
                        isChanged = true;
                    }
                }
            }
            if(!isChanged){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private void sortDescending(int[] array) {
        for (int j = array.length-1; j >0; j--) {
            boolean isChanged = false;
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] > array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    if (!isChanged){
                        isChanged = true;
                    }
                }
            }
            if(!isChanged){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void changeArray(int[] array, int period, int power){
        for (int i = period-1; i < array.length; i+=period) {
            array[i] = (int) Math.pow(array[i], power);
        }
        System.out.println(Arrays.toString(array));
    }
}
