package com.cuddle.instruction.com.cuddle.instruction.entity;

import java.util.List;

/**
 * Created by suman.das on 1/6/17.
 */


public class Instruction implements IInstruction{
    private String version;
    private List<IRule> rules;
    private IContext context;
    private IJob job;

}
