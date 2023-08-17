package com.practicaEndava.ticketSales_project.repository;

import com.practicaEndava.ticketSales_project.model.Event;
import com.practicaEndava.ticketSales_project.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findEventsByLocationLocationIDAndEventTypeEventTypeName(@Param("locationID") int locationId, @Param("eventTypeName") String eventTypeName);

    @Query("SELECT DISTINCT e.location.locationName FROM Event e")
    List<String> findAllLocationNames();

    @Query("SELECT DISTINCT e.eventType.eventTypeName FROM Event e")
    List<String> findAllEventTypeNames();

    List<Event> findEventsByLocationLocationNameAndEventTypeEventTypeName(@Param("locationName") String locationName, @Param("eventTypeName") String eventTypeName);
}

