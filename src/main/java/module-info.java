module pl.programodawca.skjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.programodawca.skjavafx to javafx.fxml;
    exports pl.programodawca.skjavafx;
}