package LoggerIR;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class SingletonLogger {

    private static SingletonLogger singletonLogger = null;

    private final  String fileNmae = "log_singleton.txt";
    private volatile PrintWriter printWriter;
    private SingletonLogger(){
        FileWriter fw = null;
        try {
            fw = new FileWriter(fileNmae);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printWriter = new PrintWriter(fw,true);
    }

    public static SingletonLogger getInstance(){
        if(singletonLogger ==  null) {
            singletonLogger = new SingletonLogger();
        }
        return singletonLogger;
    }

    public synchronized void  logWithdraw(String account, double amount){
        printWriter.println("Withrawan "+ account + " : amount "+ amount);
    }
    public synchronized void  logTransfer(String sender,String receiver, double amount){
        printWriter.println("Sender "+ sender + "Receiver "+ receiver +" : amount "+ amount);
    }
    public synchronized void  logDeposit(String account, double amount){
        printWriter.println("Deposit "+ account + " : amount "+ amount);
    }

}
