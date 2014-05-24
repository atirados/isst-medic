package managedbean;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 * Abstract base class for managed beans to share utility methods.
 */
@Named
@SessionScoped
public class AbstractBean implements Serializable {

    private static final long serialVersionUID = -3375564172975657665L;
    
    /**
     * Return the FacesContext instance for the current request.
     */
    protected FacesContext context() {
        return (FacesContext.getCurrentInstance());
    }

    /**
     * Add a localized message to the
     * FacesContext for the current request.
     *
     * @param clientId Client identifier of the component this message relates
     * to, or null for global messages
     * @param key Message key of the message to include
     */
    protected void message(String clientId, String key) {
        // Look up the requested message text
        String text;

        try {
            ResourceBundle bundle = ResourceBundle.getBundle(
                    "javaeetutorial.dukesbookstore.web.messages.Messages",
                    context().getViewRoot().getLocale());
            text = bundle.getString(key);
        } catch (Exception e) {
            text = "???" + key + "???";
        }

        // Construct and add a FacesMessage containing it
        context().addMessage(clientId, new FacesMessage(text));
    }

    /**
     * Add a localized message to the
     * FacesContext for the current request.
     *
     * @param clientId Client identifier of the component this message relates
     * to, or null for global messages
     * @param key Message key of the message to include
     * @param params Substitution parameters for using the localized text as a
     * message format
     */
    protected void message(String clientId, String key, Object[] params) {
        // Look up the requested message text
        String text;

        try {
            ResourceBundle bundle = ResourceBundle.getBundle(
                    "javaeetutorial.dukesbookstore.web.messages.Messages",
                    context().getViewRoot().getLocale());
            text = bundle.getString(key);
        } catch (Exception e) {
            text = "???" + key + "???";
        }

        // Perform the requested substitutions
        if ((params != null) && (params.length > 0)) {
            text = MessageFormat.format(text, params);
        }

        // Construct and add a FacesMessage containing it
        context().addMessage(clientId, new FacesMessage(text));
    }
}
