package observer_subject;

import observer_subject.subjectInterface.ForeCastObserver;
import observer_subject.subjectInterface.Subject;

public class WeatherStation 
{

	public static void main(String[] args) 
	{
		//首先建立一个主题
		DataSubject dataSubject = new DataSubject();
		
		//观察者注册主题
		CurrentConditionObserver currentConditionObserver = new CurrentConditionObserver(dataSubject);
		ForeCastObserver foreCastObserver = new ForeCastObserver(dataSubject);
		
		//主题更新数据 观察者收到数据更新
		dataSubject.setMeasurementChanged(35.8f, 28, 14);
		
		dataSubject.remoceSubject(foreCastObserver);
		
		dataSubject.setMeasurementChanged(38.8f, 21, 19);

	}

}
