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
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author Himanshu.Parwani
 */
public class ViewDetailsController extends FXMLDocumentController implements Initializable {
    
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
    
    @FXML
    private Button Save;
    
    private String gender;
    private String relationship;
    private String name;
    private String addressline1;
    private String addressline2;
    private String phoneno;
    private String emailid;
    private PersonTableData p;
    private int i;
    
    public ViewDetailsController(PersonTableData p, int i)
    {
        this.i=i;
        this.p=p;
        this.name = p.getName();
        this.emailid=p.getEmailId();
        this.addressline1=p.getAddressLine1();
        this.addressline2=p.getAddressLine2();;
        this.phoneno=p.getPhoneNo();
        this.gender = p.getGender();
        this.relationship = p.getRelationship();
    }
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        Name.setText(name);
        EmailId.setText(emailid);
        AddressLine1.setText(addressline1);
        AddressLine2.setText(addressline2);
        PhoneNo.setText(phoneno);
        Name.setEditable(false);
        EmailId.setEditable(false);
        AddressLine1.setEditable(false);
        AddressLine2.setEditable(false);
        PhoneNo.setEditable(false);
        Save.setDisable(true);
        if(gender == "Male")
        {
            Male.setSelected(true);
        }
        else if(gender == "Female")
        {
            Female.setSelected(true);
        }
        else
        {
            Other.setSelected(true);
        }
        if(relationship == "Married")
        {
            Married.setSelected(true);
        }
        else if(relationship == "Unmarried")
        {
            Unmarried.setSelected(true);
        }
        else
        {
            Divorcee.setSelected(true);
        }
        
    }
    @FXML
    private void handleSaveButton(final ActionEvent event)
    {
    }
    
}
