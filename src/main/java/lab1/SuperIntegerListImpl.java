package lab1;

import java.util.Arrays;

public class SuperIntegerListImpl implements SuperIntegerList{

    private static final int START_LENGTH = 2;
    private int[] mass;
    private int endPointer;
    private int curLength;

    public SuperIntegerListImpl() {
        mass = new int[START_LENGTH];
        curLength = START_LENGTH;
        endPointer = 0;
    }

    @Override
    public void add(int number) {

        if (endPointer >= curLength) {
            mass = Arrays.copyOf(mass, curLength * 2);
            curLength *= 2;
        }

        mass[endPointer++] = number;
    }

    @Override
    public void removeByIndex(int index) {

        if (index >= endPointer || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        System.arraycopy(mass, index + 1, mass, index, endPointer - index);
        endPointer--;
    }

    @Override
    public void removeByValue(int value) {
        for (int ptr = 0; ptr < endPointer; ptr++) {
            if (mass[ptr] == value) {
                removeByIndex(ptr);
                ptr--;
            }
        }
    }

    @Override
    public int get(int index) {

        if (index >= endPointer || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return mass[index];
    }

    @Override
    public void printAll() {
        for (int i = 0; i < endPointer; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
    }
}
