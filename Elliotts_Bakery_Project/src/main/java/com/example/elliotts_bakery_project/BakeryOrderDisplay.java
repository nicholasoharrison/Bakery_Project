package com.example.elliotts_bakery_project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.controlsfx.control.spreadsheet.Grid;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BakeryOrderDisplay extends Application {

    ArrayList<Item> items = new ArrayList<Item>();
    double price = 0;
    String name;
    String phoneNum;

    @Override
    public void start(Stage stage) throws IOException {



        //Stage and Main Layout--------------------------------------------------
        stage.setTitle("Elliott's Bakery");
        stage.setMinHeight(450);
        stage.setMinWidth(550);
        stage.setMaxHeight(450);
        stage.setMaxWidth(550);
        BorderPane mainGrid = new BorderPane();
        mainGrid.setPadding(new Insets(30));
        Label txtTotalDisplay = new Label("Total: $" + price);
        Button btnComplete = new Button("Complete Order");
        HBox buttons = new HBox(txtTotalDisplay, btnComplete);
        buttons.setSpacing(30);
        //----------------------------------------------------------------------



        //Main Screen-------------------------------------------------------------
        Button btnDonuts = new Button("Donuts");
        btnDonuts.setMinHeight(100);
        btnDonuts.setMinWidth(100);
        Button btnCookies = new Button("Cookies");
        btnCookies.setMinHeight(100);
        btnCookies.setMinWidth(100);
        Button btnPastriesPies = new Button("Pastries/Pies");
        btnPastriesPies.setMinHeight(100);
        btnPastriesPies.setMinWidth(100);
        Button btnBreads = new Button("Breads");
        btnBreads.setMinHeight(100);
        btnBreads.setMinWidth(100);
        GridPane mainScreen = new GridPane();
        mainScreen.add(btnDonuts,0,0);
        mainScreen.add(btnCookies,1,0);
        mainScreen.add(btnPastriesPies,0,1);
        mainScreen.add(btnBreads,1,1);
        mainScreen.setVgap(30);
        mainScreen.setHgap(30);
        mainScreen.setPadding(new Insets(30));
        //---------------------------------------------------------------------------------



        //Donut Screen---------------------------------------------------------------------
        Button btnYeastSignatureDoz = new Button("Yeast/Signature\nDozen");
        btnYeastSignatureDoz.setMinHeight(100);
        btnYeastSignatureDoz.setMinWidth(100);
        Button btnYeastSignatureHalfDoz = new Button("Yeast/Signature\nHalf Dozen");
        btnYeastSignatureHalfDoz.setMinHeight(100);
        btnYeastSignatureHalfDoz.setMinWidth(100);
        Button btnYeastSignatureDonut = new Button("Yeast/Signature\nDonut");
        btnYeastSignatureDonut.setMinHeight(100);
        btnYeastSignatureDonut.setMinWidth(100);
        Button btnCakeDoz = new Button("Cake\nDozen");
        btnCakeDoz.setMinHeight(100);
        btnCakeDoz.setMinWidth(100);
        Button btnCakeHalfDoz = new Button("Cake\nHalf Dozen");
        btnCakeHalfDoz.setMinHeight(100);
        btnCakeHalfDoz.setMinWidth(100);
        Button btnCakeDonut = new Button("Cake\nDonut");
        btnCakeDonut.setMinHeight(100);
        btnCakeDonut.setMinWidth(100);
        GridPane gridDonut = new GridPane();
        gridDonut.add(btnYeastSignatureDoz, 0,0);
        gridDonut.add(btnYeastSignatureHalfDoz, 1,0);
        gridDonut.add(btnYeastSignatureDonut, 2,0);
        gridDonut.add(btnCakeDoz, 0,1);
        gridDonut.add(btnCakeHalfDoz, 1,1);
        gridDonut.add(btnCakeDonut, 2,1);
        gridDonut.setPadding(new Insets(30));
        gridDonut.setHgap(30);
        gridDonut.setVgap(30);
        //----------------------------------------------------------------------------------



        //Cookie Screen----------------------------------------------------------------------
        Button btnDozenCookies = new Button("Cookies\nDozen");
        btnDozenCookies.setMinHeight(100);
        btnDozenCookies.setMinWidth(100);
        Button btnHalfDozenCookies = new Button("Cookies\nHalf Dozen");
        btnHalfDozenCookies.setMinHeight(100);
        btnHalfDozenCookies.setMinWidth(100);
        Button btnSingleCookie = new Button("Cookie");
        btnSingleCookie.setMinHeight(100);
        btnSingleCookie.setMinWidth(100);
        Button btnRoyalPrintedCookie = new Button("Royal Icing/\nPrinted Cutouts");
        btnRoyalPrintedCookie.setMinHeight(100);
        btnRoyalPrintedCookie.setMinWidth(100);
        GridPane gridCookie = new GridPane();
        gridCookie.add(btnDozenCookies, 0,0);
        gridCookie.add(btnHalfDozenCookies, 1,0);
        gridCookie.add(btnSingleCookie, 0,1);
        gridCookie.add(btnRoyalPrintedCookie, 1,1);
        gridCookie.setPadding(new Insets(30));
        gridCookie.setHgap(30);
        gridCookie.setVgap(30);
        //------------------------------------------------------------------------------



        //Pastries/Pies Screen--------------------------------------------------------------
        Button btnCheesecake = new Button("Cheesecake");
        btnCheesecake.setMinHeight(100);
        btnCheesecake.setMinWidth(100);
        Button btnCannoli = new Button("Cannoli");
        btnCannoli.setMinHeight(100);
        btnCannoli.setMinWidth(100);
        Button btnApplePie = new Button("Apple\nPie");
        btnApplePie.setMinHeight(100);
        btnApplePie.setMinWidth(100);
        Button btnPumpkinPie = new Button("Pumpkin\nPie");
        btnPumpkinPie.setMinHeight(100);
        btnPumpkinPie.setMinWidth(100);
        Button btnPieSlice = new Button("Pie\nSlice");
        btnPieSlice.setMinHeight(100);
        btnPieSlice.setMinWidth(100);
        Button btnEclair = new Button("Eclair");
        btnEclair.setMinHeight(100);
        btnEclair.setMinWidth(100);
        GridPane gridPastriesPies = new GridPane();
        gridPastriesPies.add(btnCheesecake, 0,0);
        gridPastriesPies.add(btnCannoli, 1,0);
        gridPastriesPies.add(btnApplePie, 2,0);
        gridPastriesPies.add(btnPumpkinPie, 0,1);
        gridPastriesPies.add(btnPieSlice, 1,1);
        gridPastriesPies.add(btnEclair, 2,1);
        gridPastriesPies.setPadding(new Insets(30));
        gridPastriesPies.setHgap(30);
        gridPastriesPies.setVgap(30);
        //---------------------------------------------------------------------------------



        //Breads Screen-----------------------------------------------------------------------
        Button btnRye = new Button("Rye");
        btnRye.setMinHeight(100);
        btnRye.setMinWidth(100);
        Button btnPumpernickle = new Button("Pumpernickle");
        btnPumpernickle.setMinHeight(100);
        btnPumpernickle.setMinWidth(100);
        Button btnWholeWheat = new Button("Whole Wheat");
        btnWholeWheat.setMinHeight(100);
        btnWholeWheat.setMinWidth(100);
        Button btnRaisin = new Button("Raisin");
        btnRaisin.setMinHeight(100);
        btnRaisin.setMinWidth(100);
        Button btnWhite = new Button("White");
        btnWhite.setMinHeight(100);
        btnWhite.setMinWidth(100);
        Button btnCinnamon = new Button("Cinnamon");
        btnCinnamon.setMinHeight(100);
        btnCinnamon.setMinWidth(100);
        GridPane gridBread = new GridPane();
        gridBread.add(btnRye, 0,0);
        gridBread.add(btnPumpernickle, 1,0);
        gridBread.add(btnWholeWheat, 2,0);
        gridBread.add(btnRaisin, 0,1);
        gridBread.add(btnWhite, 1,1);
        gridBread.add(btnCinnamon, 2,1);
        gridBread.setPadding(new Insets(30));
        gridBread.setHgap(30);
        gridBread.setVgap(30);
        //-----------------------------------------------------------------------------------



        //Name and Number Stage--------------------------------------------------------------
        GridPane nameNumGrid = new GridPane();
        Label lblName = new Label("Name: ");
        Label lblNumber = new Label("Number: ");
        Label lblError = new Label("");
        TextField txtName = new TextField();
        TextField txtNum = new TextField();
        Button btnSubmit = new Button("Submit");
        nameNumGrid.add(lblName,0,0);
        nameNumGrid.add(lblNumber, 0,1);
        nameNumGrid.add(txtName, 1,0);
        nameNumGrid.add(txtNum, 1,1);
        nameNumGrid.add(lblError, 0,2);
        nameNumGrid.add(btnSubmit, 2,2);
        mainGrid.setCenter(nameNumGrid);

        Scene scene = new Scene(mainGrid);
        stage.setScene(scene);
        stage.show();





        btnSubmit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(txtName.getText().equals(""))
                {
                    lblError.setText("Please enter a name.");
                    return;
                }
                if(txtNum.getText().equals(""))
                {
                    lblError.setText("Please enter a phone number.");
                    return;
                }
                if(txtNum.getLength() !=10)
                {
                    lblError.setText("Please enter a 10 digit phone number.");
                    return;
                }

                name = txtName.getText();
                phoneNum = txtNum.getText();
                mainGrid.setBottom(buttons);
                mainGrid.setCenter(mainScreen);
            }
        });
        //----------------------------------------------------------------------------------



        //Scene and Stage Set-up--------------------------------------------------------------
