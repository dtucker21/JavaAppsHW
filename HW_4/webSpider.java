import java.awt.*;
import java.net.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import org.xml.sax.helpers.DefaultHandler;

/**
*Searches the internet through links to find as many emails as possible. Because that's cool
*@author Daniel Tucker 
*/
public class webSpider extends DefaultHandler {

    private static URL url;
    private static String uString;
    static int i = 0;

    public static HashMap<String, Boolean> hMap = new HashMap<String, Boolean>(); //URL and if URL has already been visited goes here
    public static HashSet<String> hSet = new HashSet<String>(); //emails go here

    public static void main(String[] args) {
        try {
        uString = "http://www.spokesman.com/staff/";
        url = new URL(uString);
        } catch (MalformedURLException ex) {;}
        
        if (url == null) { return; }
        try {
            hMap.put(uString, true);
            BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            Pattern ePat = Pattern.compile("mailto:(.*?)\"");
            Pattern urlPat = Pattern.compile("www.(.*/)\"");
            while ((line = rdr.readLine()) != null) {

                Matcher mailMatch = ePat.matcher(line); //gets me those sweet, sweet emails. And with them; sweet, sweet homework points.
                Matcher urlMatch = urlPat.matcher(line);

                if (mailMatch.find()) {
                    hSet.add(mailMatch.group(1));
                }
                else if (urlMatch.find()) {
                    i++; //increment i so that the first printed URL is #1 not #0
                    System.out.println("URL #" + i + " is: " + uString);
                    uString = ("https://" + urlMatch.group(1).toString());
                    if ( i > 100 )
                        break;
                    else if (!hMap.containsKey(url.toString()));
                        hMap.put(uString, false);
                }
            }
            rdr.close();

            for (String uStr: hMap.keySet()) {
                if (hMap.get(uStr) == false) {
                    uString = uStr;
                    hMap.put(uStr, true);
                }
            }

        } catch (Exception ex) {
            System.out.printf("Could not find webpage %s\n", uString);
            ex.printStackTrace();
        }

        System.out.printf("Emails: " + hSet.toString() + "\n");
    }
}