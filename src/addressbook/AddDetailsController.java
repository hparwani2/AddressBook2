/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
//import javafx.scene.control.Alert.AlertType;
/**
 *
 * @author Be A Coder
 */
public class AddDetailsController extends FXMLDocumentController implements Initializable {
    
    
    @FXML
    private TextField Name;
    
    @FXML
    private TextField EmailId;
    
    @FXML
    private TextField AddressLine1;
    
    @FXML
    private TextField AddressLine2;
    
    @FXML
    private TextField PhoneNo;
    
    @FXML
    private RadioButton Male;
    
    @FXML
    private RadioButton Female;
    
    @FXML
    private RadioButton Other;
    
    @FXML
    private RadioButton Married;
    
    @FXML
    private RadioButton Unmarried;
    
    @FXML
    private RadioButton Divorcee;
    
    private String Gender;
    private String Relationship;
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }

    @FXML
    private void handleSaveButton(final ActionEvent event)
    {
        try
        {
            recordRadioButton();
            Person p = new Person(Name.getText(),AddressLine1.getText(),AddressLine2.getText(),Gender,Relationship,PhoneNo.getText(),EmailId.getText());
            PersonTableData pd = new PersonTableData(p);
            data.add(pd);
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch(Exception e)
        {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
   }
    
   private void recordRadioButton()
   {
       if(Male.isSelected())
       {
           Gender = "Male";
       }
       else if(Female.isSelected())
       {
           Gender = "Female";
       }
       else
       {
           Gender = "Other";
       }
       if(Married.isSelected())
       {
           Relationship = "Married";
       }
       else if(Unmarried.isSelected())
       {
           Relationship = "Unmarried";
       }
       else
       {
           Relationship = "Divorcee";
       }       
   }
   private void validateFields()
   { 
       if(Name.getText()=="")
       {
           
       }
   }
   
    
}
