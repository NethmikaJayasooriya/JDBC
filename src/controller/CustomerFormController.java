package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Customer;
import util.Crudutil;

public class CustomerFormController {
    public TextField txtId;
    public TextField txtname;
    public TextField txtadr;
    public TextField txtslry;
    public TableView tblCustomer;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableColumn colTools;

    public void saveCustomerOnAction(ActionEvent actionEvent) {
        Customer customer = new Customer(
                txtId.getText(),
                txtname.getText(),
                txtadr.getText(),
                Double.parseDouble(txtslry.getText())
        );
        try{
            boolean isSaved = Crudutil.execute(
                    "INSERT INTO customer VALUES (?, ?, ?, ?)",
                    customer.getId(),
                    customer.getName(),
                    customer.getAddress(),
                    customer.getSalary()
            );
            if(isSaved){
                clearFields();
                new Alert(Alert.AlertType.INFORMATION, "Customer Saved").show();
            }else{
                new Alert(Alert.AlertType.WARNING, "Customer Not Saved").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
            throw new RuntimeException(e);
        }
    }

    private void clearFields(){
        txtId.clear();
        txtname.clear();
        txtadr.clear();
        txtslry.clear();
    }

    public void newCustomerOnAction(ActionEvent actionEvent) {
    }
}
