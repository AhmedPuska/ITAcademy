package tags;

import java.io.IOException;
import javax.servlet.jsp.*;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FormatTag extends SimpleTagSupport{
    
    public String colour;
    public int font_size;
    public boolean is_uppercase;

    public void setcolour(String colour) {
    this.colour = colour;
    }

    public void setfont_size(int font_size) {
    this.font_size = font_size;
    }

    public void setis_uppercase(boolean is_uppercase) {
    this.is_uppercase = is_uppercase;
    }
    
    public void doTag() throws JspException, IOException {
        PageContext pageContext = (PageContext) getJspContext();
        JspWriter out = pageContext.getOut();
        
        String style = "";
        
        if(is_uppercase)
        {
            style = "style=\"text-transform: uppercase; font-size:" 
+ font_size  + "px; color: " + colour + ";\"";
        }
        else
        {
            style = "style=\"font-size:" + font_size  + "px; color: " + colour + ";\"";
        }
        

        try {
            out.print("<p "+ style  +">");
            getJspBody().invoke(out);
            out.print("</p>");

        } catch (IOException | JspException e) {
        }
    }
}