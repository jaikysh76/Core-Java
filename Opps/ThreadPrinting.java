package Opps;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPrinting {

    int num = 1;
    final Lock lock = new ReentrantLock();
    final Condition cond = lock.newCondition();

    void print() {
        for(int i=1;i<=3;i++) {
            lock.lock();
            try{

            System.out.print(i + " ");
            cond.signal();

                cond.await();
            } catch (Exception e) {

            }
            lock.unlock();
        }
    }
}
