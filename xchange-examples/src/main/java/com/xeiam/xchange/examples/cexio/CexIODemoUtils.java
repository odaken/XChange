package com.xeiam.xchange.examples.cexio;

import com.xeiam.xchange.Exchange;
import com.xeiam.xchange.ExchangeFactory;
import com.xeiam.xchange.ExchangeSpecification;
import com.xeiam.xchange.cexio.CexIOExchange;

/**
 * Author: brox
 * Since: 2/6/14
 */

public class CexIODemoUtils {

  public static Exchange createExchange() {

    ExchangeSpecification exSpec = new ExchangeSpecification(CexIOExchange.class);
    exSpec.setUserName("test42");
    exSpec.setSecretKey("auzRkXAZ3xAfWAI1oAIurkeBjT8");
    exSpec.setApiKey("3NG79UTjBDu89Ao6zQhMHVaA");
    exSpec.setSslUri("https://cex.io");
    return ExchangeFactory.INSTANCE.createExchange(exSpec);
  }

}
