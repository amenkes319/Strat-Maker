package main.java.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import main.java.Global;
import main.java.Map;

public class SelectionController
{
	@FXML private VBox parentVBox;
	@FXML private HBox topHBox, midHBox, bottomHBox;
	@FXML private Button clubBtn, coastBtn, consulateBtn, kafeBtn, oregonBtn, themeBtn, villaBtn;
	
	public void changeToScene()
	{
		try
        {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/resources/fxml/Selection.fxml"));

            loader.setController(this);
            Global.primaryStage.setResizable(true);
            Global.primaryStage.setScene(new Scene(loader.load()));
            Global.primaryStage.centerOnScreen();
            Global.primaryStage.show();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

		init();
	}
	
	private void init()
	{
		topHBox.prefWidthProperty().bind(parentVBox.widthProperty());
		topHBox.prefHeightProperty().bind(parentVBox.heightProperty());

		midHBox.prefWidthProperty().bind(parentVBox.widthProperty());
		midHBox.prefHeightProperty().bind(parentVBox.heightProperty());
		
		bottomHBox.prefWidthProperty().bind(parentVBox.widthProperty());
		bottomHBox.prefHeightProperty().bind(parentVBox.heightProperty());
		
		clubBtn.setOnAction(e -> Global.makerController.changeToScene(Map.CLUBHOUSE));
		clubBtn.prefWidthProperty().bind(parentVBox.widthProperty());
		clubBtn.prefHeightProperty().bind(parentVBox.heightProperty());
		clubBtn.setGraphic(new ImageView("/main/resources/Maps/Clubhouse.png"));
		clubBtn.getStylesheets().add("/main/css/Selection.css");
		clubBtn.getGraphic().prefWidth(clubBtn.getWidth());
		clubBtn.getGraphic().prefHeight(clubBtn.getHeight());
		
		coastBtn.setOnAction(e -> Global.makerController.changeToScene(Map.COASTLINE));
		coastBtn.getStylesheets().add("/main/css/Selection.css");
		coastBtn.setGraphic(new ImageView("/main/resources/Maps/Coastline.png"));
		coastBtn.prefWidthProperty().bind(parentVBox.widthProperty());
		coastBtn.prefHeightProperty().bind(parentVBox.heightProperty());
		
		consulateBtn.setOnAction(e -> Global.makerController.changeToScene(Map.CONSULATE));
		consulateBtn.getStylesheets().add("/main/css/Selection.css");
		consulateBtn.setGraphic(new ImageView("/main/resources/Maps/Consulate.png"));
		consulateBtn.prefWidthProperty().bind(parentVBox.widthProperty());
		consulateBtn.prefHeightProperty().bind(parentVBox.heightProperty());
		
		kafeBtn.setOnAction(e -> Global.makerController.changeToScene(Map.KAFE));
		kafeBtn.getStylesheets().add("/main/css/Selection.css");
		kafeBtn.setGraphic(new ImageView("/main/resources/Maps/Kafe.png"));
		kafeBtn.prefWidthProperty().bind(parentVBox.widthProperty());
		kafeBtn.prefHeightProperty().bind(parentVBox.heightProperty());
		
		oregonBtn.setOnAction(e -> Global.makerController.changeToScene(Map.OREGON));
		oregonBtn.getStylesheets().add("/main/css/Selection.css");
		oregonBtn.setGraphic(new ImageView("/main/resources/Maps/Oregon.png"));
		oregonBtn.prefWidthProperty().bind(parentVBox.widthProperty());
		oregonBtn.prefHeightProperty().bind(parentVBox.heightProperty());
		
		themeBtn.setOnAction(e -> Global.makerController.changeToScene(Map.THEMEPARK));
		themeBtn.getStylesheets().add("/main/css/Selection.css");
		themeBtn.setGraphic(new ImageView("/main/resources/Maps/Themepark.png"));
		themeBtn.prefWidthProperty().bind(parentVBox.widthProperty());
		themeBtn.prefHeightProperty().bind(parentVBox.heightProperty());
		
		villaBtn.setOnAction(e -> Global.makerController.changeToScene(Map.VILLA));
		villaBtn.getStylesheets().add("/main/css/Selection.css");
		villaBtn.setGraphic(new ImageView("/main/resources/Maps/Villa.png"));
//		villaBtn.prefWidth(oregonBtn.getWidth());
//		villaBtn.prefHeight(oregonBtn.getHeight());
		villaBtn.prefWidthProperty().bind(parentVBox.widthProperty());
		villaBtn.prefHeightProperty().bind(parentVBox.heightProperty());
		
	}
	

}
