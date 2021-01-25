package com.janlei.tdd.context;

import com.google.common.collect.Lists;
import com.janlei.tdd.handler.IGameHandler;

import java.util.List;

public class GameHandlerContext {

    private Integer index = 0;
    private final List<IGameHandler> rules = Lists.newArrayList();

    public boolean notEnd() {
        return index < rules.size();
    }

    public IGameHandler getNext() {
        IGameHandler handler = rules.get(index);
        index++;
        return handler;
    }

    public void add(IGameHandler rule) {
        rules.add(rule);
    }
}
