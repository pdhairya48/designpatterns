package FlyWeight;

public class SystemErrorMessage implements ErrorMessage{
    private String messageTemplate;
    private String helpUrlBase;

    public SystemErrorMessage(final String messageTemplate, final String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override public String getText(final String code) {
        return messageTemplate.replace("$errorCode",code) + helpUrlBase;
    }
}
