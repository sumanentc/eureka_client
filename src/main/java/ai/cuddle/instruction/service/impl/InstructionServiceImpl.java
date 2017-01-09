package ai.cuddle.instruction.service.impl;

import ai.cuddle.instruction.controller.ServiceInstanceRestController;
import ai.cuddle.instruction.dto.AnalysisDTO;
import ai.cuddle.instruction.dto.InstructionDTO;
import ai.cuddle.instruction.dto.RuleDTO;
import ai.cuddle.instruction.service.InstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by suman.das on 1/6/17.
 */
@Service
public class InstructionServiceImpl implements InstructionService {

    @Autowired
    ServiceInstanceRestController restController;

    @Override
    public boolean validate(InstructionDTO instructionDTO){
        /*
        if(instructionDTO.getVersion()==null || instructionDTO.getRules()== null || instructionDTO.getRules().size()==0
                || instructionDTO.getJob()== null ){
            return false;
        }
        */
        return true;
    }
    @Override
    public AnalysisDTO execute(InstructionDTO instructionDTO){
        if(instructionDTO.getRules() != null && instructionDTO.getRules().size() >0){
            System.out.println("inside rule " + instructionDTO.getRules());
            for(RuleDTO rule : instructionDTO.getRules()){
                restController.executeRule(rule.getService(),rule.getVersion());
            }

        }

        AnalysisDTO analysisDTO = new AnalysisDTO();
        analysisDTO.setLabel("Hello World Analysis");
        return  analysisDTO;
    }

    @Override
    public InstructionDTO fetchInstruction(long id) {
        InstructionDTO instructionDTO = new InstructionDTO();
        instructionDTO.setVersion("1.0.0");
        return instructionDTO;
    }
}
