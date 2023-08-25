package pages;

import java.util.HashMap;
import java.util.Map;

public class Home {
    public static void main(String[] args) {
        Map<Integer,Integer> m=new HashMap<>();
        m.put(1, 2);
        m.put(2, 3);
        m.put(3, 4);
        //System.out.print(m.get(1));
//		if(m.containsValue("Pen")) {
//			System.out.println("true");
//		}



int highest=0;

        for(Map.Entry<Integer,Integer> f : m.entrySet())
        {

           int x=f.getValue();
           if(x>highest){
               highest=x;
           }




        }

    }
}
