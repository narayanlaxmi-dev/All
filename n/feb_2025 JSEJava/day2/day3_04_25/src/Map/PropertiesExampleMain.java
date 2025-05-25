package Map;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExampleMain {

	public static void main(String[] args) {
		String path = "./src/files/application.properties";
		// properties no <> using only string
		Properties appProps = new Properties(); // this obj is currently EMPTY
		try (FileInputStream fin = new FileInputStream(path)) {
			appProps.load(fin);// loading the properties form fin and storing them into obj
			String appname = appProps.getProperty("appName");
			String appV = appProps.getProperty("appVersion");
			String appOS = appProps.getProperty("appOS");
			String appDB = appProps.getProperty("appDBMS");
			System.out.println(
					" Appname :" + appname + "\n AppVersion :" + appV + "\n AppOS :" + appOS + "\n AppDBMS :" + appDB);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
