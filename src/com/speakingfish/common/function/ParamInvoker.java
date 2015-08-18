package com.speakingfish.common.function;

@FunctionalInterface
public interface ParamInvoker<T, PARAM> {
    
    void invoke(T value, PARAM param);

}
