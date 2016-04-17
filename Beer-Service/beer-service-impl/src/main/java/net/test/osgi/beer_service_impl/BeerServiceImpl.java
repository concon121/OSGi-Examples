package net.test.osgi.beer_service_impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import net.test.osgi.beer_service_interface.Beer;
import net.test.osgi.beer_service_interface.BeerService;

import org.ops4j.pax.cdi.api.OsgiServiceProvider;

@Singleton
@OsgiServiceProvider(classes={BeerService.class})
public class BeerServiceImpl implements BeerService {

    private static final String BREWERY = "Wychwood Brewery";
    private static final String BEER_TYPE = "Heineken";
    
    public List<Beer> createBeers(int quantity) {
        
        System.out.println(BREWERY + " has been commissioned to make " + quantity + " beers.");
        
        List<Beer> beerOrder = new ArrayList<Beer>();
        
        for (int i = 0; i< quantity; i++) {
            
            Beer beer = new Beer();
            
            beerOrder.add(beer);
            
            System.out.println("Created 1 " + BEER_TYPE);
            
        }
        
        System.out.println(BREWERY + " has finished making beers!");
        
        return beerOrder;
    }

}
