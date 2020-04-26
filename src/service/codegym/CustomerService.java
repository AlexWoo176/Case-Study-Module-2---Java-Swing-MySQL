package service.codegym;

import dao.codegym.CustomerDao;
import java.util.List;
import model.codegym.Customer;

public class CustomerService {

    private CustomerDao customerDao;

    public CustomerService() {
        customerDao = new CustomerDao();
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);
    }

    public Customer getCustomerById(int id) {
        return customerDao.getCustomerById(id);
    }

    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }
    
    public List<Customer> searchCustomers(String valToSearch) {
    return customerDao.searchCustomers(valToSearch);
    }
}
