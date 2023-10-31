package lab13.task5;

public class PhoneNumber {
    String nmb;
    public PhoneNumber(String s){
        int dif = s.length()-10;
        if (s.charAt(0) == '+'){
            dif -= 1;
            nmb = "+"+s.substring(1,1+dif)+s.substring(1+dif,dif+4)+"-"+s.substring(dif+4,dif+7)+"-"+s.substring(dif+7, dif+9)+"-"+s.substring(dif+9);
        }else{
            nmb = "+"+s.substring(1,1+dif)+s.substring(1+dif,dif+4)+"-"+s.substring(dif+4,dif+7)+"-"+s.substring(dif+7, dif+9)+"-"+s.substring(dif+9);
            nmb = "+"+(Integer.parseInt(s.substring(0,dif))-1)+s.substring(dif,dif+3)+"-"+s.substring(dif+3,dif+6)+"-"+s.substring(dif+6, dif+8)+"-"+s.substring(dif+8);
        }
    }
    @Override
    public String toString(){
        return nmb;
    }
}
