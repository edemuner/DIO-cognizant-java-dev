package com.teste;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertJTest {

    @Test
    public void checkEquality(){
        Person person = new Person("Barack", "Obama");
        Person another = person;

        assertThat(person).isEqualTo(another);
    }
}
