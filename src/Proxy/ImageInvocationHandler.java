package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ImageInvocationHandler implements InvocationHandler {
    @Override public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        Method setLocation = Image.class.getMethod("setLocation", int.class, int.class);
        if(setLocation.equals(method)){
            int x = (int) args[0];
            int y = (int) args[1];
            System.out.println(x+"::"+y);
        }
        return null;
    }
}
