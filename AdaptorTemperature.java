package sensor;

public class AdaptorTemperature implements SensorInterface{
	private double sensorValue;
	private String sensorMessage;
	//create the object from the class that need to be adapted
	TemperatureSensor ts = new TemperatureSensor();
		
public double getSensorValue() {
		sensorValue = ts.senseTemperature();
	return sensorValue;
}

public String getSensorMessage() {
		sensorMessage = ts.getTempReport();
	return sensorMessage;
}
}
