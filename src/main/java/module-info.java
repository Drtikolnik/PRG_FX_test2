module com.example.prg_fx_testik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.prg_fx_testik to javafx.fxml;
    exports com.example.prg_fx_testik;
}