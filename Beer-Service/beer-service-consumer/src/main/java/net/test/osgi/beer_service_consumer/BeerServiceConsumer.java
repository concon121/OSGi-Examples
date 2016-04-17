package net.test.osgi.beer_service_consumer;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

import net.test.osgi.beer_service_interface.Beer;
import net.test.osgi.beer_service_interface.BeerService;

import org.ops4j.pax.cdi.api.OsgiService;

@Singleton
public class BeerServiceConsumer {

    @Inject
    @OsgiService
    private BeerService beerService;
    
    @PostConstruct
    public void init() {
        
        System.out.println("The beer drinker is ordering 12 beers");
        
        List<Beer> beers = beerService.createBeers(12);
        
        System.out.println(beers.size() + " beers have been delivered to the beer drinker!");
        
    }

    public BeerService getBeerService() {
        return beerService;
    }

    public void setBeerService(BeerService beerService) {
        this.beerService = beerService;
    }
    
    
}
