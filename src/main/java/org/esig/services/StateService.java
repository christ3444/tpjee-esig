package org.esig.services;

import java.util.List;
import java.util.Optional;

import org.esig.dao.StateRepository;
import org.esig.models.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {
	@Autowired
	private StateRepository stateRepository;
	
	public List<State> getAllStatate(){
		return stateRepository.findAll();
	}
	public Optional<State> getStateById(Integer id) {
		return stateRepository.findById(id);
	}
	public State saveState(State state) {
		return stateRepository.save(state);
	}
	public String deleteState(Integer id) {
		stateRepository.deleteById(id);
		return "Suppression réussoe";
	}
	public State updateState(Integer id) {
		State state = new State();
		state = stateRepository.getOne(id);
		state.setId(state.getId());
		state.setName(state.getName());
		state.setCode(state.getCode());
		state.setCountry(state.getCountry());
		stateRepository.save(state);
		return state;
	}

}
