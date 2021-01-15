package gui;

import java.util.Locale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private Button btMais;
	@FXML
	private Button btMenos;
	@FXML
	private Button btMult;
	@FXML
	private Button btDivis;
	@FXML
	private TextField txtN1;
	@FXML
	private TextField txtN2;

	@FXML
	private Label txtResultado;

	public void onBtMaisAction() {
		Locale.setDefault(Locale.US);

		double n1 = Double.parseDouble(txtN1.getText());
		double n2 = Double.parseDouble(txtN2.getText());

		double soma = n1 + n2;
		txtResultado.setText(String.format("%1f", soma));

	}
	public void onBtMultAction() {
		Locale.setDefault(Locale.US);

		double n1 = Double.parseDouble(txtN1.getText());
		double n2 = Double.parseDouble(txtN2.getText());

		double mult = n1 * n2;
		txtResultado.setText(String.format("%1f", mult));

	}
	public void onBtMenosAction() {
		Locale.setDefault(Locale.US);

		double n1 = Double.parseDouble(txtN1.getText());
		double n2 = Double.parseDouble(txtN2.getText());

		double subt = n1 - n2;
		txtResultado.setText(String.format("%1f", subt));

	}
	public void onBtDivisAction() {
		Locale.setDefault(Locale.US);

		double n1 = Double.parseDouble(txtN1.getText());
		double n2 = Double.parseDouble(txtN2.getText());

		double divis = n1 / n2;
		txtResultado.setText(String.format("%1f", divis));

	}

	
}
