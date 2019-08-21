
package tesan_oils;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.image.*;
import javafx.scene.paint.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import javafx.collections.*;

import java.io.*;
//import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javafx.animation.FadeTransition;
import javafx.scene.input.*;
import javafx.scene.web.*;
import javafx.beans.binding.*;
import javafx.print.PrinterJob;
import javafx.util.Duration;
//import org.apache.commons.io.FileUtils;
//import javafx.stage.*;
//import np.com.ngopal.control.AutoFillTextBox;

public class TESAN_OILS extends Application {
    private Stage dialog; private String stry,stry1,stry2,stre,stre1,stre2; private Properties pri; private Stage dialog1;
    private Properties pr; private List<String> list; int total=0; private GridPane log; private int q; private Stage ste;
    private String uuss; private String rpst; private double yoffset; private double xoffset;
    
    //program methods
    public void svvr(List ls,Properties pp) throws Exception {
        //Reading trsn id file
        FileInputStream in=new FileInputStream("trid.dll");
        ObjectInputStream obin=new ObjectInputStream(in);
        int y=(int) obin.readObject(); System.out.println(y);
        
        //making date to be strored
        Calendar cl=new GregorianCalendar(); int d=cl.get(Calendar.DAY_OF_MONTH); int m=cl.get(Calendar.MONTH)+1;
        String dbdat=d+"/"+m+"/"+y+"|"+cl.get(Calendar.HOUR)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND); System.out.println(dbdat);
        
