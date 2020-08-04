import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class GameView extends BorderPane {

	public Deck player1Deck;
	// public Deck player2Deck;		add when we are finished getting Player vs AI working properly
	public HBox hBoxPlayer1Deck;
	// public HBox hBoxPlayer2Deck;
	public VBox vBoxPlayArea;
	public HBox hBoxPlayer1PlayArea;
	public HBox hBoxPlayer2PlayArea;
	public GridPane gPanePlayer1Piles;
	public GridPane gPanePlayer2Piles;

	public ImageView iViewEmptyPile1Player1;
	public ImageView iViewEmptyPile2Player1;
	public ImageView iViewEmptyPile3Player1;
	public ImageView iViewEmptyPile4Player1;
	public ImageView iViewEmptyPile5Player1;

	public ImageView iViewEmptyPile1Player2;
	public ImageView iViewEmptyPile2Player2;
	public ImageView iViewEmptyPile3Player2;
	public ImageView iViewEmptyPile4Player2;
	public ImageView iViewEmptyPile5Player2;

	public ColorAdjust colorAdjustBright;
	public ColorAdjust colorAdjustDark;

	public GameView() {
		player1Deck = new Deck();
		// player2Deck = new Deck();

		hBoxPlayer1Deck = new HBox();
		// hBoxPlayer2Deck = new HBox();
		vBoxPlayArea = new VBox();
		hBoxPlayer1PlayArea = new HBox();
		hBoxPlayer2PlayArea = new HBox();
		gPanePlayer1Piles = new GridPane();
		gPanePlayer2Piles = new GridPane();

		iViewEmptyPile1Player1 = new ImageView(new Image("textures/Cards/Empty Pile.jpg"));
		iViewEmptyPile2Player1 = new ImageView(new Image("textures/Cards/Empty Pile.jpg"));
		iViewEmptyPile3Player1 = new ImageView(new Image("textures/Cards/Empty Pile.jpg"));
		iViewEmptyPile4Player1 = new ImageView(new Image("textures/Cards/Empty Pile.jpg"));
		iViewEmptyPile5Player1 = new ImageView(new Image("textures/Cards/Empty Pile.jpg"));

		iViewEmptyPile1Player1.setDisable(true);
		iViewEmptyPile2Player1.setDisable(true);
		iViewEmptyPile3Player1.setDisable(true);
		iViewEmptyPile4Player1.setDisable(true);
		iViewEmptyPile5Player1.setDisable(true);

		iViewEmptyPile1Player2 = new ImageView(new Image("textures/Cards/Red Card Back.jpg"));
		iViewEmptyPile2Player2 = new ImageView(new Image("textures/Cards/Red Card Back.jpg"));
		iViewEmptyPile3Player2 = new ImageView(new Image("textures/Cards/Red Card Back.jpg"));
		iViewEmptyPile4Player2 = new ImageView(new Image("textures/Cards/Red Card Back.jpg"));
		iViewEmptyPile5Player2 = new ImageView(new Image("textures/Cards/Red Card Back.jpg"));

		colorAdjustBright = new ColorAdjust();
		colorAdjustDark = new ColorAdjust();

		hBoxPlayer1Deck.setSpacing(5);
		for(Card c : player1Deck.getDeck()) {
			ImageView frontCardImageView = c.getFrontCardImage();
			frontCardImageView.setFitHeight(140);
			frontCardImageView.setFitWidth(90);
			frontCardImageView.setOnMouseEntered(evt->{
				frontCardImageView.setEffect(colorAdjustBright);
			});
			frontCardImageView.setOnMouseExited(evt->{
				frontCardImageView.setEffect(null);
			});
			frontCardImageView.setOnMousePressed(evt->{
				//this is a test commit
				//this is a test commit x2
				frontCardImageView.setEffect(colorAdjustDark);
			});
			frontCardImageView.setOnMouseReleased(evt->{
				if(Controller.getSelectedCardFromDeck() == null) {
					iViewEmptyPile1Player1.setDisable(false);
					iViewEmptyPile2Player1.setDisable(false);
					iViewEmptyPile3Player1.setDisable(false);
					iViewEmptyPile4Player1.setDisable(false);
					iViewEmptyPile5Player1.setDisable(false);
					Controller.setSelectedCardFromDeck(c);
					hBoxPlayer1Deck.getChildren().remove(frontCardImageView);
				}
				else {
					System.out.println("There is already a card in your hand");
				}
			});
			hBoxPlayer1Deck.getChildren().add(frontCardImageView);
		}

		// hBoxPlayer2Deck.setSpacing(5);
		// for(Card c : player2Deck.getDeck()) {
		// 	ImageView frontCardImageView = c.getFrontCardImage();
		// 	frontCardImageView.setFitHeight(140);
		// 	frontCardImageView.setFitWidth(90);
		// 	hBoxPlayer2Deck.getChildren().add(frontCardImageView);
		// }

		gPanePlayer1Piles.setPadding(new Insets(10));
		gPanePlayer1Piles.setHgap(5);
		gPanePlayer1Piles.add(iViewEmptyPile1Player1, 0, 0);
		gPanePlayer1Piles.add(iViewEmptyPile2Player1, 1, 0);
		gPanePlayer1Piles.add(iViewEmptyPile3Player1, 2, 0);
		gPanePlayer1Piles.add(iViewEmptyPile4Player1, 3, 0);
		gPanePlayer1Piles.add(iViewEmptyPile5Player1, 4, 0);

		gPanePlayer2Piles.setPadding(new Insets(10));
		gPanePlayer2Piles.setHgap(5);
		gPanePlayer2Piles.add(iViewEmptyPile1Player2, 0, 0);
		gPanePlayer2Piles.add(iViewEmptyPile2Player2, 1, 0);
		gPanePlayer2Piles.add(iViewEmptyPile3Player2, 2, 0);
		gPanePlayer2Piles.add(iViewEmptyPile4Player2, 3, 0);
		gPanePlayer2Piles.add(iViewEmptyPile5Player2, 4, 0);

		hBoxPlayer1PlayArea.getChildren().add(gPanePlayer1Piles);
		hBoxPlayer1PlayArea.setAlignment(Pos.CENTER);
		hBoxPlayer2PlayArea.getChildren().add(gPanePlayer2Piles);
		hBoxPlayer2PlayArea.setAlignment(Pos.CENTER);

		colorAdjustBright.setBrightness(0.5);
		colorAdjustDark.setBrightness(-0.5);

		vBoxPlayArea.getChildren().addAll(hBoxPlayer2PlayArea, hBoxPlayer1PlayArea);
		vBoxPlayArea.setAlignment(Pos.CENTER);

		this.setBackground(new Background(new BackgroundImage(new Image("textures/Game Background.jpg"), null, null, null, new BackgroundSize(100, 100, true, true, true, true))));
		this.setPadding(new Insets(10));
		// this.setTop(hBoxPlayer2Deck);
		this.setCenter(vBoxPlayArea);
		this.setBottom(hBoxPlayer1Deck);

	}
}
