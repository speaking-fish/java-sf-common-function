package com.speakingfish.common.function;

import java.util.function.Predicate;

@FunctionalInterface
public interface Acceptor<T> extends Predicate<T> {
}
