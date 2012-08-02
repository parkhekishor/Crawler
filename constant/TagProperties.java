package constant;

public class TagProperties {
	public static boolean title;
	public static boolean m_name;
	public static boolean m_content;
	

	public static boolean isM_content() {
		return m_content;
	}

	public static void setM_content(boolean m_content) {
		TagProperties.m_content = m_content;
	}

	public static boolean isM_name() {
		return m_name;
	}

	public static void setM_name(boolean m_name) {
		TagProperties.m_name = m_name;
	}
	public static boolean isTitle() {
		return title;
	}

	public static void setTitle(boolean title) {
		TagProperties.title = title;
	}
}
