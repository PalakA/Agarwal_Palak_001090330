/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }
    
    public Customer createCustomer(String name, String address, String phone){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAddress(address);
        customer.setPhone(phone);
        customerList.add(customer);
        return customer;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer findCustomer(String name)
    {
        for(Customer c : customerList)
        {
            if(c.getName() == name)
            {
                return c;
            }
        }
        return null;
    }
    
    public void deleteCustomer(Customer customer)
    {
        customerList.remove(customer);
    }
}
