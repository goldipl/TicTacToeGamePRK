package controller;

import java.util.Optional;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;

public class TicTacToeController {
	private boolean isFirstPlayer = true;
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    
	@FXML
	Button btn1;
	@FXML
	Button btn2;
	@FXML
	Button btn3;
	@FXML
	Button btn4;
	@FXML
	Button btn5;
	@FXML
	Button btn6;
	@FXML
	Button btn7;
	@FXML
	Button btn8;
	@FXML
	Button btn9;

	@FXML
	GridPane gameBoard;

	public void buttonQuit(ActionEvent evt1) {
        System.out.println("--- END ---");
		System.exit(0);
	}

	public void buttonNewGame(ActionEvent evt1) {
		newGame();
	}

	public void buttonClickHandler(ActionEvent evt) {
		Button clickedButton = (Button) evt.getTarget();
		String buttonLabel = clickedButton.getText();

		if ("".equals(buttonLabel) && isFirstPlayer) {
			clickedButton.setText("X");
			System.out.println("Player 1: X");
			isFirstPlayer = false;
		} else if ("".equals(buttonLabel) && !isFirstPlayer) {
			clickedButton.setText("O");
			System.out.println("Player 2: O");
			isFirstPlayer = true;
		}

		find3InARow();
	}

	private boolean find3InARow() {
		
		// Row 1
		if ("" != btn1.getText() && btn1.getText() == btn2.getText() && btn2.getText() == btn3.getText()) {
			highlightWinner(btn1, btn2, btn3);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0);        
            }
		}
		
		// Row 2
		if ("" != btn4.getText() && btn4.getText() == btn5.getText() && btn5.getText() == btn6.getText()) {
			highlightWinner(btn4, btn5, btn6);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}
		
		// Row 3
		if ("" != btn7.getText() && btn7.getText() == btn8.getText() && btn8.getText() == btn9.getText()) {
			highlightWinner(btn7, btn8, btn9);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}
		
		// Column 1
		if ("" != btn1.getText() && btn1.getText() == btn4.getText() && btn4.getText() == btn7.getText()) {
			highlightWinner(btn1, btn4, btn7);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}
		
		// Column 2
		if ("" != btn2.getText() && btn2.getText() == btn5.getText() && btn5.getText() == btn8.getText()) {
			highlightWinner(btn2, btn5, btn8);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}

		// Column 3
		if ("" != btn3.getText() && btn3.getText() == btn6.getText() && btn6.getText() == btn9.getText()) {
			highlightWinner(btn3, btn6, btn9);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}

		// Diagnol 1
		if ("" != btn1.getText() && btn1.getText() == btn5.getText() && btn5.getText() == btn9.getText()) {
			highlightWinner(btn1, btn5, btn9);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}

		// Diagnol 2
		if ("" != btn3.getText() && btn3.getText() == btn5.getText() && btn5.getText() == btn7.getText()) {
			highlightWinner(btn3, btn5, btn7);
			System.out.println("Winner!");
            alert.setTitle("We have a winner!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}
		
		// Draw
		else if ((btn1.getText() == "X" || btn1.getText() == "O") 
				&& (btn2.getText() == "X" || btn2.getText() == "O")
				&& (btn3.getText() == "X" || btn3.getText() == "O")
				&& (btn4.getText() == "X" || btn4.getText() == "O")
				&& (btn5.getText() == "X" || btn5.getText() == "O")
				&& (btn6.getText() == "X" || btn6.getText() == "O")
				&& (btn7.getText() == "X" || btn7.getText() == "O")
				&& (btn8.getText() == "X" || btn8.getText() == "O")
				&& (btn9.getText() == "X" || btn9.getText() == "O")) {
			highlightDraw(btn1, btn2, btn3);
			highlightDraw(btn4, btn5, btn6);
			highlightDraw(btn7, btn8, btn9);
			System.out.println("Draw!");
            alert.setTitle("Draw!");
            alert.setHeaderText(null);
            alert.setContentText("Do you want to play once again?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
            	newGame();
            } else {
            	System.out.println("--- END ---");
            	System.exit(0); 
            }
		}

		return false;
		
	}

	public void highlightWinner(Button first, Button second, Button third) {
		first.getStyleClass().add("winbtn");
		second.getStyleClass().add("winbtn");
		third.getStyleClass().add("winbtn");
	}
	
	public void highlightDraw(Button first, Button second, Button third) {
		first.getStyleClass().add("drawbtn");
		second.getStyleClass().add("drawbtn");
		third.getStyleClass().add("drawbtn");
	}
	
	public void newGame() {
    	System.out.println("--- NEW GAME ---");
		ObservableList<Node> buttons = gameBoard.getChildren();
		buttons.forEach(btn -> {
			((Button) btn).setText("");
			btn.getStyleClass().remove("winbtn");
			btn.getStyleClass().remove("drawbtn");
		});

		isFirstPlayer = true;

	}

}