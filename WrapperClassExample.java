
/*
Wrapper classes is used to reperesent the primitive types as object.
And it provides method to work with object oriented maner.

Boxing / AutoBoxing
UnBoxing / AutoUnBoxing

classes:

Byte
Short
Integer
Long
Float
Double
Character
Boolean

methods:

1.intValue()
2.valueOf
3.toString()
4.parseInt
5.equals
6.compareTo
7.hashCode
8.isNan
9.MIN_VALUE
10.MAX_VALUE

*/


public class Main {
    public static void main(String[] args) {
        int i = 10;
        //boxing
        Integer i1 = new Integer(i);
        i1.valueOf(i);
        System.out.println(i1.intValue());
    }
}
