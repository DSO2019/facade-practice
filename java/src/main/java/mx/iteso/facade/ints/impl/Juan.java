package mx.iteso.facade.ints.impl;
/**
 * Juan waiter class.
 */
public class Juan implements Waiters {
    /**
     * Serve.
     */
    void serve() {
        System.out.println("A Juan is serving.");
    }
    /**
     * Clean.
     */
    void clean() {
        System.out.println("A Juan is cleaning.");
    }
}
