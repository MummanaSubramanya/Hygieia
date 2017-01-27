package com.capitalone.dashboard.collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.endpoint.RefreshEndpoint;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SonarRefreshConfigService {
	@Autowired
	private RefreshEndpoint refreshEndpoint;
	
	@Scheduled(cron = "${sonar.cron}")
	public void refreshEndpoint() {
		refreshEndpoint.refresh();
	}
}
