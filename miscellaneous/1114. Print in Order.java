// SUSHANT SINHA

// to do

// 10ms(93.41%)

class Foo {

    public Foo() {
        first = false;
        second = false;
    }

    Object firstObject = new Object();
    Object secondObject = new Object();
    
    boolean first = false;
    boolean second = false;
    
    public void first(Runnable printFirst) throws InterruptedException {
        synchronized(firstObject) {
		    // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            first = true;
            firstObject.notify();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized(firstObject) {
            while (!first) {
                try {
                    // Calling wait() will block this thread until another thread calls notify() on the object.
                    firstObject.wait();
                } catch (InterruptedException e) {
                    // Happens if someone interrupts your thread.
                }
            }
            synchronized(secondObject) {
                // printSecond.run() outputs "second". Do not change or remove this line.
                printSecond.run();
                second = true;
                secondObject.notify();
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized(secondObject) {
            while (!second) {
                try {
                    // Calling wait() will block this thread until another thread calls notify() on the object.
                    secondObject.wait();  
                } catch (InterruptedException e) {
                    // Happens if someone interrupts your thread.
                }
            }
        }
        // printThird.run() outputs "third". Do not change or remove this line
        printThird.run();
    }
}