package date15032023.Interthreadcomm;

public class BankTransactionExample
{
    private static int fixedDepositeAmount = 1000;

    private static int accountAmount = 300;

    private static boolean breakFixedDepositFlag = false;

    synchronized void withdraw(int x)
    {
        System.out.println("Trying to withdraw : "+x);
        if (accountAmount < x)
        {
            System.out.println("insufficient account balance, checking for other deposits");
            try
            {
                wait(2000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            breakFixedDepositFlag = true;
            notify();
            try
            {
                wait();
                if (accountAmount < x)
                {
                    System.out.println("Not sufficient balance");
                }
                else
                {
                    System.out.println(x + " amount is deducted from " + accountAmount);
                    accountAmount -= x;
                    System.out.println("Total balance: " + accountAmount);
                }
            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }
        }
        else
        {
            System.out.println(x + " amount is deducted from " + accountAmount);
            accountAmount -= x;
            System.out.println("Total balance: " + accountAmount);
        }
    }
    synchronized void breakFixedDeposit(){
        while(true)
        {
            if (breakFixedDepositFlag)
            {
                if(fixedDepositeAmount>0)
                {
                    System.out.println("Breaking FD ...");
                    try
                    {
                        wait(2000);
                    }
                    catch (Exception exception)
                    {
                        System.out.println(exception);
                    }
                    System.out.println(accountAmount + " is your balance, breaking FD of : " + fixedDepositeAmount);
                    accountAmount += fixedDepositeAmount;
                    fixedDepositeAmount = 0;
                    System.out.println("Total account balance: " + accountAmount);
                    notify();
                    break;
                }else{
                    System.out.println("No other deposits found");
                    notify();
                    break;
                }
            }else{
                try
                {
                    System.out.println("No request for breaking FD");
                    wait();
                }
                catch (Exception exception)
                {
                    System.out.println(exception);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        BankTransactionExample bankTransactionExample = new BankTransactionExample();
        Thread thread = new Thread(()->{
            bankTransactionExample.breakFixedDeposit();
        });
        Thread thread1 = new Thread(()->{
            bankTransactionExample.withdraw(1200);
        });
        thread.start();
        thread1.start();
    }
}
