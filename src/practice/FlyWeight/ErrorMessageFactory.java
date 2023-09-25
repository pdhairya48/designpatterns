package practice.FlyWeight;

import java.util.HashMap;
import java.util.Map;


public class ErrorMessageFactory {
    public enum ErrorType{GenericSystem,PageNotFound}

    private static final ErrorMessageFactory FACTORY= new ErrorMessageFactory();

    private Map<ErrorType,SystemErrorMessage> errorMessage  = new HashMap<>();
    public static ErrorMessageFactory getInstance(){
        return FACTORY;
    }

    public SystemErrorMessage getError(ErrorType type){
        return errorMessage.get(type);
    }

    private ErrorMessageFactory(){
        errorMessage.put(ErrorType.GenericSystem,new SystemErrorMessage("Generic Error $errorCode","https:google/com"));
        errorMessage.put(ErrorType.PageNotFound,new SystemErrorMessage("Page Error $errorCode","https:google/com"));
    }
}
