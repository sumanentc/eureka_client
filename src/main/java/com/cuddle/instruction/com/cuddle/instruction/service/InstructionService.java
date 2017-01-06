package com.cuddle.instruction.com.cuddle.instruction.service;

import com.cuddle.instruction.com.cuddle.instruction.dto.AnalysisDTO;
import com.cuddle.instruction.com.cuddle.instruction.dto.InstructionDTO;
import org.springframework.stereotype.Service;

/**
 * Created by suman.das on 1/6/17.
 */


@Service
public class InstructionService {

    public boolean validateInstruction (InstructionDTO instructionDTO){
        if(instructionDTO.getVersion()==null || instructionDTO.getRules()== null || instructionDTO.getRules().size()==0
                || instructionDTO.getJob()== null ){
            return false;
        }
        return true;
    }

    public AnalysisDTO execute(InstructionDTO instructionDTO){
        return null;
    }


}
