package com.janlei.tdd.handler;

import static com.janlei.tdd.constant.StringConstant.BUZZ;
import static com.janlei.tdd.constant.StringConstant.EMPTY;

public class BuzzHandler implements IGameHandler {

    @Override
    public String handle(int number) {
        return isBuzz(number) ? BUZZ : EMPTY;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
