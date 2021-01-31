package com.practice.demo.evis.populator;

public interface Populator<Source, Target> {

    void populate(Source source, Target target);
}

