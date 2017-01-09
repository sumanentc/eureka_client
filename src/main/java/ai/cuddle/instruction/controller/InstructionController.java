package ai.cuddle.instruction.controller;

import ai.cuddle.instruction.dto.AnalysisDTO;
import ai.cuddle.instruction.dto.InstructionDTO;
import ai.cuddle.instruction.service.InstructionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by suman.das on 1/6/17.
 */
@RestController
@RequestMapping("/instruction/")
public class InstructionController {

    @Autowired
    private InstructionService instructionService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> analyze(@RequestBody InstructionDTO instruction){
        boolean status = instructionService.validate(instruction);
        if(status){
            AnalysisDTO dto = instructionService.execute(instruction);
            return ResponseEntity.ok().body(dto);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public InstructionDTO getInstruction(@PathVariable Long id){
        return instructionService.fetchInstruction(id);
    }
}
