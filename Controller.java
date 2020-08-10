import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Controller {

	private Stage mainStage;
	private GameView gameView;
	private Scene gameScene;

	public static Card selectedCardFromDeck;
	public Card selectedCard;

	private PlayArea player1PlayArea;
	// private PlayArea player2PlayArea;

	public Controller(Stage stage) {
		this.gameView = new GameView();
		this.gameScene = new Scene(gameView, 2390, 1000);
		this.mainStage = stage;

		this.player1PlayArea = new PlayArea();
		// this.player2PlayArea = new PlayArea();
		// this is another test commit

		configureButtons();
		mainStage.setScene(gameScene);
	}

	public void configureButtons() {

		//Pile 1 Player 1
		this.gameView.iViewPile1Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewPile1Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewPile1Player1.setOnMousePressed(evt -> {
			this.gameView.iViewPile1Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewPile1Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile1Player1.setEffect(null);
			if (player1PlayArea.getPiles()[0].isFull()) {
				System.out.println("Cannot add any more cards to this pile");
			}
			else {
				this.player1PlayArea.getPiles()[0].insertCard(selectedCardFromDeck);
				selectedCardFromDeck = null;
				this.gameView.iViewPile1Player1.setDisable(true);
				this.gameView.iViewPile2Player1.setDisable(true);
				this.gameView.iViewPile3Player1.setDisable(true);
				this.gameView.iViewPile4Player1.setDisable(true);
				this.gameView.iViewPile5Player1.setDisable(true);
				this.gameView.iViewPile1Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
				gameStart();
			}
		});
		this.gameView.iViewPile1Player1.setOnMouseExited(evt -> {
			this.gameView.iViewPile1Player1.setEffect(null);
		});

		//Pile 2 Player 1
		this.gameView.iViewPile2Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewPile2Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewPile2Player1.setOnMousePressed(evt -> {
			this.gameView.iViewPile2Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewPile2Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile2Player1.setEffect(null);
			this.gameView.iViewPile2Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewPile2Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile2Player1.setEffect(null);
			if (player1PlayArea.getPiles()[1].isFull()) {
				System.out.println("Cannot add any more cards to this pile");
			}
			else {
				this.player1PlayArea.getPiles()[1].insertCard(selectedCardFromDeck);
				selectedCardFromDeck = null;
				this.gameView.iViewPile1Player1.setDisable(true);
				this.gameView.iViewPile2Player1.setDisable(true);
				this.gameView.iViewPile3Player1.setDisable(true);
				this.gameView.iViewPile4Player1.setDisable(true);
				this.gameView.iViewPile5Player1.setDisable(true);
				this.gameView.iViewPile2Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
				gameStart();
			}
		});
		this.gameView.iViewPile2Player1.setOnMouseExited(evt -> {
			this.gameView.iViewPile2Player1.setEffect(null);
		});

		//Pile 3 Player 1
		this.gameView.iViewPile3Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewPile3Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewPile3Player1.setOnMousePressed(evt -> {
			this.gameView.iViewPile3Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewPile3Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile3Player1.setEffect(null);
			this.gameView.iViewPile3Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewPile3Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile3Player1.setEffect(null);
			if (player1PlayArea.getPiles()[2].isFull()) {
				System.out.println("Cannot add any more cards to this pile");
			}
			else {
				this.player1PlayArea.getPiles()[2].insertCard(selectedCardFromDeck);
				selectedCardFromDeck = null;
				this.gameView.iViewPile1Player1.setDisable(true);
				this.gameView.iViewPile2Player1.setDisable(true);
				this.gameView.iViewPile3Player1.setDisable(true);
				this.gameView.iViewPile4Player1.setDisable(true);
				this.gameView.iViewPile5Player1.setDisable(true);
				this.gameView.iViewPile3Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
				gameStart();
			}
		});
		this.gameView.iViewPile3Player1.setOnMouseExited(evt -> {
			this.gameView.iViewPile3Player1.setEffect(null);
		});

		//Pile 4 Player 1
		this.gameView.iViewPile4Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewPile4Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewPile4Player1.setOnMousePressed(evt -> {
			this.gameView.iViewPile4Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewPile4Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile4Player1.setEffect(null);
			this.gameView.iViewPile4Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewPile4Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile4Player1.setEffect(null);
			if (player1PlayArea.getPiles()[3].isFull()) {
				System.out.println("Cannot add any more cards to this pile");
			}
			else {
				this.player1PlayArea.getPiles()[3].insertCard(selectedCardFromDeck);
				selectedCardFromDeck = null;
				this.gameView.iViewPile1Player1.setDisable(true);
				this.gameView.iViewPile2Player1.setDisable(true);
				this.gameView.iViewPile3Player1.setDisable(true);
				this.gameView.iViewPile4Player1.setDisable(true);
				this.gameView.iViewPile5Player1.setDisable(true);
				this.gameView.iViewPile4Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
				gameStart();
			}
		});
		this.gameView.iViewPile4Player1.setOnMouseExited(evt -> {
			this.gameView.iViewPile4Player1.setEffect(null);
		});

		//Pile 5 Player 1
		this.gameView.iViewPile5Player1.setOnMouseEntered(evt -> {
			this.gameView.iViewPile5Player1.setEffect(this.gameView.colorAdjustBright);
		});
		this.gameView.iViewPile5Player1.setOnMousePressed(evt -> {
			this.gameView.iViewPile5Player1.setEffect(this.gameView.colorAdjustDark);
		});
		this.gameView.iViewPile5Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile5Player1.setEffect(null);
			this.gameView.iViewPile5Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
		});
		this.gameView.iViewPile5Player1.setOnMouseReleased(evt -> {
			this.gameView.iViewPile5Player1.setEffect(null);
			if (player1PlayArea.getPiles()[4].isFull()) {
				System.out.println("Cannot add any more cards to this pile");
			}
			else {
				this.player1PlayArea.getPiles()[4].insertCard(selectedCardFromDeck);
				selectedCardFromDeck = null;
				this.gameView.iViewPile1Player1.setDisable(true);
				this.gameView.iViewPile2Player1.setDisable(true);
				this.gameView.iViewPile3Player1.setDisable(true);
				this.gameView.iViewPile4Player1.setDisable(true);
				this.gameView.iViewPile5Player1.setDisable(true);
				this.gameView.iViewPile5Player1.setImage(new Image("textures/Cards/Blue Card Back.jpg"));
				gameStart();
			}
		});
		this.gameView.iViewPile5Player1.setOnMouseExited(evt -> {
			this.gameView.iViewPile5Player1.setEffect(null);
		});
	}

	public void gameStart() {
		if(player1PlayArea.pilesFull()) {
			this.gameView.iViewPile1Player1.setDisable(false);
			this.gameView.iViewPile2Player1.setDisable(false);
			this.gameView.iViewPile3Player1.setDisable(false);
			this.gameView.iViewPile4Player1.setDisable(false);
			this.gameView.iViewPile5Player1.setDisable(false);
			this.gameView.iViewPile1Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[0].checkCard();
			});
			this.gameView.iViewPile2Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[1].checkCard();
			});
			this.gameView.iViewPile3Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[2].checkCard();
			});
			this.gameView.iViewPile4Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[3].checkCard();
			});
			this.gameView.iViewPile5Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[4].checkCard();
			});
		}
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