        //storing data in strct
        if(q<=ls.size()){
            y=y+1; q=q+1;
            pp.put(dbdat+" | "+y,ls.get(q));
            
            //writing int ob file with current value
            FileOutputStream ft=new FileOutputStream("trid.dll");
            ObjectOutputStream obt=new ObjectOutputStream(ft);
            obt.writeObject(y);
            
            System.out.println(y+"  "+q);
        }
    }
    
    @Override
    @SuppressWarnings({"ConvertToTryWithResources", "element-type-mismatch"})
    public void start(Stage Stage) throws Exception { 
        //Stage styles
        Stage.setResizable(false); Stage.setWidth(987); Stage.setHeight(617); Stage.initStyle(StageStyle.UNDECORATED);
        Image icc=new Image(new FileInputStream("Tcn.png"));     
        Image icon=new Image(new FileInputStream("EXTREME.png"));      Stage.getIcons().addAll(icon);           
        //lenear colors
        Stop[] stops=new Stop[]{
            new Stop(0,Color.NAVY),new Stop(1,Color.BLACK)
        };LinearGradient ln1=new LinearGradient(23,17,19,18,true,CycleMethod.REFLECT,stops);
        //backgrounds
        BackgroundSize bs=new BackgroundSize(90,90,true,true,true,false);
        BackgroundImage bim=new BackgroundImage(icon,BackgroundRepeat.ROUND,BackgroundRepeat.ROUND,BackgroundPosition.CENTER,bs);
        Background bgi=new Background(bim);
        
        BackgroundFill bf1=new BackgroundFill(ln1,new CornerRadii(0),new Insets(0,0,0,0)); Background bg1=new Background(bf1);
        BackgroundFill bf2=new BackgroundFill(Color.NAVY,new CornerRadii(0),new Insets(0,0,0,0)); Background bg2=new Background(bf2);
        BackgroundFill bf3=new BackgroundFill(Color.NAVY,new CornerRadii(0),new Insets(0,0,0,0)); Background bg3=new Background(bf3);

        //Labels and Texts
      Text Cname=new Text("SeumX Plus (C) 2019. All rights reserved"); Text slog=new Text("Your IT Solutions");
      Cname.setStyle("-fx-font:normal 18px 'Cambria';"); Cname.setFill(Color.WHITE);
      GridPane tt=new GridPane();tt.setVgap(5);tt.setHgap(5);tt.setAlignment(Pos.BOTTOM_CENTER);tt.setOpacity(1);tt.setBackground(bg2);
      tt.add(Cname,0,0);
      
      //texting trial version exxpiry
      /*int bu=0; int cu=0; int gu; 
      File exp=new File("WindowsSystemFile1/trlex.dll"); File gyt=new File("WindowsSystemFile1");
      if(exp.exists()) {
          FileInputStream lhj=new FileInputStream(exp);
          ObjectInputStream ong=new ObjectInputStream(lhj);
          cu=(int) ong.readObject(); bu=91-cu;
          
          //writing value
          gu=cu+1;
          FileOutputStream iuj=new FileOutputStream(exp);
          ObjectOutputStream onl=new ObjectOutputStream(iuj);
          onl.writeObject(gu);
          
      } else {
          gyt.mkdirs();
          int a=0;
          FileOutputStream rui=new FileOutputStream(exp);
          ObjectOutputStream obnk=new ObjectOutputStream(rui);
          obnk.writeObject(a);
      }*/
      
      //login screen
      Text uty=new Text("User Type"); uty.setStyle("-fx-font:bold 20px 'Cambria'"); uty.setFill(Color.VIOLET);
      Text usr=new Text("Username"); usr.setStyle("-fx-font:bold 20px 'Cambria'"); usr.setFill(Color.VIOLET);
      Text pas=new Text("Password"); pas.setStyle("-fx-font:bold 20px 'Cambria'"); pas.setFill(Color.VIOLET);
      Text lgr=new Text("Login attempt failed\n Wrong username Or Password"); lgr.setStyle("-fx-font:bold 15px 'Cambria'"); 
      Text adf=new Text("Please contact System Administrator\nto reset your password"); adf.setStyle("-fx-font:bold 15px 'Cambria'"); 
      lgr.setFill(Color.RED); adf.setFill(Color.RED);
      Hyperlink fgt=new Hyperlink("Forgot password"); 
      fgt.setStyle("-fx-font:bold italic 18px 'constantia'; -fx-text-fill:slateblue");
      
      ChoiceBox ch=new ChoiceBox();
      ch.getItems().addAll("Administrator","Sales");ch.setPrefWidth(170); ch.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:azure");
      TextField uf=new TextField(); uf.setPrefWidth(170); uf.setStyle("-fx-font:normal 15px 'Cambria'");
      PasswordField pf=new PasswordField(); pf.setPrefWidth(170);
      
      Button lg=new Button("Login"); lg.setStyle("-fx-font:bold 20px 'Cambria'; -fx-background-color:darkviolet; -fx-text-fill:ivory");
      lg.setPrefWidth(150);
      lg.setPrefSize(150,25); Label sl=new Label("STAFF LOGIN");sl.setStyle("-fx-font:bold 31px 'Cambria';-fx-text-fill:slateblue");
      
      log=new GridPane(); log.setVgap(15.5); log.setHgap(8.5); log.setPadding(new Insets(2,2,2,2)); log.setAlignment(Pos.CENTER);
      log.setBackground(bg1); log.setOpacity(0.8); log.add(sl,1,0); log.add(uty,0,1); log.add(ch,1,1); log.add(usr,0,2); log.add(uf,1,2); 
      log.add(pas,0,3); log.add(pf,1,3); log.add(lg,1,5); log.add(fgt,1,6);
      
      
      //Handling exp
      /*Label expp=new Label("Your trial version has expired. \nPlease contact Administrators \nto purchase a full version.");
      Label expi=new Label("You are remaining with "+bu+" attempts \nto expire your trial version.\n Please purchase full version.");
      expp.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:darkred");
      expi.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:darkred");
      
      if(cu>75 && cu<91) {
          log.add(expi,1,11);
      }
       if(cu>=91) {
           log.add(expp,1,11); pf.setDisable(true); lg.setDisable(true); ch.setDisable(true); uf.setDisable(true); fgt.setDisable(true); 
       }*/
      
      //headerPane
      Text hd=new Text("SeumX Business Manager"); hd.setFill(Color.ALICEBLUE); hd.setStyle("-fx-font:bold 47px 'Algerian'");
      //Text hdd=new Text("Where Quality Matters"); hdd.setFill(Color.ALICEBLUE); hdd.setStyle("-fx-font:bold 37px 'Lucida Calligraphy'");
      ImageView ver=new ImageView(icon); ver.setFitWidth(59.9); ver.setFitHeight(59.9);
      Button cls=new Button("X"); cls.setStyle("-fx-font:normal 19px 'Cambria'; -fx-background-color:lightsteelblue; -fx-text-fill:navy");
      Button min=new Button("_"); min.setStyle("-fx-font:normal 19px 'Cambria'; -fx-background-color:lightsteelblue; -fx-text-fill:navy");
      GridPane l=new GridPane(); l.setVgap(0); l.setHgap(0); l.setPadding(new Insets(0,0,0,0)); l.setAlignment(Pos.CENTER);
      l.setStyle("-fx-background-color:navy"); l.add(ver,0,0);
      GridPane r=new GridPane(); r.setVgap(0); r.setHgap(4); r.setPadding(new Insets(0,0,0,0)); r.setAlignment(Pos.CENTER);
      r.setStyle("-fx-background-color:navy"); r.add(min,0,0); r.add(cls,1,0);
      
      GridPane hhd=new GridPane(); hhd.setVgap(9); hhd.setAlignment(Pos.TOP_CENTER); hhd.setBackground(bg3);
      GridPane hhdz=new GridPane(); hhdz.setVgap(9);hhdz.setHgap(97); hhdz.setAlignment(Pos.TOP_CENTER); hhdz.setBackground(bg3);
      hhdz.add(l,0,0); hhdz.add(hd,1,0); hhdz.add(r,2,0); hhd.add(hhdz,0,0);
      
      //bt actions
      cls.setOnAction(ev->{
          Stage.close();
      });
      
      cls.setOnMouseMoved(ev->{
          cls.setStyle("-fx-font:normal 19px 'Cambria'; -fx-background-color:deeppink; -fx-text-fill:navy");
      });
      
      cls.setOnMouseExited(ev->{
          cls.setStyle("-fx-font:normal 19px 'Cambria'; -fx-background-color:lightsteelblue; -fx-text-fill:navy");
      });
      
      min.setOnAction(ev->{
          Stage.setIconified(true);
      });
      
      min.setOnMouseMoved(ev->{
          min.setStyle("-fx-font:normal 19px 'Cambria'; -fx-background-color:deeppink; -fx-text-fill:navy");
      });
      
      min.setOnMouseExited(ev->{
          min.setStyle("-fx-font:normal 19px 'Cambria'; -fx-background-color:lightsteelblue; -fx-text-fill:navy");
      });
      
      //making window movable
    
      hhd.setOnMousePressed(evv->{
          yoffset=evv.getSceneY(); xoffset=evv.getSceneX();
      });
      
      hhd.setOnMouseDragged(ev->{
          Stage.setX(ev.getScreenX() - xoffset); 
          Stage.setY(ev.getScreenY() - yoffset); 
      });
      
      BorderPane brd=new BorderPane(); brd.setBackground(bgi); brd.setBottom(tt); brd.setCenter(log); brd.setTop(hhd);
      Scene sn =new Scene(brd); Stage.setTitle("SBM"); Stage.setScene(sn); 
      
      //App start animation
      Label we=new Label("SeumX Business Manager"); we.setStyle("-fx-font:bold 21px 'Cambria'; -fx-text-fill:azure");
      ImageView vew=new ImageView(icon); vew.setFitWidth(223); vew.setFitHeight(223); 
      ProgressIndicator ind=new ProgressIndicator(); ind.setStyle("-fx-progress-color:aliceblue");
        ind.setPrefWidth(117); ind.setPrefHeight(117);
        GridPane pnn=new GridPane(); pnn.setPadding(new Insets(1,1,1,1)); pnn.setVgap(7); pnn.setHgap(7); pnn.setAlignment(Pos.CENTER);
        pnn.setStyle("-fx-background-color:navy"); pnn.add(vew,0,0); pnn.add(ind,0,1); pnn.add(we,0,3);
        Scene sny=new Scene(pnn); Stage stg=new Stage(); stg.setScene(sny); stg.setWidth(497); stg.setHeight(313); 
        stg.initStyle(StageStyle.UNDECORATED); stg.getIcons().add(icon); stg.show();
        
        FadeTransition fd=new FadeTransition(Duration.millis(18000)); fd.setFromValue(0); fd.setToValue(1); fd.setNode(vew);
        fd.setAutoReverse(false); fd.setCycleCount(1); fd.play();
        fd.setOnFinished(er->{
            stg.close(); Stage.show();
        });
      
      Label niu=new Label("Please fill all the fields"); niu.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:white;");
      
      //Sales department
      Button ad=new Button("Add New Item"); ad.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:steelblue; -fx-text-fill:ivory");
      Button salz=new Button("Sell Item"); salz.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:purple; -fx-text-fill:ivory");
      Button adst=new Button("Add Stock"); adst.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:steelblue; -fx-text-fill:ivory");
      Button dslz=new Button("Daily Sales"); dslz.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:purple; -fx-text-fill:ivory");
      Button stck=new Button("View Stock"); stck.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:steelblue; -fx-text-fill:ivory");
      Button lgt=new Button("Logout"); lgt.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:darkred; -fx-text-fill:ivory");
      
      stck.setPrefSize(190,30); ad.setPrefSize(190,30); salz.setPrefSize(190,30); lgt.setPrefSize(190,30); adst.setPrefSize(190,30);
      dslz.setPrefSize(190,30);
      
      GridPane box=new GridPane(); box.setVgap(20); box.setHgap(2); box.setPadding(new Insets(2,2,2,8)); box.setBackground(bg1);
      box.setAlignment(Pos.TOP_LEFT); box.setOpacity(0.95); box.add(ad,0,0); box.add(salz,0,1); box.add(adst,0,2); box.add(dslz,0,3);
      box.add(stck,0,4); box.add(lgt,0,5);
      
      //add item
      Label org=new Label("Add new Product"); org.setStyle("-fx-font:bold 21px 'Cambria';-fx-text-fill:steelblue");
      Label nmi=new Label("Name Of Item"); nmi.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
      Label din=new Label("Date In"); din.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
      Label sep=new Label("Selling Price"); sep.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:azure");
      Label Qty=new Label("Quantity"); Qty.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:azure");
      Label ceen=new Label("A new item has been added in SBM Store"); ceen.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:lightgreen");
      Label dc=new Label("Discount Price"); dc.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
      
      TextField nmif=new TextField(); nmif.setStyle("-fx-font:bold 12px 'Cambria'");
      DatePicker dinf=new DatePicker(); dinf.setStyle("-fx-font:bold 12px 'Cambria'");
      TextField sepf=new TextField(); sepf.setStyle("-fx-font:bold 12px 'Cambria'");
      TextField qtyf=new TextField(); qtyf.setStyle("-fx-font:bold 12px 'Cambria'");
      TextField dct=new TextField(); dct.setStyle("-fx-font:bold 12px 'Cambria'");
      Button sv=new Button("SAVE"); sv.setStyle("-fx-font:bold 15px 'Cambria'; -fx-background-color:steelblue; -fx-text-fill:ivory");
      
      sepf.setOnKeyTyped(ev->{
          char [] chi=ev.getCharacter().toCharArray();
          for (char tyi : chi) {
              if(Character.isLetter(tyi)) {
                  Label ucn=new Label("Please Enter Digits."); Button kx=new Button("OK");
                  ucn.setStyle("-fx-text-fill:azure; -fx-font:normal 17px 'Cambria'");
                  kx.setStyle("-fx-background-color:navy; -fx-font:normal 16px 'Cambria'; -fx-text-fill:white");
                  kx.setPrefSize(128,31);
                  
                  GridPane lnb=new GridPane(); lnb.setPadding(new Insets(9,9,9,9)); lnb.setVgap(9); lnb.setHgap(9);
                  lnb.setAlignment(Pos.CENTER); lnb.setStyle("-fx-background-color:black"); lnb.add(ucn,0,0); lnb.add(kx,0,2);
                  
                  Stage tgv=new Stage(); tgv.setWidth(378); tgv.setHeight(197); tgv.setResizable(false); tgv.setOpacity(0.9);
                  tgv.initOwner(Stage); Scene jx=new Scene(lnb); tgv.setScene(jx); tgv.show();
                  tgv.setOnCloseRequest(ty->{
                      sepf.setText("");
                  });
                  
                  kx.setOnAction(eg->{
                      sepf.setText(""); tgv.close();
                  });
              }
          } 
      });
      
      dct.setOnKeyTyped(ev->{
          char [] chi=ev.getCharacter().toCharArray();
          for (char tyi : chi) {
              if(Character.isLetter(tyi)) {
                  Label ucn=new Label("Please Enter Digits."); Button kx=new Button("OK");
                  ucn.setStyle("-fx-text-fill:azure; -fx-font:normal 17px 'Cambria'");
                  kx.setStyle("-fx-background-color:navy; -fx-font:normal 16px 'Cambria'; -fx-text-fill:white");
                  kx.setPrefSize(128,31);
                  
                  GridPane lnb=new GridPane(); lnb.setPadding(new Insets(9,9,9,9)); lnb.setVgap(9); lnb.setHgap(9);
                  lnb.setAlignment(Pos.CENTER); lnb.setStyle("-fx-background-color:black"); lnb.add(ucn,0,0); lnb.add(kx,0,2);
                  
                  Stage tgv=new Stage(); tgv.setWidth(378); tgv.setHeight(197); tgv.setResizable(false); tgv.setOpacity(0.9);
                  tgv.initOwner(Stage); Scene jx=new Scene(lnb); tgv.setScene(jx); tgv.show();
                  tgv.setOnCloseRequest(ty->{
                      dct.setText("");
                  });
                  
                  kx.setOnAction(eg->{
                      dct.setText(""); tgv.close();
                  });
              }
          } 
      });
      
      qtyf.setOnKeyTyped(ev->{
          char [] chi=ev.getCharacter().toCharArray();
          for (char tyi : chi) {
              if(Character.isLetter(tyi)) {
                  Label ucn=new Label("Please Enter Digits."); Button kx=new Button("OK");
                  ucn.setStyle("-fx-text-fill:azure; -fx-font:normal 17px 'Cambria'");
                  kx.setStyle("-fx-background-color:navy; -fx-font:normal 16px 'Cambria'; -fx-text-fill:white");
                  kx.setPrefSize(128,31);
                  
                  GridPane lnb=new GridPane(); lnb.setPadding(new Insets(9,9,9,9)); lnb.setVgap(9); lnb.setHgap(9);
                  lnb.setAlignment(Pos.CENTER); lnb.setStyle("-fx-background-color:black"); lnb.add(ucn,0,0); lnb.add(kx,0,2);
                  
                  Stage tgv=new Stage(); tgv.setWidth(378); tgv.setHeight(197); tgv.setResizable(false); tgv.setOpacity(0.9);
                  tgv.initOwner(Stage); Scene jx=new Scene(lnb); tgv.setScene(jx); tgv.show();
                  tgv.setOnCloseRequest(ty->{
                      qtyf.setText("");
                  });
                  
                  kx.setOnAction(eg->{
                      qtyf.setText(""); tgv.close();
                  });
              }
          } 
      });
      
      //Salz
      Label in=new Label("Item Name"); in.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
      Label rt=new Label("Rate"); rt.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
      Label qt=new Label("Quantity"); qt.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:azure");
      Label amt=new Label("Amount"); amt.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:azure");
      Label dt=new Label("Date"); dt.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:azure");
      
      Button adt=new Button("+"); adt.setStyle("-fx-background-color:navy;-fx-font:bold 15px 'Cambria';-fx-text-fill:ivory");
      Button svv=new Button("Save"); svv.setStyle("-fx-background-color:navy;-fx-font:bold 15px 'Cambria';-fx-text-fill:ivory");
      Label ttll=new Label("Total Purchase : "); Label ttllv=new Label("0"); GridPane ttv=new GridPane(); ttv.setHgap(7);
      ttv.add(ttll,0,0); ttv.add(ttllv,1,0);
      ttll.setStyle("-fx-font:bold 15px 'Algerian';-fx-text-fill:violet");
      ttllv.setStyle("-fx-font:bold 15px 'Arial Black';-fx-text-fill:lightsteelblue");
      
      Button kkk=new Button("Save"); kkk.setStyle("-fx-background-color:lightsteelblue;-fx-font:bold 23px 'Cambria';-fx-text-fill:black");
      Label fr=new Label("Your Sales Data Will Be Saved For Future Use. \n\n\nClick Save");
      fr.setStyle("-fx-font: normal 17px 'Cambria'; -fx-text-fill:azure");
      GridPane hg=new GridPane(); hg.setVgap(5); hg.setHgap(5); hg.setPadding(new Insets(2,2,2,2)); hg.setAlignment(Pos.CENTER);
      hg.setBackground(bg1); hg.add(fr,0,0); hg.add(kkk,0,4);
      
      ComboBox<String> combo=new ComboBox(); combo.setStyle("-fx-font:bold 15px 'Cambria'");combo.setPrefWidth(170);
      ComboBox<String> cbb=new ComboBox(); cbb.setStyle("-fx-font:bold 15px 'Cambria'"); cbb.setPrefWidth(120);
      ObservableList<String> jji=FXCollections.observableArrayList(); jji.addAll("Normal","Discount"); cbb.setItems(jji);
      GridPane kol=new GridPane(); kol.setVgap(1); kol.setHgap(1); kol.setPadding(new Insets(1,1,1,1)); kol.setAlignment(Pos.CENTER);
      kol.add(combo,0,0); kol.add(cbb,1,0);
      TextField srt=new TextField(); srt.setPrefWidth(110); srt.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:navy");
      
      TextField rtt=new TextField(); rtt.setEditable(true); TextField qtt=new TextField(); qtt.setPrefWidth(120);
      qtt.setPromptText("Enter numbers from 0-9");
      TextField amtt=new TextField(); TextField dtt=new TextField(); amtt.setPrefWidth(110); dtt.setPrefWidth(190);
      rtt.setStyle("-fx-font:bold 15px 'Cambria'"); qtt.setStyle("-fx-font:bold 15px 'Cambria'");amtt.setEditable(false);
      amtt.setStyle("-fx-font:bold 15px 'Cambria'"); dtt.setStyle("-fx-font:bold 15px 'Cambria'");dtt.setEditable(false);
      
      qtt.setOnKeyTyped(ev->{
          char [] chi=ev.getCharacter().toCharArray();
          for (char tyi : chi) {
              if(Character.isLetter(tyi)) {
                  Label ucn=new Label("Please Enter Digits."); Button kx=new Button("OK");
                  ucn.setStyle("-fx-text-fill:azure; -fx-font:normal 17px 'Cambria'");
                  kx.setStyle("-fx-background-color:navy; -fx-font:normal 16px 'Cambria'; -fx-text-fill:white");
                  kx.setPrefSize(128,31);
                  
                  GridPane lnb=new GridPane(); lnb.setPadding(new Insets(9,9,9,9)); lnb.setVgap(9); lnb.setHgap(9);
                  lnb.setAlignment(Pos.CENTER); lnb.setStyle("-fx-background-color:black"); lnb.add(ucn,0,0); lnb.add(kx,0,2);
                  
                  Stage tgv=new Stage(); tgv.setWidth(378); tgv.setHeight(197); tgv.setResizable(false); tgv.setOpacity(0.9);
                  tgv.initOwner(Stage); Scene jx=new Scene(lnb); tgv.setScene(jx); tgv.show();
                  tgv.setOnCloseRequest(ty->{
                      qtt.setText("");
                  });
                  
                  kx.setOnAction(eg->{
                      qtt.setText(""); tgv.close();
                  });
              }
          } 
      });
      
      rtt.setOnKeyTyped(ev->{
          char [] chi=ev.getCharacter().toCharArray();
          for (char tyi : chi) {
              if(Character.isLetter(tyi)) {
                  Label ucn=new Label("Please Enter Digits."); Button kx=new Button("OK");
                  ucn.setStyle("-fx-text-fill:azure; -fx-font:normal 17px 'Cambria'");
                  kx.setStyle("-fx-background-color:navy; -fx-font:normal 16px 'Cambria'; -fx-text-fill:white");
                  kx.setPrefSize(128,31);
                  
                  GridPane lnb=new GridPane(); lnb.setPadding(new Insets(9,9,9,9)); lnb.setVgap(9); lnb.setHgap(9);
                  lnb.setAlignment(Pos.CENTER); lnb.setStyle("-fx-background-color:black"); lnb.add(ucn,0,0); lnb.add(kx,0,2);
                  
                  Stage tgv=new Stage(); tgv.setWidth(378); tgv.setHeight(197); tgv.setResizable(false); tgv.setOpacity(0.9);
                  tgv.initOwner(Stage); Scene jx=new Scene(lnb); tgv.setScene(jx); tgv.show();
                  tgv.setOnCloseRequest(ty->{
                      rtt.setText("");
                  });
                  
                  kx.setOnAction(eg->{
                      rtt.setText(""); tgv.close();
                  });
              }
          } 
      });
      
      GridPane hit=new GridPane();hit.setVgap(9);hit.setHgap(9);hit.setPadding(new Insets(4,4,4,4));hit.setAlignment(Pos.CENTER);
      hit.add(in,0,0);hit.add(srt,1,0);hit.add(kol,2,0);hit.add(rt,0,1);hit.add(rtt,1,1);hit.add(qt,0,2);hit.add(qtt,1,2);
      hit.add(amt,0,3);hit.add(amtt,1,3);hit.add(dt,0,4);hit.add(dtt,1,4);
      
      Label slsz=new Label("Sales Center"); slsz.setStyle("-fx-font:bold 27px 'Cambria';-fx-text-fill:aliceblue"); GridPane jio=new GridPane();
      jio.setVgap(8); jio.setHgap(8); jio.setPadding(new Insets(2,2,2,2)); jio.setAlignment(Pos.CENTER); jio.setBackground(bg1); jio.add(slsz,0,0);
      
      //Stock management
      Label str=new Label("Store Management"); str.setStyle("-fx-font:bold 32px 'Cambria';-fx-text-fill:lightblue");
      TextField frt=new TextField(); frt.setPrefSize(180,27); frt.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:navy");
      Label str8=new Label("Sort by name : "); str8.setStyle("-fx-font:bold 20px 'Cambria';-fx-text-fill:lightblue");
      
      GridPane gyr=new GridPane(); gyr.setVgap(7); gyr.setHgap(14); gyr.setPadding(new Insets(2,2,2,2)); gyr.setAlignment(Pos.TOP_CENTER);
      gyr.setBackground(bg1); gyr.add(str,0,0); gyr.add(str8,1,0); gyr.add(frt,2,0);
      List lst=new ArrayList(); String hdddd="Below Is Your Stock";  String lls="Purchase List";
      ObservableList<String> tgi=FXCollections.observableArrayList(lst);
      ListView lv=new ListView(); lv.setItems(tgi); lv.setPrefSize(313, 311);
      lv.setStyle("-fx-font:normal 15px 'Cambria';-fx-control-inner-background:steelblue;-fx-text-fill:navyblue");
      
      lv.setCellFactory(hyt ->{
          ListCell<String> cell=new ListCell<>(); 
          ContextMenu cnm=new ContextMenu();
          MenuItem dl2=new MenuItem(); 
          dl2.textProperty().bind(Bindings.format("Delete [%s]",cell.itemProperty()));
          dl2.setStyle("-fx-font:bold 13px 'Cambria'");
          
          MenuItem ed=new MenuItem(); 
          ed.textProperty().bind(Bindings.format("Edit [%s]",cell.itemProperty()));
          ed.setStyle("-fx-font:bold 13px 'Cambria'"); cnm.getItems().addAll(ed,dl2);
          
          dl2.setOnAction((ActionEvent jhj)->{ if(uuss.equals("Admin")){
          lv.getSelectionModel().getSelectedIndex();
              try {
                  //reading
                  FileInputStream inw=new FileInputStream("tem.dll");
                  ObjectInputStream obui=new ObjectInputStream(inw);
                  list =new ArrayList(); list=(List) obui.readObject();
                  list.remove(lv.getSelectionModel().getSelectedIndex()); 
                  System.out.println(list.size()); System.out.println(lv.getSelectionModel().getSelectedIndex());
                  System.out.println(lv.getSelectionModel().getSelectedItem().toString());
                  
                  //writing
                  FileOutputStream out=new FileOutputStream("tem.dll");
                  ObjectOutputStream bout=new ObjectOutputStream(out);
                  bout.writeObject(list);
                  
                  //reading
                  FileInputStream inw2=new FileInputStream("pc.dll");
                  ObjectInputStream obui2=new ObjectInputStream(inw2);
                  pr=new Properties(); pr=(Properties) obui2.readObject();
                  pr.remove(lv.getSelectionModel().getSelectedItem().toString());
                  System.out.println(lv.getSelectionModel().getSelectedItem().toString());
                  
                  //writing
                  FileOutputStream out2=new FileOutputStream("pc.dll");
                  ObjectOutputStream bout2=new ObjectOutputStream(out2);
                  bout2.writeObject(pr);
                  
                  //reading
                  FileInputStream inw3=new FileInputStream("qty.dll");
                  ObjectInputStream obui3=new ObjectInputStream(inw3);
                  pr=new Properties(); pr=(Properties) obui3.readObject(); 
                  pr.remove(lv.getSelectionModel().getSelectedItem().toString()); 
                  System.out.println(lv.getSelectionModel().getSelectedItem().toString());
                  
                  //writing
                  FileOutputStream out3=new FileOutputStream("qty.dll");
                  ObjectOutputStream bout3=new ObjectOutputStream(out3);
                  bout3.writeObject(pr);
                  
                  //reading
                  FileInputStream inw4=new FileInputStream("dtn.dll");
                  ObjectInputStream obui4=new ObjectInputStream(inw4);
                  pr=new Properties(); pr=(Properties) obui4.readObject();
                  pr.remove(lv.getSelectionModel().getSelectedItem().toString()); 
                  System.out.println(lv.getSelectionModel().getSelectedItem().toString());
                  
                  //writing
                  FileOutputStream out4=new FileOutputStream("dtn.dll");
                  ObjectOutputStream bout4=new ObjectOutputStream(out4);
                  bout4.writeObject(pr);
                  
                  /*lv.getItems().remove(cell.getItem());*/ lv.getItems().remove(lv.getSelectionModel().getSelectedIndex());
                  
              } catch (FileNotFoundException ex) {
                  System.out.println("Complecations.....");
              } catch (IOException | ClassNotFoundException ex) {
                  System.out.println("Complecations.....");
              }  } else {System.out.println("You do not hava the rights to delete items...."); }
          });
          
          ed.setOnAction((ActionEvent ui)->{                                    if(uuss.equals("Admin")){
                      Label qwe=new Label("Edit Item Details"); qwe.setStyle("-fx-font:bold 24px 'Cambria'; -fx-text-fill:azure;");
                      Label uus=new Label(lv.getSelectionModel().getSelectedItem().toString());
                      uus.setStyle("-fx-font:bold 19px 'Cambria'; -fx-text-fill:white;");
                      Label nb=new Label("Selling Price : "); nb.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:azure;");
                      Label nb2=new Label("Discout Price : "); nb2.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:azure;");
                      TextField iuy=new TextField(); iuy.setStyle("-fx-font:bold 15px 'Cambria'");
                      TextField iuy2=new TextField(); iuy2.setStyle("-fx-font:bold 15px 'Cambria'");
                      Button udt=new Button("Update"); udt.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:green; -fx-text-fill:azure;");
                      
                      GridPane jhi=new GridPane(); jhi.setVgap(7); jhi.setHgap(7); jhi.setPadding(new Insets(2,2,2,2)); jhi.setAlignment(Pos.CENTER);
                      jhi.setBackground(bg1); jhi.add(qwe,0,0); jhi.add(uus,0,1); jhi.add(nb,0,3); jhi.add(nb2,0,4); jhi.add(iuy,1,3);
                      jhi.add(iuy2,1,4); jhi.add(udt,1,7);
                      
                      Stage uy=new Stage(); uy.setHeight(342); uy.setWidth(542); uy.setResizable(false); uy.initOwner(Stage);
                      Scene bv=new Scene(jhi); uy.setScene(bv); uy.setOpacity(0.9); uy.show();
                      
                      udt.setOnAction((ActionEvent tr)->{
                          try {
                          //reading and writing new selling values
                          FileInputStream inu=new FileInputStream("pc.dll");
                          ObjectInputStream obin=new ObjectInputStream(inu);
                          pr=new Properties(); pr=(Properties) obin.readObject();
                          pr.put(lv.getSelectionModel().getSelectedItem().toString(),iuy.getText());
                          
                          FileOutputStream outr=new FileOutputStream("pc.dll");
                          ObjectOutputStream btu=new ObjectOutputStream(outr);
                          btu.writeObject(pr);
                          
                          //reading and writing new discount values
                          FileInputStream inu2=new FileInputStream("dsct.dll");
                          ObjectInputStream obin2=new ObjectInputStream(inu2);
                          pr=new Properties(); pr=(Properties) obin2.readObject();
                          pr.put(lv.getSelectionModel().getSelectedItem().toString(),iuy2.getText());
                          
                          FileOutputStream outr2=new FileOutputStream("dsct.dll");
                          ObjectOutputStream btu2=new ObjectOutputStream(outr2);
                          btu2.writeObject(pr);
                          
                          uy.close();
                          
                          } catch (FileNotFoundException ex) {
                              System.out.println("Complecations.....");
                          } catch (IOException | ClassNotFoundException ex) {
                              System.out.println("Complecations.....");
                          }
                      });
                } else {System.out.println("You do not hava the rights to delete items...."); }
          });
          
          cell.textProperty().bind(cell.itemProperty()); //cell.setContextMenu(cnm);
          cell.emptyProperty().addListener((obs,wasEmpty, isNowEmpty)->{
              if(isNowEmpty) {
                  dl2.setDisable(true); 
              } else {
                  dl2.setDisable(false); cell.setContextMenu(cnm);
              }
          });
          return cell;
      });
      
      Label itname=new Label("Item Name : "); itname.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:black");
      Label itpc=new Label("Selling Price : "); itpc.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:black");
      Label itdc=new Label("Discount Price : "); itdc.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:black");
      Label itqt=new Label("Quantity : "); itqt.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:black");
      Label itdn=new Label("Date In : "); itdn.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:black");
      Label itd=new Label("Item Details"); itd.setStyle("-fx-font:bold 19px 'Cambria'; -fx-text-fill:darkred");
      
      Label itnamed=new Label(); itnamed.setStyle("-fx-font:bold 16px 'Cambria'; -fx-text-fill:navy");
      Label itpcd=new Label(); itpcd.setStyle("-fx-font:bold 16px 'Cambria'; -fx-text-fill:navy");
      Label itdcd=new Label(); itdcd.setStyle("-fx-font:bold 16px 'Cambria'; -fx-text-fill:navy");
      Label itqtd=new Label(); itqtd.setStyle("-fx-font:bold 16px 'Cambria'; -fx-text-fill:navy");
      Label itdnd=new Label(); itdnd.setStyle("-fx-font:bold 16px 'Cambria'; -fx-text-fill:navy");
      
      GridPane itdet=new GridPane(); itdet.setVgap(37); itdet.setHgap(7); itdet.setPadding(new Insets(4,4,4,4)); itdet.setAlignment(Pos.TOP_LEFT);
      itdet.setStyle("-fx-background-color:plum"); itdet.setPrefSize(313, 311); itdet.add(itd,0,0); itdet.add(itname,0,1); itdet.add(itpc,0,2); 
      itdet.add(itdc,0,3); itdet.add(itqt,0,4); itdet.add(itdn,0,5); itdet.add(itnamed,1,1); itdet.add(itpcd,1,2); itdet.add(itdcd,1,3);
      itdet.add(itqtd,1,4); itdet.add(itdnd,1,5);
      
      //add to list v
      ListView lvv=new ListView(); lvv.setItems(tgi); lvv.setPrefSize(512,225);
      lvv.setStyle("-fx-font:normal 15px 'Cambria';-fx-control-inner-background:slateblue;-fx-text-fill:navyblue");
      List fg=new ArrayList();
      
      //dialogs programming
      Button ok=new Button("OK"); ok.setStyle("-fx-background-color:darkgreen;-fx-font:bold 18px 'Cambria';-fx-text-fill:lightsteelblue");
      Button cnc=new Button("Cancel"); cnc.setStyle("-fx-background-color:darkred;-fx-font:bold 18px 'Cambria';-fx-text-fill:lightsteelblue");
      ok.setPrefWidth(90); cnc.setPrefWidth(90);
      
      GridPane dlg=new GridPane(); dlg.setVgap(7); dlg.setHgap(7); dlg.setPadding(new Insets(2,2,2,2)); dlg.setAlignment(Pos.CENTER);
      dlg.setBackground(bg1); dialog=new Stage(); dialog.initStyle(StageStyle.DECORATED); dialog.initOwner(Stage);
      dialog.setWidth(519); dialog.setHeight(274); dialog.setResizable(false); dialog.setOpacity(0.87); Scene dsn=new Scene(dlg); dialog.setScene(dsn);
      
      dialog1=new Stage(); dialog1.initStyle(StageStyle.UNDECORATED); dialog1.initOwner(Stage);
      dialog1.setWidth(519); dialog1.setHeight(294); dialog1.setResizable(false); dialog1.setOpacity(0.87); Scene ds=new Scene(hg);
      dialog1.setScene(ds);
      
      //out of stock 
      Label sts=new Label("Insufficient Stock Balance.....\nPlease view stock");sts.setStyle("-fx-font: normal 17px 'Cambria'; -fx-text-fill:plum");
      Button gt=new Button("Back"); gt.setStyle("-fx-font:bold 15px 'Cambria';-fx-background-color:lightblue");
      GridPane tr=new GridPane(); tr.setVgap(17); tr.setHgap(7); tr.setPadding(new Insets(2,2,2,2)); tr.setAlignment(Pos.CENTER);
      tr.setBackground(bg1); tr.add(sts,0,0); tr.add(gt,0,3);
      
      ste=new Stage(); ste.initStyle(StageStyle.DECORATED); ste.initOwner(Stage);
      ste.setWidth(519); ste.setHeight(274); ste.setResizable(false); ste.setOpacity(0.87); Scene ds2=new Scene(tr); 
      ste.setScene(ds2);
      
      //Add stock 
      //reading from db
      FileInputStream inst=new FileInputStream("tem.dll");
      ObjectInputStream obiy=new ObjectInputStream(inst);
      list=new ArrayList(); list=(List) obiy.readObject();
      
      ComboBox<String> tms=new ComboBox(); 
      ObservableList<String> ols=FXCollections.observableArrayList(list); tms.setItems(ols); 
      TextField qty1=new TextField(); Button sv1=new Button("Save"); Label scs=new Label("Update succeded");
      tms.setStyle("-fx-font:bold 15px 'Cambria'"); qty1.setStyle("-fx-font:bold 15px 'Cambria'"); qty1.setPrefSize(210,24); tms.setPrefWidth(210);
      sv1.setStyle("-fx-background-color:navy;-fx-font:bold 18px 'Cambria';-fx-text-fill:lightsteelblue"); sv1.setPrefWidth(210);
      Label str1=new Label("Add Stock in Store"); str1.setStyle("-fx-font:bold 22px 'Cambria';-fx-text-fill:lightblue");
      Label itm1=new Label("Select Item"); itm1.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:lightblue");
      Label qt1=new Label("Enter Qty"); qt1.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:lightblue");
      scs.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:lightgreen");
      
      qty1.setOnKeyTyped(ev->{
          char [] chi=ev.getCharacter().toCharArray();
          for (char tyi : chi) {
              if(Character.isLetter(tyi)) {
                  Label ucn=new Label("Please Enter Digits."); Button kx=new Button("OK");
                  ucn.setStyle("-fx-text-fill:azure; -fx-font:normal 17px 'Cambria'");
                  kx.setStyle("-fx-background-color:navy; -fx-font:normal 16px 'Cambria'; -fx-text-fill:white");
                  kx.setPrefSize(128,31);
                  
                  GridPane lnb=new GridPane(); lnb.setPadding(new Insets(9,9,9,9)); lnb.setVgap(9); lnb.setHgap(9);
                  lnb.setAlignment(Pos.CENTER); lnb.setStyle("-fx-background-color:black"); lnb.add(ucn,0,0); lnb.add(kx,0,2);
                  
                  Stage tgv=new Stage(); tgv.setWidth(378); tgv.setHeight(197); tgv.setResizable(false); tgv.setOpacity(0.9);
                  tgv.initOwner(Stage); Scene jx=new Scene(lnb); tgv.setScene(jx); tgv.show();
                  tgv.setOnCloseRequest(ty->{
                      qty1.setText("");
                  });
                  
                  kx.setOnAction(eg->{
                      qty1.setText(""); tgv.close();
                  });
              }
          } 
      });
      
      //Dialy sales
      Label dsz=new Label("Daily Sales"); dsz.setStyle("-fx-font:bold 24px 'Cambria';-fx-text-fill:steelblue");
      List<String> llst=new ArrayList();  ObservableList<String> ollst=FXCollections.observableArrayList();
      ListView lv1=new ListView(); lv1.setPrefSize(651,330); 
      lv1.setStyle("-fx-font:normal 15px 'Cambria';-fx-control-inner-background:steelblue;-fx-text-fill:navyblue");
      
      lv1.setCellFactory(hyt ->{ 
          ListCell<String> cell=new ListCell<>(); 
          ContextMenu cnm=new ContextMenu();
          MenuItem dl2=new MenuItem();
          dl2.textProperty().bind(Bindings.format("Delete [%s]",cell.itemProperty()));
          dl2.setStyle("-fx-font:bold 13px 'Cambria'"); cnm.getItems().addAll(dl2);
          
          dl2.setOnAction((ActionEvent jhj)->{ if(uuss.equals("Admin")){
              try {
                  //reading
                  FileInputStream in7=new FileInputStream("dsalz.dll");
                  ObjectInputStream boin=new ObjectInputStream(in7);
                  list=new ArrayList(); list=(List) boin.readObject(); 
                  list.remove(lv1.getSelectionModel().getSelectedItem().toString()); 
                  
                  //writing
                  FileOutputStream outr=new FileOutputStream("dsalz.dll");      
                  ObjectOutputStream but=new ObjectOutputStream(outr);
                  but.writeObject(list);
                  
                  //updating stock balance
                  FileInputStream ina=new FileInputStream("upstk.dll");
                  ObjectInputStream obji=new ObjectInputStream(ina);
                  pr=new Properties(); pr=(Properties) obji.readObject();
                  
                  int sld=Integer.valueOf(pr.getProperty(lv1.getSelectionModel().getSelectedItem().toString()));
                  pr.remove(lv1.getSelectionModel().getSelectedItem().toString());
                  
                  FileOutputStream uyt=new FileOutputStream("upstk.dll");
                  ObjectOutputStream obju=new ObjectOutputStream(uyt);
                  obju.writeObject(pr);
                  
                  FileInputStream ina2=new FileInputStream("tem.dll");          String ittn=null;
                  ObjectInputStream obji2=new ObjectInputStream(ina2);
                  list=new ArrayList(); list=(List) obji2.readObject();
                  for(int i=0; i<list.size(); i++){
                      if(lv1.getSelectionModel().getSelectedItem().toString().contains(list.get(i))){
                          ittn=list.get(i);
                      }
                  }
                  
                  FileInputStream inb=new FileInputStream("qty.dll");
                  ObjectInputStream objy=new ObjectInputStream(inb);
                  pr=new Properties(); pr=(Properties) objy.readObject();
                  int mtk=Integer.valueOf(pr.getProperty(ittn));    System.out.println(pr.getProperty(ittn));
                  int scun=mtk+sld; String iou=String.valueOf(scun);
                  pr.setProperty(ittn,iou);                         System.out.println(pr.getProperty(ittn));
                  
                  FileOutputStream ouil=new FileOutputStream("qty.dll");
                  ObjectOutputStream objui=new ObjectOutputStream(ouil);
                  objui.writeObject(pr);
                  
                  //updating cash collected
                  FileInputStream fuin=new FileInputStream("upsalz.dll");
                  ObjectInputStream objiu=new ObjectInputStream(fuin);
                  pr=new Properties(); pr=(Properties) objiu.readObject();
                  
                  int amsld=Integer.valueOf(pr.getProperty(lv1.getSelectionModel().getSelectedItem().toString()));
                  pr.remove(lv1.getSelectionModel().getSelectedItem().toString());
                  
                  FileOutputStream outy=new FileOutputStream("upsalz.dll");
                  ObjectOutputStream objf=new ObjectOutputStream(outy);
                  objf.writeObject(pr);
                  
                  FileInputStream inft=new FileInputStream("dam.dll");
                  ObjectInputStream objhf=new ObjectInputStream(inft);          String oil=null;
                  pr=new Properties(); pr=(Properties) objhf.readObject();      List<String> uyo=new ArrayList(); Set set; set=pr.keySet();
                  Iterator itt=set.iterator();
                  while(itt.hasNext()){
                      uyo.add(itt.next().toString()); System.out.println(uyo);
                  }
                  
                  for(int i=0; i<uyo.size(); i++){
                      if(lv1.getSelectionModel().getSelectedItem().toString().contains(uyo.get(i))) {
                          oil=uyo.get(i); System.out.println(uyo.get(i));
                      }
                  }
                  int hgui=Integer.valueOf(pr.getProperty(oil)); int fty=hgui-amsld;
                  pr.put(oil,String.valueOf(fty));
                  
                  FileOutputStream ouy=new FileOutputStream("dam.dll");
                  ObjectOutputStream objhg=new ObjectOutputStream(ouy);
                  objhg.writeObject(pr);
                  
                  lv1.getItems().remove(lv1.getSelectionModel().getSelectedIndex());
                  
              } catch (FileNotFoundException ex) {
                  System.out.println("Serious error...");
              } catch (IOException | ClassNotFoundException ex) {
                  System.out.println("Serious error...");
              } } else {System.out.println("You do not have the rights to delete this.....");}
          });
          
          cell.textProperty().bind(cell.itemProperty()); //cell.setContextMenu(cnm);
          cell.emptyProperty().addListener((obs,wasEmpty, isNowEmpty)->{
              if(isNowEmpty) {
                  dl2.setDisable(true); 
              } else {
                  dl2.setDisable(false); cell.setContextMenu(cnm);
              }
          });
          return cell;
      });
      
      Label stb=new Label("Sort By : "); stb.setStyle("-fx-font:normal 21px 'Cambria';-fx-text-fill:azure");
      Label tts=new Label("Total Sales : "); tts.setStyle("-fx-font:normal 21px 'Cambria';-fx-text-fill:plum");
      Label at=new Label(); at.setStyle("-fx-font:bold 21px 'Cambria';-fx-text-fill:white");
      
      ComboBox<String> cb=new ComboBox(); ObservableList<String> ops=FXCollections.observableArrayList();
      ops.addAll("Date"); cb.setItems(ops); DatePicker pkk=new DatePicker(); TextField ttf=new TextField();
      pkk.setStyle("-fx-font:bold 15px 'Cambria'"); ttf.setStyle("-fx-font:bold 15px 'Cambria'; -fx-text-fill:navy"); 
      cb.setStyle("-fx-font:bold 15px 'Cambria'"); pkk.setPrefWidth(130); ttf.setPrefWidth(130); 
      
      GridPane dsu=new GridPane(); dsu.setVgap(5); dsu.setHgap(7); dsu.setPadding(new Insets(2,2,2,2)); dsu.setAlignment(Pos.TOP_CENTER);
      dsu.setBackground(bg1); dsu.setOpacity(0.97); dsu.add(dsz,0,0); dsu.add(stb,0,1); dsu.add(ttf,1,1); dsu.add(tts,4,1); dsu.add(at,5,1);
      
      //starting dialy amt records
      Calendar cla=new GregorianCalendar(); int da=cla.get(Calendar.DAY_OF_MONTH); int lat=cla.get(Calendar.MONTH)+1; //int b;
      int as=cla.get(Calendar.YEAR);
      //saving total d salz
      String dutt=da+"/"+lat+"/"+as;
      
      FileInputStream inte=new FileInputStream("dam.dll");
      ObjectInputStream obtt=new ObjectInputStream(inte);
      pr=new Properties(); pr=(Properties) obtt.readObject();
      if(pr.getProperty(dutt)==null){
          pr.put(dutt,"0"); System.out.println("New daily sales Instance created....");
          //output that data
          FileOutputStream out=new FileOutputStream("dam.dll");
          ObjectOutputStream obt=new ObjectOutputStream(out);
          obt.writeObject(pr); out.close(); obt.close(); pr=null;
      }
      
      //creating adminitrator panel
      GridPane hb=new GridPane(); hb.setPadding(new Insets(1,1,1,1)); hb.setStyle("-fx-background-color:black"); hb.setOpacity(0.97); 
      hb.setVgap(1); hb.setHgap(2); hb.setAlignment(Pos.TOP_CENTER);
      Button rpt=new Button("Report"); rpt.setStyle("-fx-background-color:darkslateblue;-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
      Button syu=new Button("System Users"); syu.setStyle("-fx-background-color:darkviolet;-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
      //Button slz=new Button("Daily Sales"); slz.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:purple; -fx-text-fill:ivory");
      hb.add(ad,0,0); hb.add(adst,1,0); hb.add(dslz,2,0); hb.add(rpt,3,0); hb.add(syu,4,0); hb.add(stck,5,0); hb.add(lgt,6,0);
      
      //creating con-text menus
      ContextMenu cnt=new ContextMenu();
      MenuItem dl=new MenuItem("Delete"); dl.setStyle("-fx-font:bold 15px 'Cambria'");
      dl.setOnAction((ActionEvent)->{
          System.out.println("No i have refused to delete this file.....");
      });
      MenuItem ed=new MenuItem("Edit"); ed.setStyle("-fx-font:bold 15px 'Cambria'");
      ed.setOnAction((ActionEvent)->{
          System.out.println("No i will not edit this file.....");
      });
      MenuItem iou=new MenuItem("Add"); iou.setStyle("-fx-font:bold 15px 'Cambria'");
      iou.setOnAction((ActionEvent ev)->{
          Button reft=new Button("Register"); reft.setStyle("-fx-background-color:navy;-fx-font:bold 15px 'Cambria'; -fx-text-fill:white;");
          Label uuu=new Label("User Registration"); uuu.setStyle("-fx-font:bold 27px 'Cambria';-fx-text-fill:azure");
          Label yuu=new Label("User Type : "); yuu.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
          Label yua=new Label("Username : "); yua.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
          Label yup=new Label("Password : "); yup.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
          Label tyu=new Label("Confirm Password"); tyu.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
          
          TextField gty=new TextField(); gty.setStyle("-fx-font:bold 15px 'Cambria'");
          ChoiceBox byt=new ChoiceBox(); byt.getItems().addAll("Administrator","User"); byt.setStyle("-fx-font:bold 15px 'Cambria'");
          PasswordField pff=new PasswordField(); PasswordField pff2=new PasswordField();
          gty.setPrefSize(170,27); byt.setPrefSize(170,27); reft.setPrefSize(150,27);
          
          GridPane rtty=new GridPane(); rtty.setVgap(7); rtty.setHgap(7); rtty.setPadding(new Insets(2,2,2,2)); rtty.setAlignment(Pos.CENTER);
          rtty.setBackground(bg1); rtty.add(uuu,1,0); rtty.add(yuu,0,1); rtty.add(yua,0,2); rtty.add(yup,0,3); rtty.add(tyu,0,4);
          rtty.add(byt,1,1); rtty.add(gty,1,2); rtty.add(pff,1,3); rtty.add(pff2,1,4); rtty.add(reft,1,5);
          
          Stage uye=new Stage(); uye.setHeight(410); uye.setWidth(700); uye.setResizable(false);uye.initOwner(Stage);
          Scene gtwq=new Scene(rtty); uye.setScene(gtwq); uye.setOpacity(0.9); uye.show(); 
          
          Button kyk=new Button("OK"); kyk.setStyle("-fx-font:bold 17px 'Cambria'; -fx-text-fill:azure; -fx-background-color:darkgreen");
          Label ghr=new Label("Password doesn't match"); ghr.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:darkred");
          Label ghr2=new Label("Registration succeded.."); ghr2.setStyle("-fx-font:bold 23px 'Cambria';-fx-text-fill:green");
          
          reft.setOnAction((ActionEvent)->{ String tre=gty.getText(); String tye=pff2.getText();
              try {
              if(byt.getValue().equals("Administrator")){ 
                  if(pff.getText().equals(pff2.getText())){
                  FileInputStream inu=new FileInputStream("adm.dll");
                  ObjectInputStream obu=new ObjectInputStream(inu);
                  list=new ArrayList(); list=(List) obu.readObject();
                  list.add(gty.getText());  inu.close(); obu.close();
                  
                  FileOutputStream our=new FileOutputStream("adm.dll");
                  ObjectOutputStream ourt=new ObjectOutputStream(our);
                  ourt.writeObject(list); our.close(); ourt.close();
                  
                  FileInputStream inu2=new FileInputStream("pdb.dll");
                  ObjectInputStream obu2=new ObjectInputStream(inu2);
                  Properties cpr; cpr=(Properties) obu2.readObject(); Set sot; String ytt;
                  cpr.put(tre,tye); System.out.println(gty.getText()+"\n"+pff2.getText()); 
                  sot=cpr.keySet(); Iterator it=sot.iterator(); 
                  while(it.hasNext()){
                      ytt=(String) it.next(); String hyi=cpr.getProperty(ytt);
                      System.out.println(ytt+"  "+hyi);
                  }
                  
                  FileOutputStream our2=new FileOutputStream("pdb.dll");
                  ObjectOutputStream ourt2=new ObjectOutputStream(our2);
                  ourt2.writeObject(cpr); ourt2.flush(); ourt2.close();  inu2.close(); rtty.getChildren().clear(); rtty.add(ghr2,0,0); rtty.add(kyk,0,1);
                  
              } else {rtty.add(ghr,1,7);} }
              if(byt.getValue().equals("User")){
                  if(pff.getText().equals(pff2.getText())){
                  FileInputStream inu=new FileInputStream("slz.dll");
                  ObjectInputStream obu=new ObjectInputStream(inu);
                  list=new ArrayList(); list=(List) obu.readObject();
                  list.add(gty.getText()); 
                  
                  FileOutputStream our=new FileOutputStream("slz.dll");
                  ObjectOutputStream ourt=new ObjectOutputStream(our);
                  ourt.writeObject(list);
                  
                  FileInputStream inu2=new FileInputStream("pdb.dll");
                  ObjectInputStream obu2=new ObjectInputStream(inu2);
                  pr=new Properties(); pr=(Properties) obu2.readObject();
                  pr.put(gty.getText(),pff2.getText());
                  
                  FileOutputStream our2=new FileOutputStream("pdb.dll");
                  ObjectOutputStream ourt2=new ObjectOutputStream(our2);
                  ourt2.writeObject(pr);  rtty.getChildren().clear(); rtty.add(ghr2,0,0); rtty.add(kyk,0,1);
                  
              } else {rtty.add(ghr,1,7);}
              }
              } catch (FileNotFoundException | ClassNotFoundException ex){
                  System.out.print("gth.....");
              } catch (IOException ex) {
                  System.out.print("gth.....");
              }
          });
          kyk.setOnAction((ActionEvent yu)->{
              uye.close();
          });
       
      }); ed.setDisable(true); dl.setDisable(true);
      MenuButton mbt=new MenuButton("...",null,iou,ed,dl);
      mbt.setStyle("-fx-background-color:plum;-fx-font: bold 15px 'Cambria'; -fx-text-fill:darkgreen");
      
      //reports panel
      Label dr=new Label("REPORTS"); dr.setStyle("-fx-font:bold 29px 'Cambria';-fx-text-fill:Aliceblue");
      Label std=new Label("           Sort by Date : "); std.setStyle("-fx-font:bold 23px 'Cambria';-fx-text-fill:azure");
      TextField strr=new TextField(); strr.setStyle("-fx-font:bold 15px 'Cambria'");
      Button sav=new Button("Save"); sav.setStyle("-fx-font:bold 17px 'Cambria';-fx-background-color:darkcyan;-fx-text-fill:azure");
      Button prit=new Button("Print"); prit.setStyle("-fx-font:bold 17px 'Cambria';-fx-background-color:darkcyan;-fx-text-fill:azure");
      WebView web=new WebView(); WebEngine eng=web.getEngine(); web.setPrefSize(700,371);
      
      GridPane ddr=new GridPane(); ddr.setVgap(7); ddr.setHgap(7); ddr.setPadding(new Insets(2,2,2,2)); ddr.setAlignment(Pos.TOP_CENTER);
      /*ddr.setBackground(bg1); */ddr.add(dr,0,0); ddr.add(std,1,0); ddr.add(strr,2,0); ddr.setStyle("-fx-background-color:darkblue");
      
      //System users
      Label usrn=new Label("Username : "); usrn.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
      Label prn=new Label("Password : "); prn.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
      Label cn=new Label("Confirm Password : "); cn.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:azure");
      Button adusr=new Button("Add new User"); adusr.setStyle("-fx-background-color:navy;-fx-font:bold 15px 'serif';-fx-text-fill:azure");
      Label hd7=new Label("System Management"); hd7.setStyle("-fx-font:bold 33px 'Cambria';-fx-text-fill:aliceblue");
      
      Label asrn=new Label("Users"); asrn.setStyle("-fx-font:bold 19px 'Cambria';-fx-text-fill:azure");
      Label srn=new Label("Administrators"); srn.setStyle("-fx-font:bold 19px 'Cambria';-fx-text-fill:azure");
      
      List<String> hy=new ArrayList(); ObservableList<String> hh=FXCollections.observableArrayList(hy); ListView lv4=new ListView(hh);
      List<String> hy2=new ArrayList(); ObservableList<String> hh2=FXCollections.observableArrayList(hy2); ListView lv42=new ListView(hh2);
      lv4.setPrefSize(300,270); lv42.setPrefSize(300,270); lv4.setStyle("-fx-font:bold 17px 'Cambria';-fx-control-inner-background:slateblue"); 
      lv42.setStyle("-fx-font:bold 17px 'Cambria';-fx-control-inner-background:slateblue");
      
      GridPane gtr=new GridPane(); gtr.setVgap(7); gtr.setHgap(47); gtr.setPadding(new Insets(2,2,2,2)); gtr.setAlignment(Pos.TOP_CENTER);
      gtr.setStyle("-fx-background-color:navy"); gtr.add(hd7,0,0); gtr.add(mbt,1,0);
      GridPane gtr2=new GridPane(); gtr2.setVgap(7); gtr2.setHgap(7); gtr2.setPadding(new Insets(2,2,2,2)); gtr2.setAlignment(Pos.TOP_CENTER);
      gtr2.setBackground(bg1); gtr2.add(srn,0,0); gtr2.add(asrn,1,0); gtr2.add(lv4,0,1); gtr2.add(lv42,1,1);
      
      //setting properties and actons on lvs
      lv4.setCellFactory(hyt ->{
          ListCell<String> cell=new ListCell<>(); 
          ContextMenu cnm=new ContextMenu();
          /*MenuItem dl2=new MenuItem();
          dl2.textProperty().bind(Bindings.format("Delete [%s]",cell.itemProperty()));
          dl2.setStyle("-fx-font:bold 13px 'Cambria'"); */
          
          MenuItem ed2=new MenuItem();
          ed2.textProperty().bind(Bindings.format("Edit [%s]",cell.itemProperty()));
          ed2.setStyle("-fx-font:bold 13px 'Cambria'"); cnm.getItems().addAll(ed2);
          
          /*dl2.setOnAction((ActionEvent jhj)->{
              Label art=new Label("Are you sure to delete this system user?"); 
              art.setStyle("-fx-font: bold 25px 'Cambria'; -fx-text-fill:azure");
              Button yes=new Button("Yes"); Button no=new Button("No");
              yes.setStyle("-fx-background-color:green; -fx-font:bold 18px 'Cambria'; -fx-text-fill: azure");
              no.setStyle("-fx-background-color:red; -fx-font:bold 18px 'Cambria'; -fx-text-fill: azure");
              
              //scene
              GridPane hyt6=new GridPane(); hyt6.setVgap(8); hyt6.setHgap(8); hyt6.setPadding(new Insets(2,2,2,2));
              hyt6.setAlignment(Pos.CENTER); hyt6.setBackground(bg1); hyt6.add(art,0,0); hyt6.add(yes,0,2); hyt6.add(no,1,2);
              Stage fte=new Stage(); fte.setHeight(220); fte.setWidth(550); fte.initOwner(Stage); 
              Scene htre=new Scene(hyt6); fte.setScene(htre); fte.setOpacity(0.9); fte.show(); 
              
              yes.setOnAction((ActionEvent uy)->{
                  //reading
              try{
              FileInputStream inut=new FileInputStream("adm.dll");
              ObjectInputStream inb=new ObjectInputStream(inut);
              list=new ArrayList();list=(List) inb.readObject();
              list.remove(lv4.getSelectionModel().getSelectedIndex());
              
              //writing 
              FileOutputStream fut=new FileOutputStream("adm.dll");
              ObjectOutputStream but=new ObjectOutputStream(fut);
              but.writeObject(list); 
              
              FileInputStream inut2=new FileInputStream("pdb.dll");
              ObjectInputStream obyt=new ObjectInputStream(inut2);
              pr=new Properties(); pr=(Properties) obyt.readObject();
              pr.remove(lv4.getSelectionModel().getSelectedItem().toString());
              
              FileOutputStream fut2=new FileOutputStream("pdb.dll");
              ObjectOutputStream but2=new ObjectOutputStream(fut2);
              but2.writeObject(pr); 
              lv4.getItems().remove(lv4.getSelectionModel().getSelectedIndex());
              fte.close();
              
              } catch (FileNotFoundException ex) {
                  System.out.println("Error in file......");
              } catch (IOException | ClassNotFoundException ex) {
                  System.out.println("Error in file......");
              }
              });
              no.setOnAction((ActionEvent)->{
                  fte.close();
              });
              
          });*/
          ed2.setOnAction((ActionEvent jhhj)->{ 
              String tyo=lv4.getSelectionModel().getSelectedItem().toString();
              Label wqe=new Label("Acount Reset"); wqe.setStyle("-fx-font:bold 33px 'Cambria';-fx-text-fill:azure");
              Label wqe2=new Label(tyo); wqe2.setStyle("-fx-font:bold 23px 'Cambria';-fx-text-fill:azure");
              Label gty=new Label("Enter new Password"); Label gty2=new Label("Confirm Password");
              gty.setPrefSize(230,27); gty2.setPrefSize(230,27);
              gty.setStyle("-fx-font: bold 19px 'Cambria'; -fx-text-fill:azure;"); 
              gty2.setStyle("-fx-font: bold 19px 'Cambria'; -fx-text-fill:azure;");
              PasswordField pff=new PasswordField(); PasswordField pff2=new PasswordField();
              Button rst=new Button("Reset"); rst.setStyle("-fx-background-color:navy; -fx-font: bold 19px 'Cambria'; -fx-text-fill:azure");
              rst.setPrefSize(200,27);
              
              GridPane rtty=new GridPane(); rtty.setVgap(12); rtty.setHgap(7); rtty.setPadding(new Insets(2,2,2,2)); rtty.setAlignment(Pos.CENTER);
              rtty.setBackground(bg1); rtty.add(wqe,0,0); rtty.add(wqe2,0,1); rtty.add(gty,0,2); rtty.add(gty2,0,3); rtty.add(pff,1,2);
              rtty.add(pff2,1,3); rtty.add(rst,1,4);
              
              Stage opp=new Stage(); opp.setHeight(320); opp.setWidth(500); opp.setResizable(false);
              opp.initOwner(Stage); opp.setOpacity(0.9);
              Scene gtd=new Scene(rtty); opp.setScene(gtd); opp.show();
              
              rst.setOnAction((ActionEvent)->{
              try {
                  FileInputStream inu=new FileInputStream("pdb.dll");
                  ObjectInputStream bou=new ObjectInputStream(inu);
                  pr=new Properties(); pr=(Properties) bou.readObject();
                  pr.setProperty(tyo,pff2.getText()); 
                  
                  FileOutputStream outr=new FileOutputStream("pdb.dll");
                  ObjectOutputStream outy=new ObjectOutputStream(outr);
                  outy.writeObject(pr); 
                  
                  opp.close();
                  
              } catch (FileNotFoundException ex) {
                  System.out.println("error fetching file..");
              } catch (IOException | ClassNotFoundException ex) {
                  System.out.println("error fetching file..");
              }
                  
              });
          });
          
          cell.textProperty().bind(cell.itemProperty()); //cell.setContextMenu(cnm);
          cell.emptyProperty().addListener((obs,wasEmpty, isNowEmpty)->{
              if(isNowEmpty) {
                  /*dl2.setDisable(true);*/ ed2.setDisable(true);
              } else {
                  /*dl2.setDisable(false); */ ed2.setDisable(false); cell.setContextMenu(cnm);
              }
          });
          return cell;
      });
      
      lv42.setCellFactory(hyt ->{ 
          ListCell<String> cell=new ListCell<>(); 
          ContextMenu cnm=new ContextMenu();
          MenuItem dl2=new MenuItem();
          dl2.textProperty().bind(Bindings.format("Delete [%s]",cell.itemProperty()));
          dl2.setStyle("-fx-font:bold 13px 'Cambria'");
          
          MenuItem ed2=new MenuItem();
          ed2.textProperty().bind(Bindings.format("Edit [%s]",cell.itemProperty()));
          ed2.setStyle("-fx-font:bold 13px 'Cambria'"); cnm.getItems().addAll(dl2,ed2);
          
          dl2.setOnAction((ActionEvent jhj)->{
              Label art=new Label("Are you sure to delete this system user?"); 
              art.setStyle("-fx-font: bold 25px 'Cambria'; -fx-text-fill:azure");
              Button yes=new Button("Yes"); Button no=new Button("No");
              yes.setStyle("-fx-background-color:green; -fx-font:bold 18px 'Cambria'; -fx-text-fill: azure");
              no.setStyle("-fx-background-color:red; -fx-font:bold 18px 'Cambria'; -fx-text-fill: azure");
              
              //scene
              GridPane hyt6=new GridPane(); hyt6.setVgap(8); hyt6.setHgap(8); hyt6.setPadding(new Insets(2,2,2,2));
              hyt6.setAlignment(Pos.CENTER); hyt6.setBackground(bg1); hyt6.add(art,0,0); hyt6.add(yes,0,2); hyt6.add(no,1,2);
              Stage fte=new Stage(); fte.setHeight(220); fte.setWidth(550); fte.setResizable(false); fte.initOwner(Stage); 
              Scene htre=new Scene(hyt6); fte.setScene(htre); fte.setOpacity(0.9); fte.show(); 
              
              yes.setOnAction((ActionEvent uy)->{
                  //reading
              try{
              FileInputStream inut=new FileInputStream("slz.dll");
              ObjectInputStream inb=new ObjectInputStream(inut);
              list=new ArrayList();list=(List) inb.readObject();
              list.remove(lv42.getSelectionModel().getSelectedIndex());
              
              //writing 
              FileOutputStream fut=new FileOutputStream("slz.dll");
              ObjectOutputStream but=new ObjectOutputStream(fut);
              but.writeObject(list); 
              
              FileInputStream inut2=new FileInputStream("pdb.dll");
              ObjectInputStream obyt=new ObjectInputStream(inut2);
              pr=new Properties(); pr=(Properties) obyt.readObject();
              System.out.println(lv42.getSelectionModel().getSelectedItem().toString());
              pr.remove(lv42.getSelectionModel().getSelectedItem().toString()); 
              
              FileOutputStream fut2=new FileOutputStream("pdb.dll");
              ObjectOutputStream but2=new ObjectOutputStream(fut2);
              but2.writeObject(pr);
              lv42.getItems().remove(lv42.getSelectionModel().getSelectedIndex());
              fte.close();
              
              } catch (FileNotFoundException ex) {
                  System.out.println("Error in file......");
              } catch (IOException | ClassNotFoundException ex) {
                  System.out.println("Error in file......");
              }
              });
              no.setOnAction((ActionEvent)->{
                  fte.close();
              });
          });
          ed2.setOnAction((ActionEvent jhhj)->{
              String tyo=lv42.getSelectionModel().getSelectedItem().toString();
              Label wqe=new Label("Acount Reset"); wqe.setStyle("-fx-font:bold 33px 'Cambria';-fx-text-fill:azure");
              Label wqe2=new Label(tyo); wqe2.setStyle("-fx-font:bold 23px 'Cambria';-fx-text-fill:azure");
              Label gty=new Label("Enter new Password"); Label gty2=new Label("Confirm Password");
              gty.setPrefSize(230,27); gty2.setPrefSize(230,27);
              gty.setStyle("-fx-font: bold 19px 'Cambria'; -fx-text-fill:azure;"); 
              gty2.setStyle("-fx-font: bold 19px 'Cambria'; -fx-text-fill:azure;");
              PasswordField pff=new PasswordField(); PasswordField pff2=new PasswordField();
              Button rst=new Button("Reset"); rst.setStyle("-fx-background-color:navy; -fx-font: bold 19px 'Cambria'; -fx-text-fill:azure");
              rst.setPrefSize(200,27);
              
              GridPane rtty=new GridPane(); rtty.setVgap(12); rtty.setHgap(7); rtty.setPadding(new Insets(2,2,2,2)); rtty.setAlignment(Pos.CENTER);
              rtty.setBackground(bg1); rtty.add(wqe,0,0); rtty.add(wqe2,0,1); rtty.add(gty,0,2); rtty.add(gty2,0,3); rtty.add(pff,1,2);
              rtty.add(pff2,1,3); rtty.add(rst,1,4);
              
              Stage opp=new Stage(); opp.setHeight(320); opp.setWidth(500); opp.setResizable(false);
              opp.initOwner(Stage); opp.setOpacity(0.9);
              Scene gtd=new Scene(rtty); opp.setScene(gtd); opp.show();
              
              rst.setOnAction((ActionEvent)->{
              try {
                  FileInputStream inu=new FileInputStream("pdb.dll");
                  ObjectInputStream bou=new ObjectInputStream(inu);
                  pr=new Properties(); pr=(Properties) bou.readObject();
                  pr.setProperty(tyo,pff2.getText()); 
                  
                  FileOutputStream outr=new FileOutputStream("pdb.dll");
                  ObjectOutputStream outy=new ObjectOutputStream(outr);
                  outy.writeObject(pr); 
                  
                  opp.close();
                  
              } catch (FileNotFoundException ex) {
                  System.out.println("error fetching file..");
              } catch (IOException | ClassNotFoundException ex) {
                  System.out.println("error fetching file..");
              }
                  
              });
          });
          
          cell.textProperty().bind(cell.itemProperty()); //cell.setContextMenu(cnm);
          cell.emptyProperty().addListener((obs,wasEmpty, isNowEmpty)->{
              if(isNowEmpty) {
                  dl2.setDisable(true); ed2.setDisable(true);
              } else {
                  dl2.setDisable(false); ed2.setDisable(false); cell.setContextMenu(cnm);
              }
          });
          return cell;
      });
      
      //Actions
      lg.setOnAction((ActionEvent Syr)->{
          if(ch.getValue().equals("Sales")){
              try {
                  FileInputStream slzin=new FileInputStream("slz.dll");
                  ObjectInputStream obin=new ObjectInputStream(slzin);
                  list=new ArrayList(); list=(List) obin.readObject(); obin.close(); slzin.close(); 
                  if(list.contains(uf.getText())){
                      FileInputStream psdin=new FileInputStream("pdb.dll");
                      ObjectInputStream obpin=new ObjectInputStream(psdin);
                      pr=new Properties(); pr=(Properties) obpin.readObject(); obpin.close(); psdin.close();
                      if(pf.getText().equals(pr.getProperty(uf.getText()))){ uuss="usr"; hhd.getChildren().remove(hb);
                          box.getChildren().clear(); hb.getChildren().clear();
                          stck.setPrefSize(190,30); ad.setPrefSize(190,30); salz.setPrefSize(190,30); lgt.setPrefSize(190,30); adst.setPrefSize(190,30);
                          dslz.setPrefSize(190,30);
                          box.add(ad,0,0); box.add(salz,0,1); box.add(adst,0,2); box.add(dslz,0,3);
                          box.add(stck,0,4); box.add(lgt,0,5);
                          brd.setLeft(box); log.getChildren().clear(); 
                      } else {log.add(lgr,1,4); }
                  }else {log.add(lgr,1,4); }
                  
                  //pr.clear(); pr=null;
              } catch (FileNotFoundException | ClassNotFoundException ex) {
                  System.out.println("Error accessing database.");
              } catch (IOException ex) {
                  System.out.println("Error accessing database.");
              }
          } else {
              try{
                  FileInputStream adin=new FileInputStream("adm.dll");
                  ObjectInputStream obinn=new ObjectInputStream(adin);
                  list=new ArrayList(); list=(List) obinn.readObject();
                  
                  if(list.contains(uf.getText())){
                      FileInputStream psdin=new FileInputStream("pdb.dll");
                      ObjectInputStream obpin=new ObjectInputStream(psdin);
                      pr=new Properties(); pr=(Properties) obpin.readObject(); obpin.close(); psdin.close();
                      
                      if(pf.getText().equals(pr.getProperty(uf.getText()))){ uuss="Admin";
                          ad.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:darkgreen; -fx-text-fill:ivory");
                          ad.setPrefSize(150,30); adst.setPrefSize(120,30); dslz.setPrefSize(120,30); rpt.setPrefSize(110,30);syu.setPrefSize(150,30);
                          lgt.setPrefSize(120,30); stck.setPrefSize(130,30); box.getChildren().clear(); hb.getChildren().clear();
                          
                          hb.add(ad,0,0); hb.add(adst,1,0); hb.add(dslz,2,0); hb.add(rpt,3,0); hb.add(syu,4,0); hb.add(stck,5,0); hb.add(lgt,6,0);
                          
                          brd.setLeft(null); log.getChildren().clear();
                          hhd.getChildren().remove(hb); hhd.add(hb,0,2);
                      } else {log.add(lgr,1,4); }
                  } else {log.add(lgr,1,4); }
                  
              }catch (FileNotFoundException | ClassNotFoundException ex) {
                  System.out.println("Error fetching files");
              } catch (IOException ex) {
                  System.out.println("Error fetching files");
              }
          }
      });
      pf.setOnAction((ActionEvent ev)->{
          if(ch.getValue().equals("Sales")){
              try {
                  FileInputStream slzin=new FileInputStream("slz.dll");
                  ObjectInputStream obin=new ObjectInputStream(slzin);
                  list=new ArrayList(); list=(List) obin.readObject(); obin.close(); slzin.close(); 
                  if(list.contains(uf.getText())){
                      FileInputStream psdin=new FileInputStream("pdb.dll");
                      ObjectInputStream obpin=new ObjectInputStream(psdin);
                      pr=new Properties(); pr=(Properties) obpin.readObject(); obpin.close(); psdin.close();
                      if(pf.getText().equals(pr.getProperty(uf.getText()))){ uuss="usr"; hhd.getChildren().remove(hb);
                          box.getChildren().clear(); hb.getChildren().clear();
                          stck.setPrefSize(190,30); ad.setPrefSize(190,30); salz.setPrefSize(190,30); lgt.setPrefSize(190,30); adst.setPrefSize(190,30);
                          dslz.setPrefSize(190,30);
                          box.add(ad,0,0); box.add(salz,0,1); box.add(adst,0,2); box.add(dslz,0,3);
                          box.add(stck,0,4); box.add(lgt,0,5);
                          brd.setLeft(box); log.getChildren().clear(); 
                      } else { log.add(lgr,1,4); }
                  }else {log.add(lgr,1,4); }
                  
                  //pr.clear(); pr=null;
              } catch (FileNotFoundException | ClassNotFoundException ex) {
                  System.out.println("Error accessing database.");
              } catch (IOException ex) {
                  System.out.println("Error accessing database.");
              }
          } else {
              try{
                  FileInputStream adin=new FileInputStream("adm.dll");
                  ObjectInputStream obinn=new ObjectInputStream(adin);
                  list=new ArrayList(); list=(List) obinn.readObject();
                  
                  if(list.contains(uf.getText())){
                      FileInputStream psdin=new FileInputStream("pdb.dll");
                      ObjectInputStream obpin=new ObjectInputStream(psdin);
                      pr=new Properties(); pr=(Properties) obpin.readObject(); obpin.close(); psdin.close();
                      
                      if(pf.getText().equals(pr.getProperty(uf.getText()))){ uuss="Admin";
                          ad.setStyle("-fx-font:bold 17px 'Cambria'; -fx-background-color:darkgreen; -fx-text-fill:ivory");
                          ad.setPrefSize(150,30); adst.setPrefSize(120,30); dslz.setPrefSize(120,30); rpt.setPrefSize(110,30);syu.setPrefSize(150,30);
                          lgt.setPrefSize(120,30); stck.setPrefSize(130,30); box.getChildren().clear(); hb.getChildren().clear();
                          
                          hb.add(ad,0,0); hb.add(adst,1,0); hb.add(dslz,2,0); hb.add(rpt,3,0); hb.add(syu,4,0); hb.add(stck,5,0); hb.add(lgt,6,0);
                          
                          brd.setLeft(null); log.getChildren().clear();
                          hhd.getChildren().remove(hb); hhd.add(hb,0,2);
                      } else {log.add(lgr,1,4); }
                  } else {log.add(lgr,1,4); }
                  
              }catch (FileNotFoundException | ClassNotFoundException ex) {
                  System.out.println("Error fetching files");
              } catch (IOException ex) {
                  System.out.println("Error fetching files");
              }
          }
     });
      ad.setOnAction((ActionEvent sel)->{ log.getChildren().clear(); log.add(org,1,0);
          log.add(nmi,0,1); log.add(din,0,2); log.add(sep,0,3); log.add(dc,0,4); log.add(Qty,0,5);
          log.add(nmif,1,1); log.add(dinf,1,2); log.add(sepf,1,3); log.add(dct,1,4); log.add(qtyf,1,5); log.add(sv,1,7);
      });
      salz.setOnAction((ActionEvent ala)->{ lst.clear(); lst.add(lls);          Date calldate=new Date();
      Calendar jue=new GregorianCalendar(); 
      int ae=jue.get(Calendar.DAY_OF_MONTH),be=jue.get(Calendar.MONTH)+1,ce=jue.get(Calendar.YEAR),de=jue.get(Calendar.HOUR_OF_DAY),
              ee=jue.get(Calendar.MINUTE),fe=jue.get(Calendar.SECOND); String calldt=ae+"/"+be+"/"+ce+" | "+de+":"+ee+":"+fe;
      //reading frm file
      try {                                                                     dtt.setText(calldt);
      FileInputStream innn=new FileInputStream("tem.dll"); 
      ObjectInputStream obiinn=new ObjectInputStream(innn);
      list=new ArrayList(); list=(List) 
      obiinn.readObject(); ObservableList<String> obbb=FXCollections.observableArrayList(list); combo.setItems(obbb); 
      
          log.getChildren().clear(); log.add(jio,1,0); log.add(hit,1,1); //log.add(rt,0,1); log.add(rtt,1,1);
          /*log.add(qt,0,2); log.add(qtt,1,2); log.add(amt,0,3); log.add(amtt,1,3); log.add(dt,0,4); log.add(dtt,1,4);*/
          log.add(adt,0,3); log.add(lvv,1,3);
          log.add(svv,0,5); log.add(ttv,1,5);
          
          //reciept printing
          Button yhg=new Button("Reciept"); yhg.setStyle("-fx-font:bold 15px 'Cambria';-fx-background-color:darkred;-fx-text-fill:azure");
          log.add(yhg,2,5);
          yhg.setOnAction((ActionEvent evv)->{
              System.out.println("Am gona print your reciept");
              List<String> lok=new ArrayList(); 
              if(lvv.getItems().size()>0){
                  for(int i=0; i<lvv.getItems().size(); i++){
                      lok.add(lvv.getItems().get(i).toString());
                  }
                  String hgs=lok.toString().replaceAll("^.|.$","").replace(",","<br/>");
                  String wwb="<html><body><div style=\"background-color:azure\"><h2>SeumX Business Manager</h2><br/><font face=\"Cambria\" size=\"+1\">" 
                          + "<b><i>Payment Reciept.</b></i><br/><br/>"+
                          "<br/>"+hgs+"<br/><br/><b>Total Amount : </b>"+ttllv.getText()+"<br/><br/> Thanks </body></html>";
                  //creating buttons and scene
                  Label rct=new Label("Reciept");rct.setStyle("-fx-font:bold 29px 'Cambria'; -fx-text-fill:azure");
                  Button re=new Button("Print"); re.setStyle("-fx-font:bold 15px 'Cambria'; -fx-background-color:darkgreen; -fx-text-fill:azure");
                  Button re2=new Button("Cancel"); re2.setStyle("-fx-font:bold 15px 'Cambria'; -fx-background-color:darkred; -fx-text-fill:azure");
                  WebView vuy=new WebView(); vuy.setPrefSize(524,397); vuy.getEngine().loadContent(wwb); 
                  Stage le=new Stage(); le.setHeight(407); le.setWidth(700); le.setResizable(false); le.setOpacity(0.9); le.initOwner(Stage);
                  
                  GridPane ke=new GridPane(); ke.setVgap(8); ke.setHgap(8); ke.setPadding(new Insets(2,2,2,2)); ke.setAlignment(Pos.CENTER);
                  ke.setBackground(bg1); ke.add(rct,0,0); ke.add(vuy,0,1); ke.add(re,0,2); ke.add(re2,1,2);
                  Scene hga=new Scene(ke); le.setScene(hga); le.show();
                  
                  re.setOnAction((ActionEvent ev)->{ 
                      PrinterJob pjc=PrinterJob.createPrinterJob();
                      if(pjc!=null && pjc.showPrintDialog(Stage)){ le.close();
                      vuy.getEngine().print(pjc); pjc.endJob();
                    }
                  });
                  re2.setOnAction((ActionEvent ev)->{
                      le.close();
                  });
              }
          });
          
      } catch (FileNotFoundException ex){
          System.out.println("File Not found");
      } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(TESAN_OILS.class.getName()).log(Level.SEVERE, null, ex);
        }
      });
      lgt.setOnAction((ActionEvent pro)->{ hhd.getChildren().remove(hb); hb.getChildren().clear();
          log.getChildren().clear(); brd.setLeft(null); ch.setValue(null); uf.setText(""); pf.setText(null);
          log.add(sl,1,0); log.add(uty,0,1); log.add(ch,1,1); log.add(usr,0,2); log.add(uf,1,2); 
          log.add(pas,0,3); log.add(pf,1,3); log.add(lg,1,5); log.add(fgt,1,6); pr.clear(); pr=null; list.clear(); list=null;
          hhd.getChildren().remove(hb); 
      });
      stck.setOnAction((ActionEvent digital)->{
          //adding data to listview
          //item
          try{
            FileInputStream ffin = new FileInputStream("tem.dll");
            ObjectInputStream obi=new ObjectInputStream(ffin);
            list=new ArrayList(); list=(List) obi.readObject();
            //String itnm=list.toString();
            
            ObservableList<String> tg=FXCollections.observableArrayList(lst);
            GridPane gwe=new GridPane(); gwe.setVgap(7); gwe.setHgap(7); gwe.setPadding(new Insets(2,2,2,2)); gwe.setAlignment(Pos.CENTER);
            gwe.setBackground(bg1); gwe.add(lv,0,0); gwe.add(itdet,1,0);
            log.getChildren().clear(); tg.clear(); lst.clear();
            tg.addAll(list); lv.setItems(tg); log.add(gyr,0,0); log.add(gwe,0,2); 
          } catch (FileNotFoundException ex) {
              System.out.println("File lost...");
          } catch (IOException | ClassNotFoundException ex) {
            System.out.println("File lost...");
        }
          
      });
      sv.setOnAction((ActionEvent hkk)->{ dlg.getChildren().clear(); 
      if(!nmif.getText().equals("") && dinf.getValue()!=null && !sepf.getText().equals("") && !qtyf.getText().equals("") && !dct.getText().equals("")) {
          Label flt=new Label("This item will be added in your store as a new stock");
          Label iity=new Label(nmif.getText()); Label ddy=new Label("Do you want to proceed"); Label jrw=new Label(dct.getText());
          ddy.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:lightblue");
          Label ssp=new Label(sepf.getText()); Label qqt=new Label(qtyf.getText()); qqt.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:aqua");
          flt.setStyle("-fx-font:bold 17px 'Cambria';-fx-text-fill:aqua"); iity.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
          ssp.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure"); qqt.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
          jrw.setStyle("-fx-font:bold 15px 'Cambria';-fx-text-fill:azure");
          dlg.add(flt,0,0); dlg.add(iity,0,2); dlg.add(ssp,0,3); dlg.add(qqt,0,4); dlg.add(jrw,0,5); dlg.add(ddy,0,6); 
          dlg.add(ok,0,7); dlg.add(cnc,1,7);
          dialog.show(); } 
            else {
          log.add(niu,1,6);
      }
      });
      ok.setOnAction((ActionEvent seal)->{
        try { log.getChildren().remove(niu);
            //name of item
            FileInputStream ffin=new FileInputStream("tem.dll");
            ObjectInputStream obi=new ObjectInputStream(ffin);
            list=new ArrayList(); list=(List) obi.readObject();
            list.add(nmif.getText());
            //write
            FileOutputStream ffot=new FileOutputStream("tem.dll");
            ObjectOutputStream obo=new ObjectOutputStream(ffot);
            obo.writeObject(list); obo.flush(); obo.close(); ffot.close(); 
            
            //selling price
            FileInputStream ffin2=new FileInputStream("pc.dll");
            ObjectInputStream obi2=new ObjectInputStream(ffin2);
            pr=new Properties(); pr=(Properties) obi2.readObject();
            pr.put(nmif.getText(),sepf.getText());
            //write
            FileOutputStream ffot2=new FileOutputStream("pc.dll");
            ObjectOutputStream obo2=new ObjectOutputStream(ffot2);
            obo2.writeObject(pr); obo2.flush(); obo2.close(); ffot2.close();
            
            //discount price
            FileInputStream ffin5=new FileInputStream("dsct.dll");
            ObjectInputStream obi5=new ObjectInputStream(ffin5);
            pr=new Properties(); pr=(Properties) obi5.readObject();
            pr.put(nmif.getText(),dct.getText());
            //write
            FileOutputStream ffot5=new FileOutputStream("dsct.dll");
            ObjectOutputStream obo5=new ObjectOutputStream(ffot5);
            obo5.writeObject(pr); obo5.flush(); obo5.close(); ffot5.close();
            
            //Quantity
            FileInputStream ffin3=new FileInputStream("qty.dll");
            ObjectInputStream obi3=new ObjectInputStream(ffin3);
            pr=new Properties(); pr=(Properties) obi3.readObject();
            pr.put(nmif.getText(),qtyf.getText());
            //write
            FileOutputStream ffot3=new FileOutputStream("qty.dll");
            ObjectOutputStream obo3=new ObjectOutputStream(ffot3);
            obo3.writeObject(pr); obo3.flush(); obo3.close(); ffot3.close();
            
            //Date in
            FileInputStream ffin4=new FileInputStream("dtn.dll");
            ObjectInputStream obi4=new ObjectInputStream(ffin4);
            pr=new Properties(); pr=(Properties) obi4.readObject();
            pr.put(nmif.getText(),dinf.getValue().toString());
            //write
            FileOutputStream ffot4=new FileOutputStream("dtn.dll");
            ObjectOutputStream obo4=new ObjectOutputStream(ffot4);
            obo4.writeObject(pr); obo4.flush(); obo4.close(); ffot4.close();
            pr.clear(); pr=null;
            dialog.close(); log.getChildren().remove(ceen); log.add(ceen,1,8); nmif.setText(""); dinf.setValue(null); sepf.setText(""); 
            qtyf.setText(""); dct.setText("");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Database does not exist");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Database does not exist");
        }
          
      });
      cnc.setOnAction((ActionEvent xtreme)->{
          dialog.close(); 
      });
      adst.setOnAction((ActionEvent me)->{ ols.clear();
          try {
            FileInputStream instty=new FileInputStream("tem.dll");
            ObjectInputStream obiyhy=new ObjectInputStream(instty);   
            list=new ArrayList(); list=(List) obiyhy.readObject();
            ols.addAll(list); tms.setItems(ols); 
          log.getChildren().clear(); log.add(itm1,0,1); log.add(qt1,0,2); log.add(str1,1,0); log.add(tms,1,1); log.add(qty1,1,2); log.add(sv1,1,3);
          } catch (FileNotFoundException ex) {
              System.out.println("Error fetching file....");
          } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error fetching file....");
        }
      });
      sv1.setOnAction((ActionEvent eyt)->{
          log.getChildren().clear(); log.add(itm1,0,1); log.add(qt1,0,2); log.add(str1,1,0); log.add(tms,1,1); log.add(qty1,1,2); log.add(sv1,1,3);
        try {
            if(str1.getText()!=null && qty1.getText()!=null) { log.getChildren().remove(niu);
            //time
            Calendar cl=new GregorianCalendar(); int d=cl.get(Calendar.DAY_OF_MONTH); int m=cl.get(Calendar.MONTH)+1; int bt;
            int y=cl.get(Calendar.YEAR); String dttt=d+"/"+m+"/"+y;
            //reading frm file
            FileInputStream finnn=new FileInputStream("qty.dll");
            ObjectInputStream obiin=new ObjectInputStream(finnn);
            pr=new Properties(); pr=(Properties) obiin.readObject(); String stttr=pr.getProperty(tms.getValue()),sttr=qty1.getText();
            System.out.println(sttr+"\n"+stttr);
            int a=Integer.valueOf(stttr); int b =Integer.valueOf(sttr); int c=a+b; String vvv=String.valueOf(c);
            pr.setProperty(tms.getValue(), vvv);
            
            //writing frm file
            FileOutputStream ouut=new FileOutputStream("qty.dll");
            ObjectOutputStream obuun=new ObjectOutputStream(ouut);
            obuun.writeObject(pr); obuun.flush(); obuun.close(); ouut.close(); 
            
            //writing stck ++ dbs
            FileInputStream inn=new FileInputStream("stkad.dll");
            ObjectInputStream oin=new ObjectInputStream(inn);
            list=new ArrayList(); list=(List) oin.readObject();                 String trn=dttt+" | "+tms.getValue()+" | "+qty1.getText();
            list.add(trn);
            
            FileOutputStream fou=new FileOutputStream("stkad.dll");
            ObjectOutputStream oib=new ObjectOutputStream(fou);
            oib.writeObject(list); fou.close(); oib.close();  
            
            pr.clear(); pr=null; } else {log.add(niu,1,5);}
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TESAN_OILS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Silmatic...");
        }
          log.getChildren().remove(scs); log.add(scs,1,4); qty1.setText(""); tms.setValue("");
      });
      dslz.setOnAction((ActionEvent evv)->{ llst.clear(); ollst.clear(); lv1.setItems(null);
        try {
            //reading sales data from file
            FileInputStream inf=new FileInputStream("dsalz.dll");
            ObjectInputStream bin=new ObjectInputStream(inf);
            list=new ArrayList(); list=(List) bin.readObject(); //Set st; String keys;
            
            //adding all database items to list
            for(int i=0; i<list.size(); i++){
                llst.add(list.get(i)); //System.out.println(llst);
            }
            
            //getting data for at
            Calendar cl=new GregorianCalendar(); int d=cl.get(Calendar.DAY_OF_MONTH); int m=cl.get(Calendar.MONTH)+1;
            int y=cl.get(Calendar.YEAR);
            String dttt=d+"/"+m+"/"+y;
            
            FileInputStream stm=new FileInputStream("dam.dll");
            ObjectInputStream obi=new ObjectInputStream(stm);
            
            pr=new Properties(); pr=(Properties) obi.readObject(); Set stt; String tre;
            stt=pr.keySet(); Iterator it=stt.iterator(); 
            while(it.hasNext()){
                tre=(String) it.next(); System.out.println(tre); System.out.println(pr.getProperty(tre));
            
            if(pr.getProperty(dttt)!=null){
                at.setText(pr.getProperty(dttt));
            } else {
                at.setText("0");
            }   }
            
            //final
            ollst.addAll(llst); lv1.setItems(ollst); 
            log.getChildren().clear(); log.add(dsu,0,0); log.add(lv1,0,2);
            //pr.clear(); pr=null;
            
        } catch (FileNotFoundException ex) {
            System.out.println("File no found");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("File no found");
        }
          
      });
      fgt.setOnAction((ActionEvent evv)->{
          log.add(adf,1,7);
      });
      lv.setOnMouseClicked((new EventHandler<MouseEvent>(){
          @Override
          public void handle(MouseEvent ev){
              if(ev.getClickCount()==1 && lv.getSelectionModel().getSelectedItem()!=null){
                  String itnm=lv.getSelectionModel().getSelectedItem().toString();
                  //read data
        try {
            String sttr,sttr2,sttr3,sttr4;
            //price
            FileInputStream ffin2=new FileInputStream("pc.dll");
            ObjectInputStream obi2=new ObjectInputStream(ffin2);
            pr=new Properties(); pr=(Properties) obi2.readObject(); 
            sttr=pr.getProperty(itnm);                                          itnamed.setText(itnm); itpcd.setText(sttr);
            
            //qty
            FileInputStream ffin3=new FileInputStream("qty.dll");
            ObjectInputStream obi3=new ObjectInputStream(ffin3);
            pr=new Properties(); pr=(Properties) obi3.readObject();
            sttr2=pr.getProperty(itnm);                                         itqtd.setText(sttr2); 
            
            //datein
            FileInputStream ffin4=new FileInputStream("dtn.dll");
            ObjectInputStream obi4=new ObjectInputStream(ffin4);
            pr=new Properties(); pr=(Properties) obi4.readObject();
            sttr3=pr.getProperty(itnm);                                         itdnd.setText(sttr3); 
            
            //discount price
            FileInputStream ffin5=new FileInputStream("dsct.dll");
            ObjectInputStream obi5=new ObjectInputStream(ffin5);
            pr=new Properties(); pr=(Properties) obi5.readObject();
            sttr4=pr.getProperty(itnm);                                         itdcd.setText(sttr4);
            
            pr.clear(); pr=null;
        } catch (FileNotFoundException ex) {
            System.out.println("Unsupported file....");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Unsupported file....");
        }
              }
          }
      }));
      combo.setOnAction((ActionEvent evv)->{
        try {
            if(cbb.getValue().equals("Normal")){
            FileInputStream finnn=new FileInputStream("pc.dll");
            ObjectInputStream obiin=new ObjectInputStream(finnn);
            pr=new Properties(); pr=(Properties) obiin.readObject(); String tgh=pr.getProperty(combo.getValue());
            int rate=Integer.valueOf(tgh); rtt.setText(tgh);
            pr.clear(); pr=null; }
            
            if(cbb.getValue().equals("Discount")){
            FileInputStream finnn=new FileInputStream("dsct.dll");
            ObjectInputStream obiin=new ObjectInputStream(finnn);
            pr=new Properties(); pr=(Properties) obiin.readObject(); String tgh=pr.getProperty(combo.getValue());
            int rate=Integer.valueOf(tgh); rtt.setText(tgh);
            pr.clear(); pr=null; }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error fetching file...");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error fetching file...");
        }
          
      });
      qtt.setOnKeyReleased((new EventHandler<KeyEvent>(){
          @Override
          public void handle(KeyEvent ev){
          int t=Integer.valueOf(qtt.getText()); int v=Integer.valueOf(rtt.getText()); int h=t*v;
          amtt.setText(String.valueOf(h)); 
          }
      }));
      qtt.setOnAction((ActionEvent ev)->{
          /*int t=Integer.valueOf(qtt.getText()); int v=Integer.valueOf(rtt.getText()); int h=t*v;
          amtt.setText(String.valueOf(h)); */
      });
      adt.setOnAction((ActionEvent evv)->{              
      Calendar jue=new GregorianCalendar(); 
      int ae=jue.get(Calendar.DAY_OF_MONTH),be=jue.get(Calendar.MONTH)+1,ce=jue.get(Calendar.YEAR),de=jue.get(Calendar.HOUR_OF_DAY),
              ee=jue.get(Calendar.MINUTE),fe=jue.get(Calendar.SECOND); String calldt=ae+"/"+be+"/"+ce+" | "+de+":"+ee+":"+fe;
      dtt.setText(calldt);
          
        try { 
            if(combo.getValue()!=null && rtt.getText()!=null && qtt.getText()!=null && !amtt.getText().equals("")) {
            hit.getChildren().remove(niu);
            //Updating Stock
            FileInputStream fin=new FileInputStream("qty.dll");  int t,e,o;
            ObjectInputStream oni=new ObjectInputStream(fin);       String y=combo.getValue();
            pr=new Properties(); pr=(Properties) oni.readObject();  String c=pr.getProperty(y); 
            t=Integer.valueOf(c); e=Integer.valueOf(qtt.getText()); o=t-e; String yt=String.valueOf(o);
            if(c!=null){  if(e<=t && e>0) {
                //adding to list
                String hj=combo.getValue()+"     |     "+rtt.getText()+"    |    "+qtt.getText()+"    |   "+amtt.getText()+"   |   "+dtt.getText();
                fg.add(hj); ObservableList<String> tu=FXCollections.observableArrayList(fg); 
                lvv.setItems(tu); int ammmmt=Integer.valueOf(amtt.getText());
                total=total+ammmmt; ttllv.setText(String.valueOf(total)); 
                
                //stock update
                pr.setProperty(y,yt); System.out.println("Stock updated....."+yt);
                FileOutputStream ou=new FileOutputStream("qty.dll");
                ObjectOutputStream obu=new ObjectOutputStream(ou);
                obu.writeObject(pr); 
                t=0;e=0;o=0; System.out.println(t+""+e+""+o+"values cleared");
                
                //backing up trsn stock
                FileInputStream ine=new FileInputStream("upstk.dll");
                ObjectInputStream bne=new ObjectInputStream(ine);
                pr=new Properties(); pr=(Properties) bne.readObject(); //System.out.println(pr);
                pr.put(hj,qtt.getText()); 
                
                FileOutputStream oute=new FileOutputStream("upstk.dll");
                ObjectOutputStream obje=new ObjectOutputStream(oute);
                obje.writeObject(pr); System.out.println(pr);
                
                //backing up trn cash 
                FileInputStream ine2=new FileInputStream("upsalz.dll");
                ObjectInputStream bne2=new ObjectInputStream(ine2);
                pr=new Properties(); pr=(Properties) bne2.readObject(); //System.out.println(pr);
                pr.put(hj,amtt.getText());  
                
                FileOutputStream oute2=new FileOutputStream("upsalz.dll");
                ObjectOutputStream obje2=new ObjectOutputStream(oute2);
                obje2.writeObject(pr); System.out.println(pr);
                
            } else {
                ste.show();
            }
            
            }       } else { hit.add(niu,1,5); }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found ");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("File not found ");
        }
        //clearing fields
          combo.setValue(null); rtt.setText(""); qtt.setText(""); amtt.setText("");
      });
      svv.setOnAction((ActionEvent evv)->{
        try { 
            //get values for store
            /*Calendar cl=new GregorianCalendar(); int d=cl.get(Calendar.DAY_OF_MONTH); int m=cl.get(Calendar.MONTH)+1;
            int y=cl.get(Calendar.YEAR);// int h=cl.get(Calendar.HOUR)+1; int mn=cl.get(Calendar.MINUTE); int s=cl.get(Calendar.SECOND);
            String dbdat=d+"/"+m+"/"+y+"|"+cl.get(Calendar.HOUR)+":"+cl.get(Calendar.MINUTE)+":"+cl.get(Calendar.SECOND); System.out.println(dbdat);*/
            
            FileInputStream fini=new FileInputStream("dsalz.dll");
            ObjectInputStream obinn=new ObjectInputStream(fini);
            list=new ArrayList(); list=(List) obinn.readObject();
            //writing data to prty
            for(int i=0;i<fg.size();i++){
                list.add(fg.get(i).toString());System.out.println(fg.get(i).toString());
            }
            
            //writing prty to file
            FileOutputStream outt=new FileOutputStream("dsalz.dll");
            ObjectOutputStream obbbin=new ObjectOutputStream(outt);
            obbbin.writeObject(list); fg.clear(); lvv.setItems(null); System.out.println("daily sales saved..."); 
            dialog1.show(); 
             
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("File not found");
        }
      });
      cb.setOnAction((ActionEvent evv)->{
          if(cb.getValue().equals("Name")){
              dsu.getChildren().remove(ttf); dsu.add(ttf,3,1);
          }
          if(cb.getValue().equals("Date")){
              dsu.getChildren().remove(ttf); dsu.add(ttf,3,1);
          }
      });
      pkk.setOnAction((ActionEvent er)->{ llst.clear(); ollst.clear(); lv1.setItems(null);
        try {
            FileInputStream fn=new FileInputStream("dsalz.dll");
            ObjectInputStream of=new ObjectInputStream(fn);
            list=new ArrayList(); list=(List) of.readObject();
            for(int i=0; i<list.size(); i++){
                if(list.get(i).contains(pkk.getValue().toString())){
                    llst.add(list.get(i)); System.out.println(list.get(i));
                }
            }
            ollst.addAll(llst); lv1.setItems(ollst);
        } catch (FileNotFoundException ex) {
            System.out.println("error reading file");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("error reading file");
        }
      });
      ttf.setOnKeyReleased(ty->{ llst.clear(); ollst.clear(); lv1.setItems(null);
          try {
            FileInputStream fn=new FileInputStream("dsalz.dll");
            ObjectInputStream of=new ObjectInputStream(fn);
            list=new ArrayList(); list=(List) of.readObject();
            for(int i=0; i<list.size(); i++){
                if(list.get(i).contains(ttf.getText())){
                    llst.add(list.get(i)); System.out.println(list.get(i));
                }
            }
            ollst.addAll(llst); lv1.setItems(ollst);
            
            //updating dsalz by date
            FileInputStream inj=new FileInputStream("dam.dll");                 Set stt; String ky;
            ObjectInputStream onin=new ObjectInputStream(inj);
            pr=new Properties(); pr=(Properties) onin.readObject();
            stt=pr.keySet(); Iterator itt=stt.iterator(); ky=(String) itt.next(); 
            if(pr.getProperty(ttf.getText())!=null){
                at.setText(pr.getProperty(ttf.getText()));
            } else {at.setText("0"); }
            
        } catch (FileNotFoundException ex) {
            System.out.println("error reading file");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("error reading file");
        }
      });
      kkk.setOnAction((ActionEvent uy)->{
          try { System.out.println("Opening accounts center...."); 
            Calendar cl=new GregorianCalendar(); int d=cl.get(Calendar.DAY_OF_MONTH); int m=cl.get(Calendar.MONTH)+1; int b;
            int y=cl.get(Calendar.YEAR);
            //saving total d salz
            String dttt=d+"/"+m+"/"+y;
            FileInputStream ins=new FileInputStream("dam.dll");                 String hsl,ki; Set st; 
            ObjectInputStream obinb=new ObjectInputStream(ins);                 
            Properties prt; prt=(Properties) obinb.readObject();            
            st=prt.keySet(); Iterator it=st.iterator(); 
            if(it.hasNext()){ System.out.println("entering file data");
                hsl=(String) it.next(); ki=prt.getProperty(hsl); System.out.println(hsl); System.out.println(ki); 
                
                //updating and saving values
                int x=Integer.valueOf(prt.getProperty(dttt));/*u=Integer.valueOf(ttllv.getText())*/  b=x+total; 
                System.out.println(x+"\n"+total+"\n"+b);
                //writing file back
                prt.setProperty(dttt,String.valueOf(b));
                //prt.put(dttt,String.valueOf(b));
                FileOutputStream ot=new FileOutputStream("dam.dll"); 
                ObjectOutputStream obot=new ObjectOutputStream(ot);
                obot.writeObject(prt); /*obot.flush(); obot.close(); ot.close();*/ System.out.println("writing....");
            
            /*if(hsl.contains(dttt)){ 
                //int x=Integer.valueOf(prt.getProperty(dttt))+total;
                prt.put(dttt,String.valueOf(x));
                //writing file back
                FileOutputStream ot=new FileOutputStream("dam.dll"); 
                ObjectOutputStream obot=new ObjectOutputStream(ot);
                obot.writeObject(prt); obot.flush(); obot.close(); ot.close(); System.out.println("writing....");
            } 
            else if(!hsl.contains(dttt)){ 
                //int x=total;
                prt.put(dttt,String.valueOf(x));
                //writing file back
                FileOutputStream ot=new FileOutputStream("dam.dll");
                ObjectOutputStream obot=new ObjectOutputStream(ot);
                obot.writeObject(prt); obot.flush(); obot.close(); ot.close(); System.out.println("creating....");
            }*/
          }
          } catch (FileNotFoundException ex) {
              System.out.println("Am experiencing trouble...");
          } catch (IOException | ClassNotFoundException ex){
              System.out.println("Am experiencing trouble...");
          }
          ttllv.setText("0"); total=0; dialog1.close();
      });
      gt.setOnAction((ActionEvent evv)->{
          ste.close(); 
      });
      rpt.setOnAction((ActionEvent ii)->{
          try {
          //time
          Calendar cl=new GregorianCalendar(); int d=cl.get(Calendar.DAY_OF_MONTH); int m=cl.get(Calendar.MONTH)+1; int b;
          int y=cl.get(Calendar.YEAR); List<String> dte=new ArrayList(); List<String> dtf=new ArrayList();
          //saving total d salz
          String dttt=d+"/"+m+"/"+y; String atmt;
          //calling data files
          FileInputStream inf=new FileInputStream("dsalz.dll");
          ObjectInputStream obif=new ObjectInputStream(inf);
          list =new ArrayList(); list=(List) obif.readObject(); 
          
          for(int i=0; i<list.size(); i++){
              if(list.get(i).contains(dttt)){
                  dtf.add(list.get(i));
              }
          }
          int trp=dtf.size(); String ft=String.valueOf(trp);
          
          FileInputStream inf2=new FileInputStream("dam.dll"); 
          ObjectInputStream obif2=new ObjectInputStream(inf2);
          pr=new Properties(); pr=(Properties) obif2.readObject();
          if(pr.getProperty(dttt)!=null){
              atmt=pr.getProperty(dttt);
          } else {atmt="0";}
          
          FileInputStream inf3=new FileInputStream("stkad.dll");
          ObjectInputStream obif3=new ObjectInputStream(inf3);
          list=new ArrayList(); list=(List) obif3.readObject();
          for(int i=0; i<list.size(); i++){
              if(list.get(i).contains(dttt)){
                  dte.add(list.get(i));
              }
          }
          String tad=dte.toString().replaceAll("^.|.$","").replace(",","<br/>");
          rpst="<html><body><div style=\"background-color:aliceblue\"><span style=\"color:navy\"><h2>SeumX Business Manager REPORT</h2></span>"+
          "<font face=\"Cambria\" size=\"+1\" color=\"black\" ><b>Date : </b>"+dttt+".<br/><br/><br/> <b>Items Sold : </b>"+ft+
          ".<br/><br/><br/><b>Amount Collected : </b>"+atmt+".<br/><br/><br/> <b>Stock added to store : </b><br/>"+tad+"\n"+". "
                  + "<br/><br/><br/><br/>"
                //  + " <span style=\"background-color:plum\"><i><b>SeumX+ (C) 2019. All Rights Reserved.</b></i> </span>"
                  + "</div> </body> </html>"; 
          
          web.getEngine().loadContent(rpst); 
          log.getChildren().clear(); log.add(ddr,0,0); log.add(web,0,1); log.add(sav,0,2); log.add(prit,1,2);
          } catch (FileNotFoundException ex) {
              
          } catch (IOException | ClassNotFoundException ex) {
              
          }
      });
      syu.setOnAction((ActionEvent ht)->{ hy.clear(); hy2.clear(); hh.clear(); hh2.clear(); lv4.setItems(null); lv42.setItems(null); 
          try{
          //getting data
          FileInputStream ino=new FileInputStream("adm.dll");
          ObjectInputStream oning=new ObjectInputStream(ino);
          list=new ArrayList(); list=(List) oning.readObject();
          for (int i=0; i<list.size(); i++){
              hy.add(list.get(i));
          }
          
          FileInputStream ino2=new FileInputStream("slz.dll");
          ObjectInputStream oning2=new ObjectInputStream(ino2);
          list=new ArrayList(); list=(List) oning2.readObject();
          for(int i=0; i<list.size(); i++){
              hy2.add(list.get(i));
          }
          
          hh.addAll(hy); lv4.setItems(hh); hh2.addAll(hy2); lv42.setItems(hh2);
          log.getChildren().clear(); log.add(gtr,0,0); log.add(gtr2,0,1);
          } catch (FileNotFoundException ex) {
              
          } catch (IOException | ClassNotFoundException ex) {
              
          }
      });
      strr.setOnAction((ActionEvent ev)->{
          try {
          List<String> dte=new ArrayList(); List<String> dtf=new ArrayList(); int ct = 0;
          List<String> ht=new ArrayList(); List<String> ht2=new ArrayList(); List<Integer> ht3; String atmt;
          
          //calling data files
          FileInputStream inf=new FileInputStream("dsalz.dll");
          ObjectInputStream obif=new ObjectInputStream(inf);
          list =new ArrayList(); list=(List) obif.readObject(); 
          
          for(int i=0; i<list.size(); i++){
              if(list.get(i).contains(strr.getText())){
                  dtf.add(list.get(i));
              }
          }
          int trp=dtf.size(); String ft=String.valueOf(trp);
          
          FileInputStream inf2=new FileInputStream("dam.dll"); 
          ObjectInputStream obif2=new ObjectInputStream(inf2);
          pr=new Properties(); pr=(Properties) obif2.readObject();
          Set st; st=pr.keySet(); Iterator it=st.iterator();
          while(it.hasNext()){
              ht.add(it.next().toString()); System.out.println(ht);
          }
         for(int i=0; i<pr.size(); i++){
              if(ht.get(i).contains(strr.getText())){
                  ht2.add(pr.getProperty(ht.get(i))); 
              }
          }
         
          ht3=ht2.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList()); System.out.println(ht3);
          for(int i=0; i<ht3.size(); i++){
              ct+=ht3.get(i); System.out.println(ct);
          } atmt=String.valueOf(ct);
          
          FileInputStream inf3=new FileInputStream("stkad.dll");
          ObjectInputStream obif3=new ObjectInputStream(inf3);
          list=new ArrayList(); list=(List) obif3.readObject();
          for(int i=0; i<list.size(); i++){
              if(list.get(i).contains(strr.getText())){
                  dte.add(list.get(i));
              }
          }
          String tad=dte.toString().replaceAll("^.|.$","").replace(",","<br/>");
          rpst="<html><body><div style=\"background-color:aliceblue\"><span style=\"color:navy\"><h2>SeumX Business Manager REPORT</h2></span>"+
          "<font face=\"Cambria\" size=\"+1\" color=\"black\" ><b>Date : </b>"+strr.getText()+".<br/><br/><br/> <b>Items Sold : </b>"+ft+
          ".<br/><br/><br/><b>Amount Collected : </b>"+atmt+".<br/><br/><br/> <b>Stock added to store : </b><br/>"+tad+"\n"+". "
                  + "<br/><br/><br/><br/>"
                //  + " <span style=\"background-color:plum\"><i><b>SeumX+ (C) 2019. All Rights Reserved.</b></i> </span>"
                  + "</div> </body> </html>"; 
          
          web.getEngine().loadContent(rpst); 
          log.getChildren().clear(); log.add(ddr,0,0); log.add(web,0,1); log.add(sav,0,2); log.add(prit,1,2);
          } catch (FileNotFoundException ex) {
              
          } catch (IOException | ClassNotFoundException ex) {
              
          }
      });
      frt.setOnKeyReleased(ev->{ ObservableList<String> gtre=FXCollections.observableArrayList();
          try{ lst.clear(); gtre.clear(); lv.setItems(null);
          //reading
          FileInputStream iny=new FileInputStream("tem.dll");
          ObjectInputStream inb=new ObjectInputStream(iny);
          list=new ArrayList(); list=(List) inb.readObject();
          for(int i=0; i<list.size(); i++){
              if(list.get(i).contains(frt.getText())){
                  lst.add(list.get(i));
              }
          } gtre.addAll(lst); lv.setItems(gtre);
          
          if(frt.getText()==null || frt.getText().equals("")){ 
              gtre.clear(); lv.setItems(null); gtre.addAll(list); lv.setItems(gtre);
          }
          } catch (FileNotFoundException ex) {
              System.out.println("Error......");
          } catch (IOException | ClassNotFoundException ex) {
              
          }
      });
      sav.setOnAction((ActionEvent iu)->{
          FileChooser chh=new FileChooser();
          chh.getExtensionFilters().add(new FileChooser.ExtensionFilter("Report",".html"));
          chh.setTitle("Save your Report"); 
          
          try{
              File file=chh.showSaveDialog(Stage);
              if(file!=null){
                  FileWriter writer=new FileWriter(file);
                  writer.write(rpst); writer.flush(); writer.close(); 
                  //System.out.println("file dt"+rpst); System.out.println("File written");
              }
          } catch (IOException ex) {
              System.out.println("Cant write file.....");
          }
      });
      prit.setOnAction((ActionEvent uy)->{
          PrinterJob pjb=PrinterJob.createPrinterJob();
          if(pjb!=null && pjb.showPrintDialog(Stage)){
              web.getEngine().print(pjb); pjb.endJob();
          }
      });
      srt.setOnKeyReleased(ev->{
          try {
          ObservableList<String> ytu=FXCollections.observableArrayList(); List ytu1=new ArrayList();
              //Reading file
          FileInputStream inuy=new FileInputStream("tem.dll");
          ObjectInputStream obhy=new ObjectInputStream(inuy);
          list=new ArrayList(); list=(List) obhy.readObject();
          //applying combo sorting action
          if(!srt.getText().equals("")) {
          for(int i=0; i<list.size(); i++){
              if(list.get(i).contains(srt.getText())){
                  ytu1.add(list.get(i));
              }
          }
            ytu.addAll(ytu1);  combo.setItems(ytu);
          }
          if(srt.getText().equals("")){
              ytu.addAll(list);
              combo.setItems(ytu);
          }
          
          }catch (FileNotFoundException ex) {
              System.out.println("Error fetching file.....");
          } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error fetching file.....");
        }
      });
      cbb.setOnAction((ActionEvent yu)->{
          combo.setValue(null); rtt.setText("");
      });
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
