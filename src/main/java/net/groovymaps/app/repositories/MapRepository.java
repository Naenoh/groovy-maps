package net.groovymaps.app.repositories;
import java.util.List;

import net.groovymaps.app.models.Map;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "map", path = "map")
public interface MapRepository extends PagingAndSortingRepository<Map, Long> {

    List<Map> findByName(@Param("name") String name);

}