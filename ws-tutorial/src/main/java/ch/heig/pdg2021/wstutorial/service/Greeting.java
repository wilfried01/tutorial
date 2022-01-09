package ch.heig.pdg2021.wstutorial.service;

import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("service/greeting")
public interface Greeting {

    String sayHello();
}
