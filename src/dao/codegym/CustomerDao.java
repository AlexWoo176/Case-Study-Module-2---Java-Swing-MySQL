package dao.codegym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.codegym.Customer;

public class CustomerDao {

    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>();

        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;

        String sql = "SELECT * FROM customer";

        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();

                customer.setId(rs.getInt("ID"));
                customer.setFullname(rs.getString("FULLNAME"));
                customer.setAge(rs.getInt("AGE"));
                customer.setUsername(rs.getString("USERNAME"));
                customer.setPassword(rs.getString("PASSWORD"));
                customer.setRetypepass(rs.getString("RETYPEPASS"));
                customer.setPhone(rs.getString("PHONENUMBER"));
                customer.setGender(rs.getString("GENDER"));
                customer.setAddress(rs.getString("ADDRESS"));
                customer.setRole(rs.getString("ROLE"));

                customerList.add(customer);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return customerList;
    }

    public Customer getCustomerById(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;

        String sql = "SELECT * FROM customer WHERE ID = ?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();

                customer.setId(rs.getInt("ID"));
                customer.setFullname(rs.getString("FULLNAME"));
                customer.setAge(rs.getInt("AGE"));
                customer.setUsername(rs.getString("USERNAME"));
                customer.setPassword(rs.getString("PASSWORD"));
                customer.setRetypepass(rs.getString("RETYPEPASS"));
                customer.setPhone(rs.getString("PHONENUMBER"));
                customer.setGender(rs.getString("GENDER"));
                customer.setAddress(rs.getString("ADDRESS"));
                customer.setRole(rs.getString("ROLE"));

                return customer;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }
    
    public void addCustomer(Customer customer) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "INSERT INTO customer(FULLNAME, AGE, USERNAME, PASSWORD, RETYPEPASS, PHONENUMBER, GENDER, ADDRESS, ROLE) VALUE(?,?,?,?,?,?,?,?,?)";

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, customer.getFullname());
            pst.setInt(2, customer.getAge());
            pst.setString(3, customer.getUsername());
            pst.setString(4, customer.getPassword());
            pst.setString(5, customer.getRetypepass());
            pst.setString(6, customer.getPhone());
            pst.setString(7, customer.getGender());
            pst.setString(8, customer.getAddress());
            pst.setString(9, customer.getRole());

            int rs = pst.executeUpdate();
            System.out.println(rs);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void updateCustomer(Customer customer) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "UPDATE customer SET FULLNAME = ?,AGE = ?,USERNAME = ?,PASSWORD = ?,RETYPEPASS = ?,PHONENUMBER = ?,GENDER = ?,ADDRESS = ?, ROLE = ? WHERE ID =?";

        try {
            pst = connection.prepareStatement(sql);
            pst = connection.prepareStatement(sql);
            pst.setString(1, customer.getFullname());
            pst.setInt(2, customer.getAge());
            pst.setString(3, customer.getUsername());
            pst.setString(4, customer.getPassword());
            pst.setString(5, customer.getRetypepass());
            pst.setString(6, customer.getPhone());
            pst.setString(7, customer.getGender());
            pst.setString(8, customer.getAddress());
            pst.setString(9, customer.getRole());
            pst.setInt(10, customer.getId());

            int rs = pst.executeUpdate();
            System.out.println(rs);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void deleteCustomer(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;
        String sql = "delete from Customer where id = ?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            int rs = pst.executeUpdate();
            System.out.println(rs);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
     public List<Customer> searchCustomers(String valToSearch) {
        List<Customer> customerList = new ArrayList<>();

        Connection connection = JDBCConnection.getJDBCConnection();
        PreparedStatement pst = null;

        String sql = "SELECT * FROM `customer` WHERE CONCAT (`ID`, `FULLNAME`, `AGE`, `USERNAME`, `PHONENUMBER`) LIKE '%"+valToSearch+"%' ";

        try {
            pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();

                customer.setId(rs.getInt("ID"));
                customer.setFullname(rs.getString("FULLNAME"));
                customer.setAge(rs.getInt("AGE"));
                customer.setUsername(rs.getString("USERNAME"));
                customer.setPassword(rs.getString("PASSWORD"));
                customer.setRetypepass(rs.getString("RETYPEPASS"));
                customer.setPhone(rs.getString("PHONENUMBER"));
                customer.setGender(rs.getString("GENDER"));
                customer.setAddress(rs.getString("ADDRESS"));
                customer.setRole(rs.getString("ROLE"));

                customerList.add(customer);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return customerList;
    }
}
