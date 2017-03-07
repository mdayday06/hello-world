/**
 * 
 */
package observer_subject.subjectInterface;

/**
 * @author Administrator
 * 主题类  用于订阅、取消和通知观察者
 *
 */
public interface Subject 
{
	/**
	 * 订阅主题
	 * @param o
	 */
	void registerSubject(Observer o);
	
	/**
	 * 取消主题
	 * @param o
	 */
	
	void remoceSubject(Observer o);
	
	/**
	 * 通知已订阅的观察者
	 */
	void notifyObserver();

}
