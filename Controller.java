import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Controller {

	private Stage mainStage;
	private GameView gameView;
	private Scene gameScene;

	public static Card selectedCardFromDeck;

	private PlayArea player1PlayArea;
	// private PlayArea player2PlayArea;

	public Controller(Stage stage) {
		this.gameView = new GameView();
		this.gameScene = new Scene(gameView, 2390, 1000);
		this.mainStage = stage;

		this.player1PlayArea = new PlayArea();
		// this.player2PlayArea = new PlayArea();

		configureButtons();
		mainStage.setScene(gameScene);
	}

	public void configureButtons() {
		this.gameView.iViewEmptyPile1Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewEmptyPile1Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewEmptyPile1Player1.setOnMousePressed(evt -> {
			this.gameView.iViewEmptyPile1Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewEmptyPile1Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewEmptyPile1Player1.setEffect(null);
			if (player1PlayArea.getPiles()[0].isFull()) {
				System.out.println("Cannot add any more cards to this pile");
			} else {
				this.player1PlayArea.getPiles()[0].insertCard(selectedCardFromDeck);
				selectedCardFromDeck = null;
				this.gameView.iViewEmptyPile1Player1.setDisable(true);
				this.gameView.iViewEmptyPile2Player1.setDisable(true);
				this.gameView.iViewEmptyPile3Player1.setDisable(true);
				this.gameView.iViewEmptyPile4Player1.setDisable(true);
				this.gameView.iViewEmptyPile5Player1.setDisable(true);
			}
			this.gameView.iViewEmptyPile1Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewEmptyPile1Player1.setOnMouseExited(evt -> {
			this.gameView.iViewEmptyPile1Player1.setEffect(null);
		});

		this.gameView.iViewEmptyPile2Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewEmptyPile2Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewEmptyPile2Player1.setOnMousePressed(evt -> {
			this.gameView.iViewEmptyPile2Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewEmptyPile2Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewEmptyPile2Player1.setEffect(null);
			this.gameView.iViewEmptyPile2Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewEmptyPile2Player1.setOnMouseExited(evt -> {
			this.gameView.iViewEmptyPile2Player1.setEffect(null);
		});

		this.gameView.iViewEmptyPile3Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewEmptyPile3Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewEmptyPile3Player1.setOnMousePressed(evt -> {
			this.gameView.iViewEmptyPile3Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewEmptyPile3Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewEmptyPile3Player1.setEffect(null);
			this.gameView.iViewEmptyPile3Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewEmptyPile3Player1.setOnMouseExited(evt -> {
			this.gameView.iViewEmptyPile3Player1.setEffect(null);
		});

		this.gameView.iViewEmptyPile4Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewEmptyPile4Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewEmptyPile4Player1.setOnMousePressed(evt -> {
			this.gameView.iViewEmptyPile4Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewEmptyPile4Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewEmptyPile4Player1.setEffect(null);
			this.gameView.iViewEmptyPile4Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewEmptyPile4Player1.setOnMouseExited(evt -> {
			this.gameView.iViewEmptyPile4Player1.setEffect(null);
		});

		this.gameView.iViewEmptyPile5Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewEmptyPile5Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewEmptyPile5Player1.setOnMousePressed(evt -> {
			this.gameView.iViewEmptyPile5Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewEmptyPile5Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewEmptyPile5Player1.setEffect(null);
			this.gameView.iViewEmptyPile5Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewEmptyPile5Player1.setOnMouseExited(evt -> {
			this.gameView.iViewEmptyPile5Player1.setEffect(null);
		});
	}

	public static void setSelectedCardFromDeck(Card c) {
		selectedCardFromDeck = c;
	}

	public static Card getSelectedCardFromDeck() {
		return selectedCardFromDeck;
	}

	public void start() {
		mainStage.show();
	}

}
