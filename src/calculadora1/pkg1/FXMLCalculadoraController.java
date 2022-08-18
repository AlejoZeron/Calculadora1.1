/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calculadora1.pkg1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author zeron
 */
public class FXMLCalculadoraController implements Initializable {
    
    private Label label;
    @FXML
    private Label lab_pantalla;
    @FXML
    private Button clic_siete;
    @FXML
    private Button clic_ocho;
    @FXML
    private Button clic_nueve;
    @FXML
    private Button clic_cuatro;
    @FXML
    private Button clic_cinco;
    @FXML
    private Button clic_seis;
    @FXML
    private Button clic_uno;
    @FXML
    private Button clic_dos;
    @FXML
    private Button clic_tres;
    @FXML
    private Button clic_cero;
    @FXML
    private Button clic_punto;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