/*
        mainGrid.setCenter(mainScreen);
        mainGrid.setBottom(buttons);
        Scene scene = new Scene(mainGrid);
        stage.setScene(scene);
        stage.show();*/
        //-------------------------------------------------------------------------------------



        //Main Screen Events----------------------------------------------------------------
        btnDonuts.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mainGrid.setCenter(gridDonut);
            }
        });
        btnCookies.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mainGrid.setCenter(gridCookie);
            }
        });
        btnPastriesPies.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mainGrid.setCenter(gridPastriesPies);
            }
        });
        btnBreads.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mainGrid.setCenter(gridBread);
            }
        });
        //--------------------------------------------------------------------------------



        //Donuts Events-------------------------------------------------------------------
        btnYeastSignatureDoz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=20.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Donut(20.00, "Yeast/Signature Dozen"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnYeastSignatureHalfDoz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=10.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Donut(10.50, "Yeast/Signature Half Dozen"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnYeastSignatureDonut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=2.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Donut(2.00, "Yeast/Signature Donut"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnCakeDoz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=16.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Donut(16.00, "Cake Donut Dozen"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnCakeHalfDoz.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=8.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Donut(8.00, "Cake Donut Half Dozen"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnCakeDonut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=1.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Donut(1.50, "Cake Donut"));
                mainGrid.setCenter(mainScreen);
            }
        });
        //-------------------------------------------------------------------------------



        //Cookies Events--------------------------------------------------------------------
        btnDozenCookies.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=16.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Cookie(16.00, "Dozen Cookies"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnHalfDozenCookies.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=8.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Cookie(8.00, "Half Dozen Cookies"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnSingleCookie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=1.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Cookie(1.50, "Single Cookie"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnRoyalPrintedCookie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=2.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Cookie(2.50, "Royal Icing/Printed Cut-out Cookie"));
                mainGrid.setCenter(mainScreen);
            }
        });
        //---------------------------------------------------------------------------------



        //Pastries/Pies Events----------------------------------------------------------------
        btnCheesecake.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new PastryPie(3.50, "Cheesecake"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnCannoli.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new PastryPie(3.50, "Cannoli"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnApplePie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=14.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new PastryPie(14.00, "Apple Pie"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnPumpkinPie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=21.00;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new PastryPie(21.00, "Pumpkin Pie"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnPieSlice.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new PastryPie(3.50, "Pie Slice"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnEclair.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new PastryPie(3.50, "Eclair"));
                mainGrid.setCenter(mainScreen);
            }
        });
        //----------------------------------------------------------------------------------



        //Breads Events---------------------------------------------------------------------
        btnRye.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.25;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Bread(3.25, "Rye Bread"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnPumpernickle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.25;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Bread(3.25, "Pumpernickle Bread"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnWholeWheat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.25;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Bread(3.25, "Whole Wheat Bread"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnRaisin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=4.50;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Bread(4.50, "Raisin Bread"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnWhite.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=3.25;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Bread(3.25, "White Bread"));
                mainGrid.setCenter(mainScreen);
            }
        });
        btnCinnamon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                price+=7.25;
                txtTotalDisplay.setText("Total: $" + price);
                items.add(new Bread(7.25, "Cinnamon Bread"));
                mainGrid.setCenter(mainScreen);
            }
        });
        //----------------------------------------------------------------------------------



        //Receipt Stage--------------------------------------------------------------------
        Stage receiptStage = new Stage();
        receiptStage.setTitle("Receipt");
        receiptStage.setMinHeight(600);
        receiptStage.setMaxHeight(600);
        receiptStage.setMinWidth(400);
        receiptStage.setMaxWidth(400);
        Label lblReceipt = new Label("");
        Scene receiptScene = new Scene(lblReceipt);
        //---------------------------------------------------------------------------------


        //Complete Order Event-------------------------------------------------------------
        btnComplete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Person person = new Person(name, phoneNum);
                Order order = new Order(person, items);
            try
            {
                FileWriter fileWriter = new FileWriter("Receipt.txt");
                fileWriter.write(order.getPerson()+"\n\n");
                for(int i=0; i<items.size(); i++)
                {
                    fileWriter.write(items.get(i) + "\n\n");
                }
                fileWriter.write("\nSubtotal: $" + price);
                fileWriter.write("\nTax:      $" + price*0.06);
                fileWriter.write("\nTotal:    $" + (price*1.06));
                fileWriter.close();
                System.out.println("File successfully written.");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            try
            {
                File readingFile = new File("Receipt.txt");
                Scanner reader = new Scanner(readingFile);
                reader.useDelimiter("[\\n]");
                String tempReceipt = "";
                while(reader.hasNext())
                {
                    tempReceipt+=reader.next();
                    tempReceipt+="\n";
                }
                lblReceipt.setText(tempReceipt);
            }
            catch(Exception e)
            {

            }
                receiptStage.setScene(receiptScene);
                receiptStage.show();
                stage.close();
            }

        });
        //---------------------------------------------------------------------------------

    }

    public static void main(String[] args) {
        launch();
    }
}