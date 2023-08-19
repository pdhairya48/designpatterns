package LoggerIR;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = new Logger();
        Logger logger2 = new Logger();
        Logger logger3 = new Logger();

        logger1.logDeposit("01",80.5);
        logger2.logWithdraw("02",2);
        logger1.logTransfer("01","03",33);
        logger3.logDeposit("04",43);
        logger2.logDeposit("014",32.3);

        SingletonLogger singletonLogger1 = SingletonLogger.getInstance();
        SingletonLogger singletonLogger2 = SingletonLogger.getInstance();
        SingletonLogger singletonLogger4 = SingletonLogger.getInstance();

        singletonLogger1.logDeposit("01",80.5);
        singletonLogger2.logWithdraw("02",2);
        singletonLogger1.logTransfer("01","03",33);
        singletonLogger4.logDeposit("04",43);
        singletonLogger2.logDeposit("014",32.3);

    }
}
