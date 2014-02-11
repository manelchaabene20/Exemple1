/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaire;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
/**
 * @author Walid
 */
public class Midlet extends MIDlet implements CommandListener {
    Display disp = Display.getDisplay(this);
    Form f= new Form("Millionnaire");
    Form f2= new Form("Millionnaire");
    TextField tf= new TextField ("Nom", "", 150,TextField.ANY);
    TextField tfAge= new TextField ("Age", "", 150,TextField.NUMERIC);
    Command cmdNext=new Command("Next", Command.SCREEN,0);
     StringItem  SI=new StringItem("Millionnaire","Welcome");
      Ticker tk=new Ticker("a7na do5na 3alle5r");
    public void startApp() {
        f.append(tf);
        f.append(tfAge);
        f2.append(SI);
        f.addCommand(cmdNext);
        f.setCommandListener(this);
    f2.setTicker(tk);
    
     disp.setCurrent(f);
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
    public void commandAction(Command c, Displayable d) {
       if(c==cmdNext){
        SI.setText(tf.getString());
       disp.setCurrent(f2);}
    }
}