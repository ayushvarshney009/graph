import java.util.HashMap;
import java.util.Map;

public class gds {
    public static void main(String[] args) {

        HashMap <String ,Integer>  obj = new HashMap<>();
        obj.put("ABC", 50);
        obj.put("ABC1",100);
        obj.put("ABC2", 21);


//        System.out.println(obj.get("ABC"));
//        System.out.println(obj.get("ABC1"));
//        System.out.println(obj.getOrDefault("ABC2", 0));

//        int res = obj.getOrDefault("BCD", 0);
//        System.out.println(res);

        for(Map.Entry<String, Integer>res : obj.entrySet()){
            System.out.println(res.getKey());
            System.out.println(res.getValue());

        }


    }



}
