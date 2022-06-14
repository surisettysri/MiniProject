package com.zensar.service;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Address;
import com.zensar.db.AddressDAO;


@Service
public class AddressService {

@Autowired
AddressDAO dao;

public Address addAddress(Address address) {
return this.dao.save(address);
}

public Address findByAddressId(int addressId) {

Optional<Address> optional = this.dao.findById(addressId);
if (optional.isPresent())
return optional.get();
return null;
}

// public Address updateByAddressId(int Id) {
// Optional<Address> optional = this.dao.findById(Id);
// if (optional.isPresent()) {
// Address address = optional.get();
//
// address.setBuildingName(address.getBuildingName());
// address.setCity(address.getCity());
// address.setCountry(address.getCountry());
// address.setPincode(address.getPincode());
// address.setState(address.getState());
// address.setStreetNo(address.getStreetNo());
//
// Address newAddress = this.dao.save(address);
// return newAddress;
// }
// else {
// return null;
// }
// }

public Address updateAddressById(Address address, int id) {
return this.dao.save(address);
}



public List<Address> getAllAddresses(){
return this.dao.findAll();
}



}
