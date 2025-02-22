package br.com.coderclub.events.repository;

import br.com.coderclub.events.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepo extends CrudRepository<Event, Integer> {
    public Event findByPrettyName(String prettyname);
}
