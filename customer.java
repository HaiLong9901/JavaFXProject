package application;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

import javafx.event.Event;
public class customer {
	@FXML
	private Rectangle drinkRec, fastFoodRec, europeRec, asianRec, creamRec, cakeRec, vegetRec;
	@FXML
	private Text drinkText, fastfoodText, europeText, asianText, creamText, cakeText, vegetText;
	@FXML
	private ImageView drinkImg, fastFoodImg, europeImg, asianImg, creamImg, cakeImg, vegetImg;
	
	private Color color;
	
	@FXML
	private AnchorPane root1;
	
	@FXML
	private Pagination pagination;
	
	private String[] fastfoodArrayList = {"potatoChip1.jpg", "hotdog2.jpg", "sandwick1.jpg", "sandwick2.jpg","potatoChip2.jpg", "pizza1.jpg","potatoChip3.jpg", "pizza2.jpg","potatoChip4.jpg", "hotdog1.jpg", };
	public void Init(String[] a) {
		   pagination.setPageFactory((Callback<Integer, Node>) new Callback<Integer, Node>() {
		       public Node call(Integer pageIndex) {
		           VBox box = new VBox(5);
		           Image testImage = new Image(getClass().getResourceAsStream(a[pageIndex]));
		           
//		           ImageView[] imgView = new ImageView[10];
// 		           for (int i = 0; i < pageIndex + 10; i++) {
// 		        	   imgView[i] = new ImageView(testImage);
// 		        	   imgView[i].setFitWidth(20);
// 		        	   imgView[i].setFitHeight(20);
// 		        	   imgView[i].setSmooth(true);
// 		        	   imgView[i].setCache(true);
//		               box.getChildren().add(imgView[i]);
//		           }
		           ImageView imgView2 = new ImageView(testImage);
		           imgView2.setFitHeight(400);
		           imgView2.setFitWidth(591);
		           box.getChildren().add(imgView2);
		           return box;
		       }
		   });
	}
	
	@FXML
	public void hoverDrink(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			drinkRec.setOpacity(1);
		}
		else {
			drinkRec.setOpacity(0);
		}
	}
	@FXML
	public void hoverFastFood(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			fastFoodRec.setOpacity(1);
		}
		else if(e.getEventType() == MouseEvent.MOUSE_CLICKED) {
			Init(fastfoodArrayList);
		}
		else {
			fastFoodRec.setOpacity(0);
		}
	}
	@FXML
	public void hoverEurope(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			europeRec.setOpacity(1);
		}
		else if(e.getEventType() == MouseEvent.MOUSE_CLICKED) {
			Init(fastfoodArrayList);
		}
		else {
			europeRec.setOpacity(0);
		}
	}
	@FXML
	public void hoverAsian(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			asianRec.setOpacity(1);
		}
		else {
			asianRec.setOpacity(0);
		}
	}
	@FXML
	public void hoverCream(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			creamRec.setOpacity(1);
		}
		else {
			creamRec.setOpacity(0);
		}
	}
	@FXML
	public void hoverCake(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			cakeRec.setOpacity(1);
		}
		else {
			cakeRec.setOpacity(0);
		}
	}
	@FXML
	public void hoverVeget(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			vegetRec.setOpacity(1);
		}
		else {
			vegetRec.setOpacity(0);
		}
	}
//	@FXML
//	public void hoverDrink(MouseEvent e) {
//		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
//			drinkRec.setOpacity(0.3);
//			System.out.println("up");
//		}
//		else {
//			drinkRec.setOpacity(0);
//			drinkRec.setStroke(Color.TRANSPARENT);
//		}
//	}
//	@FXML
//	public void hoverDrink(MouseEvent e) {
//		if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
//			drinkRec.setOpacity(0.3);
//			System.out.println("up");
//		}
//		else {
//			drinkRec.setOpacity(0);
//			drinkRec.setStroke(Color.TRANSPARENT);
//		}
//	}
	public void Close(MouseEvent e) {
		if(e.getEventType() == MouseEvent.MOUSE_CLICKED) {
			Stage stage = (Stage) root1.getScene().getWindow();
			stage.close();
		}
		else if(e.getEventType() == MouseEvent.MOUSE_ENTERED) {
			
		}
		else {
			
		}
	}
}
