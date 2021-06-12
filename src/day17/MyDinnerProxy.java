package day17;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyDinnerProxy implements InvocationHandler {

  private Object originalObject;

  public Object bind(Object obj) {
    this.originalObject = obj;
    return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    //  返回代理对象
  }

  private void beforeDinner() {
    System.out.println("吃饭之前要洗手");
  }

  private void afterDinner() {
    System.out.println("吃饭之后要洗碗");
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    Object result = null;

    beforeDinner();
    result = method.invoke(this.originalObject, args);
    afterDinner();

    return result;
  }
}
