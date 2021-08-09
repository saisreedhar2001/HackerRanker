import java.awt.*;
import java.applet.*;
 
public class Applet1 extends Applet
{
Image picture;
public void init(){
   picture = getImage(getCodeBase(),"grocery1.jpg");
}
public void paint(Graphics g){
g.drawImage(picture,30,30,this);
}

}
/* 
<applet code="Applet1.class" width="300" height="300"> 
</applet> 
*/ 