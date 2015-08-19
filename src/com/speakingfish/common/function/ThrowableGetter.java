package com.speakingfish.common.function;

@FunctionalInterface
public interface ThrowableGetter<T> {

    T get() throws Exception;
}
