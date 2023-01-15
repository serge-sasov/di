package org.example;

public class ServiceBImp implements ServiceB{

    private ServiceA serviceA;

    @Override
    public ServiceA getServiceA() {
        return serviceA;
    }

    @Override
    public void setServiceA(final ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public String jobB() {
        return "jobB()";
    }

}