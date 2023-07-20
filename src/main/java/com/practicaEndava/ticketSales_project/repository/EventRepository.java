package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.repository.model.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
    @Query("SELECT e from Event e left join EventType t where e.location=?1 and t.eventTypeName=?2")
    List<Event> findAllByLocationAndByEventType(int locationID, String eventTypeName);

    List<Event> findAll();

}

