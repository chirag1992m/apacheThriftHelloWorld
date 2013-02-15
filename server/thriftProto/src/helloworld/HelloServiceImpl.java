package helloworld;

import org.apache.thrift.TException;

public class HelloServiceImpl implements HelloService.Iface {
	
	public String sayHello() throws TException {
		return "Hello World!!";
	}
}
