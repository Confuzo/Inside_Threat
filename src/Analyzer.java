import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Analyzer {
	
	public void analyzerUsers(User user) {
		System.out.println("rodou aq");
		Date date = user.getDate();
		Collection<Device> lista_devices;
		if(date != null) {
			lista_devices = date.getHash_table().values();
			Iterator<Device> lista = lista_devices.iterator();
			int [] hist = new int [24];
			while(lista.hasNext()) {
				Device device = lista.next();
				int [] hist_device = analyzerDevices(device);
				for(int i =0; i < hist.length; i++) {
					hist[i] += hist_device[i];
				}
			}

			for(int i =0 ; i < hist.length; i++) {
				System.out.print(hist[i] + " ");
			}
			System.out.println();
			user.getDate().setHist(hist);
			user.setHist(percentageAnalyzer(hist));
		}
	}
	
	public int [] percentageAnalyzer(int [] hist) {
		int sum = 0;
		int [] hist_per = new int[24];
		for(int i = 0; i < hist.length; i++) {
			sum += hist[i];
		}
		for(int i = 0; i < hist.length; i++) {
			hist_per[i] = (hist[i]/sum) * 100;
			System.out.println(hist[i] + " " + sum);
		}
		return hist_per;
	}
	
	public int [] analyzerDevices(Device device) {
		
		int [] a = new int[24];
		int [] b = new int[24];
		int [] c = new int[24];
		if(device.getInput() != null) {
			a = device.getInput().getHist();
		}
		if(device.getLogin() != null) {
			b = device.getLogin().getHist();
		}
		if(device.getHttp() != null) {
			c = device.getHttp().getHist();
		}
		
		int [] hist = new int[24];
		
		for(int i = 0; i < hist.length; i++) {
			hist[i] = a[i] + b[i] + c[i];
		}
		
		device.setHist(hist);
		return hist;
		
	}
}
