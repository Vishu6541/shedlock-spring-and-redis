package com.vishu.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.vishu.entity.Employee;
import com.vishu.repo.EmployeeRepo;

import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
public class JobScheduler {

	@Autowired
	RedisTemplate<String, String> redisTemplate;

	@Autowired
	EmployeeRepo employeeRepo;

	@Scheduled(cron = "0 */2 * * * *")
	@SchedulerLock(name = "unique_job_name", lockAtMostFor = "1m", lockAtLeastFor = "1m")
	public void executeTask() {
		employeeRepo.save(new Employee("vishu", "JavaDeveloper"));
	}

}
