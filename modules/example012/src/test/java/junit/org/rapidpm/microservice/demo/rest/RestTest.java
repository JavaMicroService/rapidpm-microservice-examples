/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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

package junit.org.rapidpm.microservice.demo.rest;

import junit.org.rapidpm.microservice.demo.BaseTest;
import org.jboss.resteasy.test.TestPortProvider;
import org.junit.*;
import org.rapidpm.dependencies.core.net.PortUtils;
import org.rapidpm.microservice.Main;
import org.rapidpm.microservice.MainUndertow;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class RestTest extends BaseTest {

  @Test
  public void testRestPath() throws Exception {
    Client client = ClientBuilder.newClient();

    final String generateURL = TestPortProvider.generateURL("/rest" + "/multiply");
    System.out.println("generateURL = " + generateURL);
    int val = client
        .target(generateURL)
        .queryParam("x", 2)
        .queryParam("y", 21)
        .request()
        .get(Integer.class);
    Assert.assertEquals(42, val);
    client.close();
  }


}
