/**
 * 
 */
package observer_subject.subjectInterface;

/**
 * @author Administrator
 * 观察者接口 用于订阅主题
 *
 */
public interface Observer 
{
	void update(float tem, float humidity, float pressure);
}
