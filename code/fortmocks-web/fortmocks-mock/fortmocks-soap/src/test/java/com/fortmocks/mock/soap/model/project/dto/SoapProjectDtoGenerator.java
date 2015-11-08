/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortmocks.mock.soap.model.project.dto;

import com.fortmocks.core.model.project.DomainNameStrategy;

import java.util.Date;


/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class SoapProjectDtoGenerator {

    public static SoapProjectDto generateSoapProjectDto(){
        final SoapProjectDto projectDto = new SoapProjectDto();
        projectDto.setId(1L);
        projectDto.setName("Project name");
        projectDto.setDescription("Project description");
        projectDto.setDomainNameStrategy(DomainNameStrategy.PERCENT_ENCODING);
        projectDto.setCreated(new Date());
        projectDto.setUpdated(new Date());
        return projectDto;
    }
}
