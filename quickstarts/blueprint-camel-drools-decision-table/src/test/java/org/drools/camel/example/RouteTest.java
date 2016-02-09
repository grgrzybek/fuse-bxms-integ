//package org.drools.camel.example;
//
////import com.redhat.example.activemq.EmbeddedActiveMQResource;
//import org.apache.camel.EndpointInject;
//import org.apache.camel.component.mock.MockEndpoint;
//import org.junit.Rule;
//import org.junit.Test;
//
//import java.util.concurrent.TimeUnit;
//import org.apache.camel.Exchange;
//import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.model.ProcessorDefinition;
//import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
//
//public class RouteTest extends CamelBlueprintTestSupport {
//
//    private boolean debugBeforeMethodCalled;
//    private boolean debugAfterMethodCalled;
//
//    static final String TEST_MESSAGE_1
//            = "TEST_MESSAGE_1";
//    static final String TEST_MESSAGE_2
//            = "TEST_MESSAGE_2";
//    static final String TEST_MESSAGE_3
//            = "TEST_MESSAGE_3";
//    static final String TEST_MESSAGE_4
//            = "TEST_MESSAGE_4";
//    static final String TEST_MESSAGE_5
//            = "TEST_MESSAGE_5";
//    static final String TEST_MESSAGE_6
//            = "TEST_MESSAGE_6";
//    static final String TEST_MESSAGE_7
//            = "TEST_MESSAGE_7";
//    static final String TEST_MESSAGE_8
//            = "TEST_MESSAGE_8";
//    static final String TEST_MESSAGE_9
//            = "TEST_MESSAGE_9";
//    static final String TEST_MESSAGE_0
//            = "TEST_MESSAGE_0";
//
//    @Override
//    protected String getBlueprintDescriptor() {
//        return "OSGI-INF/blueprint/camel-context.xml";
//    }
//
//    @Override
//    protected String[] loadConfigAdminConfigurationFile() {
//        return new String[]{"src/main/resources/etc/com.sandata.lab.rules.cep.engine.cfg", "com.sandata.lab.rules.cep.engine"};
//    }
//
//    @Override
//    public boolean isUseDebugger() {
//        // must enable debugger
//        return true;
//    }
//
//    @Override
//    protected void debugBefore(Exchange exchange, org.apache.camel.Processor processor, ProcessorDefinition<?> definition, String id, String label) {
//        log.info("Before " + definition + " with body " + exchange.getIn().getBody());
//        debugBeforeMethodCalled = true;
//    }
//
//    @Override
//    protected void debugAfter(Exchange exchange, org.apache.camel.Processor processor, ProcessorDefinition<?> definition, String id, String label, long timeTaken) {
//        log.info("After " + definition + " with body " + exchange.getIn().getBody());
//        debugAfterMethodCalled = true;
//    }
//
////    @Rule
////    public EmbeddedActiveMQResource sourceBroker = new EmbeddedActiveMQResource("localhost", false);
//
////    String endpoint1 = "source://queue:q.Test1";
////    String endpoint2 = "source://queue:q.Test2";
////
////    @EndpointInject(uri = "mock://log://jms-queue-drain-throughput")
////    MockEndpoint target;
//
//    @Test(timeout = 60000)
//    public void testRouteBuilder() throws Exception {
//
////        context.getRouteDefinitions().get(0).adviceWith(context, new RouteBuilder() {
////            @Override
////            public void configure() throws Exception {
////                // intercept sending to mock:foo and do something else
////                interceptSendToEndpoint("log://jms-queue-drain-throughput?level=DEBUG")
////                        .skipSendToOriginalEndpoint()
////                        .to("mock://log://jms-queue-drain-throughput");
////            }
////        });
////        
////        context.getRouteDefinitions().get(1).adviceWith(context, new RouteBuilder() {
////            @Override
////            public void configure() throws Exception {
////                // intercept sending to mock:foo and do something else
////                interceptSendToEndpoint("log://jms-queue-drain-throughput?level=DEBUG")
////                        .skipSendToOriginalEndpoint()
////                        .to("mock://log://jms-queue-drain-throughput");
////            }
////        });
//
//        log.info("********** Starting Test **********");
////
////        int messageCount = 10;
////        target.setExpectedMessageCount(messageCount);
////
////        template.setDefaultEndpointUri(endpoint1);
////
////        log.info("********** Sending 10001 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_1, "JMSMessageID", "10001");
////        log.info("********** Sending 10002 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_2, "JMSMessageID", "10002");
////        log.info("********** Sending 10003 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_3, "JMSMessageID", "10003");
////        log.info("********** Sending 10004 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_4, "JMSMessageID", "10004");
////        log.info("********** Sending 10005 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_5, "JMSMessageID", "10005");
////
////        template.setDefaultEndpointUri(endpoint2);
////
////        log.info("********** Sending 10006 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_6, "JMSMessageID", "10006");
////        log.info("********** Sending 10007 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_7, "JMSMessageID", "10007");
////        log.info("********** Sending 10008 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_8, "JMSMessageID", "10008");
////        log.info("********** Sending 10009 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_9, "JMSMessageID", "10009");
////        log.info("********** Sending 10000 **********");
////        template.sendBodyAndHeader(TEST_MESSAGE_0, "JMSMessageID", "10000");
////
////        assertMockEndpointsSatisfied(30, TimeUnit.SECONDS);
//        
//    }
//
//}
