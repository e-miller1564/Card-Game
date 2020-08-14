import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller {

	private Stage mainStage;
	private GameView gameView;
	private Scene gameScene;

	public static Card selectedCardFromDeck;

	public Card selectedCard;
	public Pile selectedPile;
	public ImageView selectedCardImageView;

	public Card selectedOpponentCard;
	public Pile selectedOpponentPile;

	private PlayArea player1PlayArea;
	private PlayArea player2PlayArea;

	public Controller(Stage stage) {
		this.gameView = new GameView();
		this.gameScene = new Scene(gameView, 2390, 1000);
		this.mainStage = stage;

		this.player1PlayArea = new PlayArea();
		this.player2PlayArea = new PlayArea();
		populateAIPiles();

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

			this.gameView.hBoxPlayer1Deck.getChildren().add(this.gameView.gameKnowledge);

			this.gameView.iViewPile1Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[0].checkCard();
				selectedPile = player1PlayArea.getPiles()[0];
				selectedCardImageView = this.gameView.iViewPile1Player1;
			});
			this.gameView.iViewPile2Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[1].checkCard();
				selectedPile = player1PlayArea.getPiles()[1];
				selectedCardImageView = this.gameView.iViewPile2Player1;
			});
			this.gameView.iViewPile3Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[2].checkCard();
				selectedPile = player1PlayArea.getPiles()[2];
				selectedCardImageView = this.gameView.iViewPile3Player1;
			});
			this.gameView.iViewPile4Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[3].checkCard();
				selectedPile = player1PlayArea.getPiles()[3];
				selectedCardImageView = this.gameView.iViewPile4Player1;
			});
			this.gameView.iViewPile5Player1.setOnMouseReleased(evt->{
				selectedCard = player1PlayArea.getPiles()[4].checkCard();
				selectedPile = player1PlayArea.getPiles()[4];
				selectedCardImageView = this.gameView.iViewPile5Player1;
			});

			//Make AI Piles clickable
			//Pile 1
			this.gameView.iViewPile1Player2.setOnMouseEntered(evt -> {
				this.gameView.iViewPile1Player2.setEffect(this.gameView.colorAdjustBright);
			});
			this.gameView.iViewPile1Player2.setOnMousePressed(evt -> {
				this.gameView.iViewPile1Player2.setEffect(this.gameView.colorAdjustDark);
			});
			this.gameView.iViewPile1Player2.setOnMouseReleased(evt-> {
				selectedOpponentCard = player2PlayArea.getPiles()[0].checkCard();
				selectedOpponentPile = player2PlayArea.getPiles()[0];
				compareCards();
				if(selectedOpponentPile.isEmpty()) {
					this.gameView.iViewPile1Player2.setImage(new Image("textures/Cards/Empty Pile Game.jpg"));	//make a blank space
					this.gameView.iViewPile1Player2.setDisable(true);
				}

				if(selectedPile.isEmpty()) {
					selectedCardImageView.setImage(new Image("textures/Cards/Empty Pile Game.jpg")); //make a blank space
					this.selectedCardImageView.setDisable(true);
				}
			});
			this.gameView.iViewPile1Player2.setOnMouseExited(evt-> {
				this.gameView.iViewPile1Player2.setEffect(null);
			});

			//Pile 2
			this.gameView.iViewPile2Player2.setOnMouseEntered(evt -> {
				this.gameView.iViewPile2Player2.setEffect(this.gameView.colorAdjustBright);
			});
			this.gameView.iViewPile2Player2.setOnMousePressed(evt -> {
				this.gameView.iViewPile2Player2.setEffect(this.gameView.colorAdjustDark);
			});
			this.gameView.iViewPile2Player2.setOnMouseReleased(evt-> {
				selectedOpponentCard = player2PlayArea.getPiles()[1].checkCard();
				selectedOpponentPile = player2PlayArea.getPiles()[1];
				compareCards();
				if(selectedOpponentPile.isEmpty()) {
					this.gameView.iViewPile2Player2.setImage(new Image("textures/Cards/Empty Pile Game.jpg"));	//make a blank space
					this.gameView.iViewPile2Player2.setDisable(true);
				}

				if(selectedPile.isEmpty()) {
					selectedCardImageView.setImage(new Image("textures/Cards/Empty Pile Game.jpg")); //make a blank space
					this.selectedCardImageView.setDisable(true);
				}
			});
			this.gameView.iViewPile2Player2.setOnMouseExited(evt-> {
				this.gameView.iViewPile2Player2.setEffect(null);
			});

			//Pile 3
			this.gameView.iViewPile3Player2.setOnMouseEntered(evt -> {
				this.gameView.iViewPile3Player2.setEffect(this.gameView.colorAdjustBright);
			});
			this.gameView.iViewPile3Player2.setOnMousePressed(evt -> {
				this.gameView.iViewPile3Player2.setEffect(this.gameView.colorAdjustDark);
			});
			this.gameView.iViewPile3Player2.setOnMouseReleased(evt-> {
				selectedOpponentCard = player2PlayArea.getPiles()[2].checkCard();
				selectedOpponentPile = player2PlayArea.getPiles()[2];
				compareCards();
				if(selectedOpponentPile.isEmpty()) {
					this.gameView.iViewPile3Player2.setImage(new Image("textures/Cards/Empty Pile Game.jpg"));	//make a blank space
					this.gameView.iViewPile3Player2.setDisable(true);
				}

				if(selectedPile.isEmpty()) {
					selectedCardImageView.setImage(new Image("textures/Cards/Empty Pile Game.jpg")); //make a blank space
					this.selectedCardImageView.setDisable(true);
				}
			});
			this.gameView.iViewPile3Player2.setOnMouseExited(evt-> {
				this.gameView.iViewPile3Player2.setEffect(null);
			});

			//Pile 4
			this.gameView.iViewPile4Player2.setOnMouseEntered(evt -> {
				this.gameView.iViewPile4Player2.setEffect(this.gameView.colorAdjustBright);
			});
			this.gameView.iViewPile4Player2.setOnMousePressed(evt -> {
				this.gameView.iViewPile4Player2.setEffect(this.gameView.colorAdjustDark);
			});
			this.gameView.iViewPile4Player2.setOnMouseReleased(evt-> {
				selectedOpponentCard = player2PlayArea.getPiles()[3].checkCard();
				selectedOpponentPile = player2PlayArea.getPiles()[3];
				compareCards();
				if(selectedOpponentPile.isEmpty()) {
					this.gameView.iViewPile4Player2.setImage(new Image("textures/Cards/Empty Pile Game.jpg"));	//make a blank space
					this.gameView.iViewPile4Player2.setDisable(true);
				}

				if(selectedPile.isEmpty()) {
					selectedCardImageView.setImage(new Image("textures/Cards/Empty Pile Game.jpg")); //make a blank space
					this.selectedCardImageView.setDisable(true);
				}
			});
			this.gameView.iViewPile4Player2.setOnMouseExited(evt-> {
				this.gameView.iViewPile4Player2.setEffect(null);
			});

			//Pile 5
			this.gameView.iViewPile5Player2.setOnMouseEntered(evt -> {
				this.gameView.iViewPile5Player2.setEffect(this.gameView.colorAdjustBright);
			});
			this.gameView.iViewPile5Player2.setOnMousePressed(evt -> {
				this.gameView.iViewPile5Player2.setEffect(this.gameView.colorAdjustDark);
			});
			this.gameView.iViewPile5Player2.setOnMouseReleased(evt-> {
				selectedOpponentCard = player2PlayArea.getPiles()[4].checkCard();
				selectedOpponentPile = player2PlayArea.getPiles()[4];
				compareCards();
				if(selectedOpponentPile.isEmpty()) {
					this.gameView.iViewPile5Player2.setImage(new Image("textures/Cards/Empty Pile Game.jpg"));	//make a blank space
					this.gameView.iViewPile5Player2.setDisable(true);
				}

				if(selectedPile.isEmpty()) {
					selectedCardImageView.setImage(new Image("textures/Cards/Empty Pile Game.jpg")); //make a blank space
					this.selectedCardImageView.setDisable(true);
				}
			});
			this.gameView.iViewPile5Player2.setOnMouseExited(evt-> {
				this.gameView.iViewPile5Player2.setEffect(null);
			});
		}
	}

	public static void setSelectedCardFromDeck(Card c) {
		selectedCardFromDeck = c;
	}

	public static Card getSelectedCardFromDeck() {
		return selectedCardFromDeck;
	}

	public void populateAIPiles() {
		Deck aiDeck = new Deck();
		int randomPile = randomPile();
		Card aiCrownCard = aiDeck.getDeck().get(0);
		player2PlayArea.getPiles()[randomPile].insertCard(aiCrownCard);
		aiDeck.getDeck().remove(aiCrownCard);

		for(Card c : aiDeck.getDeck()) {
			randomPile = randomPile();
			if(player2PlayArea.getPiles()[randomPile].isFull()) {
				randomPile = randomPile();
			}
			else {
				player2PlayArea.getPiles()[randomPile].insertCard(c);
			}
		}
	}

	public int randomPile() {
		return (int) (Math.random() * 5);
	}

	public void compareCards() {
		int compare = selectedCard.compareTo(selectedOpponentCard);
		switch (compare) {
			case -2:
				selectedPile.removeCard();
				selectedOpponentPile.removeCard();
				break;
			case -1:
				selectedPile.removeCard();
				break;
			case 0:
				break;
			case 1:
				selectedOpponentPile.removeCard();
				break;
			case 2:
				break;
		}
	}

	public void start() {
		mainStage.show();
	}

}
