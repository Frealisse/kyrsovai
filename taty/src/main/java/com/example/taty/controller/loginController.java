package com.example.taty.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.example.taty.main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField k_login;

    @FXML
    private PasswordField k_pasword;

    @FXML
    private Button k_reg;

    @FXML
    private Button k_vhod;

    @FXML
    void initialize(Stage stage) {
    }

    @FXML
    void klik()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(registerController.class.getResource("register.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 800, 500);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setTitle("Taty-Salon");
        stage.setScene(scene);
        stage.show();
    }


}
