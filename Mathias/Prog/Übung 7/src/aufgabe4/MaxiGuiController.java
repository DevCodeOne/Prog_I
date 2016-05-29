package aufgabe4;

import java.io.IOException;
import java.util.Optional;

import aufgabe3.Buch;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class MaxiGuiController {

	@FXML
	private ListView<Buch> listView;

	private ObservableList<Buch> buecher = FXCollections.observableArrayList();

	public MaxiGuiController() {
		Platform.runLater(() -> listView.setItems(buecher));
	}

	@FXML
	public void loeschen(ActionEvent event) {
		if (listView.getSelectionModel().getSelectedIndex() < 0)
			return;
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setHeaderText(listView.getSelectionModel().getSelectedItem().getTitel());
		alert.setContentText("Wirklich löschen?");
		alert.getDialogPane().getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Optional<ButtonType> result = alert.showAndWait();

		if (result.get() == ButtonType.OK) {
			Buch buch = listView.getSelectionModel().getSelectedItem();
			buecher.remove(buch);
		}
	}

	@FXML
	public void anlegen(ActionEvent event) {

		Buch buch = new Buch("", "", "", "");
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Dialog.fxml"));
		AnchorPane dialogPane = null;
		try {
			dialogPane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		DialogController controller = loader.getController();

		Dialog<Buch> dialog = new Dialog<>();
		dialog.getDialogPane().setContent(dialogPane);
		dialog.

		ButtonType buttonTypeOK = new ButtonType("Übernehmen", ButtonData.OK_DONE);
		ButtonType buttonTypeCancel = new ButtonType("Abbrechen", ButtonData.CANCEL_CLOSE);
		dialog.getDialogPane().getButtonTypes().addAll(buttonTypeCancel, buttonTypeOK);

		controller.setBuch(buch);

		dialog.setResultConverter(button -> {
			if (button.getButtonData() == ButtonData.OK_DONE) {
				return controller.getBuch();
			} else
				return null;
		});

		Optional<Buch> result = dialog.showAndWait();
		if (result.isPresent()) {
			buecher.add(controller.getBuch());
			listView.refresh();
		}
	}

	@FXML
	public void aendern(ActionEvent event) {

		if (listView.getSelectionModel().getSelectedIndex() < 0)
			return;

		Buch buch = listView.getSelectionModel().getSelectedItem();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Dialog.fxml"));
		AnchorPane dialogPane = null;
		try {
			dialogPane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		DialogController controller = loader.getController();

		Dialog<Buch> dialog = new Dialog<>();
		dialog.getDialogPane().setContent(dialogPane);

		ButtonType buttonTypeOK = new ButtonType("Übernehmen", ButtonData.OK_DONE);
		ButtonType buttonTypeCancel = new ButtonType("Abbrechen", ButtonData.CANCEL_CLOSE);
		dialog.getDialogPane().getButtonTypes().addAll(buttonTypeCancel, buttonTypeOK);

		controller.setBuch(buch);

		dialog.setResultConverter(button -> {
			if (button.getButtonData() == ButtonData.OK_DONE) {
				return controller.getBuch();
			} else
				return null;
		});

		Optional<Buch> result = dialog.showAndWait();
		if (result.isPresent()) {
			controller.getBuch();
			listView.refresh();
		}

	}

}
