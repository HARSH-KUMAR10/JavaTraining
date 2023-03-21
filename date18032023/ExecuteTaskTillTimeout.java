package date18032023;

import java.util.Optional;

class TaskTimeNotFoundException extends Exception{
    TaskTimeNotFoundException(String errorMesssage){
        super(errorMesssage);
    }
}

public class ExecuteTaskTillTimeout extends Thread
{
    Optional<Runnable> taskToPerform;

    Optional<Long> timeout;

    Optional<Long> startTime;
    public ExecuteTaskTillTimeout(Runnable task, long timeout){
        this.taskToPerform = Optional.ofNullable(task);
        this.timeout = Optional.ofNullable(timeout);
    }

    public void run(){
        try
        {
            this.startTime = Optional.ofNullable(System.currentTimeMillis());
            if(this.taskToPerform.isPresent() && this.timeout.isPresent())
            {
                while(System.currentTimeMillis()-this.startTime.get()<=this.timeout.get())
                {
                    this.taskToPerform.get().run();
                    Thread.sleep(500);// Only to have a small pause between two execution
                }
            }else{
                throw new TaskTimeNotFoundException("Task or time cannot be null");
            }
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}
