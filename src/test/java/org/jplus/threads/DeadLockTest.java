package org.jplus.threads;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeadLockTest {

    @Test
    public void execute() throws InterruptedException {
        new DeadLock().execute();

        //wait logic execution in test target
        Thread.sleep(3000);
        System.out.println("\n\nLocked.....will exit in 3 seconds");
        Thread.sleep(3000);
    }
}