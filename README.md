#AEM Training TP7

# AEM Service OSGI
Service OSGI c'est une class JAVA qui est charger ou instanciée par le context OSGI (singleton) referencé et exposer 
à tout les autres Service par son interface 

- Dans ce TP on va créer un Service OSGI qui fait appel à une API REST
- Le Service return le reponse au model pour le transférer ou client

    https://restcountries.eu/rest/v2/all




Exemple d'une class Service
=
Interface
 -
    package com.aem.training;
    
    /**
     * A simple service interface
     */
    public interface HelloService {
        
        /**
         * @return the name of the underlying JCR repository implementation
         */
        public String getRepositoryName();
    
    }
   
 Implémentation
 --
    package com.aem.training.impl;
    
    import javax.jcr.Repository;
    
    import org.apache.felix.scr.annotations.Component;
    import org.apache.felix.scr.annotations.Reference;
    import org.apache.felix.scr.annotations.Service;
    import org.apache.sling.jcr.api.SlingRepository;
    
    import com.aem.training.HelloService;
    
    /**
     * One implementation of the {@link HelloService}. Note that
     * the repository is injected, not retrieved.
     */
    @Service
    @Component(metatype = false)
    public class HelloServiceImpl implements HelloService {
        
        @Reference
        private SlingRepository repository;
    
        public String getRepositoryName() {
            return repository.getDescriptor(Repository.REP_NAME_DESC);
        }
    
    }



Exercices :
--

TODO
    
    
Good Learning 
