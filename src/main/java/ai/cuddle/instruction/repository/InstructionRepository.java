package ai.cuddle.instruction.repository;

import ai.cuddle.instruction.entity.Instruction;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by suman.das on 1/6/17.
 */
public interface InstructionRepository extends CrudRepository<Instruction,Long>{
}
