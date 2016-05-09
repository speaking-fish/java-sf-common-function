package com.speakingfish.common.function;

import java.util.function.Function;

@FunctionalInterface
public interface Mapper<RESULT, SOURCE> extends Function<SOURCE, RESULT> {
    
}
