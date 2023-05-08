package contract.web.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.Collections;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;

import contract.data.ContractRepository;
import contract.Contract;

@RestController
@RequestMapping(path = "/danhsach", produces = "application/json")
@CrossOrigin(origins = "*")

public class ContractController {
	private ContractRepository aContractRepo;

	public ContractController(ContractRepository aContractRepo) {
		this.aContractRepo = aContractRepo;
	}

	@GetMapping
	public Iterable<Contract> getAllContract() {
		return aContractRepo.findAll();
	}

	@PostMapping(consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public Contract postContract(@RequestBody Contract acontract) {
		return aContractRepo.save(acontract);
	}
	
	@PutMapping("/{id}") 
	public Map<String, String> putContract(@PathVariable long id, @RequestBody Contract aContract) { 
//		Contract aContract = aContractRepo.findById(id).get();
		aContractRepo.save(aContract); 
		return Collections.singletonMap("message", "Edit " + id + " succsess");
	} 
	@DeleteMapping("/{id}")
	public Map<String, String> deleteContract(@PathVariable long id) {
		Contract aContract = aContractRepo.findById(id).get();
		aContractRepo.delete(aContract); 
		return Collections.singletonMap("message", "Delete " + id + " succsess");
	}
}
