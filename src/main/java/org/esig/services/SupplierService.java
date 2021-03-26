package org.esig.services;

import java.util.List;
import java.util.Optional;

import org.esig.dao.SupplierRepository;
import org.esig.models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {
	@Autowired
	private SupplierRepository supplierRepository;
	public List<Supplier> getAllSupplier() {
		return supplierRepository.findAll();
	}
	public Optional<Supplier> getSupplierById(Integer id) {
		return supplierRepository.findById(id);
	}
	public String saveSupplier(Supplier supplier) {
		supplierRepository.save(supplier);
		return "Enregistrement effectué avec succès";
	}
	public String deleteSupplier(Supplier supplier) {
		supplierRepository.delete(supplier);
		return "Suppression effectuée avec succès";
	}
	public Supplier updateSupplier(Integer id) {
		Supplier supplier = new Supplier();
		supplier.setId(supplier.getId());
		supplier.setName(supplier.getName());
		supplier.setAdresse(supplier.getAdresse());
		supplier.setEmail(supplier.getEmail());
		supplier.setTelephone(supplier.getTelephone());
		supplier.setState(supplier.getState());
		supplierRepository.save(supplier);
		return supplier;
	}

}
