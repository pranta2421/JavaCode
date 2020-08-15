
package com.company;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.PACKAGE)
@interface myannotation{
    int value();
}

@myannotation(value = 10)

public class Hello {
    public void sayhello(){
        System.out.println("Hello");
    }


}
