package com.practice.demo.evis.populator.impl;

import com.practice.demo.evis.populator.Converter;
import com.practice.demo.evis.populator.Populator;
import com.practice.demo.evis.utils.CheckUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AbstractConverter<Source, Target> implements Converter<Source, Target> {

    private Class<Target> targetClass;
    private List<Populator<Source, Target>> populatorList;

    @Override
    public Target convert(Source source) {

        CheckUtils.vaildateNotNullElment(targetClass);
        CheckUtils.vaildateNotNullElment(source);

        try {
            Target target = getTargetClass().getDeclaredConstructor().newInstance();
            getPopulatorList().forEach(populator -> populator.populate(source, target));
            return target;
        } catch (Exception e) {
            throw new IllegalArgumentException(String.format("Populate problem with error %s", e.getMessage()));
        }
    }

    @Override
    public List<Target> convertAll(List<Source> sources) {

        List<Target> result = new ArrayList<>();
        sources.forEach(source -> result.add(convert(source)));
        return result;
    }

    protected List<Populator<Source, Target>> getPopulatorList() {
        return populatorList;
    }

    protected Class<Target> getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(Class<Target> targetClass) {
        this.targetClass = targetClass;
    }

    public void setPopulatorList(List<Populator<Source, Target>> populatorList) {
        this.populatorList = populatorList;
    }
}
