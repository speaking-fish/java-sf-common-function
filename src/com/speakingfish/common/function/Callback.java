package com.speakingfish.common.function;

@FunctionalInterface
public interface Callback<T> {
    
    void callback(T value) throws Exception;

}
