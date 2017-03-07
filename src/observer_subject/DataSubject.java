/**
 * 
 */
package observer_subject;


import java.util.ArrayList;
import java.util.List;

import observer_subject.subjectInterface.Observer;
import observer_subject.subjectInterface.Subject;

/**
 * @author Administrator
 *
 */
public class DataSubject implements Subject 
{
	private List<Observer> observers;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	
	public DataSubject()
	{
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerSubject(Observer o) 
	{
		observers.add(o);
	}

	@Override
	public void remoceSubject(Observer o) 
	{
		int pos = observers.indexOf(o);
		if(pos >= 0)
		{
			observers.remove(pos);
		}
	}

	@Override
	public void notifyObserver() 
	{
		for(Observer observer : observers)
		{
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	//从外部得到数据 赋值更新属性操作
	public void setMeasurementChanged(float tem, float humidity, float pressure) 
	{
		this.temperature = tem;
		this.humidity = humidity;
		this.pressure = pressure;
		
		//notify the observer
		measurementChanged();
	}
	
	private void measurementChanged()
	{
		notifyObserver();
	}
	

}
