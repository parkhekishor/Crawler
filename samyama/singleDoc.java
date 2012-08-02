package samyama;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class singleDoc extends Document {

	public singleDoc(String baseUri) {
		super(baseUri);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String url="http://sample.com/";
		Validate.isTrue(!url.isEmpty(),"Invalid url");
		Document doc=Jsoup.connect(url).get();
		System.out.println(metaData(doc));;
	}
	
	public static String metaData(Document doc) {
		Elements meta=doc.select("meta[content]");
		System.out.println(meta);
		String m_d_s="";
		boolean f_c=false;
		for(Element e:meta){
			if (f_c) {
				m_d_s=m_d_s+"\n"+e.attr("content");
			}else {
				m_d_s=e.attr("content");
				f_c=true;
			}
		
		
		}
		return m_d_s;
		
	}
	
	public static String getTitle(Document doc){
		Elements title=doc.select("Title");
		return title.text();
		
		
	}

}
