package com.yls.javase;

import lombok.Data;

import java.util.List;

@Data
public class AA<T extends List> {
    private T name;
}
