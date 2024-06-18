package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO  {

    public ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException;

    public void btnSave_OnAction(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public void updateCustomer(String name, String address,String id) throws SQLException, ClassNotFoundException;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public String generatenewCustomer() throws SQLException, ClassNotFoundException;

    public boolean exitcustomer(String id) throws SQLException, ClassNotFoundException;

    public void loadallcustomer() throws SQLException, ClassNotFoundException;

    boolean existCustomerID(String id);

}