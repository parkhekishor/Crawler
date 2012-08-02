package samyama;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Samyama {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
firstNode("http://sample.com/");
	}

	
	private static void firstNode(String url) {
		try{
			Validate.isTrue(!url.isEmpty(),"Invalid url");
			Document doc=Jsoup.connect(url).get();
//			System.out.println(doc);
			 
			getTitle();
			Elements link=doc.select("a[href]");
//			System.out.println(link);
			Elements div=doc.select("meta[name]");
			
//			singleDoc.getTitle("null");
			System.out.println(div);;
			System.out.println(div.text());
			for(Element e: div){
				Elements e_c=e.getElementsByClass("entry");
				
//				System.out.println(doc.select("p").text());
				for(Element c:e_c){
//					System.out.println(c);
					Elements s=c.siblingElements();
					for(Element el:s)
					System.out.println();	
				}
			
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	
	
	}

	

	private static Elements getTitle( ) {
		
		return null;
		// TODO Auto-generated method stub
		
	}

	
}
 