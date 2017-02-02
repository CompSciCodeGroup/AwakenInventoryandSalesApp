package fibonacci;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.URI;
import java.net.URL;

public class importHTML {

    public static void main(String[] args) {
    	String url = "file:///C:/Users/chase/Documents/CompSci/AwakenInventoryandSales/AwakenGUI/index.html";
        openInBrowser(url);
    }

    /**
     * If possible this method opens the default browser to the specified web page.
     * If not it notifies the user of webpage's url so that they may access it
     * manually.
     *
     * @param url
     *            - this can be in the form of a web address (http://www.mywebsite.com)
     *            or a path to an html file or SVG image file e.t.c
     */
    public static void openInBrowser(String url)
    {
        try
        {
            URI uri = new URL(url).toURI();
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE))
                desktop.browse(uri);
        }
        catch (Exception e)
        {
            /*
             *  I know this is bad practice
             *  but we don't want to do anything clever for a specific error
             */
            e.printStackTrace();

            // Copy URL to the clipboard so the user can paste it into their browser
            StringSelection stringSelection = new StringSelection(url);
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
            // Notify the user of the failure
            //WindowTools.informationWindow("This program just tried to open a webpage." + "\n"
            //              + "The URL has been copied to your clipboard, simply paste into your browser to access.",
            //    "Webpage: " + url);
        }
    }
}
