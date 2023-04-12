import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Named;

@Stateless
@Local(MyInterface.class)
public class MyInterfaceImpl implements MyInterface {
    @Override
    public String sayHello() {
        return "say hello";
    }
}
