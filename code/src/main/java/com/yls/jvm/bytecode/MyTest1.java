package com.yls.jvm.bytecode;

import lombok.Data;

/**
 * 反编译：javap -c com/yls/jvm/bytecode/MyTest1.class
 * 更加详细反编译：javap -verbose com/yls/jvm/bytecode/MyTest1.class
 *
 */
@Data
public class MyTest1 {
    private int a=1;
}
