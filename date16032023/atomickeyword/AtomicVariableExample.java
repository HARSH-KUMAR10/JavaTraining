package date16032023.atomickeyword;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableExample
{
    int variable = 100;

    void changeVariable(){
        System.out.println("Initial value : "+variable);
        variable++;
        System.out.println("Final value : "+variable);
    }
    AtomicInteger atomicVariable = new AtomicInteger(100);
    void changeAtomicVariable(){
        System.out.println("Initial value : "+atomicVariable.get());
        atomicVariable.incrementAndGet();
        System.out.println("Final value : "+atomicVariable.get());
    }

    public static void main(String[] args)
    {
        AtomicVariableExample atomicVariableExample = new AtomicVariableExample();
        Thread thread = new Thread(()->{
            atomicVariableExample.changeAtomicVariable();
        });
        Thread thread1 = new Thread(()->{
            atomicVariableExample.changeAtomicVariable();
        });
//        thread.start();
//        thread1.start();

        Thread thread2 = new Thread(()->{
            atomicVariableExample.changeVariable();
        });
        Thread thread3 = new Thread(()->{
            atomicVariableExample.changeVariable();
        });
        thread2.start();
        thread3.start();
    }
}
