package com.janlei.tdd.model;

import com.janlei.tdd.context.GameHandlerContext;
import com.janlei.tdd.handler.IGameHandler;

public class FizzBuzzGame {

    private static final String EMPTY = "";
    private final GameHandlerContext rules = new GameHandlerContext();

    public String result(int call) {
        StringBuilder result = new StringBuilder();
        while (rules.notEnd()) {
            result.append(rules.getNext().handle(call));
        }

        boolean notMatched = EMPTY.equals(result.toString());
        if (notMatched) {
            return result.append(call).toString();
        }

        return result.toString();
    }

    public void setRule(IGameHandler handler) {
        rules.add(handler);
    }
}
