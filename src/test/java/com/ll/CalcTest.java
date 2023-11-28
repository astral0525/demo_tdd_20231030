package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {

    @Test
    @DisplayName("Calc에 run메서드는 int를 반환한다")
    void t1(){
        int rs = Calc.run("");
    }

    @Test
    @DisplayName("10+10 => 20")
    void t2(){
        int rs = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);

    }

    @Test
    @DisplayName("10-10 => 0")
    void t3(){
        int rs = Calc.run("10 - 10");
        assertThat(rs).isEqualTo(0);
    }




}
