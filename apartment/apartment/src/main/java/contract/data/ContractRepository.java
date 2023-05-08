package contract.data;

import org.springframework.data.repository.CrudRepository;

import contract.Contract;
public interface ContractRepository extends CrudRepository<Contract, Long>{
}

