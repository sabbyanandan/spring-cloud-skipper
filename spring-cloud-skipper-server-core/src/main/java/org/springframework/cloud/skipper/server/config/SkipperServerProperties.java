/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.skipper.server.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.skipper.domain.Repository;

/**
 * Configurable properties of the server.
 *
 * @author Mark Pollack
 */
@ConfigurationProperties("spring.cloud.skipper.server")
public class SkipperServerProperties {

	/**
	 * List of locations for package Repositories
	 */
	private List<Repository> packageRepositories = new ArrayList<>();

	/**
	 * Flag indicating to sync the local contents of the index directory with the database on
	 * startup.
	 */
	private boolean synchonizeIndexOnContextRefresh = true;

	/**
	 * Flag indicating if any local platform accounts should be registered.
	 */
	private boolean enableLocalPlatform = true;

	/**
	 * Flag indicating if the ReleaseStateUpdateService, which has a
	 * {@link org.springframework.scheduling.annotation.Scheduled} method, should be created.
	 */
	private boolean disableReleaseStateUpdateService; // false

	public List<Repository> getPackageRepositories() {
		return packageRepositories;
	}

	public void setPackageRepositories(List<Repository> packageRepositories) {
		this.packageRepositories = packageRepositories;
	}

	public boolean isSynchonizeIndexOnContextRefresh() {
		return synchonizeIndexOnContextRefresh;
	}

	public void setSynchonizeIndexOnContextRefresh(boolean synchonizeIndexOnContextRefresh) {
		this.synchonizeIndexOnContextRefresh = synchonizeIndexOnContextRefresh;
	}

	public boolean isDisableReleaseStateUpdateService() {
		return disableReleaseStateUpdateService;
	}

	public void setDisableReleaseStateUpdateService(boolean disableReleaseStateUpdateService) {
		this.disableReleaseStateUpdateService = disableReleaseStateUpdateService;
	}

	public boolean isEnableLocalPlatform() {
		return enableLocalPlatform;
	}

	public void setEnableLocalPlatform(boolean enableLocalPlatform) {
		this.enableLocalPlatform = enableLocalPlatform;
	}
}
