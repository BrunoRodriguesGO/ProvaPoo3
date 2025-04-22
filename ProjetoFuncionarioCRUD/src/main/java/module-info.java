module com.example.projetofuncionariocrud {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.projetofuncionariocrud to javafx.fxml;
    exports com.example.projetofuncionariocrud;
    exports com.example.projetofuncionariocrud.Controller;
    opens com.example.projetofuncionariocrud.Controller to javafx.fxml;
    exports com.example.projetofuncionariocrud.Model;
    opens com.example.projetofuncionariocrud.Model to javafx.fxml;
}





//module com.example.projetofuncionariocrud {
//        requires javafx.controls;
//        requires javafx.fxml;
//
//        }
