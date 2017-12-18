package sensor;

public class AdaptorRadiation implements SensorInterface{
	private double sensorValue;
	private String sensorMessage;
	//create the object from the class that need to be adapted	
	RadiationSensor ts = new RadiationSensor();
	
public double getSensorValue() {
		sensorValue = ts.getRadiationValue();
	return sensorValue;
}

public String getSensorMessage() {
		sensorMessage = ts.getStatusInfo();
	return sensorMessage;
}
}
