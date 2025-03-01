/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.idp.metadata.saml2.internal;

import org.osgi.service.http.HttpService;
import org.wso2.carbon.idp.mgt.IdpManager;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.service.RealmService;
import org.wso2.carbon.utils.ConfigurationContextService;

/**
 * Identity provider SAML component service holder class.
 */
public class IDPMetadataSAMLServiceComponentHolder {

    public static IDPMetadataSAMLServiceComponentHolder instance = new IDPMetadataSAMLServiceComponentHolder();
    private RegistryService registryService;
    private RealmService realmService;
    private ConfigurationContextService configCtxService;
    private HttpService httpService;
    private IdpManager idpManager;

    public static IDPMetadataSAMLServiceComponentHolder getInstance() {

        return instance;
    }

    public void setRegistryService(RegistryService registryService) {

        this.registryService = registryService;
    }

    public RegistryService getRegistryService() {

        return registryService;
    }

    public RealmService getRealmService() {

        return realmService;
    }

    public void setRealmService(RealmService realmService) {

        this.realmService = realmService;
    }

    public ConfigurationContextService getConfigCtxService() {

        return configCtxService;
    }

    public void setConfigCtxService(ConfigurationContextService configCtxService) {

        this.configCtxService = configCtxService;
    }

    public HttpService getHttpService() {

        return httpService;
    }

    public void setHttpService(HttpService httpService) {

        this.httpService = httpService;
    }

    public IdpManager getIdpManager() {

        return idpManager;
    }

    public void setIdpManager(IdpManager idpManager) {

        this.idpManager = idpManager;
    }
}
