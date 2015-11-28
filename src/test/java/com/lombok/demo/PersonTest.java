package com.lombok.demo;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO 写javadoc.
 *
 * @auther loki 15/11/26
 */
public class PersonTest {

    @Test
    public void test(){
        Person person=new Person();
        person.setName("aaa");

        Assert.assertEquals("aaa", person.getName());
    }
}
