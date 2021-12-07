package experiment001;

import lombok.Data;

@Data
public class PersonImpl implements Person{
    private Phone phone;
    private String name;
    private String type;
    @Override
    public void dial(String to){
        System.out.println(name+"开始拨号");
        phone.call(to);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Phone getPhone() {
        return phone;
    }

    @Override
    public void init(){
        System.out.println("personbean is going through init");
    }

    @Override
    public void destroy(){
        System.out.println("personbean will destroy now");
    }

}
