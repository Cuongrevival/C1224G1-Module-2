package Randomnumber;

import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;

    public RandomListFacade(ListFilter listFilter, ListPrinter listPrinter, RandomList randomList) {
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
        this.randomList = randomList;
    }

    public void printRandomEvenList(int min, int max,  int size) {
        listPrinter.printList(listFilter.filterOdd(randomList.generateList(size, min, max)));
    }
}
