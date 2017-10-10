package com.github.galimru.telegram.methods;

import java.io.Serializable;

public abstract class AbstractMethod implements Serializable {
    private static final long serialVersionUID = -7615985097681778366L;

    public String getMethodName() {
        String className = getClass().getSimpleName();
        return className.substring(0, 1).toLowerCase() + className.substring(1);
    }
}
