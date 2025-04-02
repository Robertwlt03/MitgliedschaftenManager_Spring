package r.walter.Mitgliedschaftenmanager_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import r.walter.Mitgliedschaftenmanager_Spring.model.Mitgliedschaft;

import java.util.List;

@Repository
public interface MitgliedschaftRepository extends JpaRepository<Mitgliedschaft, Integer> {
    @Query("""
    SELECT m FROM Mitgliedschaft m
    WHERE lower(m.vorname) LIKE lower(concat('%', :keyword, '%'))
       OR lower(m.nachname) LIKE lower(concat('%', :keyword, '%'))
       OR lower(m.email) = lower(:keyword)
       OR m.telefonnummer = :keyword
       OR lower(m.status) = lower(:keyword)
    """)
    List<Mitgliedschaft> searchMitgliedschaften(String keyword);
}
