package net.test.osgi.beer_service_interface;

import java.util.List;

public interface BeerService {

    public List<Beer> createBeers(int quantity);
    
}
