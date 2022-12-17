package hello;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "telephoneConverter")
public class TelephoneConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        StringBuilder tel_full = new StringBuilder();
        Telephone telephone = new Telephone();

        if (value == null) {
            return null;
        }

        if (value.length() > 14 || value.length() < 11) {
            FacesMessage msg = new FacesMessage("Telephone conversion error.", "Invalid Telephone format");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
        }
        if (!(value.startsWith("+"))) {
            tel_full.append("+");
        }

        tel_full.append(value);

        tel_full.insert(4, "/");
        tel_full.insert(7, "/");

        telephone.setFull_number(tel_full.toString());
        telephone.setCountry(tel_full.substring(0, 3));
        telephone.setArea(tel_full.substring(3, 5));
        telephone.setNumber(tel_full.substring(5));

        return telephone;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        String string = null;
        if (value instanceof Telephone) {
            string = ((Telephone) value).toString();
        }
        return string;
    }

}
