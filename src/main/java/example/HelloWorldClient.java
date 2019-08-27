package example;

import mypackage.HelloWorld;
import mypackage.HelloWorldServiceLocator;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
          HelloWorld service = locator.getHelloWorldPort();
          // If authorization is required
          //((HelloWorldPortBindingStub)service).setUsername("user3");
          //((HelloWorldPortBindingStub)service).setPassword("pass3");
          // invoke business method
          System.out.println(service.sayHelloWorldFrom("cc"));
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
