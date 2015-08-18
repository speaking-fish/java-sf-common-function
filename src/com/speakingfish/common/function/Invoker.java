package com.speakingfish.common.function;

@FunctionalInterface
public interface Invoker<T> {
    
    void invoke(T value);

}
