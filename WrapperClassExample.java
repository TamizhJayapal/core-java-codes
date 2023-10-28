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
7.isNaN
8.MIN_VALUE
9.MAX_VALUE

*/

package com.example;

public class WrapperClassExample {
    public static void main(String[] args) {
        int i = 10;
        
        //boxing
        Integer i1 = new Integer(2);
       // Integer.valueOf(i);
        
       // AutoBoxing
        Integer i2 = 20;
        System.out.println(i2.intValue());
        
        // unboxing
        int p1 = i2.intValue();
        
        // AutoUnBoxing
        int p2 = i2;
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        
        System.out.println(i2.toString());
        
        System.out.println(i1.equals(i2));
        
        System.out.println(Integer.parseInt("123"));
        
        int result = i1.compareTo(i2);
        
        System.out.println(result);// i1 = -1 < 0 < 1
        
        Double d1 = Double.NaN;
        
        System.out.println(Double.isNaN(d1));
        
        
    }
}
