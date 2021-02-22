package lesson5;

public class Test {
    public static void main(String[] args) {

//        Semaphore semaphore = new Semaphore();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(semaphore.getState());
//            semaphore.next();
//        }
        LampChain chain = new LampChain();
        for (int i = 0; i < 40; i++) {
            chain.addLamp();
        }
        chain.on();
        System.out.println(chain.check());
        chain.off(2);
        System.out.println(chain.check());
        chain.on(2);
        System.out.println(chain.check());

    }
}
