package XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class dom4text {
    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();

        try {
            Document read = saxReader.read("book05\\src\\XML\\b.xml");
//            System.out.println(read);
            Element rootElement = read.getRootElement();
            List<Element> book = rootElement.elements("book");
            for (Element element : book) {
                String name = element.elementText("name");
                Double peric = Double.valueOf(element.elementText("peric"));

                String sn = element.attributeValue("sn");
                System.out.println(new books(sn,name,peric));

            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
