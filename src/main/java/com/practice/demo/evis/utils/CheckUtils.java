package com.practice.demo.evis.utils;

import java.util.Objects;

public class CheckUtils {

    public static void vaildateNotNullElment(Object object) {
        if (Objects.isNull(object)) {
            throw new IllegalArgumentException("wrong input argument");
        }
    }
}
