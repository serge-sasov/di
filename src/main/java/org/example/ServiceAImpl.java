package org.example;

public class ServiceAImp implements ServiceA{

    private ServiceB serviceB;

    // no constructor anymore here!

    @Override // <- added getter to ServiceA interface
    public ServiceB getServiceB() { return serviceB; }

    @Override // <- added setter to ServiceA interface
    public void setServiceB(final ServiceB serviceB) { this.serviceB = serviceB; }

    // jobA() same as before
    @Override
    public String jobA() {
        return "jobA(" + this.serviceB.jobB() + ")";
    }

}