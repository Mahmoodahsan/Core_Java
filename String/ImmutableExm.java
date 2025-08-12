package STRING;

public class ImmutableExm {
    public static void main(String args[]){
        String s="MAHMOOD";
        String m="mahmood";
        String e="DOOMHAM";
        String f="mahmood";
        /** 
         *   It is important to notice that methods whose names sound like they might
             change the string (toLowerCase(), trim(), etc.) do not change the string
             they are called on. This is because strings are immutable;
         */
        System.out.println(s.toLowerCase());
        System.out.println(s);

        /**
         * Returns negative if this string comes alphabetically before s, zero if
           equal, and positive if alphabetically after.
           *if you want to compare strings with respect to their alphabetical order.
         */
       System.out.println(s.compareTo(m));
       System.out.println(s.compareToIgnoreCase(m));

       /**
        *  Returns true if o is a string with the same contents as this string
        */
       System.out.println(s.equals(m));
       System.out.println(s.equals(e));
       System.out.println(m.equals(f));

       System.out.println(s.indexOf("AHM"));
       System.out.println(s.indexOf("m",1));

       System.out.println(s.substring(4));
       System.out.println(s.substring(2,5));
    }
}
