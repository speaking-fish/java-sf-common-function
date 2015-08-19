package com.speakingfish.common.function;

public interface Creator<R, P> {
    
    R create(P params);

}
