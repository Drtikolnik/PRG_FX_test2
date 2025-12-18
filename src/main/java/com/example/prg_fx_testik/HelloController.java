package com.example.prg_fx_testik;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class HelloController {
    private ObservableList<Ucitel> ucitele = FXCollections.observableArrayList();

    String jmeno;
    String vyucovanyPredmet;

    @FXML
    private ListView<Ucitel> ucitelListView;

    @FXML
    private TextField jmenoField;
    @FXML
    private TextField vyucovanyPredmetField;
    @FXML
    private TextField hodnoceniField;

    @FXML
    private Button button1;



    @FXML
    public void initialize() {
        ucitele.add(new Ucitel("Jirásek", "Literatura", 5));
        ucitele.add(new Ucitel("Alojs", "Literatura", 1));
        ucitele.add(new Ucitel("Zdeněk", "aj", 4));
        ucitele.add(new Ucitel("Přemysl", "čj", 10));
        ucitele.add(new Ucitel("Dyk", "Matematika", 2));
        ucitele.add(new Ucitel("Dobrovský", "Literatura", 8));
        ucitelListView.setItems(ucitele);
    }

    @FXML
    public void handleVyberUcitel() {
        jmenoField.setText(ucitelListView.getSelectionModel().getSelectedItem().getJmeno());
        jmeno = jmenoField.getText();
        vyucovanyPredmetField.setText(ucitelListView.getSelectionModel().getSelectedItem().getVyucovanyPredmet());
        vyucovanyPredmet = vyucovanyPredmetField.getText();
        hodnoceniField.setText(String.valueOf(ucitelListView.getSelectionModel().getSelectedItem().getHodnoceni()));
    }

/*
    @FXML
    public void handlePridatUcitel(){
        ucitele.add(new Ucitel(jmenoField.getText(), vyucovanyPredmetField.getText(), Integer.parseInt(hodnoceniField.getText() )));
        jmenoField.setText("");
        vyucovanyPredmetField.setText("");
        hodnoceniField.setText("");
    }
*/

    @FXML
    public void odebratUcitel(){
        if(ucitelListView.getSelectionModel().getSelectedIndex()!=-1) {
            ucitele.remove(ucitelListView.getSelectionModel().getSelectedItem());
        }
    }

    @FXML
    public void handleUpravitHodnoceni() {
        handleVyberUcitel();
        if(ucitelListView.getSelectionModel().getSelectedIndex()!=-1){
            if (Integer.parseInt(hodnoceniField.getText()) > 0 && Integer.parseInt(hodnoceniField.getText()) <= 10) {
                odebratUcitel();
                ucitele.add(new Ucitel(jmeno, vyucovanyPredmet, Integer.parseInt(hodnoceniField.getText()) ));
            }else{
                System.err.println("Hodnocení musí bít od 1 do 10 !!!");
            }

        }


    }


}
