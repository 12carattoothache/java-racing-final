package org.ssc.study.carracing;

public class AlwaysMove implements MoveStrategy {
    @Override
    public boolean isMoveAble() {
        return true;
    }
}