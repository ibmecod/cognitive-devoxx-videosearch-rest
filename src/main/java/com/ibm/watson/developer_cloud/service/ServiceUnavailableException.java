/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.service;

import com.ibm.watson.developer_cloud.http.HttpStatus;
import com.squareup.okhttp.Response;

/**
 * 503 Service Unavailable (HTTP/1.0 - RFC 1945)
 */
public class ServiceUnavailableException extends ServiceResponseException {

  /**
   * The Constant serialVersionUID.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Instantiates a new Service Unavailable Exception.
   * 
   * @param message the error message
   * @param response the HTTP response
   */
  public ServiceUnavailableException(String message, Response response) {
    super(HttpStatus.SERVICE_UNAVAILABLE, message, response);
  }

}
