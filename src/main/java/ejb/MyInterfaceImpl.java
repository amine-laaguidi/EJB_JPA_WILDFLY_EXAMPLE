package ejb;

import jakarta.ejb.Local;
import jakarta.ejb.Stateless;

@Stateless
@Local(MyInterface.class)
public class MyInterfaceImpl implements MyInterface {
    @Override
    public String sayHello() {
        return "say hello";
    }
}
