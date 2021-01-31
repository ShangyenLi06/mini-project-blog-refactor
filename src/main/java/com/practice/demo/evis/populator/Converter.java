package com.practice.demo.evis.populator;

import java.util.List;

public interface Converter<Source, Target> {

    Target convert(Source source);

    List<Target> convertAll(List<Source> sourceList);
}
