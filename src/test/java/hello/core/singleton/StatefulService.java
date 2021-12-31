package hello.core.singleton;

public class StatefulService {

    //stateful 방식
    private int price; //상태를 유지하는 필드

    //stateful 방식
/*    public void order(String name, int price) {

        System.out.println("name = " + name + " price = " + price);
        this.price = price; //여기가 문제!
    }*/

    //stateless 방식
    public int order(String name, int price) {

        System.out.println("name = " + name + " price = " + price);
        //this.price = price; //여기가 문제!
        return price;
    }

    public int getPrice() {
        return price;
    }
}
