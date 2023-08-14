package Command;

import java.util.LinkedList;
import java.util.List;

//multithreaded task runner
public class MailTasksRunner implements Runnable{
    private Thread runner;
    private List<Command> pendingCommands;
    private volatile boolean stop;
    private static final MailTasksRunner RUNNER=new MailTasksRunner();
    public static final MailTasksRunner getInstance(){
        return RUNNER;
    }
    private MailTasksRunner() {
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    //Run method takes pending commands and executes them.
    @Override
    public void run() {

        while (true) {
            Command cmd = null;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Runner interrupted");
                        if (stop) {
                            System.out.println("Runner stopping");
                            return;
                        }
                    }
                }
                System.out.println(Thread.currentThread().getName()+":::ThreadName::InsideRun "+pendingCommands.size()+
                        "::size");
                System.out.println(Thread.currentThread().getName()+":::ThreadName::InsideRun "+pendingCommands.size()+"::size");

                cmd = pendingCommands.isEmpty()?null:pendingCommands.remove(0);

                System.out.println(Thread.currentThread().getName()+":::ThreadName::InsideRun "+pendingCommands.size()+"::size");
                System.out.println(Thread.currentThread().getName()+":::ThreadName::InsideRun "+pendingCommands.size()+"::size");

            }
            if (cmd == null)
                return;
            cmd.execute();
        }

    }

    //Giving it a command will schedule it for later execution
    public void addCommand(Command cmd) {
        synchronized (pendingCommands) {
            System.out.println(Thread.currentThread().getName()+":::ThreadName "+pendingCommands.size()+"::size");
            System.out.println(Thread.currentThread().getName()+":::ThreadName "+pendingCommands.size()+"::size");
            pendingCommands.add(cmd);
            System.out.println(Thread.currentThread().getName()+":::ThreadName "+pendingCommands.size()+"::size");
            System.out.println(Thread.currentThread().getName()+":::ThreadName "+pendingCommands.size()+"::size");

            pendingCommands.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }
}
