package com.janlei.tdd.handler;

import static com.janlei.tdd.constant.StringConstant.EMPTY;
import static com.janlei.tdd.constant.StringConstant.FIZZ;

public class FizzHandler implements IGameHandler {
    @Override
    public String handle(int number) {
        return isFizz(number) ? FIZZ : EMPTY;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
