/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Be A Coder
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public TableView<PersonTableData> table;
    
    public static ObservableList<PersonTableData> data = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MouseClick();
        table.setEditable(true);
        table.setItems(data);
        populate(retrieveData());
        
    }    
    private void populate(List<Person> people)
    {
        for(Person p:people)
        {
            data.add(new PersonTableData(p));
        }
    }
    private List<Person> retrieveData()
    {
        try
        {
            return Arrays.asList(new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"),
                          new Person("Himanshu","E-53,Sector-27","Noida-UP","Male","Unmarried","8114431733","himanshu.parwani8@gmail.com"));
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return new ArrayList<Person>();
    }
    @FXML
    private void Add(final ActionEvent event)
    {
        FXMLLoader loader;
        try {
            AddDetailsController ad = new AddDetailsController();
            loader = new FXMLLoader(getClass().getResource("/addressbook/AddDetails.fxml"));
            loader.setController(ad);
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Details");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 800, 500));
            stage.show();
            // Hide this current window (if this is what you want)
            //((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }
     @FXML
    private void Update(final ActionEvent event)
    {
         FXMLLoader loader;
        try {
            UpdateDetailsController ad = new UpdateDetailsController(table.getSelectionModel().getSelectedItem(),table.getSelectionModel().getSelectedIndex());
            loader = new FXMLLoader(getClass().getResource("/addressbook/AddDetails.fxml"));
            loader.setController(ad);
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Details");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 800, 500));
            stage.show();
            // Hide this current window (if this is what you want)
            //((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }
    @FXML
    private void Delete(final ActionEvent event)
    {
        data.remove(table.getSelectionModel().getSelectedItem());
    }
    private void MouseClick()
    {
        table.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
       if(event.getClickCount()==2)
       {
                FXMLLoader loader;
        try {
            ViewDetailsController ad = new ViewDetailsController(table.getSelectionModel().getSelectedItem(),table.getSelectionModel().getSelectedIndex());
            loader = new FXMLLoader(getClass().getResource("/addressbook/AddDetails.fxml"));
            loader.setController(ad);
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Details");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 800, 500));
            stage.show();
            // Hide this current window (if this is what you want)
            //((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
       }
            }
        });
    }
    
}
