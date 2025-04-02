package r.walter.Mitgliedschaftenmanager_Spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import r.walter.Mitgliedschaftenmanager_Spring.model.Mitgliedschaft;
import r.walter.Mitgliedschaftenmanager_Spring.repository.MitgliedschaftRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class MitgliedschaftServive {

    @Autowired
    MitgliedschaftRepository repository;

    public List<Mitgliedschaft> findAll() {
        return repository.findAll();
    }

    public Mitgliedschaft findById(int id) {
        return repository.getReferenceById(id);
    }

    public Mitgliedschaft setMitgliedschaft() {
        return Mitgliedschaft.builder()
                .eintrittsdatum(LocalDate.now())
                .build();
    }

    public void saveOrUpdate(Mitgliedschaft mitgliedschaft) {
        repository.save(mitgliedschaft);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<Mitgliedschaft> search(String keyword) {
        return repository.searchMitgliedschaften(keyword);
    }
}
