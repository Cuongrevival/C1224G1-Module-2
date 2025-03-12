//sai nguyên lý LSP
class Bird {
    void fly() {
        System.out.println("I can fly");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");// thay đổi hành vi fly thành một ngoại lệ, vi phạm LSP.
    }
}
//Đúng nguyên lý LSP
interface Flyable {
    void fly();
}

class Sparrow implements Flyable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin1 {
    void swim() {
        System.out.println("Penguin is swimming");
    }
}
