module AleksandrFeldman_COMP1011Sec003 {
	requires javafx.controls;
	requires java.sql;
	requires javafx.fxml;
	requires java.desktop;
	requires java.sql.rowset;
	requires javafx.swing;

	opens application to javafx.graphics, javafx.fxml;
}