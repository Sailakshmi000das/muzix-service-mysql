package com.stackroute.muzixservice.repository;

import com.stackroute.muzixservice.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track ,String> {

   /* public List<Track> getTrackByName(String trackName);
    */@Query(value = "select t from Track t where t.trackName=:trackName")
    public List<Track> retrieveTrackByName(String trackName);
}
