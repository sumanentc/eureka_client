package ai.cuddle.instruction.controller;

import ai.cuddle.instruction.dto.InstructionDTO;
import ai.cuddle.instruction.service.InstructionService;
import ai.cuddle.instruction.entity.Instruction;
import org.springframework.beans.factory.annotation.Autowired;
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
        return null;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Instruction getInstruction(@PathVariable Long id){
        return null;
    }
}
