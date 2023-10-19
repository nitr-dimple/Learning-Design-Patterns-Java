package com.neu.dimple.structuraldesignpattern.FacadeDesignPattern;

/**
 * @author Dimpleben Kanjibhai Patel
 */
public class EmailFacade {

    public boolean sendOrderEmail(Order order){
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBulder()
                .withStationary(stationary)
                .withTemplate(template)
                .forObject(order)
                .build();

        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }

}
