/**
 * 
 */
package observer_subject;

import observer_subject.subjectInterface.DisplayElement;
import observer_subject.subjectInterface.Observer;
import observer_subject.subjectInterface.Subject;

/**
 * @author Administrator
 * 当前天气观察着
 *
 */
public class CurrentConditionObserver implements Observer, DisplayElement
{
    private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	private Subject dataSubject;
	
	/**
	 * 在每个观察者类 的构造方法中
	 * 注册主题
	 * @param dataSubject
	 */
	public CurrentConditionObserver(Subject dataSubject)
	{
		this.dataSubject = dataSubject;
		this.dataSubject.registerSubject(this);
	}

	@Override
	public void display() 
	{
		System.out.println("CurrentCondition: the temperature is " + temperature + ", the humidity is " + humidity + ", the pressure is " + pressure);
	}

	@Override
	public void update(float tem, float humidity, float pressure) 
	{
		this.temperature = tem;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

}
