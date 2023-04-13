package ejb;

import jakarta.ejb.Local;

@Local
public interface MyInterface {
    public String sayHello();
}
