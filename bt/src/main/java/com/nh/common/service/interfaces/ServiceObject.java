package com.nh.common.service.interfaces;

public interface ServiceObject<InputType, OutputType> {
    public OutputType service(InputType input) throws Throwable;
}
