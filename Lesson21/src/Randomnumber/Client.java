package Randomnumber;

public class Client {

    public void printList(int size, int min, int max) {

    RandomListFacade listFacade = new RandomListFacade(new ListFilter(), new ListPrinter(), new RandomList());
    listFacade.printRandomEvenList(min, max, size);
    }
}
