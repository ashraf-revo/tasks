package Q5;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by ashraf on 31/10/16.
 */
public class Q5 {
    public  static int scrollDown (Integer a,String v)                  // void   Integer       v
    {
        return (a == 0) ? scrollDown(100,v) : scrollDown(a-1,v);            // = not ==)    return   v
    }

   public static void main(int arg1, int arg2)       //public static void    int arg2
    {
        if (arg2 <= 0)
            if (arg2 < 0)
                print("Too small.") ;                 //;
            else
                print("Just right.");                //;
        scrollDown(arg1, "start");
    }

}
