package experiment001;

import lombok.Data;

@Data
public class PhoneImpl implements Phone{
    private String phoneType;
    @Override
    public void call(String to){
        System.out.println("手机型号："+phoneType+",正在接通"+to);
    }

    @Override
    public String getType() {
        return phoneType;
    }

    @Override
    public void init(){
        System.out.println("phonebean is going through init");
    }

    @Override
    public void destroy(){
        System.out.println("phonebean will destroy now");
    }

}
