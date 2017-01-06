package ai.cuddle.instruction.service.impl;

import ai.cuddle.instruction.dto.AnalysisDTO;
import ai.cuddle.instruction.dto.InstructionDTO;
import ai.cuddle.instruction.service.InstructionService;
import org.springframework.stereotype.Service;

/**
 * Created by suman.das on 1/6/17.
 */
@Service
public class InstructionServiceImpl implements InstructionService {

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
