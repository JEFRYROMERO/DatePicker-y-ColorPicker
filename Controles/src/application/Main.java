package application;
	
import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;

public class Main extends Application {
	
	
	
	@Override
	public void init () {
		System.out.println("metodo init:");
		
	
	}
	@Override
	public void start(Stage primaryStage) {
		
		
		//creacion de las  etiquetas
		Label fecha = new Label("SELECCCIONA UNA FECHA: ");
		Label labelColor = new Label("SELECCIONA UN COLOR: ");
		
		// Creacion del DatePicker y ColorPicker 
		DatePicker seleccion_fecha = new DatePicker();
		ColorPicker seleccion_color = new ColorPicker();
	
		
		//Crear Boton
		
		Button boton = new Button("Confirmar");
		
		//GUARDA AL PRESIONAR EL BOTON 
		boton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			
			public void handle(ActionEvent event) {
				
				LocalDate date =  seleccion_fecha.getValue();
				Color color = seleccion_color.getValue();
				
				
				
		                System.out.println("FECHA SELECCIONADA: " + date);
		                System.out.println("COLOR SELECCIONADO: " + color);
				
				
				
			}
			
		});
		
		// Crear VBox para organizar los controles
        VBox root = new VBox(10); // Espaciado vertical 
        root.setAlignment(Pos.CENTER); // Centrar los controles verticalmente
        root.setPadding(new Insets(20)); // Añadir espacio alrededor del VBox
        root.getChildren().addAll(fecha,seleccion_fecha, labelColor,  seleccion_color, boton);

		
		
		
		
		
		 Scene scene = new Scene(root, 300, 200); // Tamaño de la escena: ancho x alto
	        primaryStage.setScene(scene);

	        // Configurar título de la ventana
	        primaryStage.setTitle("Seleccionar Fecha y Color");

		
	        primaryStage.show();
	}
	
	
	
	
	
	
	@Override
	public void stop () {
		System.out.println("metodo stop:");
		
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
