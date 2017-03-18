package cn.org.disco.boot.platform.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @intro 定时任务 <br />
 * 		<span>@Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行</span></br>
 *        <span>@Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行</span></br>
 *        <span>@Scheduled(initialDelay=1000,fixedRate=5000)：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次</span></br>
 *        <span>@Scheduled(cron="**")：通过cron表达式定义规则</span></br>
 * @version 1.0
 * @author lengyu
 * @since 2017年3月2日 上午11:33:23
 */
@Component
public class ScheduledTasks {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("现在时间：" + dateFormat.format(new Date()));
	}
}
