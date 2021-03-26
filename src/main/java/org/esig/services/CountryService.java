package org.esig.services;

import java.util.List;
import java.util.Optional;

import org.esig.dao.CountryRepository;
import org.esig.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
//	@Autowired
//	private Country country;
	
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	
	public Optional<Country> getCountryById(Integer id) {
		return countryRepository.findById(id);
	}
	
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}
	
	public String deleteCountry(Country country) {
		countryRepository.delete(country);
		return "Suppression réussie " ;
		
	}
	
	public Country updateCountry(Integer id) {
		Country country = new Country();
		country = countryRepository.getOne(id);
		country.setId(country.getId());
		country.setName(country.getName());
		country.setCode(country.getCode());
		country.setStates(country.getStates());
		countryRepository.save(country);
		return country;
	}

}
