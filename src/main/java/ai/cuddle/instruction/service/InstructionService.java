package ai.cuddle.instruction.service;

import ai.cuddle.instruction.dto.AnalysisDTO;
import ai.cuddle.instruction.dto.InstructionDTO;

/**
 * Created by suman.das on 1/6/17.
 */



public interface InstructionService {

    boolean validateInstruction (InstructionDTO instructionDTO);

    AnalysisDTO execute(InstructionDTO instructionDTO);

    InstructionDTO fetchInstruction(long id);


}
