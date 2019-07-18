package com.redhat.labs.nexus.openshift;

/*-
 * #%L
 * com.redhat.labs.nexus:nexus-openshift-plugin
 * %%
 * Copyright (C) 2008 - 2019 Red Hat
 * %%
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
 * #L%
 */

import org.sonatype.goodies.common.ComponentSupport;
import org.sonatype.nexus.common.log.LogConfigurationCustomizer;
import org.sonatype.nexus.common.log.LoggerLevel;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class LogConfigurationCustomizerImpl extends ComponentSupport implements LogConfigurationCustomizer {

  @Override
  public void customize(Configuration configuration) {
    configuration.setLoggerLevel("com.redhat.labs.nexus", LoggerLevel.DEBUG);
  }
}
